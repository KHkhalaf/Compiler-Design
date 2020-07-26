grammar SQL;

parse
 : ( sql_stmt_list | statements_of_code_list)* EOF
 ;

sql_stmt_list
 : ';'* sql_stmt ( ';'+ sql_stmt )* ';'*
 ;

sql_stmt
:      ( comments
       | drop_table_stmt
       | factored_select_stmt
       | create_table_stmt
       | create_type_stmt
       | delete_stmt
       | alter_table_stmt
       | insert_stmt
       | update_stmt
       | create_aggregation_fun
       )
 ;

alter_table_stmt
 : K_ALTER K_TABLE  ( database_name '.' )? source_table_name
   ( K_RENAME K_TO new_table_name
   | alter_table_add
   | alter_table_add_constraint
   | alter_table_add_constraint
   | K_ADD K_COLUMN? column_def
   )
 ;

alter_table_add_constraint
 : K_ADD K_CONSTRAINT any_name table_constraint
 ;

alter_table_add
 : K_ADD table_constraint
 ;

create_type_stmt:K_CREATE K_TYPE create_type_name '(' column_def ( ',' column_def )* ')';

create_aggregation_fun:K_CREATE K_AGGREGATION_FUNCTION function_name '('jarPath','className','methodName','returnType',[' arrayParams (','arrayParams)* ']'')';

arrayParams: types;

returnType:types;

methodName:any_name| '"'character'"';

className:any_name| '"'character'"';

jarPath: any_name | '"'character'"';

create_table_stmt
 : K_CREATE  K_TABLE ( K_IF K_NOT K_EXISTS )?
   ( database_name '.' )? table_name
   ( '(' column_def ( ',' table_constraint | ',' column_def )* ')'
   | K_AS select_stmt
   )
   type path
 ;
type: K_TYPE'=' '"'character'"';
path: K_PATH'=' '"'character'"';

delete_stmt
 :  K_DELETE K_FROM qualified_table_name
   ( K_WHERE expr )?
 ;

drop_table_stmt
 : K_DROP K_TABLE ( K_IF K_EXISTS )? ( database_name '.' )? table_name
 ;


factored_select_stmt
 :
   select_core
   ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
   ( K_LIMIT expr ( ( K_OFFSET | ',' ) expr )? )?
 ;

insert_stmt :  K_INSERT  K_INTO
   ( database_name '.' )? table_name ( '(' column_name ( ',' column_name )* ')' )?
   ( K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
   | select_stmt
   | K_DEFAULT K_VALUES
   )
 ;

select_stmt
 :  select_or_values
   ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
   ( K_LIMIT expr ( ( K_OFFSET | ',' ) expr )? )?
 ;

select_or_values
 : K_SELECT ( K_DISTINCT | K_ALL )? result_column ( ',' result_column )*
   ( K_FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
   ( K_WHERE expr )?
   ( K_GROUP K_BY expr ( ',' expr )* ( K_HAVING expr )? )?
 | K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
 ;

update_stmt : K_UPDATE  qualified_table_name
   K_SET column_name '=' expr ( ',' column_name '=' expr )* ( K_WHERE expr )?
 ;

column_def
 : column_name ( column_constraint | type_name )*
 ;

type_name
 : (name ( '(' signed_number (any_name)? ')'
         | '(' signed_number (any_name)? ',' signed_number (any_name)? ')' )?) | types
 ;

column_constraint
 : ( K_CONSTRAINT name )?
   ( column_constraint_primary_key
   | column_constraint_foreign_key
   | column_constraint_not_null
   | column_constraint_null
   | K_UNIQUE
   | K_CHECK '(' expr ')'
   | column_default
   | K_COLLATE collation_name
   )
 ;

column_constraint_primary_key : K_PRIMARY  ( K_ASC | K_DESC )?  K_AUTOINCREMENT?
 ;

column_constraint_foreign_key
 : foreign_key_clause
 ;

column_constraint_not_null : K_NOT K_NULL
 ;

column_constraint_null : K_NULL
 ;

column_default
 : K_DEFAULT (column_default_value | '(' expr ')' | K_NEXTVAL '(' expr ')' | any_name )  ( '::' any_name+ )?
 ;

column_default_value
 : ( signed_number | literal_value )
 ;

expr
 : literal_value
 | ( ( database_name '.' )? table_name '.' )? column_name
 | unary_operator expr
 | expr '||' expr
 | expr ( '*' | '/' | '%' ) expr
 | expr ( '+' | '-' ) expr
 | expr ( '<<' | '>>' | '&' | '|' ) expr
 | expr ( '<' | '<=' | '>' | '>=' ) expr
 | expr ( '=' | '==' | '!=' | '<>' | K_IS | K_IS K_NOT | K_LIKE | K_GLOB | K_MATCH | K_REGEXP ) expr
 | expr K_IN '('expressions')'
 | expr K_AND expr
 | expr K_OR expr
 | functionExpr
 | '(' expr ')'
 | expr K_IN '('select_core')'
 | '"' character '"'
 ;
expressions: expr (','expr)*;
functionExpr: function_name '(' ( K_DISTINCT? expr ( ',' expr )* | '*' )? ')';
foreign_key_clause
 : K_REFERENCES ( database_name '.' )? foreign_table ( '(' fk_target_column_name ( ',' fk_target_column_name )* ')' )?
   ( ( K_ON ( K_DELETE | K_UPDATE ) ( K_SET K_NULL
                                    | K_SET K_DEFAULT
                                    | K_CASCADE
                                    | K_RESTRICT
                                    | K_NO K_ACTION )
     | K_MATCH name
     )
   )*
   ( K_NOT? K_DEFERRABLE ( K_INITIALLY K_DEFERRED | K_INITIALLY K_IMMEDIATE )? K_ENABLE? )?
 ;

fk_target_column_name
 : name
 ;

indexed_column
 : column_name ( K_COLLATE collation_name )? ( K_ASC | K_DESC )?
 ;

table_constraint
 : ( K_CONSTRAINT name )?
   ( table_constraint_primary_key
   | table_constraint_key
   | table_constraint_unique
   | K_CHECK '(' expr ')'
   | table_constraint_foreign_key
   )
 ;

table_constraint_primary_key : K_PRIMARY  '(' indexed_column ( ',' indexed_column )* ')'
 ;

table_constraint_foreign_key
 : K_FOREIGN  '(' fk_origin_column_name ( ',' fk_origin_column_name )* ')' foreign_key_clause
 ;

table_constraint_unique : K_UNIQUE ? name? '(' indexed_column ( ',' indexed_column )* ')'
 ;

table_constraint_key :  name? '(' indexed_column ( ',' indexed_column )* ')'
 ;

fk_origin_column_name
 : column_name
 ;

qualified_table_name
 : ( database_name '.' )? table_name ( K_INDEXED K_BY index_name
                                     | K_NOT K_INDEXED )?
 ;

ordering_term
 : expr  ( K_ASC | K_DESC )?
 ;

result_column
 : '*'
 | table_name '.' '*'
 | expr ( K_AS? column_alias )?
 ;

table_or_subquery
 : ( database_name '.' )? table_name ( K_AS? table_alias )?
   ( K_INDEXED K_BY index_name
   | K_NOT K_INDEXED )?
 | '(' ( table_or_subquery ( ',' table_or_subquery )*
       | join_clause )
   ')' ( K_AS? table_alias )?
 | '(' select_stmt ')' ( K_AS? table_alias )?
 ;

join_clause
 : table_or_subquery ( join_operator table_or_subquery join_constraint )*
 ;

join_operator
 : ','
 |  ( K_LEFT K_OUTER? | K_INNER |K_RIGHT )? K_JOIN
 ;

join_constraint : ( K_ON expr)?
 ;

select_core
 : (K_VAR any_name'=')? (any_name'=')? K_SELECT ( K_DISTINCT | K_ALL )? result_column ( ',' result_column )*
   ( K_FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
   ( K_WHERE expr )?
   ( K_GROUP K_BY expr ( ',' expr )* ( K_HAVING expr )? )?
 | K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
 ;

signed_number
 : ( ( '+' | '-' )? NUMERIC_LITERAL | '*' )
 ;

literal_value
 : NUMERIC_LITERAL
 | STRING_LITERAL
 | BLOB_LITERAL
 | K_NULL
 | K_CURRENT_TIME
 | K_CURRENT_DATE
 | K_CURRENT_TIMESTAMP
 ;

unary_operator
 : '-'
 | '+'
 | '~'
 | K_NOT
 ;

column_alias
 : IDENTIFIER
 | STRING_LITERAL
 ;

name
 : any_name
 ;

function_name
 : any_name
 ;

database_name
 : any_name
 ;

source_table_name
 : any_name
 ;

create_type_name:any_name;

table_name
 : any_name
 ;

new_table_name
 : any_name
 ;

column_name
 : any_name
 ;

collation_name
 : any_name
 ;

foreign_table
 : any_name
 ;

index_name
 : any_name
 ;

table_alias
 : IDENTIFIER
 ;

///////////////////////////////   Definition java

statements_of_code_list: statements_of_code (';'statements_of_code)*';';

statements_of_code: (def_function | def_stmt_list) ;

def_function : types? IDENTIFIER OPEN_PAR listOfParameters CLOSE_PAR  def_stmt_list ;

listOfParameters:parameter? (','parameter)*;

parameter:(keyword_def IDENTIFIER ('=' exp)? );

prototype_func: IDENTIFIER OPEN_PAR prototype_func_parameters CLOSE_PAR;

prototype_func_parameters: (exp (',' exp)*)?;

def_var_core : keyword_def def_var  (','def_var)*  ';'* ;

while_repeat: K_WHILE OPEN_PAR cond+  CLOSE_PAR (('{'def_stmt_list '}') | def_stmt);

do_while: K_DO  (('{'def_stmt_list '}') | def_stmt) K_WHILE OPEN_PAR cond+  CLOSE_PAR ';';

for_repeat: K_FOR OPEN_PAR def_stmt ';' cond+ def_stmt? ';' def_stmt CLOSE_PAR  (('{'def_stmt_list '}') | def_stmt)  ;

foreach : K_FORECH '(' K_VAR IDENTIFIER K_IN IDENTIFIER ')' (('{'def_stmt_list '}') | def_stmt) ;

repeat : while_repeat
        | do_while
        | for_repeat
        | foreach
         ;
return_value:K_RETURN (exp | cond)* ';';

try_catch: try_Statement  catch_Statement (K_FINALY def_stmt_list )? ;

try_Statement:K_TRY def_stmt_list;

catch_Statement:K_CATCH OPEN_PAR K_EXCEPTION IDENTIFIER CLOSE_PAR  def_stmt_list;

switch_case: K_SWITCH OPEN_PAR exp CLOSE_PAR '{' switch_body '}';

switch_body: cases+  default_statement?;

cases: K_CASE exp ':'  def_stmt_list ';'* ;

default_statement:(K_DEFAULT ':'  (('{'def_stmt_list '}') | def_stmt) );

print_func:K_PRINT '(' exp ('+' exp)*')'';'*;

sort_func_def :IDENTIFIER '('IDENTIFIER ',' K_FUNCTION '(' IDENTIFIER ',' IDENTIFIER ')'
                '{' K_RETURN IDENTIFIER ('>'|'<') IDENTIFIER ';' '})';

array_def:(K_ARRAY | K_VAR) IDENTIFIER '[]' ('=' bodyArray)? ';'*;

bodyArray:'[' ( exp  | body_for_json) (',' ( exp | body_for_json ) )* ']';

arr_setValue:arr_getValue ASSIGN exp ';'*;

arr_getValue:IDENTIFIER '[' exp ']';

key_value: IDENTIFIER ':' ( NUMERIC_LITERAL | exp | '"' character '"') ;

body_for_json: ( key_value | IDENTIFIER ':' (('{' body_for_json '}') | bodyArray))
                ( (',' key_value) | ',' IDENTIFIER ':' (('{' body_for_json '}') | bodyArray))* ;

obj_json:K_VAR? IDENTIFIER '=' '{' body_for_json? '}' ';'*;

read_obj_json:IDENTIFIER ('.'IDENTIFIER)+;

write_obj_json:IDENTIFIER ('.'IDENTIFIER)+ '=' exp;

character: (IDENTIFIER | NUMERIC_LITERAL | '>' | '//' | '\\' |'<' |'/'|':' |'?'|'>'|'<'|'!'|'@'|'#'|'$'|'.'|'='|'*'|'('|')'|'{'|'}'|'&'|'^'|'_'|'+'|'-'|'~'|'|'|'['|']'|'%'|'^')+;

if_statement_core: K_IF OPEN_PAR cond+ CLOSE_PAR  (('{'def_stmt_list '}') | def_stmt );

if_statement: if_statement_core else_if_statement* else_statement? ;

else_if_statement:K_ELSE if_statement_core;

else_statement:K_ELSE (('{'def_stmt_list '}') | def_stmt );

if_statement_one_line: keyword_def IDENTIFIER '=' (body_onelineCond) ';'*;

body_onelineCond: cond+ '?' ('{'def_stmt_list '}' | def_stmt | '(' body_onelineCond ')')
                        ':' ('{'def_stmt_list '}' | def_stmt | '(' body_onelineCond ')');

exp: keyword_def? IDENTIFIER op? ASSIGN exp ';'*
      |  OPEN_PAR exp CLOSE_PAR ';'*
      |  exp STAR exp ';'*
      |  exp DIV exp ';'*
      |  exp op  exp ';'*
      |  op_double IDENTIFIER (ASSIGN (exp | IDENTIFIER))? ';'*
      |  any_name op_double (ASSIGN (exp | IDENTIFIER))? ';'*
      |  prototype_func ';'*
      |  read_obj_json ';'*
      |  arr_getValue ';'*
      |  any_name ';'*
      |  numbers ';'*
      | '"'character'"' ';'*
      |  booleanValue ';'*
      | K_NULL ';'*
      ;

numbers: NUMERIC_LITERAL;

booleanValue: K_TRUE | K_FALSE;

cond: exp ( '<' | '<=' | '>' | '>=' | '==' | '!=' ) exp
    | prototype_func
    | any_name
    | exp ((( '==' | '!=' ) K_NULL) | K_ISNULL)
    | cond ('||' | '&&' | '|' | '&') cond
    | '(' cond ')'
    |  numbers
    | booleanValue;

comments: ( '//' character*) | ('/*' character* '*/');

def_stmt_list:(  comments
               | factored_select_stmt ';'*
               | def_var_core
               | exp
               | repeat
               | if_statement
               | if_statement_one_line
               | try_catch
               | switch_case
               | print_func
               | sort_func_def
               | array_def
               | obj_json
               | write_obj_json
               | return_value
               | breakKeyWord
               | arr_setValue
               | '{'def_stmt_list '}')*;

def_stmt:   (    comments
               | def_var_core
               | factored_select_stmt ';'*
               | exp
               | repeat
               | if_statement
               | if_statement_one_line
               | try_catch
               | switch_case
               | print_func
               | array_def
               | sort_func_def
               | obj_json
               | return_value
               | write_obj_json
               | breakKeyWord);

op: PLUS | MINUS | DIV | STAR ;

op_double:(PLUS PLUS) | (MINUS MINUS);

def_var : any_name (ASSIGN exp)?  ;

breakKeyWord:K_BREAK ';'*;

keyword_def: types| K_VAR ;

 types:K_NUMBER | K_STRING | K_BOOLEAN | K_INT | K_FLOAT;


any_name
 : IDENTIFIER
 | STRING_LITERAL
 | '(' any_name ')'
 ;

SCOL : ';';
DOT : '.';
OPEN_PAR : '(';
CLOSE_PAR : ')';
COMMA : ',';
ASSIGN : '=';
STAR : '*';
PLUS : '+';
MINUS : '-';
TILDE : '~';
PIPE2 : '||';
DIV : '/';
MOD : '%';
LT2 : '<<';
GT2 : '>>';
AMP : '&';
PIPE : '|';
LT : '<';
LT_EQ : '<=';
GT : '>';
GT_EQ : '>=';
EQ : '==';
NOT_EQ1 : '!=';
NOT_EQ2 : '<>';



// http://www.sqlite.org/lang_keywords.html
K_ABORT : A B O R T;
K_ACTION : A C T I O N;
K_ADD : A D D;
K_AFTER : A F T E R;
K_ALL : A L L;
K_ALTER : A L T E R;
K_ANALYZE : A N A L Y Z E;
K_AND : A N D;
K_AS : A S;
K_ASC : A S C;
K_ATTACH : A T T A C H;
K_AUTOINCREMENT : A U T O I N C R E M E N T;
K_BEFORE : B E F O R E;
K_BEGIN : B E G I N;
K_BETWEEN : B E T W E E N;
K_BY : B Y;
K_CASCADE : C A S C A D E;
K_CASE : C A S E;
K_CAST : C A S T;
K_CHECK : C H E C K;
K_COLLATE : C O L L A T E;
K_COLUMN : C O L U M N;
K_COMMIT : C O M M I T;
K_CONFLICT : C O N F L I C T;
K_CONSTRAINT : C O N S T R A I N T;
K_CREATE : C R E A T E;
K_CROSS : C R O S S;
K_CURRENT_DATE : C U R R E N T '_' D A T E;
K_CURRENT_TIME : C U R R E N T '_' T I M E;
K_CURRENT_TIMESTAMP : C U R R E N T '_' T I M E S T A M P;
K_DATABASE : D A T A B A S E;
K_DEFAULT : D E F A U L T;
K_DEFERRABLE : D E F E R R A B L E;
K_DEFERRED : D E F E R R E D;
K_DELETE : D E L E T E;
K_DESC : D E S C;
K_DETACH : D E T A C H;
K_DISTINCT : D I S T I N C T;
K_DROP : D R O P;
K_EACH : E A C H;
K_ELSE : E L S E;
K_END : E N D;
K_ENABLE : E N A B L E;
K_ESCAPE : E S C A P E;
K_EXCEPT : E X C E P T;
K_EXCLUSIVE : E X C L U S I V E;
K_EXISTS : E X I S T S;
K_EXPLAIN : E X P L A I N;
K_FAIL : F A I L;
K_FOR : F O R;
K_FOREIGN : F O R E I G N;
K_FROM : F R O M;
K_FULL : F U L L;
K_GLOB : G L O B;
K_GROUP : G R O U P;
K_HAVING : H A V I N G;
K_IF : I F;
K_IGNORE : I G N O R E;
K_IMMEDIATE : I M M E D I A T E;
K_IN : I N;
K_INDEX : I N D E X;
K_INDEXED : I N D E X E D;
K_INITIALLY : I N I T I A L L Y;
K_INNER : I N N E R;
K_INSERT : I N S E R T;
K_INSTEAD : I N S T E A D;
K_INTERSECT : I N T E R S E C T;
K_INTO : I N T O;
K_IS : I S;
K_ISNULL : I S N U L L;
K_JOIN : J O I N;
K_LEFT : L E F T;
K_LIKE : L I K E;
K_LIMIT : L I M I T;
K_MATCH : M A T C H;
K_NATURAL : N A T U R A L;
K_NEXTVAL : N E X T V A L;
K_NO : N O;
K_NOT : N O T;
K_NOTNULL : N O T N U L L;
K_NULL : N U L L;
K_OF : O F;
K_OFFSET : O F F S E T;
K_ON : O N;
K_ONLY : O N L Y;
K_OR : O R;
K_ORDER : O R D E R;
K_OUTER : O U T E R;
K_PLAN : P L A N;
K_PRAGMA : P R A G M A;
K_PRIMARY : P R I M A R Y;
K_QUERY : Q U E R Y;
K_RAISE : R A I S E;
K_RECURSIVE : R E C U R S I V E;
K_REFERENCES : R E F E R E N C E S;
K_REGEXP : R E G E X P;
K_REINDEX : R E I N D E X;
K_RELEASE : R E L E A S E;
K_RENAME : R E N A M E;
K_REPLACE : R E P L A C E;
K_RESTRICT : R E S T R I C T;
K_RIGHT : R I G H T;
K_ROLLBACK : R O L L B A C K;
K_ROW : R O W;
K_SAVEPOINT : S A V E P O I N T;
K_SELECT : S E L E C T;
K_SET : S E T;
K_TABLE : T A B L E;
K_TYPE : T Y P E;
K_PATH:P A T H;
K_TEMP : T E M P;
K_TEMPORARY : T E M P O R A R Y;
K_THEN : T H E N;
K_TO : T O;
K_TRANSACTION : T R A N S A C T I O N;
K_TRIGGER : T R I G G E R;
K_UNION : U N I O N;
K_UNIQUE : U N I Q U E;
K_UPDATE : U P D A T E;
K_USING : U S I N G;
K_VACUUM : V A C U U M;
K_VALUES : V A L U E S;
K_VIEW : V I E W;
K_VIRTUAL : V I R T U A L;
K_WHEN : W H E N;
K_WHERE : W H E R E;
K_WITH : W I T H;
K_WITHOUT : W I T H O U T;
K_VOID : V O I D;
K_INT : I N T;
K_FLOAT : F L O A T;
K_WHILE : W H I L E;
K_TRY : T R Y;
K_CATCH : C A T C H;
K_EXCEPTION : E X C E P T I O N;
K_FINALY: F I N A L Y;
K_SWITCH: S W I T C H;
K_BREAK: B R E A K;
K_DO: D O;
K_PRINT: P R I N T;
K_RETURN : R E T U R N;
K_VAR : V A R;
K_ARRAY : A R R A Y;
K_FUNCTION : F U N C T I O N;
K_CONTENUOE : C O N T E N U O E ;
K_FORECH : F O R E C H ;
K_FALSE : F A L S E ;
K_TRUE : T R U E ;
K_AGGREGATION_FUNCTION: A G G R E G A T I O N '_' F U N C T I O N;
K_NUMBER:N U M B E R;
K_STRING: S T R I N G;
K_BOOLEAN:B O O L E A N;

IDENTIFIER
 : '`' (~'`' | '``')* '`'
 | [a-zA-Z_] [a-zA-Z_0-9]* // TODO check: needs more chars in set
 ;

CHAR: ('a'..'z' | 'A'..'Z')+;

NUMERIC_LITERAL
 : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
 | '.' DIGIT+ ( E [-+]? DIGIT+ )?
 ;

/*BIND_PARAMETER
 : '?' DIGIT*
 | [:@$] IDENTIFIER
 ;*/

STRING_LITERAL
 : '\'' ( ~'\'' | '\'\'' )* '\''
 ;

BLOB_LITERAL
 : X STRING_LITERAL
 ;

/*SINGLE_LINE_COMMENT
 : '--' ~[\r\n]* -> channel(HIDDEN)
 ;*/

MULTILINE_COMMENT
 : '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN)
 ;

SPACES
 : [ \u000B\t\r\n] -> channel(HIDDEN)
 ;

UNEXPECTED_CHAR
 : .
 ;

fragment DIGIT : [0-9];

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];





