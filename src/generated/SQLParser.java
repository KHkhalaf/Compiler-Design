package generated;// Generated from C:/Users/hp/Documents/Intellij Projects/Compiler/src\SQL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, SCOL=23, DOT=24, OPEN_PAR=25, 
		CLOSE_PAR=26, COMMA=27, ASSIGN=28, STAR=29, PLUS=30, MINUS=31, TILDE=32, 
		PIPE2=33, DIV=34, MOD=35, LT2=36, GT2=37, AMP=38, PIPE=39, LT=40, LT_EQ=41, 
		GT=42, GT_EQ=43, EQ=44, NOT_EQ1=45, NOT_EQ2=46, K_ABORT=47, K_ACTION=48, 
		K_ADD=49, K_AFTER=50, K_ALL=51, K_ALTER=52, K_ANALYZE=53, K_AND=54, K_AS=55, 
		K_ASC=56, K_ATTACH=57, K_AUTOINCREMENT=58, K_BEFORE=59, K_BEGIN=60, K_BETWEEN=61, 
		K_BY=62, K_CASCADE=63, K_CASE=64, K_CAST=65, K_CHECK=66, K_COLLATE=67, 
		K_COLUMN=68, K_COMMIT=69, K_CONFLICT=70, K_CONSTRAINT=71, K_CREATE=72, 
		K_CROSS=73, K_CURRENT_DATE=74, K_CURRENT_TIME=75, K_CURRENT_TIMESTAMP=76, 
		K_DATABASE=77, K_DEFAULT=78, K_DEFERRABLE=79, K_DEFERRED=80, K_DELETE=81, 
		K_DESC=82, K_DETACH=83, K_DISTINCT=84, K_DROP=85, K_EACH=86, K_ELSE=87, 
		K_END=88, K_ENABLE=89, K_ESCAPE=90, K_EXCEPT=91, K_EXCLUSIVE=92, K_EXISTS=93, 
		K_EXPLAIN=94, K_FAIL=95, K_FOR=96, K_FOREIGN=97, K_FROM=98, K_FULL=99, 
		K_GLOB=100, K_GROUP=101, K_HAVING=102, K_IF=103, K_IGNORE=104, K_IMMEDIATE=105, 
		K_IN=106, K_INDEX=107, K_INDEXED=108, K_INITIALLY=109, K_INNER=110, K_INSERT=111, 
		K_INSTEAD=112, K_INTERSECT=113, K_INTO=114, K_IS=115, K_ISNULL=116, K_JOIN=117, 
		K_LEFT=118, K_LIKE=119, K_LIMIT=120, K_MATCH=121, K_NATURAL=122, K_NEXTVAL=123, 
		K_NO=124, K_NOT=125, K_NOTNULL=126, K_NULL=127, K_OF=128, K_OFFSET=129, 
		K_ON=130, K_ONLY=131, K_OR=132, K_ORDER=133, K_OUTER=134, K_PLAN=135, 
		K_PRAGMA=136, K_PRIMARY=137, K_QUERY=138, K_RAISE=139, K_RECURSIVE=140, 
		K_REFERENCES=141, K_REGEXP=142, K_REINDEX=143, K_RELEASE=144, K_RENAME=145, 
		K_REPLACE=146, K_RESTRICT=147, K_RIGHT=148, K_ROLLBACK=149, K_ROW=150, 
		K_SAVEPOINT=151, K_SELECT=152, K_SET=153, K_TABLE=154, K_TYPE=155, K_PATH=156, 
		K_TEMP=157, K_TEMPORARY=158, K_THEN=159, K_TO=160, K_TRANSACTION=161, 
		K_TRIGGER=162, K_UNION=163, K_UNIQUE=164, K_UPDATE=165, K_USING=166, K_VACUUM=167, 
		K_VALUES=168, K_VIEW=169, K_VIRTUAL=170, K_WHEN=171, K_WHERE=172, K_WITH=173, 
		K_WITHOUT=174, K_VOID=175, K_INT=176, K_FLOAT=177, K_WHILE=178, K_TRY=179, 
		K_CATCH=180, K_EXCEPTION=181, K_FINALY=182, K_SWITCH=183, K_BREAK=184, 
		K_DO=185, K_PRINT=186, K_RETURN=187, K_VAR=188, K_ARRAY=189, K_FUNCTION=190, 
		K_CONTENUOE=191, K_FORECH=192, K_FALSE=193, K_TRUE=194, K_AGGREGATION_FUNCTION=195, 
		K_NUMBER=196, K_STRING=197, K_BOOLEAN=198, IDENTIFIER=199, CHAR=200, NUMERIC_LITERAL=201, 
		STRING_LITERAL=202, BLOB_LITERAL=203, MULTILINE_COMMENT=204, SPACES=205, 
		UNEXPECTED_CHAR=206;
	public static final int
		RULE_parse = 0, RULE_sql_stmt_list = 1, RULE_sql_stmt = 2, RULE_alter_table_stmt = 3, 
		RULE_alter_table_add_constraint = 4, RULE_alter_table_add = 5, RULE_create_type_stmt = 6, 
		RULE_create_aggregation_fun = 7, RULE_arrayParams = 8, RULE_returnType = 9, 
		RULE_methodName = 10, RULE_className = 11, RULE_jarPath = 12, RULE_create_table_stmt = 13, 
		RULE_type = 14, RULE_path = 15, RULE_delete_stmt = 16, RULE_drop_table_stmt = 17, 
		RULE_factored_select_stmt = 18, RULE_insert_stmt = 19, RULE_select_stmt = 20, 
		RULE_select_or_values = 21, RULE_update_stmt = 22, RULE_column_def = 23, 
		RULE_type_name = 24, RULE_column_constraint = 25, RULE_column_constraint_primary_key = 26, 
		RULE_column_constraint_foreign_key = 27, RULE_column_constraint_not_null = 28, 
		RULE_column_constraint_null = 29, RULE_column_default = 30, RULE_column_default_value = 31, 
		RULE_expr = 32, RULE_expressions = 33, RULE_functionExpr = 34, RULE_foreign_key_clause = 35, 
		RULE_fk_target_column_name = 36, RULE_indexed_column = 37, RULE_table_constraint = 38, 
		RULE_table_constraint_primary_key = 39, RULE_table_constraint_foreign_key = 40, 
		RULE_table_constraint_unique = 41, RULE_table_constraint_key = 42, RULE_fk_origin_column_name = 43, 
		RULE_qualified_table_name = 44, RULE_ordering_term = 45, RULE_result_column = 46, 
		RULE_table_or_subquery = 47, RULE_join_clause = 48, RULE_join_operator = 49, 
		RULE_join_constraint = 50, RULE_select_core = 51, RULE_signed_number = 52, 
		RULE_literal_value = 53, RULE_unary_operator = 54, RULE_column_alias = 55, 
		RULE_name = 56, RULE_function_name = 57, RULE_database_name = 58, RULE_source_table_name = 59, 
		RULE_create_type_name = 60, RULE_table_name = 61, RULE_new_table_name = 62, 
		RULE_column_name = 63, RULE_collation_name = 64, RULE_foreign_table = 65, 
		RULE_index_name = 66, RULE_table_alias = 67, RULE_statements_of_code_list = 68, 
		RULE_statements_of_code = 69, RULE_def_function = 70, RULE_listOfParameters = 71, 
		RULE_parameter = 72, RULE_prototype_func = 73, RULE_prototype_func_parameters = 74, 
		RULE_def_var_core = 75, RULE_while_repeat = 76, RULE_do_while = 77, RULE_for_repeat = 78, 
		RULE_foreach = 79, RULE_repeat = 80, RULE_return_value = 81, RULE_try_catch = 82, 
		RULE_try_Statement = 83, RULE_catch_Statement = 84, RULE_switch_case = 85, 
		RULE_switch_body = 86, RULE_cases = 87, RULE_default_statement = 88, RULE_print_func = 89, 
		RULE_sort_func_def = 90, RULE_array_def = 91, RULE_bodyArray = 92, RULE_arr_setValue = 93, 
		RULE_arr_getValue = 94, RULE_key_value = 95, RULE_body_for_json = 96, 
		RULE_obj_json = 97, RULE_read_obj_json = 98, RULE_write_obj_json = 99, 
		RULE_character = 100, RULE_if_statement_core = 101, RULE_if_statement = 102, 
		RULE_else_if_statement = 103, RULE_else_statement = 104, RULE_if_statement_one_line = 105, 
		RULE_body_onelineCond = 106, RULE_exp = 107, RULE_numbers = 108, RULE_booleanValue = 109, 
		RULE_cond = 110, RULE_comments = 111, RULE_def_stmt_list = 112, RULE_def_stmt = 113, 
		RULE_op = 114, RULE_op_double = 115, RULE_def_var = 116, RULE_breakKeyWord = 117, 
		RULE_keyword_def = 118, RULE_types = 119, RULE_any_name = 120;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "alter_table_add_constraint", 
			"alter_table_add", "create_type_stmt", "create_aggregation_fun", "arrayParams", 
			"returnType", "methodName", "className", "jarPath", "create_table_stmt", 
			"type", "path", "delete_stmt", "drop_table_stmt", "factored_select_stmt", 
			"insert_stmt", "select_stmt", "select_or_values", "update_stmt", "column_def", 
			"type_name", "column_constraint", "column_constraint_primary_key", "column_constraint_foreign_key", 
			"column_constraint_not_null", "column_constraint_null", "column_default", 
			"column_default_value", "expr", "expressions", "functionExpr", "foreign_key_clause", 
			"fk_target_column_name", "indexed_column", "table_constraint", "table_constraint_primary_key", 
			"table_constraint_foreign_key", "table_constraint_unique", "table_constraint_key", 
			"fk_origin_column_name", "qualified_table_name", "ordering_term", "result_column", 
			"table_or_subquery", "join_clause", "join_operator", "join_constraint", 
			"select_core", "signed_number", "literal_value", "unary_operator", "column_alias", 
			"name", "function_name", "database_name", "source_table_name", "create_type_name", 
			"table_name", "new_table_name", "column_name", "collation_name", "foreign_table", 
			"index_name", "table_alias", "statements_of_code_list", "statements_of_code", 
			"def_function", "listOfParameters", "parameter", "prototype_func", "prototype_func_parameters", 
			"def_var_core", "while_repeat", "do_while", "for_repeat", "foreach", 
			"repeat", "return_value", "try_catch", "try_Statement", "catch_Statement", 
			"switch_case", "switch_body", "cases", "default_statement", "print_func", 
			"sort_func_def", "array_def", "bodyArray", "arr_setValue", "arr_getValue", 
			"key_value", "body_for_json", "obj_json", "read_obj_json", "write_obj_json", 
			"character", "if_statement_core", "if_statement", "else_if_statement", 
			"else_statement", "if_statement_one_line", "body_onelineCond", "exp", 
			"numbers", "booleanValue", "cond", "comments", "def_stmt_list", "def_stmt", 
			"op", "op_double", "def_var", "breakKeyWord", "keyword_def", "types", 
			"any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "',['", "']'", "'\"'", "'::'", "'{'", "'}'", "':'", "'})'", "'[]'", 
			"'['", "'//'", "'\\'", "'?'", "'!'", "'@'", "'#'", "'$'", "'^'", "'_'", 
			"'&&'", "'/*'", "'*/'", "';'", "'.'", "'('", "')'", "','", "'='", "'*'", 
			"'+'", "'-'", "'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", 
			"'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "SCOL", 
			"DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", "PLUS", "MINUS", 
			"TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", "PIPE", "LT", "LT_EQ", 
			"GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "K_ABORT", "K_ACTION", "K_ADD", 
			"K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", "K_AS", "K_ASC", 
			"K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", "K_BETWEEN", "K_BY", 
			"K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", "K_COLUMN", 
			"K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", "K_CROSS", "K_CURRENT_DATE", 
			"K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", 
			"K_DEFERRED", "K_DELETE", "K_DESC", "K_DETACH", "K_DISTINCT", "K_DROP", 
			"K_EACH", "K_ELSE", "K_END", "K_ENABLE", "K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", 
			"K_EXISTS", "K_EXPLAIN", "K_FAIL", "K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", 
			"K_GLOB", "K_GROUP", "K_HAVING", "K_IF", "K_IGNORE", "K_IMMEDIATE", "K_IN", 
			"K_INDEX", "K_INDEXED", "K_INITIALLY", "K_INNER", "K_INSERT", "K_INSTEAD", 
			"K_INTERSECT", "K_INTO", "K_IS", "K_ISNULL", "K_JOIN", "K_LEFT", "K_LIKE", 
			"K_LIMIT", "K_MATCH", "K_NATURAL", "K_NEXTVAL", "K_NO", "K_NOT", "K_NOTNULL", 
			"K_NULL", "K_OF", "K_OFFSET", "K_ON", "K_ONLY", "K_OR", "K_ORDER", "K_OUTER", 
			"K_PLAN", "K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", "K_RECURSIVE", 
			"K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", "K_REPLACE", 
			"K_RESTRICT", "K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", "K_SELECT", 
			"K_SET", "K_TABLE", "K_TYPE", "K_PATH", "K_TEMP", "K_TEMPORARY", "K_THEN", 
			"K_TO", "K_TRANSACTION", "K_TRIGGER", "K_UNION", "K_UNIQUE", "K_UPDATE", 
			"K_USING", "K_VACUUM", "K_VALUES", "K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", 
			"K_WITH", "K_WITHOUT", "K_VOID", "K_INT", "K_FLOAT", "K_WHILE", "K_TRY", 
			"K_CATCH", "K_EXCEPTION", "K_FINALY", "K_SWITCH", "K_BREAK", "K_DO", 
			"K_PRINT", "K_RETURN", "K_VAR", "K_ARRAY", "K_FUNCTION", "K_CONTENUOE", 
			"K_FORECH", "K_FALSE", "K_TRUE", "K_AGGREGATION_FUNCTION", "K_NUMBER", 
			"K_STRING", "K_BOOLEAN", "IDENTIFIER", "CHAR", "NUMERIC_LITERAL", "STRING_LITERAL", 
			"BLOB_LITERAL", "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<Statements_of_code_listContext> statements_of_code_list() {
			return getRuleContexts(Statements_of_code_listContext.class);
		}
		public Statements_of_code_listContext statements_of_code_list(int i) {
			return getRuleContext(Statements_of_code_listContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << T__20) | (1L << SCOL) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << K_ALTER))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (K_CREATE - 72)) | (1L << (K_DELETE - 72)) | (1L << (K_DROP - 72)) | (1L << (K_FOR - 72)) | (1L << (K_IF - 72)) | (1L << (K_INSERT - 72)) | (1L << (K_NULL - 72)))) != 0) || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & ((1L << (K_SELECT - 152)) | (1L << (K_UPDATE - 152)) | (1L << (K_VALUES - 152)) | (1L << (K_INT - 152)) | (1L << (K_FLOAT - 152)) | (1L << (K_WHILE - 152)) | (1L << (K_TRY - 152)) | (1L << (K_SWITCH - 152)) | (1L << (K_BREAK - 152)) | (1L << (K_DO - 152)) | (1L << (K_PRINT - 152)) | (1L << (K_RETURN - 152)) | (1L << (K_VAR - 152)) | (1L << (K_ARRAY - 152)) | (1L << (K_FORECH - 152)) | (1L << (K_FALSE - 152)) | (1L << (K_TRUE - 152)) | (1L << (K_NUMBER - 152)) | (1L << (K_STRING - 152)) | (1L << (K_BOOLEAN - 152)) | (1L << (IDENTIFIER - 152)) | (1L << (NUMERIC_LITERAL - 152)) | (1L << (STRING_LITERAL - 152)))) != 0)) {
				{
				setState(244);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(242);
					sql_stmt_list();
					}
					break;
				case 2:
					{
					setState(243);
					statements_of_code_list();
					}
					break;
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(251);
				match(SCOL);
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			sql_stmt();
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(259); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(258);
						match(SCOL);
						}
						}
						setState(261); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(263);
					sql_stmt();
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					match(SCOL);
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmtContext extends ParserRuleContext {
		public CommentsContext comments() {
			return getRuleContext(CommentsContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_type_stmtContext create_type_stmt() {
			return getRuleContext(Create_type_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Create_aggregation_funContext create_aggregation_fun() {
			return getRuleContext(Create_aggregation_funContext.class,0);
		}
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(275);
				comments();
				}
				break;
			case 2:
				{
				setState(276);
				drop_table_stmt();
				}
				break;
			case 3:
				{
				setState(277);
				factored_select_stmt();
				}
				break;
			case 4:
				{
				setState(278);
				create_table_stmt();
				}
				break;
			case 5:
				{
				setState(279);
				create_type_stmt();
				}
				break;
			case 6:
				{
				setState(280);
				delete_stmt();
				}
				break;
			case 7:
				{
				setState(281);
				alter_table_stmt();
				}
				break;
			case 8:
				{
				setState(282);
				insert_stmt();
				}
				break;
			case 9:
				{
				setState(283);
				update_stmt();
				}
				break;
			case 10:
				{
				setState(284);
				create_aggregation_fun();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(SQLParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Source_table_nameContext source_table_name() {
			return getRuleContext(Source_table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(SQLParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(SQLParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public Alter_table_addContext alter_table_add() {
			return getRuleContext(Alter_table_addContext.class,0);
		}
		public Alter_table_add_constraintContext alter_table_add_constraint() {
			return getRuleContext(Alter_table_add_constraintContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alter_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(K_ALTER);
			setState(288);
			match(K_TABLE);
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(289);
				database_name();
				setState(290);
				match(DOT);
				}
				break;
			}
			setState(294);
			source_table_name();
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(295);
				match(K_RENAME);
				setState(296);
				match(K_TO);
				setState(297);
				new_table_name();
				}
				break;
			case 2:
				{
				setState(298);
				alter_table_add();
				}
				break;
			case 3:
				{
				setState(299);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
				setState(300);
				alter_table_add_constraint();
				}
				break;
			case 5:
				{
				setState(301);
				match(K_ADD);
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLUMN) {
					{
					setState(302);
					match(K_COLUMN);
					}
				}

				setState(305);
				column_def();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_add_constraintContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_add_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_add_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_add_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_add_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_add_constraintContext alter_table_add_constraint() throws RecognitionException {
		Alter_table_add_constraintContext _localctx = new Alter_table_add_constraintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(K_ADD);
			setState(309);
			match(K_CONSTRAINT);
			setState(310);
			any_name();
			setState(311);
			table_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_addContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_addContext alter_table_add() throws RecognitionException {
		Alter_table_addContext _localctx = new Alter_table_addContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(K_ADD);
			setState(314);
			table_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_type_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_TYPE() { return getToken(SQLParser.K_TYPE, 0); }
		public Create_type_nameContext create_type_name() {
			return getRuleContext(Create_type_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Create_type_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_type_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_type_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_type_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_type_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_type_stmtContext create_type_stmt() throws RecognitionException {
		Create_type_stmtContext _localctx = new Create_type_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_create_type_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(K_CREATE);
			setState(317);
			match(K_TYPE);
			setState(318);
			create_type_name();
			setState(319);
			match(OPEN_PAR);
			setState(320);
			column_def();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(321);
				match(COMMA);
				setState(322);
				column_def();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_aggregation_funContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_AGGREGATION_FUNCTION() { return getToken(SQLParser.K_AGGREGATION_FUNCTION, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public JarPathContext jarPath() {
			return getRuleContext(JarPathContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public List<ArrayParamsContext> arrayParams() {
			return getRuleContexts(ArrayParamsContext.class);
		}
		public ArrayParamsContext arrayParams(int i) {
			return getRuleContext(ArrayParamsContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Create_aggregation_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_aggregation_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_aggregation_fun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_aggregation_fun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_aggregation_fun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_aggregation_funContext create_aggregation_fun() throws RecognitionException {
		Create_aggregation_funContext _localctx = new Create_aggregation_funContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_create_aggregation_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(K_CREATE);
			setState(331);
			match(K_AGGREGATION_FUNCTION);
			setState(332);
			function_name();
			setState(333);
			match(OPEN_PAR);
			setState(334);
			jarPath();
			setState(335);
			match(COMMA);
			setState(336);
			className();
			setState(337);
			match(COMMA);
			setState(338);
			methodName();
			setState(339);
			match(COMMA);
			setState(340);
			returnType();
			setState(341);
			match(T__0);
			setState(342);
			arrayParams();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(343);
				match(COMMA);
				setState(344);
				arrayParams();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			match(T__1);
			setState(351);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayParamsContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public ArrayParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArrayParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArrayParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArrayParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayParamsContext arrayParams() throws RecognitionException {
		ArrayParamsContext _localctx = new ArrayParamsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			types();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypeContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			types();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodName);
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				any_name();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(T__2);
				setState(359);
				character();
				setState(360);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_className);
		try {
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				any_name();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(T__2);
				setState(366);
				character();
				setState(367);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JarPathContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public JarPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jarPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJarPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJarPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJarPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JarPathContext jarPath() throws RecognitionException {
		JarPathContext _localctx = new JarPathContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jarPath);
		try {
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				any_name();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(T__2);
				setState(373);
				character();
				setState(374);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(K_CREATE);
			setState(379);
			match(K_TABLE);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(380);
				match(K_IF);
				setState(381);
				match(K_NOT);
				setState(382);
				match(K_EXISTS);
				}
			}

			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(385);
				database_name();
				setState(386);
				match(DOT);
				}
				break;
			}
			setState(390);
			table_name();
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(391);
				match(OPEN_PAR);
				setState(392);
				column_def();
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(397);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(393);
						match(COMMA);
						setState(394);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(395);
						match(COMMA);
						setState(396);
						column_def();
						}
						break;
					}
					}
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(402);
				match(CLOSE_PAR);
				}
				break;
			case K_AS:
				{
				setState(404);
				match(K_AS);
				setState(405);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(408);
			type();
			setState(409);
			path();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode K_TYPE() { return getToken(SQLParser.K_TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(K_TYPE);
			setState(412);
			match(ASSIGN);
			setState(413);
			match(T__2);
			setState(414);
			character();
			setState(415);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public TerminalNode K_PATH() { return getToken(SQLParser.K_PATH, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(K_PATH);
			setState(418);
			match(ASSIGN);
			setState(419);
			match(T__2);
			setState(420);
			character();
			setState(421);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SQLParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(K_DELETE);
			setState(424);
			match(K_FROM);
			setState(425);
			qualified_table_name();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(426);
				match(K_WHERE);
				setState(427);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_drop_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(K_DROP);
			setState(431);
			match(K_TABLE);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(432);
				match(K_IF);
				setState(433);
				match(K_EXISTS);
				}
			}

			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(436);
				database_name();
				setState(437);
				match(DOT);
				}
				break;
			}
			setState(441);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			select_core();
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(444);
				match(K_ORDER);
				setState(445);
				match(K_BY);
				setState(446);
				ordering_term();
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(447);
					match(COMMA);
					setState(448);
					ordering_term();
					}
					}
					setState(453);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(456);
				match(K_LIMIT);
				setState(457);
				expr(0);
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(458);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(459);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INSERT() { return getToken(SQLParser.K_INSERT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(K_INSERT);
			setState(465);
			match(K_INTO);
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(466);
				database_name();
				setState(467);
				match(DOT);
				}
				break;
			}
			setState(471);
			table_name();
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(472);
				match(OPEN_PAR);
				setState(473);
				column_name();
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(474);
					match(COMMA);
					setState(475);
					column_name();
					}
					}
					setState(480);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(481);
				match(CLOSE_PAR);
				}
			}

			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(485);
				match(K_VALUES);
				setState(486);
				match(OPEN_PAR);
				setState(487);
				expr(0);
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(488);
					match(COMMA);
					setState(489);
					expr(0);
					}
					}
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(495);
				match(CLOSE_PAR);
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(496);
					match(COMMA);
					setState(497);
					match(OPEN_PAR);
					setState(498);
					expr(0);
					setState(503);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(499);
						match(COMMA);
						setState(500);
						expr(0);
						}
						}
						setState(505);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(506);
					match(CLOSE_PAR);
					}
					}
					setState(512);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(513);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(514);
				match(K_DEFAULT);
				setState(515);
				match(K_VALUES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public Select_or_valuesContext select_or_values() {
			return getRuleContext(Select_or_valuesContext.class,0);
		}
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			select_or_values();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(519);
				match(K_ORDER);
				setState(520);
				match(K_BY);
				setState(521);
				ordering_term();
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(522);
					match(COMMA);
					setState(523);
					ordering_term();
					}
					}
					setState(528);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(531);
				match(K_LIMIT);
				setState(532);
				expr(0);
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(533);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(534);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_or_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_select_or_values);
		int _la;
		try {
			setState(613);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				match(K_SELECT);
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(540);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(543);
				result_column();
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(544);
					match(COMMA);
					setState(545);
					result_column();
					}
					}
					setState(550);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(551);
					match(K_FROM);
					setState(561);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(552);
						table_or_subquery();
						setState(557);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(553);
							match(COMMA);
							setState(554);
							table_or_subquery();
							}
							}
							setState(559);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(560);
						join_clause();
						}
						break;
					}
					}
				}

				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(565);
					match(K_WHERE);
					setState(566);
					expr(0);
					}
				}

				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(569);
					match(K_GROUP);
					setState(570);
					match(K_BY);
					setState(571);
					expr(0);
					setState(576);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(572);
						match(COMMA);
						setState(573);
						expr(0);
						}
						}
						setState(578);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(581);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(579);
						match(K_HAVING);
						setState(580);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				match(K_VALUES);
				setState(586);
				match(OPEN_PAR);
				setState(587);
				expr(0);
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(588);
					match(COMMA);
					setState(589);
					expr(0);
					}
					}
					setState(594);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(595);
				match(CLOSE_PAR);
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(596);
					match(COMMA);
					setState(597);
					match(OPEN_PAR);
					setState(598);
					expr(0);
					setState(603);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(599);
						match(COMMA);
						setState(600);
						expr(0);
						}
						}
						setState(605);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(606);
					match(CLOSE_PAR);
					}
					}
					setState(612);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SQLParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(K_UPDATE);
			setState(616);
			qualified_table_name();
			setState(617);
			match(K_SET);
			setState(618);
			column_name();
			setState(619);
			match(ASSIGN);
			setState(620);
			expr(0);
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(621);
				match(COMMA);
				setState(622);
				column_name();
				setState(623);
				match(ASSIGN);
				setState(624);
				expr(0);
				}
				}
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(631);
				match(K_WHERE);
				setState(632);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_column_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			column_name();
			setState(640);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(638);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_CHECK:
					case K_COLLATE:
					case K_CONSTRAINT:
					case K_DEFAULT:
					case K_NOT:
					case K_NULL:
					case K_PRIMARY:
					case K_REFERENCES:
					case K_UNIQUE:
						{
						setState(636);
						column_constraint();
						}
						break;
					case OPEN_PAR:
					case K_INT:
					case K_FLOAT:
					case K_NUMBER:
					case K_STRING:
					case K_BOOLEAN:
					case IDENTIFIER:
					case STRING_LITERAL:
						{
						setState(637);
						type_name();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_type_name);
		int _la;
		try {
			setState(666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(643);
				name();
				setState(663);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(644);
					match(OPEN_PAR);
					setState(645);
					signed_number();
					setState(647);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
						{
						setState(646);
						any_name();
						}
					}

					setState(649);
					match(CLOSE_PAR);
					}
					break;
				case 2:
					{
					setState(651);
					match(OPEN_PAR);
					setState(652);
					signed_number();
					setState(654);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
						{
						setState(653);
						any_name();
						}
					}

					setState(656);
					match(COMMA);
					setState(657);
					signed_number();
					setState(659);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
						{
						setState(658);
						any_name();
						}
					}

					setState(661);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				}
				break;
			case K_INT:
			case K_FLOAT:
			case K_NUMBER:
			case K_STRING:
			case K_BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				types();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraintContext extends ParserRuleContext {
		public Column_constraint_primary_keyContext column_constraint_primary_key() {
			return getRuleContext(Column_constraint_primary_keyContext.class,0);
		}
		public Column_constraint_foreign_keyContext column_constraint_foreign_key() {
			return getRuleContext(Column_constraint_foreign_keyContext.class,0);
		}
		public Column_constraint_not_nullContext column_constraint_not_null() {
			return getRuleContext(Column_constraint_not_nullContext.class,0);
		}
		public Column_constraint_nullContext column_constraint_null() {
			return getRuleContext(Column_constraint_nullContext.class,0);
		}
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Column_defaultContext column_default() {
			return getRuleContext(Column_defaultContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(668);
				match(K_CONSTRAINT);
				setState(669);
				name();
				}
			}

			setState(685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(672);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(673);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(674);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(675);
				column_constraint_null();
				}
				break;
			case K_UNIQUE:
				{
				setState(676);
				match(K_UNIQUE);
				}
				break;
			case K_CHECK:
				{
				setState(677);
				match(K_CHECK);
				setState(678);
				match(OPEN_PAR);
				setState(679);
				expr(0);
				setState(680);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(682);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(683);
				match(K_COLLATE);
				setState(684);
				collation_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Column_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_primary_keyContext column_constraint_primary_key() throws RecognitionException {
		Column_constraint_primary_keyContext _localctx = new Column_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(K_PRIMARY);
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(688);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AUTOINCREMENT) {
				{
				setState(691);
				match(K_AUTOINCREMENT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_foreign_keyContext extends ParserRuleContext {
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public Column_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_foreign_keyContext column_constraint_foreign_key() throws RecognitionException {
		Column_constraint_foreign_keyContext _localctx = new Column_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			foreign_key_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_not_nullContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public Column_constraint_not_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_not_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_not_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_not_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_not_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_not_nullContext column_constraint_not_null() throws RecognitionException {
		Column_constraint_not_nullContext _localctx = new Column_constraint_not_nullContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(K_NOT);
			setState(697);
			match(K_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_nullContext extends ParserRuleContext {
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public Column_constraint_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_nullContext column_constraint_null() throws RecognitionException {
		Column_constraint_nullContext _localctx = new Column_constraint_nullContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(K_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defaultContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public Column_default_valueContext column_default_value() {
			return getRuleContext(Column_default_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SQLParser.K_NEXTVAL, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Column_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defaultContext column_default() throws RecognitionException {
		Column_defaultContext _localctx = new Column_defaultContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_column_default);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(K_DEFAULT);
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(702);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(703);
				match(OPEN_PAR);
				setState(704);
				expr(0);
				setState(705);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(707);
				match(K_NEXTVAL);
				setState(708);
				match(OPEN_PAR);
				setState(709);
				expr(0);
				setState(710);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				setState(712);
				any_name();
				}
				break;
			}
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(715);
				match(T__3);
				setState(717); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(716);
						any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(719); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_default_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_default_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_default_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_default_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_default_valueContext column_default_value() throws RecognitionException {
		Column_default_valueContext _localctx = new Column_default_valueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(723);
				signed_number();
				}
				break;
			case 2:
				{
				setState(724);
				literal_value();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunctionExprContext functionExpr() {
			return getRuleContext(FunctionExprContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public TerminalNode PIPE2() { return getToken(SQLParser.PIPE2, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SQLParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SQLParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLParser.NOT_EQ2, 0); }
		public TerminalNode K_IS() { return getToken(SQLParser.K_IS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(728);
				literal_value();
				}
				break;
			case 2:
				{
				setState(737);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(732);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						setState(729);
						database_name();
						setState(730);
						match(DOT);
						}
						break;
					}
					setState(734);
					table_name();
					setState(735);
					match(DOT);
					}
					break;
				}
				setState(739);
				column_name();
				}
				break;
			case 3:
				{
				setState(740);
				unary_operator();
				setState(741);
				expr(14);
				}
				break;
			case 4:
				{
				setState(743);
				functionExpr();
				}
				break;
			case 5:
				{
				setState(744);
				match(OPEN_PAR);
				setState(745);
				expr(0);
				setState(746);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(748);
				match(T__2);
				setState(749);
				character();
				setState(750);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(804);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(802);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(754);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(755);
						match(PIPE2);
						setState(756);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(757);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(758);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(759);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(760);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(761);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(762);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(763);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(764);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(765);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(766);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(767);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(768);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(769);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(781);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
						case 1:
							{
							setState(770);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(771);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(772);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(773);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(774);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(775);
							match(K_IS);
							setState(776);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(777);
							match(K_LIKE);
							}
							break;
						case 8:
							{
							setState(778);
							match(K_GLOB);
							}
							break;
						case 9:
							{
							setState(779);
							match(K_MATCH);
							}
							break;
						case 10:
							{
							setState(780);
							match(K_REGEXP);
							}
							break;
						}
						setState(783);
						expr(9);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(784);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(785);
						match(K_AND);
						setState(786);
						expr(7);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(787);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(788);
						match(K_OR);
						setState(789);
						expr(6);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(790);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(791);
						match(K_IN);
						setState(792);
						match(OPEN_PAR);
						setState(793);
						expressions();
						setState(794);
						match(CLOSE_PAR);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(796);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(797);
						match(K_IN);
						setState(798);
						match(OPEN_PAR);
						setState(799);
						select_core();
						setState(800);
						match(CLOSE_PAR);
						}
						break;
					}
					} 
				}
				setState(806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			expr(0);
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(808);
				match(COMMA);
				setState(809);
				expr(0);
				}
				}
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionExprContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public FunctionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionExprContext functionExpr() throws RecognitionException {
		FunctionExprContext _localctx = new FunctionExprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			function_name();
			setState(816);
			match(OPEN_PAR);
			setState(829);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DISTINCT:
			case K_NOT:
			case K_NULL:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_DISTINCT) {
					{
					setState(817);
					match(K_DISTINCT);
					}
				}

				setState(820);
				expr(0);
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(821);
					match(COMMA);
					setState(822);
					expr(0);
					}
					}
					setState(827);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STAR:
				{
				setState(828);
				match(STAR);
				}
				break;
			case CLOSE_PAR:
				break;
			default:
				break;
			}
			setState(831);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(SQLParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Fk_target_column_nameContext> fk_target_column_name() {
			return getRuleContexts(Fk_target_column_nameContext.class);
		}
		public Fk_target_column_nameContext fk_target_column_name(int i) {
			return getRuleContext(Fk_target_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_ON() { return getTokens(SQLParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(SQLParser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(SQLParser.K_MATCH); }
		public TerminalNode K_MATCH(int i) {
			return getToken(SQLParser.K_MATCH, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(SQLParser.K_DELETE); }
		public TerminalNode K_DELETE(int i) {
			return getToken(SQLParser.K_DELETE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(SQLParser.K_UPDATE); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(SQLParser.K_UPDATE, i);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLParser.K_IMMEDIATE, 0); }
		public TerminalNode K_ENABLE() { return getToken(SQLParser.K_ENABLE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(SQLParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(SQLParser.K_SET, i);
		}
		public List<TerminalNode> K_NULL() { return getTokens(SQLParser.K_NULL); }
		public TerminalNode K_NULL(int i) {
			return getToken(SQLParser.K_NULL, i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(SQLParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(SQLParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(SQLParser.K_CASCADE); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(SQLParser.K_CASCADE, i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(SQLParser.K_RESTRICT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(SQLParser.K_RESTRICT, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(SQLParser.K_NO); }
		public TerminalNode K_NO(int i) {
			return getToken(SQLParser.K_NO, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(SQLParser.K_ACTION); }
		public TerminalNode K_ACTION(int i) {
			return getToken(SQLParser.K_ACTION, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(K_REFERENCES);
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(834);
				database_name();
				setState(835);
				match(DOT);
				}
				break;
			}
			setState(839);
			foreign_table();
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(840);
				match(OPEN_PAR);
				setState(841);
				fk_target_column_name();
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(842);
					match(COMMA);
					setState(843);
					fk_target_column_name();
					}
					}
					setState(848);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(849);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(867);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(853);
					match(K_ON);
					setState(854);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(863);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(855);
						match(K_SET);
						setState(856);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(857);
						match(K_SET);
						setState(858);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(859);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(860);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(861);
						match(K_NO);
						setState(862);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(865);
					match(K_MATCH);
					setState(866);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(887);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(874);
					match(K_NOT);
					}
				}

				setState(877);
				match(K_DEFERRABLE);
				setState(882);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(878);
					match(K_INITIALLY);
					setState(879);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(880);
					match(K_INITIALLY);
					setState(881);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ENABLE) {
					{
					setState(884);
					match(K_ENABLE);
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fk_target_column_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Fk_target_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_target_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFk_target_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFk_target_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFk_target_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_target_column_nameContext fk_target_column_name() throws RecognitionException {
		Fk_target_column_nameContext _localctx = new Fk_target_column_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			column_name();
			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(892);
				match(K_COLLATE);
				setState(893);
				collation_name();
				}
			}

			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(896);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public Table_constraint_primary_keyContext table_constraint_primary_key() {
			return getRuleContext(Table_constraint_primary_keyContext.class,0);
		}
		public Table_constraint_keyContext table_constraint_key() {
			return getRuleContext(Table_constraint_keyContext.class,0);
		}
		public Table_constraint_uniqueContext table_constraint_unique() {
			return getRuleContext(Table_constraint_uniqueContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Table_constraint_foreign_keyContext table_constraint_foreign_key() {
			return getRuleContext(Table_constraint_foreign_keyContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(899);
				match(K_CONSTRAINT);
				setState(900);
				name();
				}
			}

			setState(912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(903);
				table_constraint_primary_key();
				}
				break;
			case 2:
				{
				setState(904);
				table_constraint_key();
				}
				break;
			case 3:
				{
				setState(905);
				table_constraint_unique();
				}
				break;
			case 4:
				{
				setState(906);
				match(K_CHECK);
				setState(907);
				match(OPEN_PAR);
				setState(908);
				expr(0);
				setState(909);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				{
				setState(911);
				table_constraint_foreign_key();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_primary_keyContext table_constraint_primary_key() throws RecognitionException {
		Table_constraint_primary_keyContext _localctx = new Table_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(K_PRIMARY);
			setState(915);
			match(OPEN_PAR);
			setState(916);
			indexed_column();
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(917);
				match(COMMA);
				setState(918);
				indexed_column();
				}
				}
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(924);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_foreign_keyContext extends ParserRuleContext {
		public TerminalNode K_FOREIGN() { return getToken(SQLParser.K_FOREIGN, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Fk_origin_column_nameContext> fk_origin_column_name() {
			return getRuleContexts(Fk_origin_column_nameContext.class);
		}
		public Fk_origin_column_nameContext fk_origin_column_name(int i) {
			return getRuleContext(Fk_origin_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_foreign_keyContext table_constraint_foreign_key() throws RecognitionException {
		Table_constraint_foreign_keyContext _localctx = new Table_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(K_FOREIGN);
			setState(927);
			match(OPEN_PAR);
			setState(928);
			fk_origin_column_name();
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(929);
				match(COMMA);
				setState(930);
				fk_origin_column_name();
				}
				}
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(936);
			match(CLOSE_PAR);
			setState(937);
			foreign_key_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_uniqueContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_uniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_unique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_unique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_unique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_unique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_uniqueContext table_constraint_unique() throws RecognitionException {
		Table_constraint_uniqueContext _localctx = new Table_constraint_uniqueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(939);
				match(K_UNIQUE);
				}
			}

			setState(943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(942);
				name();
				}
				break;
			}
			setState(945);
			match(OPEN_PAR);
			setState(946);
			indexed_column();
			setState(951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(947);
				match(COMMA);
				setState(948);
				indexed_column();
				}
				}
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(954);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_keyContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_keyContext table_constraint_key() throws RecognitionException {
		Table_constraint_keyContext _localctx = new Table_constraint_keyContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(956);
				name();
				}
				break;
			}
			setState(959);
			match(OPEN_PAR);
			setState(960);
			indexed_column();
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(961);
				match(COMMA);
				setState(962);
				indexed_column();
				}
				}
				setState(967);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(968);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fk_origin_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Fk_origin_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_origin_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFk_origin_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFk_origin_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFk_origin_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_origin_column_nameContext fk_origin_column_name() throws RecognitionException {
		Fk_origin_column_nameContext _localctx = new Fk_origin_column_nameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(972);
				database_name();
				setState(973);
				match(DOT);
				}
				break;
			}
			setState(977);
			table_name();
			setState(983);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(978);
				match(K_INDEXED);
				setState(979);
				match(K_BY);
				setState(980);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(981);
				match(K_NOT);
				setState(982);
				match(K_INDEXED);
				}
				break;
			case EOF:
			case T__2:
			case T__4:
			case T__10:
			case T__20:
			case SCOL:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case K_ALTER:
			case K_CREATE:
			case K_DELETE:
			case K_DROP:
			case K_FOR:
			case K_IF:
			case K_INSERT:
			case K_NULL:
			case K_SELECT:
			case K_SET:
			case K_UPDATE:
			case K_VALUES:
			case K_WHERE:
			case K_INT:
			case K_FLOAT:
			case K_WHILE:
			case K_TRY:
			case K_SWITCH:
			case K_BREAK:
			case K_DO:
			case K_PRINT:
			case K_RETURN:
			case K_VAR:
			case K_ARRAY:
			case K_FORECH:
			case K_FALSE:
			case K_TRUE:
			case K_NUMBER:
			case K_STRING:
			case K_BOOLEAN:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			expr(0);
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(986);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_result_column);
		int _la;
		try {
			setState(1001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
				table_name();
				setState(991);
				match(DOT);
				setState(992);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(994);
				expr(0);
				setState(999);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(996);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(995);
						match(K_AS);
						}
					}

					setState(998);
					column_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_table_or_subquery);
		int _la;
		try {
			setState(1050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1006);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(1003);
					database_name();
					setState(1004);
					match(DOT);
					}
					break;
				}
				setState(1008);
				table_name();
				setState(1013);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(1010);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1009);
						match(K_AS);
						}
					}

					setState(1012);
					table_alias();
					}
					break;
				}
				setState(1020);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1015);
					match(K_INDEXED);
					setState(1016);
					match(K_BY);
					setState(1017);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1018);
					match(K_NOT);
					setState(1019);
					match(K_INDEXED);
					}
					break;
				case EOF:
				case T__2:
				case T__4:
				case T__5:
				case T__6:
				case T__10:
				case T__20:
				case SCOL:
				case OPEN_PAR:
				case CLOSE_PAR:
				case COMMA:
				case PLUS:
				case MINUS:
				case K_ALTER:
				case K_CASE:
				case K_CREATE:
				case K_DEFAULT:
				case K_DELETE:
				case K_DROP:
				case K_ELSE:
				case K_FOR:
				case K_GROUP:
				case K_IF:
				case K_INNER:
				case K_INSERT:
				case K_JOIN:
				case K_LEFT:
				case K_LIMIT:
				case K_NULL:
				case K_ON:
				case K_ORDER:
				case K_RIGHT:
				case K_SELECT:
				case K_TYPE:
				case K_UPDATE:
				case K_VALUES:
				case K_WHERE:
				case K_INT:
				case K_FLOAT:
				case K_WHILE:
				case K_TRY:
				case K_CATCH:
				case K_FINALY:
				case K_SWITCH:
				case K_BREAK:
				case K_DO:
				case K_PRINT:
				case K_RETURN:
				case K_VAR:
				case K_ARRAY:
				case K_FORECH:
				case K_FALSE:
				case K_TRUE:
				case K_NUMBER:
				case K_STRING:
				case K_BOOLEAN:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1022);
				match(OPEN_PAR);
				setState(1032);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1023);
					table_or_subquery();
					setState(1028);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1024);
						match(COMMA);
						setState(1025);
						table_or_subquery();
						}
						}
						setState(1030);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1031);
					join_clause();
					}
					break;
				}
				setState(1034);
				match(CLOSE_PAR);
				setState(1039);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1036);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1035);
						match(K_AS);
						}
					}

					setState(1038);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1041);
				match(OPEN_PAR);
				setState(1042);
				select_stmt();
				setState(1043);
				match(CLOSE_PAR);
				setState(1048);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1045);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1044);
						match(K_AS);
						}
					}

					setState(1047);
					table_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			table_or_subquery();
			setState(1059);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (K_INNER - 110)) | (1L << (K_JOIN - 110)) | (1L << (K_LEFT - 110)) | (1L << (K_RIGHT - 110)))) != 0)) {
				{
				{
				setState(1053);
				join_operator();
				setState(1054);
				table_or_subquery();
				setState(1055);
				join_constraint();
				}
				}
				setState(1061);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLParser.K_JOIN, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SQLParser.K_INNER, 0); }
		public TerminalNode K_RIGHT() { return getToken(SQLParser.K_RIGHT, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_join_operator);
		int _la;
		try {
			setState(1072);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1062);
				match(COMMA);
				}
				break;
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1069);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1063);
					match(K_LEFT);
					setState(1065);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1064);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1067);
					match(K_INNER);
					}
					break;
				case K_RIGHT:
					{
					setState(1068);
					match(K_RIGHT);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1071);
				match(K_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1074);
				match(K_ON);
				setState(1075);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_select_core);
		int _la;
		try {
			setState(1163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case K_SELECT:
			case K_VAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1082);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_VAR) {
					{
					setState(1078);
					match(K_VAR);
					setState(1079);
					any_name();
					setState(1080);
					match(ASSIGN);
					}
				}

				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1084);
					any_name();
					setState(1085);
					match(ASSIGN);
					}
				}

				setState(1089);
				match(K_SELECT);
				setState(1091);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1090);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1093);
				result_column();
				setState(1098);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1094);
					match(COMMA);
					setState(1095);
					result_column();
					}
					}
					setState(1100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1101);
					match(K_FROM);
					setState(1111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
					case 1:
						{
						setState(1102);
						table_or_subquery();
						setState(1107);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1103);
							match(COMMA);
							setState(1104);
							table_or_subquery();
							}
							}
							setState(1109);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1110);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1115);
					match(K_WHERE);
					setState(1116);
					expr(0);
					}
				}

				setState(1133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1119);
					match(K_GROUP);
					setState(1120);
					match(K_BY);
					setState(1121);
					expr(0);
					setState(1126);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1122);
						match(COMMA);
						setState(1123);
						expr(0);
						}
						}
						setState(1128);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1131);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1129);
						match(K_HAVING);
						setState(1130);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1135);
				match(K_VALUES);
				setState(1136);
				match(OPEN_PAR);
				setState(1137);
				expr(0);
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1138);
					match(COMMA);
					setState(1139);
					expr(0);
					}
					}
					setState(1144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1145);
				match(CLOSE_PAR);
				setState(1160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1146);
					match(COMMA);
					setState(1147);
					match(OPEN_PAR);
					setState(1148);
					expr(0);
					setState(1153);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1149);
						match(COMMA);
						setState(1150);
						expr(0);
						}
						}
						setState(1155);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1156);
					match(CLOSE_PAR);
					}
					}
					setState(1162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1165);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1168);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(1169);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (K_CURRENT_DATE - 74)) | (1L << (K_CURRENT_TIME - 74)) | (1L << (K_CURRENT_TIMESTAMP - 74)) | (1L << (K_NULL - 74)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (NUMERIC_LITERAL - 201)) | (1L << (STRING_LITERAL - 201)) | (1L << (BLOB_LITERAL - 201)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SQLParser.TILDE, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Source_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Source_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSource_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSource_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSource_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_table_nameContext source_table_name() throws RecognitionException {
		Source_table_nameContext _localctx = new Source_table_nameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_type_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Create_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_type_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_type_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_type_nameContext create_type_name() throws RecognitionException {
		Create_type_nameContext _localctx = new Create_type_nameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_create_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statements_of_code_listContext extends ParserRuleContext {
		public List<Statements_of_codeContext> statements_of_code() {
			return getRuleContexts(Statements_of_codeContext.class);
		}
		public Statements_of_codeContext statements_of_code(int i) {
			return getRuleContext(Statements_of_codeContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Statements_of_code_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements_of_code_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterStatements_of_code_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitStatements_of_code_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitStatements_of_code_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statements_of_code_listContext statements_of_code_list() throws RecognitionException {
		Statements_of_code_listContext _localctx = new Statements_of_code_listContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_statements_of_code_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			statements_of_code();
			setState(1207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1203);
					match(SCOL);
					setState(1204);
					statements_of_code();
					}
					} 
				}
				setState(1209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			setState(1210);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statements_of_codeContext extends ParserRuleContext {
		public Def_functionContext def_function() {
			return getRuleContext(Def_functionContext.class,0);
		}
		public Def_stmt_listContext def_stmt_list() {
			return getRuleContext(Def_stmt_listContext.class,0);
		}
		public Statements_of_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements_of_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterStatements_of_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitStatements_of_code(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitStatements_of_code(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statements_of_codeContext statements_of_code() throws RecognitionException {
		Statements_of_codeContext _localctx = new Statements_of_codeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_statements_of_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1212);
				def_function();
				}
				break;
			case 2:
				{
				setState(1213);
				def_stmt_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_functionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ListOfParametersContext listOfParameters() {
			return getRuleContext(ListOfParametersContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Def_stmt_listContext def_stmt_list() {
			return getRuleContext(Def_stmt_listContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public Def_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDef_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDef_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDef_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_functionContext def_function() throws RecognitionException {
		Def_functionContext _localctx = new Def_functionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_def_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 176)) & ~0x3f) == 0 && ((1L << (_la - 176)) & ((1L << (K_INT - 176)) | (1L << (K_FLOAT - 176)) | (1L << (K_NUMBER - 176)) | (1L << (K_STRING - 176)) | (1L << (K_BOOLEAN - 176)))) != 0)) {
				{
				setState(1216);
				types();
				}
			}

			setState(1219);
			match(IDENTIFIER);
			setState(1220);
			match(OPEN_PAR);
			setState(1221);
			listOfParameters();
			setState(1222);
			match(CLOSE_PAR);
			setState(1223);
			def_stmt_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListOfParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public ListOfParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listOfParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterListOfParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitListOfParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitListOfParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListOfParametersContext listOfParameters() throws RecognitionException {
		ListOfParametersContext _localctx = new ListOfParametersContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_listOfParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 176)) & ~0x3f) == 0 && ((1L << (_la - 176)) & ((1L << (K_INT - 176)) | (1L << (K_FLOAT - 176)) | (1L << (K_VAR - 176)) | (1L << (K_NUMBER - 176)) | (1L << (K_STRING - 176)) | (1L << (K_BOOLEAN - 176)))) != 0)) {
				{
				setState(1225);
				parameter();
				}
			}

			setState(1232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1228);
				match(COMMA);
				setState(1229);
				parameter();
				}
				}
				setState(1234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public Keyword_defContext keyword_def() {
			return getRuleContext(Keyword_defContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1235);
			keyword_def();
			setState(1236);
			match(IDENTIFIER);
			setState(1239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1237);
				match(ASSIGN);
				setState(1238);
				exp(0);
				}
			}

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prototype_funcContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Prototype_func_parametersContext prototype_func_parameters() {
			return getRuleContext(Prototype_func_parametersContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Prototype_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prototype_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPrototype_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPrototype_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPrototype_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prototype_funcContext prototype_func() throws RecognitionException {
		Prototype_funcContext _localctx = new Prototype_funcContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_prototype_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			match(IDENTIFIER);
			setState(1242);
			match(OPEN_PAR);
			setState(1243);
			prototype_func_parameters();
			setState(1244);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prototype_func_parametersContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Prototype_func_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prototype_func_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPrototype_func_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPrototype_func_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPrototype_func_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prototype_func_parametersContext prototype_func_parameters() throws RecognitionException {
		Prototype_func_parametersContext _localctx = new Prototype_func_parametersContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_prototype_func_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (K_NULL - 127)) | (1L << (K_INT - 127)) | (1L << (K_FLOAT - 127)) | (1L << (K_VAR - 127)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (K_FALSE - 193)) | (1L << (K_TRUE - 193)) | (1L << (K_NUMBER - 193)) | (1L << (K_STRING - 193)) | (1L << (K_BOOLEAN - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (NUMERIC_LITERAL - 193)) | (1L << (STRING_LITERAL - 193)))) != 0)) {
				{
				setState(1246);
				exp(0);
				setState(1251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1247);
					match(COMMA);
					setState(1248);
					exp(0);
					}
					}
					setState(1253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_var_coreContext extends ParserRuleContext {
		public Keyword_defContext keyword_def() {
			return getRuleContext(Keyword_defContext.class,0);
		}
		public List<Def_varContext> def_var() {
			return getRuleContexts(Def_varContext.class);
		}
		public Def_varContext def_var(int i) {
			return getRuleContext(Def_varContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Def_var_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_var_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDef_var_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDef_var_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDef_var_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_var_coreContext def_var_core() throws RecognitionException {
		Def_var_coreContext _localctx = new Def_var_coreContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_def_var_core);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			keyword_def();
			setState(1257);
			def_var();
			setState(1262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1258);
				match(COMMA);
				setState(1259);
				def_var();
				}
				}
				setState(1264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1265);
					match(SCOL);
					}
					} 
				}
				setState(1270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_repeatContext extends ParserRuleContext {
		public TerminalNode K_WHILE() { return getToken(SQLParser.K_WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Def_stmtContext def_stmt() {
			return getRuleContext(Def_stmtContext.class,0);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public Def_stmt_listContext def_stmt_list() {
			return getRuleContext(Def_stmt_listContext.class,0);
		}
		public While_repeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterWhile_repeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitWhile_repeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitWhile_repeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_repeatContext while_repeat() throws RecognitionException {
		While_repeatContext _localctx = new While_repeatContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_while_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			match(K_WHILE);
			setState(1272);
			match(OPEN_PAR);
			setState(1274); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1273);
				cond(0);
				}
				}
				setState(1276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (K_NULL - 127)) | (1L << (K_INT - 127)) | (1L << (K_FLOAT - 127)) | (1L << (K_VAR - 127)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (K_FALSE - 193)) | (1L << (K_TRUE - 193)) | (1L << (K_NUMBER - 193)) | (1L << (K_STRING - 193)) | (1L << (K_BOOLEAN - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (NUMERIC_LITERAL - 193)) | (1L << (STRING_LITERAL - 193)))) != 0) );
			setState(1278);
			match(CLOSE_PAR);
			setState(1284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				{
				setState(1279);
				match(T__4);
				setState(1280);
				def_stmt_list();
				setState(1281);
				match(T__5);
				}
				}
				break;
			case T__2:
			case T__10:
			case T__20:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case K_FOR:
			case K_IF:
			case K_NULL:
			case K_SELECT:
			case K_VALUES:
			case K_INT:
			case K_FLOAT:
			case K_WHILE:
			case K_TRY:
			case K_SWITCH:
			case K_BREAK:
			case K_DO:
			case K_PRINT:
			case K_RETURN:
			case K_VAR:
			case K_ARRAY:
			case K_FORECH:
			case K_FALSE:
			case K_TRUE:
			case K_NUMBER:
			case K_STRING:
			case K_BOOLEAN:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
				{
				setState(1283);
				def_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_whileContext extends ParserRuleContext {
		public TerminalNode K_DO() { return getToken(SQLParser.K_DO, 0); }
		public TerminalNode K_WHILE() { return getToken(SQLParser.K_WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Def_stmtContext def_stmt() {
			return getRuleContext(Def_stmtContext.class,0);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public Def_stmt_listContext def_stmt_list() {
			return getRuleContext(Def_stmt_listContext.class,0);
		}
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDo_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_do_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			match(K_DO);
			setState(1292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				{
				setState(1287);
				match(T__4);
				setState(1288);
				def_stmt_list();
				setState(1289);
				match(T__5);
				}
				}
				break;
			case T__2:
			case T__10:
			case T__20:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case K_FOR:
			case K_IF:
			case K_NULL:
			case K_SELECT:
			case K_VALUES:
			case K_INT:
			case K_FLOAT:
			case K_WHILE:
			case K_TRY:
			case K_SWITCH:
			case K_BREAK:
			case K_DO:
			case K_PRINT:
			case K_RETURN:
			case K_VAR:
			case K_ARRAY:
			case K_FORECH:
			case K_FALSE:
			case K_TRUE:
			case K_NUMBER:
			case K_STRING:
			case K_BOOLEAN:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
				{
				setState(1291);
				def_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1294);
			match(K_WHILE);
			setState(1295);
			match(OPEN_PAR);
			setState(1297); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1296);
				cond(0);
				}
				}
				setState(1299); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (K_NULL - 127)) | (1L << (K_INT - 127)) | (1L << (K_FLOAT - 127)) | (1L << (K_VAR - 127)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (K_FALSE - 193)) | (1L << (K_TRUE - 193)) | (1L << (K_NUMBER - 193)) | (1L << (K_STRING - 193)) | (1L << (K_BOOLEAN - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (NUMERIC_LITERAL - 193)) | (1L << (STRING_LITERAL - 193)))) != 0) );
			setState(1301);
			match(CLOSE_PAR);
			setState(1302);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_repeatContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(SQLParser.K_FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Def_stmtContext> def_stmt() {
			return getRuleContexts(Def_stmtContext.class);
		}
		public Def_stmtContext def_stmt(int i) {
			return getRuleContext(Def_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public Def_stmt_listContext def_stmt_list() {
			return getRuleContext(Def_stmt_listContext.class,0);
		}
		public For_repeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFor_repeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFor_repeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFor_repeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_repeatContext for_repeat() throws RecognitionException {
		For_repeatContext _localctx = new For_repeatContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_for_repeat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1304);
			match(K_FOR);
			setState(1305);
			match(OPEN_PAR);
			setState(1306);
			def_stmt();
			setState(1307);
			match(SCOL);
			setState(1309); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1308);
					cond(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1311); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__10) | (1L << T__20) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (K_FOR - 96)) | (1L << (K_IF - 96)) | (1L << (K_NULL - 96)) | (1L << (K_SELECT - 96)))) != 0) || ((((_la - 168)) & ~0x3f) == 0 && ((1L << (_la - 168)) & ((1L << (K_VALUES - 168)) | (1L << (K_INT - 168)) | (1L << (K_FLOAT - 168)) | (1L << (K_WHILE - 168)) | (1L << (K_TRY - 168)) | (1L << (K_SWITCH - 168)) | (1L << (K_BREAK - 168)) | (1L << (K_DO - 168)) | (1L << (K_PRINT - 168)) | (1L << (K_RETURN - 168)) | (1L << (K_VAR - 168)) | (1L << (K_ARRAY - 168)) | (1L << (K_FORECH - 168)) | (1L << (K_FALSE - 168)) | (1L << (K_TRUE - 168)) | (1L << (K_NUMBER - 168)) | (1L << (K_STRING - 168)) | (1L << (K_BOOLEAN - 168)) | (1L << (IDENTIFIER - 168)) | (1L << (NUMERIC_LITERAL - 168)) | (1L << (STRING_LITERAL - 168)))) != 0)) {
				{
				setState(1313);
				def_stmt();
				}
			}

			setState(1316);
			match(SCOL);
			setState(1317);
			def_stmt();
			setState(1318);
			match(CLOSE_PAR);
			setState(1324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				{
				setState(1319);
				match(T__4);
				setState(1320);
				def_stmt_list();
				setState(1321);
				match(T__5);
				}
				}
				break;
			case T__2:
			case T__10:
			case T__20:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case K_FOR:
			case K_IF:
			case K_NULL:
			case K_SELECT:
			case K_VALUES:
			case K_INT:
			case K_FLOAT:
			case K_WHILE:
			case K_TRY:
			case K_SWITCH:
			case K_BREAK:
			case K_DO:
			case K_PRINT:
			case K_RETURN:
			case K_VAR:
			case K_ARRAY:
			case K_FORECH:
			case K_FALSE:
			case K_TRUE:
			case K_NUMBER:
			case K_STRING:
			case K_BOOLEAN:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
				{
				setState(1323);
				def_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachContext extends ParserRuleContext {
		public TerminalNode K_FORECH() { return getToken(SQLParser.K_FORECH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Def_stmtContext def_stmt() {
			return getRuleContext(Def_stmtContext.class,0);
		}
		public Def_stmt_listContext def_stmt_list() {
			return getRuleContext(Def_stmt_listContext.class,0);
		}
		public ForeachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitForeach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachContext foreach() throws RecognitionException {
		ForeachContext _localctx = new ForeachContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			match(K_FORECH);
			setState(1327);
			match(OPEN_PAR);
			setState(1328);
			match(K_VAR);
			setState(1329);
			match(IDENTIFIER);
			setState(1330);
			match(K_IN);
			setState(1331);
			match(IDENTIFIER);
			setState(1332);
			match(CLOSE_PAR);
			setState(1338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				{
				setState(1333);
				match(T__4);
				setState(1334);
				def_stmt_list();
				setState(1335);
				match(T__5);
				}
				}
				break;
			case T__2:
			case T__10:
			case T__20:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case K_FOR:
			case K_IF:
			case K_NULL:
			case K_SELECT:
			case K_VALUES:
			case K_INT:
			case K_FLOAT:
			case K_WHILE:
			case K_TRY:
			case K_SWITCH:
			case K_BREAK:
			case K_DO:
			case K_PRINT:
			case K_RETURN:
			case K_VAR:
			case K_ARRAY:
			case K_FORECH:
			case K_FALSE:
			case K_TRUE:
			case K_NUMBER:
			case K_STRING:
			case K_BOOLEAN:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
				{
				setState(1337);
				def_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatContext extends ParserRuleContext {
		public While_repeatContext while_repeat() {
			return getRuleContext(While_repeatContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public For_repeatContext for_repeat() {
			return getRuleContext(For_repeatContext.class,0);
		}
		public ForeachContext foreach() {
			return getRuleContext(ForeachContext.class,0);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_repeat);
		try {
			setState(1344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1340);
				while_repeat();
				}
				break;
			case K_DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(1341);
				do_while();
				}
				break;
			case K_FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1342);
				for_repeat();
				}
				break;
			case K_FORECH:
				enterOuterAlt(_localctx, 4);
				{
				setState(1343);
				foreach();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_valueContext extends ParserRuleContext {
		public TerminalNode K_RETURN() { return getToken(SQLParser.K_RETURN, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public Return_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterReturn_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitReturn_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitReturn_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_valueContext return_value() throws RecognitionException {
		Return_valueContext _localctx = new Return_valueContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_return_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			match(K_RETURN);
			setState(1351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (K_NULL - 127)) | (1L << (K_INT - 127)) | (1L << (K_FLOAT - 127)) | (1L << (K_VAR - 127)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (K_FALSE - 193)) | (1L << (K_TRUE - 193)) | (1L << (K_NUMBER - 193)) | (1L << (K_STRING - 193)) | (1L << (K_BOOLEAN - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (NUMERIC_LITERAL - 193)) | (1L << (STRING_LITERAL - 193)))) != 0)) {
				{
				setState(1349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1347);
					exp(0);
					}
					break;
				case 2:
					{
					setState(1348);
					cond(0);
					}
					break;
				}
				}
				setState(1353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1354);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Try_catchContext extends ParserRuleContext {
		public Try_StatementContext try_Statement() {
			return getRuleContext(Try_StatementContext.class,0);
		}
		public Catch_StatementContext catch_Statement() {
			return getRuleContext(Catch_StatementContext.class,0);
		}
		public TerminalNode K_FINALY() { return getToken(SQLParser.K_FINALY, 0); }
		public Def_stmt_listContext def_stmt_list() {
			return getRuleContext(Def_stmt_listContext.class,0);
		}
		public Try_catchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_catch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTry_catch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTry_catch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTry_catch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_catchContext try_catch() throws RecognitionException {
		Try_catchContext _localctx = new Try_catchContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_try_catch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			try_Statement();
			setState(1357);
			catch_Statement();
			setState(1360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1358);
				match(K_FINALY);
				setState(1359);
				def_stmt_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Try_StatementContext extends ParserRuleContext {
		public TerminalNode K_TRY() { return getToken(SQLParser.K_TRY, 0); }
		public Def_stmt_listContext def_stmt_list() {
			return getRuleContext(Def_stmt_listContext.class,0);
		}
		public Try_StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_Statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTry_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTry_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTry_Statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_StatementContext try_Statement() throws RecognitionException {
		Try_StatementContext _localctx = new Try_StatementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_try_Statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			match(K_TRY);
			setState(1363);
			def_stmt_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Catch_StatementContext extends ParserRuleContext {
		public TerminalNode K_CATCH() { return getToken(SQLParser.K_CATCH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode K_EXCEPTION() { return getToken(SQLParser.K_EXCEPTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Def_stmt_listContext def_stmt_list() {
			return getRuleContext(Def_stmt_listContext.class,0);
		}
		public Catch_StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_Statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCatch_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCatch_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCatch_Statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_StatementContext catch_Statement() throws RecognitionException {
		Catch_StatementContext _localctx = new Catch_StatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_catch_Statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			match(K_CATCH);
			setState(1366);
			match(OPEN_PAR);
			setState(1367);
			match(K_EXCEPTION);
			setState(1368);
			match(IDENTIFIER);
			setState(1369);
			match(CLOSE_PAR);
			setState(1370);
			def_stmt_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_caseContext extends ParserRuleContext {
		public TerminalNode K_SWITCH() { return getToken(SQLParser.K_SWITCH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Switch_bodyContext switch_body() {
			return getRuleContext(Switch_bodyContext.class,0);
		}
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSwitch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSwitch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSwitch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_switch_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372);
			match(K_SWITCH);
			setState(1373);
			match(OPEN_PAR);
			setState(1374);
			exp(0);
			setState(1375);
			match(CLOSE_PAR);
			setState(1376);
			match(T__4);
			setState(1377);
			switch_body();
			setState(1378);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_bodyContext extends ParserRuleContext {
		public List<CasesContext> cases() {
			return getRuleContexts(CasesContext.class);
		}
		public CasesContext cases(int i) {
			return getRuleContext(CasesContext.class,i);
		}
		public Default_statementContext default_statement() {
			return getRuleContext(Default_statementContext.class,0);
		}
		public Switch_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSwitch_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSwitch_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSwitch_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_bodyContext switch_body() throws RecognitionException {
		Switch_bodyContext _localctx = new Switch_bodyContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_switch_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1380);
				cases();
				}
				}
				setState(1383); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_CASE );
			setState(1386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFAULT) {
				{
				setState(1385);
				default_statement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasesContext extends ParserRuleContext {
		public TerminalNode K_CASE() { return getToken(SQLParser.K_CASE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Def_stmt_listContext def_stmt_list() {
			return getRuleContext(Def_stmt_listContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			match(K_CASE);
			setState(1389);
			exp(0);
			setState(1390);
			match(T__6);
			setState(1391);
			def_stmt_list();
			setState(1395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(1392);
				match(SCOL);
				}
				}
				setState(1397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_statementContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public Def_stmtContext def_stmt() {
			return getRuleContext(Def_stmtContext.class,0);
		}
		public Def_stmt_listContext def_stmt_list() {
			return getRuleContext(Def_stmt_listContext.class,0);
		}
		public Default_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDefault_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDefault_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDefault_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_statementContext default_statement() throws RecognitionException {
		Default_statementContext _localctx = new Default_statementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_default_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1398);
			match(K_DEFAULT);
			setState(1399);
			match(T__6);
			setState(1405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				{
				setState(1400);
				match(T__4);
				setState(1401);
				def_stmt_list();
				setState(1402);
				match(T__5);
				}
				}
				break;
			case T__2:
			case T__10:
			case T__20:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case K_FOR:
			case K_IF:
			case K_NULL:
			case K_SELECT:
			case K_VALUES:
			case K_INT:
			case K_FLOAT:
			case K_WHILE:
			case K_TRY:
			case K_SWITCH:
			case K_BREAK:
			case K_DO:
			case K_PRINT:
			case K_RETURN:
			case K_VAR:
			case K_ARRAY:
			case K_FORECH:
			case K_FALSE:
			case K_TRUE:
			case K_NUMBER:
			case K_STRING:
			case K_BOOLEAN:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
				{
				setState(1404);
				def_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_funcContext extends ParserRuleContext {
		public TerminalNode K_PRINT() { return getToken(SQLParser.K_PRINT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> PLUS() { return getTokens(SQLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SQLParser.PLUS, i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Print_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPrint_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPrint_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPrint_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_funcContext print_func() throws RecognitionException {
		Print_funcContext _localctx = new Print_funcContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_print_func);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			match(K_PRINT);
			setState(1408);
			match(OPEN_PAR);
			setState(1409);
			exp(0);
			setState(1414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(1410);
				match(PLUS);
				setState(1411);
				exp(0);
				}
				}
				setState(1416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1417);
			match(CLOSE_PAR);
			setState(1421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1418);
					match(SCOL);
					}
					} 
				}
				setState(1423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sort_func_defContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_FUNCTION() { return getToken(SQLParser.K_FUNCTION, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_RETURN() { return getToken(SQLParser.K_RETURN, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public Sort_func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSort_func_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSort_func_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSort_func_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sort_func_defContext sort_func_def() throws RecognitionException {
		Sort_func_defContext _localctx = new Sort_func_defContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_sort_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			match(IDENTIFIER);
			setState(1425);
			match(OPEN_PAR);
			setState(1426);
			match(IDENTIFIER);
			setState(1427);
			match(COMMA);
			setState(1428);
			match(K_FUNCTION);
			setState(1429);
			match(OPEN_PAR);
			setState(1430);
			match(IDENTIFIER);
			setState(1431);
			match(COMMA);
			setState(1432);
			match(IDENTIFIER);
			setState(1433);
			match(CLOSE_PAR);
			setState(1434);
			match(T__4);
			setState(1435);
			match(K_RETURN);
			setState(1436);
			match(IDENTIFIER);
			setState(1437);
			_la = _input.LA(1);
			if ( !(_la==LT || _la==GT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1438);
			match(IDENTIFIER);
			setState(1439);
			match(SCOL);
			setState(1440);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_defContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode K_ARRAY() { return getToken(SQLParser.K_ARRAY, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public BodyArrayContext bodyArray() {
			return getRuleContext(BodyArrayContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Array_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_defContext array_def() throws RecognitionException {
		Array_defContext _localctx = new Array_defContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_array_def);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			_la = _input.LA(1);
			if ( !(_la==K_VAR || _la==K_ARRAY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1443);
			match(IDENTIFIER);
			setState(1444);
			match(T__8);
			setState(1447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1445);
				match(ASSIGN);
				setState(1446);
				bodyArray();
				}
			}

			setState(1452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1449);
					match(SCOL);
					}
					} 
				}
				setState(1454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyArrayContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<Body_for_jsonContext> body_for_json() {
			return getRuleContexts(Body_for_jsonContext.class);
		}
		public Body_for_jsonContext body_for_json(int i) {
			return getRuleContext(Body_for_jsonContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public BodyArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterBodyArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitBodyArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitBodyArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyArrayContext bodyArray() throws RecognitionException {
		BodyArrayContext _localctx = new BodyArrayContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_bodyArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			match(T__9);
			setState(1458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1456);
				exp(0);
				}
				break;
			case 2:
				{
				setState(1457);
				body_for_json();
				}
				break;
			}
			setState(1467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1460);
				match(COMMA);
				setState(1463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1461);
					exp(0);
					}
					break;
				case 2:
					{
					setState(1462);
					body_for_json();
					}
					break;
				}
				}
				}
				setState(1469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1470);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arr_setValueContext extends ParserRuleContext {
		public Arr_getValueContext arr_getValue() {
			return getRuleContext(Arr_getValueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Arr_setValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_setValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArr_setValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArr_setValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArr_setValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arr_setValueContext arr_setValue() throws RecognitionException {
		Arr_setValueContext _localctx = new Arr_setValueContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_arr_setValue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			arr_getValue();
			setState(1473);
			match(ASSIGN);
			setState(1474);
			exp(0);
			setState(1478);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1475);
					match(SCOL);
					}
					} 
				}
				setState(1480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arr_getValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Arr_getValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_getValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArr_getValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArr_getValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArr_getValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arr_getValueContext arr_getValue() throws RecognitionException {
		Arr_getValueContext _localctx = new Arr_getValueContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_arr_getValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1481);
			match(IDENTIFIER);
			setState(1482);
			match(T__9);
			setState(1483);
			exp(0);
			setState(1484);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key_valueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public Key_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterKey_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitKey_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitKey_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key_valueContext key_value() throws RecognitionException {
		Key_valueContext _localctx = new Key_valueContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_key_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			match(IDENTIFIER);
			setState(1487);
			match(T__6);
			setState(1494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1488);
				match(NUMERIC_LITERAL);
				}
				break;
			case 2:
				{
				setState(1489);
				exp(0);
				}
				break;
			case 3:
				{
				setState(1490);
				match(T__2);
				setState(1491);
				character();
				setState(1492);
				match(T__2);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Body_for_jsonContext extends ParserRuleContext {
		public List<Key_valueContext> key_value() {
			return getRuleContexts(Key_valueContext.class);
		}
		public Key_valueContext key_value(int i) {
			return getRuleContext(Key_valueContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<BodyArrayContext> bodyArray() {
			return getRuleContexts(BodyArrayContext.class);
		}
		public BodyArrayContext bodyArray(int i) {
			return getRuleContext(BodyArrayContext.class,i);
		}
		public List<Body_for_jsonContext> body_for_json() {
			return getRuleContexts(Body_for_jsonContext.class);
		}
		public Body_for_jsonContext body_for_json(int i) {
			return getRuleContext(Body_for_jsonContext.class,i);
		}
		public Body_for_jsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_for_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterBody_for_json(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitBody_for_json(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitBody_for_json(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_for_jsonContext body_for_json() throws RecognitionException {
		Body_for_jsonContext _localctx = new Body_for_jsonContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_body_for_json);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1496);
				key_value();
				}
				break;
			case 2:
				{
				setState(1497);
				match(IDENTIFIER);
				setState(1498);
				match(T__6);
				setState(1504);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					{
					setState(1499);
					match(T__4);
					setState(1500);
					body_for_json();
					setState(1501);
					match(T__5);
					}
					}
					break;
				case T__9:
					{
					setState(1503);
					bodyArray();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(1522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1520);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
					case 1:
						{
						{
						setState(1508);
						match(COMMA);
						setState(1509);
						key_value();
						}
						}
						break;
					case 2:
						{
						setState(1510);
						match(COMMA);
						setState(1511);
						match(IDENTIFIER);
						setState(1512);
						match(T__6);
						setState(1518);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__4:
							{
							{
							setState(1513);
							match(T__4);
							setState(1514);
							body_for_json();
							setState(1515);
							match(T__5);
							}
							}
							break;
						case T__9:
							{
							setState(1517);
							bodyArray();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(1524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Obj_jsonContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public Body_for_jsonContext body_for_json() {
			return getRuleContext(Body_for_jsonContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Obj_jsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterObj_json(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitObj_json(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitObj_json(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Obj_jsonContext obj_json() throws RecognitionException {
		Obj_jsonContext _localctx = new Obj_jsonContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_obj_json);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(1525);
				match(K_VAR);
				}
			}

			setState(1528);
			match(IDENTIFIER);
			setState(1529);
			match(ASSIGN);
			setState(1530);
			match(T__4);
			setState(1532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1531);
				body_for_json();
				}
			}

			setState(1534);
			match(T__5);
			setState(1538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1535);
					match(SCOL);
					}
					} 
				}
				setState(1540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Read_obj_jsonContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public Read_obj_jsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_obj_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRead_obj_json(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRead_obj_json(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitRead_obj_json(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_obj_jsonContext read_obj_json() throws RecognitionException {
		Read_obj_jsonContext _localctx = new Read_obj_jsonContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_read_obj_json);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1541);
			match(IDENTIFIER);
			setState(1544); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1542);
					match(DOT);
					setState(1543);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1546); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Write_obj_jsonContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public Write_obj_jsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_obj_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterWrite_obj_json(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitWrite_obj_json(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitWrite_obj_json(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_obj_jsonContext write_obj_json() throws RecognitionException {
		Write_obj_jsonContext _localctx = new Write_obj_jsonContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_write_obj_json);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1548);
			match(IDENTIFIER);
			setState(1551); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1549);
				match(DOT);
				setState(1550);
				match(IDENTIFIER);
				}
				}
				setState(1553); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOT );
			setState(1555);
			match(ASSIGN);
			setState(1556);
			exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SQLParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SQLParser.NUMERIC_LITERAL, i);
		}
		public List<TerminalNode> GT() { return getTokens(SQLParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(SQLParser.GT, i);
		}
		public List<TerminalNode> LT() { return getTokens(SQLParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(SQLParser.LT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(SQLParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(SQLParser.DIV, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public List<TerminalNode> STAR() { return getTokens(SQLParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(SQLParser.STAR, i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public List<TerminalNode> AMP() { return getTokens(SQLParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(SQLParser.AMP, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SQLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SQLParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SQLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SQLParser.MINUS, i);
		}
		public List<TerminalNode> TILDE() { return getTokens(SQLParser.TILDE); }
		public TerminalNode TILDE(int i) {
			return getToken(SQLParser.TILDE, i);
		}
		public List<TerminalNode> PIPE() { return getTokens(SQLParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(SQLParser.PIPE, i);
		}
		public List<TerminalNode> MOD() { return getTokens(SQLParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(SQLParser.MOD, i);
		}
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_character);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1559); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1558);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << DOT) | (1L << OPEN_PAR) | (1L << CLOSE_PAR) | (1L << ASSIGN) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << DIV) | (1L << MOD) | (1L << AMP) | (1L << PIPE) | (1L << LT) | (1L << GT))) != 0) || _la==IDENTIFIER || _la==NUMERIC_LITERAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1561); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statement_coreContext extends ParserRuleContext {
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Def_stmtContext def_stmt() {
			return getRuleContext(Def_stmtContext.class,0);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public Def_stmt_listContext def_stmt_list() {
			return getRuleContext(Def_stmt_listContext.class,0);
		}
		public If_statement_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIf_statement_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIf_statement_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIf_statement_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statement_coreContext if_statement_core() throws RecognitionException {
		If_statement_coreContext _localctx = new If_statement_coreContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_if_statement_core);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1563);
			match(K_IF);
			setState(1564);
			match(OPEN_PAR);
			setState(1566); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1565);
				cond(0);
				}
				}
				setState(1568); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (K_NULL - 127)) | (1L << (K_INT - 127)) | (1L << (K_FLOAT - 127)) | (1L << (K_VAR - 127)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (K_FALSE - 193)) | (1L << (K_TRUE - 193)) | (1L << (K_NUMBER - 193)) | (1L << (K_STRING - 193)) | (1L << (K_BOOLEAN - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (NUMERIC_LITERAL - 193)) | (1L << (STRING_LITERAL - 193)))) != 0) );
			setState(1570);
			match(CLOSE_PAR);
			setState(1576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				{
				setState(1571);
				match(T__4);
				setState(1572);
				def_stmt_list();
				setState(1573);
				match(T__5);
				}
				}
				break;
			case T__2:
			case T__10:
			case T__20:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case K_FOR:
			case K_IF:
			case K_NULL:
			case K_SELECT:
			case K_VALUES:
			case K_INT:
			case K_FLOAT:
			case K_WHILE:
			case K_TRY:
			case K_SWITCH:
			case K_BREAK:
			case K_DO:
			case K_PRINT:
			case K_RETURN:
			case K_VAR:
			case K_ARRAY:
			case K_FORECH:
			case K_FALSE:
			case K_TRUE:
			case K_NUMBER:
			case K_STRING:
			case K_BOOLEAN:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
				{
				setState(1575);
				def_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public If_statement_coreContext if_statement_core() {
			return getRuleContext(If_statement_coreContext.class,0);
		}
		public List<Else_if_statementContext> else_if_statement() {
			return getRuleContexts(Else_if_statementContext.class);
		}
		public Else_if_statementContext else_if_statement(int i) {
			return getRuleContext(Else_if_statementContext.class,i);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_if_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1578);
			if_statement_core();
			setState(1582);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1579);
					else_if_statement();
					}
					} 
				}
				setState(1584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			}
			setState(1586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1585);
				else_statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_if_statementContext extends ParserRuleContext {
		public TerminalNode K_ELSE() { return getToken(SQLParser.K_ELSE, 0); }
		public If_statement_coreContext if_statement_core() {
			return getRuleContext(If_statement_coreContext.class,0);
		}
		public Else_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterElse_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitElse_if_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitElse_if_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_statementContext else_if_statement() throws RecognitionException {
		Else_if_statementContext _localctx = new Else_if_statementContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_else_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1588);
			match(K_ELSE);
			setState(1589);
			if_statement_core();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode K_ELSE() { return getToken(SQLParser.K_ELSE, 0); }
		public Def_stmtContext def_stmt() {
			return getRuleContext(Def_stmtContext.class,0);
		}
		public Def_stmt_listContext def_stmt_list() {
			return getRuleContext(Def_stmt_listContext.class,0);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitElse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591);
			match(K_ELSE);
			setState(1597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				{
				setState(1592);
				match(T__4);
				setState(1593);
				def_stmt_list();
				setState(1594);
				match(T__5);
				}
				}
				break;
			case T__2:
			case T__10:
			case T__20:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case K_FOR:
			case K_IF:
			case K_NULL:
			case K_SELECT:
			case K_VALUES:
			case K_INT:
			case K_FLOAT:
			case K_WHILE:
			case K_TRY:
			case K_SWITCH:
			case K_BREAK:
			case K_DO:
			case K_PRINT:
			case K_RETURN:
			case K_VAR:
			case K_ARRAY:
			case K_FORECH:
			case K_FALSE:
			case K_TRUE:
			case K_NUMBER:
			case K_STRING:
			case K_BOOLEAN:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
				{
				setState(1596);
				def_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statement_one_lineContext extends ParserRuleContext {
		public Keyword_defContext keyword_def() {
			return getRuleContext(Keyword_defContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public Body_onelineCondContext body_onelineCond() {
			return getRuleContext(Body_onelineCondContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public If_statement_one_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement_one_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIf_statement_one_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIf_statement_one_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIf_statement_one_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statement_one_lineContext if_statement_one_line() throws RecognitionException {
		If_statement_one_lineContext _localctx = new If_statement_one_lineContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_if_statement_one_line);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1599);
			keyword_def();
			setState(1600);
			match(IDENTIFIER);
			setState(1601);
			match(ASSIGN);
			{
			setState(1602);
			body_onelineCond();
			}
			setState(1606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1603);
					match(SCOL);
					}
					} 
				}
				setState(1608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Body_onelineCondContext extends ParserRuleContext {
		public List<Def_stmt_listContext> def_stmt_list() {
			return getRuleContexts(Def_stmt_listContext.class);
		}
		public Def_stmt_listContext def_stmt_list(int i) {
			return getRuleContext(Def_stmt_listContext.class,i);
		}
		public List<Def_stmtContext> def_stmt() {
			return getRuleContexts(Def_stmtContext.class);
		}
		public Def_stmtContext def_stmt(int i) {
			return getRuleContext(Def_stmtContext.class,i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<Body_onelineCondContext> body_onelineCond() {
			return getRuleContexts(Body_onelineCondContext.class);
		}
		public Body_onelineCondContext body_onelineCond(int i) {
			return getRuleContext(Body_onelineCondContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public Body_onelineCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_onelineCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterBody_onelineCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitBody_onelineCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitBody_onelineCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_onelineCondContext body_onelineCond() throws RecognitionException {
		Body_onelineCondContext _localctx = new Body_onelineCondContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_body_onelineCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1609);
				cond(0);
				}
				}
				setState(1612); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (K_NULL - 127)) | (1L << (K_INT - 127)) | (1L << (K_FLOAT - 127)) | (1L << (K_VAR - 127)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (K_FALSE - 193)) | (1L << (K_TRUE - 193)) | (1L << (K_NUMBER - 193)) | (1L << (K_STRING - 193)) | (1L << (K_BOOLEAN - 193)) | (1L << (IDENTIFIER - 193)) | (1L << (NUMERIC_LITERAL - 193)) | (1L << (STRING_LITERAL - 193)))) != 0) );
			setState(1614);
			match(T__12);
			setState(1624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1615);
				match(T__4);
				setState(1616);
				def_stmt_list();
				setState(1617);
				match(T__5);
				}
				break;
			case 2:
				{
				setState(1619);
				def_stmt();
				}
				break;
			case 3:
				{
				setState(1620);
				match(OPEN_PAR);
				setState(1621);
				body_onelineCond();
				setState(1622);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(1626);
			match(T__6);
			setState(1636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1627);
				match(T__4);
				setState(1628);
				def_stmt_list();
				setState(1629);
				match(T__5);
				}
				break;
			case 2:
				{
				setState(1631);
				def_stmt();
				}
				break;
			case 3:
				{
				setState(1632);
				match(OPEN_PAR);
				setState(1633);
				body_onelineCond();
				setState(1634);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Keyword_defContext keyword_def() {
			return getRuleContext(Keyword_defContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Op_doubleContext op_double() {
			return getRuleContext(Op_doubleContext.class,0);
		}
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Prototype_funcContext prototype_func() {
			return getRuleContext(Prototype_funcContext.class,0);
		}
		public Read_obj_jsonContext read_obj_json() {
			return getRuleContext(Read_obj_jsonContext.class,0);
		}
		public Arr_getValueContext arr_getValue() {
			return getRuleContext(Arr_getValueContext.class,0);
		}
		public NumbersContext numbers() {
			return getRuleContext(NumbersContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 214;
		enterRecursionRule(_localctx, 214, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 176)) & ~0x3f) == 0 && ((1L << (_la - 176)) & ((1L << (K_INT - 176)) | (1L << (K_FLOAT - 176)) | (1L << (K_VAR - 176)) | (1L << (K_NUMBER - 176)) | (1L << (K_STRING - 176)) | (1L << (K_BOOLEAN - 176)))) != 0)) {
					{
					setState(1639);
					keyword_def();
					}
				}

				setState(1642);
				match(IDENTIFIER);
				setState(1644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << DIV))) != 0)) {
					{
					setState(1643);
					op();
					}
				}

				setState(1646);
				match(ASSIGN);
				setState(1647);
				exp(0);
				setState(1651);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1648);
						match(SCOL);
						}
						} 
					}
					setState(1653);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(1654);
				match(OPEN_PAR);
				setState(1655);
				exp(0);
				setState(1656);
				match(CLOSE_PAR);
				setState(1660);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1657);
						match(SCOL);
						}
						} 
					}
					setState(1662);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(1663);
				op_double();
				setState(1664);
				match(IDENTIFIER);
				setState(1670);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1665);
					match(ASSIGN);
					setState(1668);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
					case 1:
						{
						setState(1666);
						exp(0);
						}
						break;
					case 2:
						{
						setState(1667);
						match(IDENTIFIER);
						}
						break;
					}
					}
					break;
				}
				setState(1675);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1672);
						match(SCOL);
						}
						} 
					}
					setState(1677);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				}
				}
				break;
			case 4:
				{
				setState(1678);
				any_name();
				setState(1679);
				op_double();
				setState(1685);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1680);
					match(ASSIGN);
					setState(1683);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
					case 1:
						{
						setState(1681);
						exp(0);
						}
						break;
					case 2:
						{
						setState(1682);
						match(IDENTIFIER);
						}
						break;
					}
					}
					break;
				}
				setState(1690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1687);
						match(SCOL);
						}
						} 
					}
					setState(1692);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
				}
				}
				break;
			case 5:
				{
				setState(1693);
				prototype_func();
				setState(1697);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1694);
						match(SCOL);
						}
						} 
					}
					setState(1699);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
				}
				}
				break;
			case 6:
				{
				setState(1700);
				read_obj_json();
				setState(1704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1701);
						match(SCOL);
						}
						} 
					}
					setState(1706);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
				}
				}
				break;
			case 7:
				{
				setState(1707);
				arr_getValue();
				setState(1711);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1708);
						match(SCOL);
						}
						} 
					}
					setState(1713);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
				}
				}
				break;
			case 8:
				{
				setState(1714);
				any_name();
				setState(1718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1715);
						match(SCOL);
						}
						} 
					}
					setState(1720);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
				}
				}
				break;
			case 9:
				{
				setState(1721);
				numbers();
				setState(1725);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1722);
						match(SCOL);
						}
						} 
					}
					setState(1727);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				}
				}
				break;
			case 10:
				{
				setState(1728);
				match(T__2);
				setState(1729);
				character();
				setState(1730);
				match(T__2);
				setState(1734);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1731);
						match(SCOL);
						}
						} 
					}
					setState(1736);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
				}
				}
				break;
			case 11:
				{
				setState(1737);
				booleanValue();
				setState(1741);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1738);
						match(SCOL);
						}
						} 
					}
					setState(1743);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
				}
				}
				break;
			case 12:
				{
				setState(1744);
				match(K_NULL);
				setState(1748);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1745);
						match(SCOL);
						}
						} 
					}
					setState(1750);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1782);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1780);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(1753);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1754);
						match(STAR);
						setState(1755);
						exp(0);
						setState(1759);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1756);
								match(SCOL);
								}
								} 
							}
							setState(1761);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
						}
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(1762);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1763);
						match(DIV);
						setState(1764);
						exp(0);
						setState(1768);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1765);
								match(SCOL);
								}
								} 
							}
							setState(1770);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
						}
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(1771);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1772);
						op();
						setState(1773);
						exp(0);
						setState(1777);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1774);
								match(SCOL);
								}
								} 
							}
							setState(1779);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(1784);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NumbersContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public NumbersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numbers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterNumbers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitNumbers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitNumbers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumbersContext numbers() throws RecognitionException {
		NumbersContext _localctx = new NumbersContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_numbers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1785);
			match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode K_TRUE() { return getToken(SQLParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(SQLParser.K_FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			_la = _input.LA(1);
			if ( !(_la==K_FALSE || _la==K_TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLParser.GT_EQ, 0); }
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLParser.NOT_EQ1, 0); }
		public Prototype_funcContext prototype_func() {
			return getRuleContext(Prototype_funcContext.class,0);
		}
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode K_ISNULL() { return getToken(SQLParser.K_ISNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public NumbersContext numbers() {
			return getRuleContext(NumbersContext.class,0);
		}
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode PIPE2() { return getToken(SQLParser.PIPE2, 0); }
		public TerminalNode PIPE() { return getToken(SQLParser.PIPE, 0); }
		public TerminalNode AMP() { return getToken(SQLParser.AMP, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 220;
		enterRecursionRule(_localctx, 220, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1790);
				exp(0);
				setState(1791);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1792);
				exp(0);
				}
				break;
			case 2:
				{
				setState(1794);
				prototype_func();
				}
				break;
			case 3:
				{
				setState(1795);
				any_name();
				}
				break;
			case 4:
				{
				setState(1796);
				exp(0);
				setState(1800);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQ:
				case NOT_EQ1:
					{
					{
					setState(1797);
					_la = _input.LA(1);
					if ( !(_la==EQ || _la==NOT_EQ1) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1798);
					match(K_NULL);
					}
					}
					break;
				case K_ISNULL:
					{
					setState(1799);
					match(K_ISNULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				{
				setState(1802);
				match(OPEN_PAR);
				setState(1803);
				cond(0);
				setState(1804);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1806);
				numbers();
				}
				break;
			case 7:
				{
				setState(1807);
				booleanValue();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1815);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cond);
					setState(1810);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(1811);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << PIPE2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1812);
					cond(5);
					}
					} 
				}
				setState(1817);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CommentsContext extends ParserRuleContext {
		public List<CharacterContext> character() {
			return getRuleContexts(CharacterContext.class);
		}
		public CharacterContext character(int i) {
			return getRuleContext(CharacterContext.class,i);
		}
		public CommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterComments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitComments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitComments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentsContext comments() throws RecognitionException {
		CommentsContext _localctx = new CommentsContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_comments);
		int _la;
		try {
			int _alt;
			setState(1833);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1818);
				match(T__10);
				setState(1822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1819);
						character();
						}
						} 
					}
					setState(1824);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
				}
				}
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1825);
				match(T__20);
				setState(1829);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << DOT) | (1L << OPEN_PAR) | (1L << CLOSE_PAR) | (1L << ASSIGN) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << DIV) | (1L << MOD) | (1L << AMP) | (1L << PIPE) | (1L << LT) | (1L << GT))) != 0) || _la==IDENTIFIER || _la==NUMERIC_LITERAL) {
					{
					{
					setState(1826);
					character();
					}
					}
					setState(1831);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1832);
				match(T__21);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_stmt_listContext extends ParserRuleContext {
		public List<CommentsContext> comments() {
			return getRuleContexts(CommentsContext.class);
		}
		public CommentsContext comments(int i) {
			return getRuleContext(CommentsContext.class,i);
		}
		public List<Factored_select_stmtContext> factored_select_stmt() {
			return getRuleContexts(Factored_select_stmtContext.class);
		}
		public Factored_select_stmtContext factored_select_stmt(int i) {
			return getRuleContext(Factored_select_stmtContext.class,i);
		}
		public List<Def_var_coreContext> def_var_core() {
			return getRuleContexts(Def_var_coreContext.class);
		}
		public Def_var_coreContext def_var_core(int i) {
			return getRuleContext(Def_var_coreContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<RepeatContext> repeat() {
			return getRuleContexts(RepeatContext.class);
		}
		public RepeatContext repeat(int i) {
			return getRuleContext(RepeatContext.class,i);
		}
		public List<If_statementContext> if_statement() {
			return getRuleContexts(If_statementContext.class);
		}
		public If_statementContext if_statement(int i) {
			return getRuleContext(If_statementContext.class,i);
		}
		public List<If_statement_one_lineContext> if_statement_one_line() {
			return getRuleContexts(If_statement_one_lineContext.class);
		}
		public If_statement_one_lineContext if_statement_one_line(int i) {
			return getRuleContext(If_statement_one_lineContext.class,i);
		}
		public List<Try_catchContext> try_catch() {
			return getRuleContexts(Try_catchContext.class);
		}
		public Try_catchContext try_catch(int i) {
			return getRuleContext(Try_catchContext.class,i);
		}
		public List<Switch_caseContext> switch_case() {
			return getRuleContexts(Switch_caseContext.class);
		}
		public Switch_caseContext switch_case(int i) {
			return getRuleContext(Switch_caseContext.class,i);
		}
		public List<Print_funcContext> print_func() {
			return getRuleContexts(Print_funcContext.class);
		}
		public Print_funcContext print_func(int i) {
			return getRuleContext(Print_funcContext.class,i);
		}
		public List<Sort_func_defContext> sort_func_def() {
			return getRuleContexts(Sort_func_defContext.class);
		}
		public Sort_func_defContext sort_func_def(int i) {
			return getRuleContext(Sort_func_defContext.class,i);
		}
		public List<Array_defContext> array_def() {
			return getRuleContexts(Array_defContext.class);
		}
		public Array_defContext array_def(int i) {
			return getRuleContext(Array_defContext.class,i);
		}
		public List<Obj_jsonContext> obj_json() {
			return getRuleContexts(Obj_jsonContext.class);
		}
		public Obj_jsonContext obj_json(int i) {
			return getRuleContext(Obj_jsonContext.class,i);
		}
		public List<Write_obj_jsonContext> write_obj_json() {
			return getRuleContexts(Write_obj_jsonContext.class);
		}
		public Write_obj_jsonContext write_obj_json(int i) {
			return getRuleContext(Write_obj_jsonContext.class,i);
		}
		public List<Return_valueContext> return_value() {
			return getRuleContexts(Return_valueContext.class);
		}
		public Return_valueContext return_value(int i) {
			return getRuleContext(Return_valueContext.class,i);
		}
		public List<BreakKeyWordContext> breakKeyWord() {
			return getRuleContexts(BreakKeyWordContext.class);
		}
		public BreakKeyWordContext breakKeyWord(int i) {
			return getRuleContext(BreakKeyWordContext.class,i);
		}
		public List<Arr_setValueContext> arr_setValue() {
			return getRuleContexts(Arr_setValueContext.class);
		}
		public Arr_setValueContext arr_setValue(int i) {
			return getRuleContext(Arr_setValueContext.class,i);
		}
		public List<Def_stmt_listContext> def_stmt_list() {
			return getRuleContexts(Def_stmt_listContext.class);
		}
		public Def_stmt_listContext def_stmt_list(int i) {
			return getRuleContext(Def_stmt_listContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Def_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDef_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDef_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDef_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_stmt_listContext def_stmt_list() throws RecognitionException {
		Def_stmt_listContext _localctx = new Def_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_def_stmt_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1864);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1862);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
					case 1:
						{
						setState(1835);
						comments();
						}
						break;
					case 2:
						{
						setState(1836);
						factored_select_stmt();
						setState(1840);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1837);
								match(SCOL);
								}
								} 
							}
							setState(1842);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
						}
						}
						break;
					case 3:
						{
						setState(1843);
						def_var_core();
						}
						break;
					case 4:
						{
						setState(1844);
						exp(0);
						}
						break;
					case 5:
						{
						setState(1845);
						repeat();
						}
						break;
					case 6:
						{
						setState(1846);
						if_statement();
						}
						break;
					case 7:
						{
						setState(1847);
						if_statement_one_line();
						}
						break;
					case 8:
						{
						setState(1848);
						try_catch();
						}
						break;
					case 9:
						{
						setState(1849);
						switch_case();
						}
						break;
					case 10:
						{
						setState(1850);
						print_func();
						}
						break;
					case 11:
						{
						setState(1851);
						sort_func_def();
						}
						break;
					case 12:
						{
						setState(1852);
						array_def();
						}
						break;
					case 13:
						{
						setState(1853);
						obj_json();
						}
						break;
					case 14:
						{
						setState(1854);
						write_obj_json();
						}
						break;
					case 15:
						{
						setState(1855);
						return_value();
						}
						break;
					case 16:
						{
						setState(1856);
						breakKeyWord();
						}
						break;
					case 17:
						{
						setState(1857);
						arr_setValue();
						}
						break;
					case 18:
						{
						setState(1858);
						match(T__4);
						setState(1859);
						def_stmt_list();
						setState(1860);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(1866);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_stmtContext extends ParserRuleContext {
		public CommentsContext comments() {
			return getRuleContext(CommentsContext.class,0);
		}
		public Def_var_coreContext def_var_core() {
			return getRuleContext(Def_var_coreContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public If_statement_one_lineContext if_statement_one_line() {
			return getRuleContext(If_statement_one_lineContext.class,0);
		}
		public Try_catchContext try_catch() {
			return getRuleContext(Try_catchContext.class,0);
		}
		public Switch_caseContext switch_case() {
			return getRuleContext(Switch_caseContext.class,0);
		}
		public Print_funcContext print_func() {
			return getRuleContext(Print_funcContext.class,0);
		}
		public Array_defContext array_def() {
			return getRuleContext(Array_defContext.class,0);
		}
		public Sort_func_defContext sort_func_def() {
			return getRuleContext(Sort_func_defContext.class,0);
		}
		public Obj_jsonContext obj_json() {
			return getRuleContext(Obj_jsonContext.class,0);
		}
		public Return_valueContext return_value() {
			return getRuleContext(Return_valueContext.class,0);
		}
		public Write_obj_jsonContext write_obj_json() {
			return getRuleContext(Write_obj_jsonContext.class,0);
		}
		public BreakKeyWordContext breakKeyWord() {
			return getRuleContext(BreakKeyWordContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Def_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDef_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDef_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDef_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_stmtContext def_stmt() throws RecognitionException {
		Def_stmtContext _localctx = new Def_stmtContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_def_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1867);
				comments();
				}
				break;
			case 2:
				{
				setState(1868);
				def_var_core();
				}
				break;
			case 3:
				{
				setState(1869);
				factored_select_stmt();
				setState(1873);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1870);
						match(SCOL);
						}
						} 
					}
					setState(1875);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
				}
				}
				break;
			case 4:
				{
				setState(1876);
				exp(0);
				}
				break;
			case 5:
				{
				setState(1877);
				repeat();
				}
				break;
			case 6:
				{
				setState(1878);
				if_statement();
				}
				break;
			case 7:
				{
				setState(1879);
				if_statement_one_line();
				}
				break;
			case 8:
				{
				setState(1880);
				try_catch();
				}
				break;
			case 9:
				{
				setState(1881);
				switch_case();
				}
				break;
			case 10:
				{
				setState(1882);
				print_func();
				}
				break;
			case 11:
				{
				setState(1883);
				array_def();
				}
				break;
			case 12:
				{
				setState(1884);
				sort_func_def();
				}
				break;
			case 13:
				{
				setState(1885);
				obj_json();
				}
				break;
			case 14:
				{
				setState(1886);
				return_value();
				}
				break;
			case 15:
				{
				setState(1887);
				write_obj_json();
				}
				break;
			case 16:
				{
				setState(1888);
				breakKeyWord();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << DIV))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_doubleContext extends ParserRuleContext {
		public List<TerminalNode> PLUS() { return getTokens(SQLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SQLParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SQLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SQLParser.MINUS, i);
		}
		public Op_doubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_double; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOp_double(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOp_double(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOp_double(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_doubleContext op_double() throws RecognitionException {
		Op_doubleContext _localctx = new Op_doubleContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_op_double);
		try {
			setState(1897);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1893);
				match(PLUS);
				setState(1894);
				match(PLUS);
				}
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1895);
				match(MINUS);
				setState(1896);
				match(MINUS);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_varContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Def_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDef_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDef_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDef_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_varContext def_var() throws RecognitionException {
		Def_varContext _localctx = new Def_varContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_def_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1899);
			any_name();
			setState(1902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1900);
				match(ASSIGN);
				setState(1901);
				exp(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakKeyWordContext extends ParserRuleContext {
		public TerminalNode K_BREAK() { return getToken(SQLParser.K_BREAK, 0); }
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public BreakKeyWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakKeyWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterBreakKeyWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitBreakKeyWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitBreakKeyWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakKeyWordContext breakKeyWord() throws RecognitionException {
		BreakKeyWordContext _localctx = new BreakKeyWordContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_breakKeyWord);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1904);
			match(K_BREAK);
			setState(1908);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1905);
					match(SCOL);
					}
					} 
				}
				setState(1910);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Keyword_defContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public Keyword_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterKeyword_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitKeyword_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitKeyword_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keyword_defContext keyword_def() throws RecognitionException {
		Keyword_defContext _localctx = new Keyword_defContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_keyword_def);
		try {
			setState(1913);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INT:
			case K_FLOAT:
			case K_NUMBER:
			case K_STRING:
			case K_BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1911);
				types();
				}
				break;
			case K_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1912);
				match(K_VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypesContext extends ParserRuleContext {
		public TerminalNode K_NUMBER() { return getToken(SQLParser.K_NUMBER, 0); }
		public TerminalNode K_STRING() { return getToken(SQLParser.K_STRING, 0); }
		public TerminalNode K_BOOLEAN() { return getToken(SQLParser.K_BOOLEAN, 0); }
		public TerminalNode K_INT() { return getToken(SQLParser.K_INT, 0); }
		public TerminalNode K_FLOAT() { return getToken(SQLParser.K_FLOAT, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1915);
			_la = _input.LA(1);
			if ( !(((((_la - 176)) & ~0x3f) == 0 && ((1L << (_la - 176)) & ((1L << (K_INT - 176)) | (1L << (K_FLOAT - 176)) | (1L << (K_NUMBER - 176)) | (1L << (K_STRING - 176)) | (1L << (K_BOOLEAN - 176)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_any_name);
		try {
			setState(1923);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1917);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1918);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1919);
				match(OPEN_PAR);
				setState(1920);
				any_name();
				setState(1921);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 32:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 107:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 110:
			return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 13);
		case 11:
			return precpred(_ctx, 12);
		case 12:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00d0\u0788\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\3\2\3\2\7\2\u00f7\n\2\f\2\16\2\u00fa\13\2\3\2\3"+
		"\2\3\3\7\3\u00ff\n\3\f\3\16\3\u0102\13\3\3\3\3\3\6\3\u0106\n\3\r\3\16"+
		"\3\u0107\3\3\7\3\u010b\n\3\f\3\16\3\u010e\13\3\3\3\7\3\u0111\n\3\f\3\16"+
		"\3\u0114\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0120\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\5\5\u0127\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\u0132\n\5\3\5\5\5\u0135\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\b\u0146\n\b\f\b\16\b\u0149\13\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u015c\n\t\f\t"+
		"\16\t\u015f\13\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u016d\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u0174\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u017b\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0182\n\17\3\17\3\17\3"+
		"\17\5\17\u0187\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0190\n\17"+
		"\f\17\16\17\u0193\13\17\3\17\3\17\3\17\3\17\5\17\u0199\n\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u01af\n\22\3\23\3\23\3\23\3\23\5\23\u01b5\n"+
		"\23\3\23\3\23\3\23\5\23\u01ba\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u01c4\n\24\f\24\16\24\u01c7\13\24\5\24\u01c9\n\24\3\24\3\24"+
		"\3\24\3\24\5\24\u01cf\n\24\5\24\u01d1\n\24\3\25\3\25\3\25\3\25\3\25\5"+
		"\25\u01d8\n\25\3\25\3\25\3\25\3\25\3\25\7\25\u01df\n\25\f\25\16\25\u01e2"+
		"\13\25\3\25\3\25\5\25\u01e6\n\25\3\25\3\25\3\25\3\25\3\25\7\25\u01ed\n"+
		"\25\f\25\16\25\u01f0\13\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u01f8\n"+
		"\25\f\25\16\25\u01fb\13\25\3\25\3\25\7\25\u01ff\n\25\f\25\16\25\u0202"+
		"\13\25\3\25\3\25\3\25\5\25\u0207\n\25\3\26\3\26\3\26\3\26\3\26\3\26\7"+
		"\26\u020f\n\26\f\26\16\26\u0212\13\26\5\26\u0214\n\26\3\26\3\26\3\26\3"+
		"\26\5\26\u021a\n\26\5\26\u021c\n\26\3\27\3\27\5\27\u0220\n\27\3\27\3\27"+
		"\3\27\7\27\u0225\n\27\f\27\16\27\u0228\13\27\3\27\3\27\3\27\3\27\7\27"+
		"\u022e\n\27\f\27\16\27\u0231\13\27\3\27\5\27\u0234\n\27\5\27\u0236\n\27"+
		"\3\27\3\27\5\27\u023a\n\27\3\27\3\27\3\27\3\27\3\27\7\27\u0241\n\27\f"+
		"\27\16\27\u0244\13\27\3\27\3\27\5\27\u0248\n\27\5\27\u024a\n\27\3\27\3"+
		"\27\3\27\3\27\3\27\7\27\u0251\n\27\f\27\16\27\u0254\13\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\7\27\u025c\n\27\f\27\16\27\u025f\13\27\3\27\3\27\7"+
		"\27\u0263\n\27\f\27\16\27\u0266\13\27\5\27\u0268\n\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0275\n\30\f\30\16\30\u0278"+
		"\13\30\3\30\3\30\5\30\u027c\n\30\3\31\3\31\3\31\7\31\u0281\n\31\f\31\16"+
		"\31\u0284\13\31\3\32\3\32\3\32\3\32\5\32\u028a\n\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0291\n\32\3\32\3\32\3\32\5\32\u0296\n\32\3\32\3\32\5\32\u029a"+
		"\n\32\3\32\5\32\u029d\n\32\3\33\3\33\5\33\u02a1\n\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u02b0\n\33\3\34"+
		"\3\34\5\34\u02b4\n\34\3\34\5\34\u02b7\n\34\3\35\3\35\3\36\3\36\3\36\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u02cc\n \3 \3 \6 \u02d0"+
		"\n \r \16 \u02d1\5 \u02d4\n \3!\3!\5!\u02d8\n!\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u02df\n\"\3\"\3\"\3\"\5\"\u02e4\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\5\"\u02f3\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u0310\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\7\"\u0325\n\"\f\"\16\"\u0328\13\"\3#\3#\3#\7#\u032d"+
		"\n#\f#\16#\u0330\13#\3$\3$\3$\5$\u0335\n$\3$\3$\3$\7$\u033a\n$\f$\16$"+
		"\u033d\13$\3$\5$\u0340\n$\3$\3$\3%\3%\3%\3%\5%\u0348\n%\3%\3%\3%\3%\3"+
		"%\7%\u034f\n%\f%\16%\u0352\13%\3%\3%\5%\u0356\n%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\5%\u0362\n%\3%\3%\5%\u0366\n%\7%\u0368\n%\f%\16%\u036b\13%\3"+
		"%\5%\u036e\n%\3%\3%\3%\3%\3%\5%\u0375\n%\3%\5%\u0378\n%\5%\u037a\n%\3"+
		"&\3&\3\'\3\'\3\'\5\'\u0381\n\'\3\'\5\'\u0384\n\'\3(\3(\5(\u0388\n(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0393\n(\3)\3)\3)\3)\3)\7)\u039a\n)\f)\16"+
		")\u039d\13)\3)\3)\3*\3*\3*\3*\3*\7*\u03a6\n*\f*\16*\u03a9\13*\3*\3*\3"+
		"*\3+\5+\u03af\n+\3+\5+\u03b2\n+\3+\3+\3+\3+\7+\u03b8\n+\f+\16+\u03bb\13"+
		"+\3+\3+\3,\5,\u03c0\n,\3,\3,\3,\3,\7,\u03c6\n,\f,\16,\u03c9\13,\3,\3,"+
		"\3-\3-\3.\3.\3.\5.\u03d2\n.\3.\3.\3.\3.\3.\3.\5.\u03da\n.\3/\3/\5/\u03de"+
		"\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u03e7\n\60\3\60\5\60\u03ea"+
		"\n\60\5\60\u03ec\n\60\3\61\3\61\3\61\5\61\u03f1\n\61\3\61\3\61\5\61\u03f5"+
		"\n\61\3\61\5\61\u03f8\n\61\3\61\3\61\3\61\3\61\3\61\5\61\u03ff\n\61\3"+
		"\61\3\61\3\61\3\61\7\61\u0405\n\61\f\61\16\61\u0408\13\61\3\61\5\61\u040b"+
		"\n\61\3\61\3\61\5\61\u040f\n\61\3\61\5\61\u0412\n\61\3\61\3\61\3\61\3"+
		"\61\5\61\u0418\n\61\3\61\5\61\u041b\n\61\5\61\u041d\n\61\3\62\3\62\3\62"+
		"\3\62\3\62\7\62\u0424\n\62\f\62\16\62\u0427\13\62\3\63\3\63\3\63\5\63"+
		"\u042c\n\63\3\63\3\63\5\63\u0430\n\63\3\63\5\63\u0433\n\63\3\64\3\64\5"+
		"\64\u0437\n\64\3\65\3\65\3\65\3\65\5\65\u043d\n\65\3\65\3\65\3\65\5\65"+
		"\u0442\n\65\3\65\3\65\5\65\u0446\n\65\3\65\3\65\3\65\7\65\u044b\n\65\f"+
		"\65\16\65\u044e\13\65\3\65\3\65\3\65\3\65\7\65\u0454\n\65\f\65\16\65\u0457"+
		"\13\65\3\65\5\65\u045a\n\65\5\65\u045c\n\65\3\65\3\65\5\65\u0460\n\65"+
		"\3\65\3\65\3\65\3\65\3\65\7\65\u0467\n\65\f\65\16\65\u046a\13\65\3\65"+
		"\3\65\5\65\u046e\n\65\5\65\u0470\n\65\3\65\3\65\3\65\3\65\3\65\7\65\u0477"+
		"\n\65\f\65\16\65\u047a\13\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0482"+
		"\n\65\f\65\16\65\u0485\13\65\3\65\3\65\7\65\u0489\n\65\f\65\16\65\u048c"+
		"\13\65\5\65\u048e\n\65\3\66\5\66\u0491\n\66\3\66\3\66\5\66\u0495\n\66"+
		"\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3"+
		"A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3F\7F\u04b8\nF\fF\16F\u04bb\13F\3F\3F"+
		"\3G\3G\5G\u04c1\nG\3H\5H\u04c4\nH\3H\3H\3H\3H\3H\3H\3I\5I\u04cd\nI\3I"+
		"\3I\7I\u04d1\nI\fI\16I\u04d4\13I\3J\3J\3J\3J\5J\u04da\nJ\3K\3K\3K\3K\3"+
		"K\3L\3L\3L\7L\u04e4\nL\fL\16L\u04e7\13L\5L\u04e9\nL\3M\3M\3M\3M\7M\u04ef"+
		"\nM\fM\16M\u04f2\13M\3M\7M\u04f5\nM\fM\16M\u04f8\13M\3N\3N\3N\6N\u04fd"+
		"\nN\rN\16N\u04fe\3N\3N\3N\3N\3N\3N\5N\u0507\nN\3O\3O\3O\3O\3O\3O\5O\u050f"+
		"\nO\3O\3O\3O\6O\u0514\nO\rO\16O\u0515\3O\3O\3O\3P\3P\3P\3P\3P\6P\u0520"+
		"\nP\rP\16P\u0521\3P\5P\u0525\nP\3P\3P\3P\3P\3P\3P\3P\3P\5P\u052f\nP\3"+
		"Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u053d\nQ\3R\3R\3R\3R\5R\u0543\n"+
		"R\3S\3S\3S\7S\u0548\nS\fS\16S\u054b\13S\3S\3S\3T\3T\3T\3T\5T\u0553\nT"+
		"\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3W\3X\6X\u0568\nX"+
		"\rX\16X\u0569\3X\5X\u056d\nX\3Y\3Y\3Y\3Y\3Y\7Y\u0574\nY\fY\16Y\u0577\13"+
		"Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0580\nZ\3[\3[\3[\3[\3[\7[\u0587\n[\f[\16[\u058a"+
		"\13[\3[\3[\7[\u058e\n[\f[\16[\u0591\13[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\5]\u05aa\n]"+
		"\3]\7]\u05ad\n]\f]\16]\u05b0\13]\3^\3^\3^\5^\u05b5\n^\3^\3^\3^\5^\u05ba"+
		"\n^\7^\u05bc\n^\f^\16^\u05bf\13^\3^\3^\3_\3_\3_\3_\7_\u05c7\n_\f_\16_"+
		"\u05ca\13_\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\5a\u05d9\na\3b\3b\3"+
		"b\3b\3b\3b\3b\3b\5b\u05e3\nb\5b\u05e5\nb\3b\3b\3b\3b\3b\3b\3b\3b\3b\3"+
		"b\5b\u05f1\nb\7b\u05f3\nb\fb\16b\u05f6\13b\3c\5c\u05f9\nc\3c\3c\3c\3c"+
		"\5c\u05ff\nc\3c\3c\7c\u0603\nc\fc\16c\u0606\13c\3d\3d\3d\6d\u060b\nd\r"+
		"d\16d\u060c\3e\3e\3e\6e\u0612\ne\re\16e\u0613\3e\3e\3e\3f\6f\u061a\nf"+
		"\rf\16f\u061b\3g\3g\3g\6g\u0621\ng\rg\16g\u0622\3g\3g\3g\3g\3g\3g\5g\u062b"+
		"\ng\3h\3h\7h\u062f\nh\fh\16h\u0632\13h\3h\5h\u0635\nh\3i\3i\3i\3j\3j\3"+
		"j\3j\3j\3j\5j\u0640\nj\3k\3k\3k\3k\3k\7k\u0647\nk\fk\16k\u064a\13k\3l"+
		"\6l\u064d\nl\rl\16l\u064e\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\5l\u065b\nl\3"+
		"l\3l\3l\3l\3l\3l\3l\3l\3l\3l\5l\u0667\nl\3m\3m\5m\u066b\nm\3m\3m\5m\u066f"+
		"\nm\3m\3m\3m\7m\u0674\nm\fm\16m\u0677\13m\3m\3m\3m\3m\7m\u067d\nm\fm\16"+
		"m\u0680\13m\3m\3m\3m\3m\3m\5m\u0687\nm\5m\u0689\nm\3m\7m\u068c\nm\fm\16"+
		"m\u068f\13m\3m\3m\3m\3m\3m\5m\u0696\nm\5m\u0698\nm\3m\7m\u069b\nm\fm\16"+
		"m\u069e\13m\3m\3m\7m\u06a2\nm\fm\16m\u06a5\13m\3m\3m\7m\u06a9\nm\fm\16"+
		"m\u06ac\13m\3m\3m\7m\u06b0\nm\fm\16m\u06b3\13m\3m\3m\7m\u06b7\nm\fm\16"+
		"m\u06ba\13m\3m\3m\7m\u06be\nm\fm\16m\u06c1\13m\3m\3m\3m\3m\7m\u06c7\n"+
		"m\fm\16m\u06ca\13m\3m\3m\7m\u06ce\nm\fm\16m\u06d1\13m\3m\3m\7m\u06d5\n"+
		"m\fm\16m\u06d8\13m\5m\u06da\nm\3m\3m\3m\3m\7m\u06e0\nm\fm\16m\u06e3\13"+
		"m\3m\3m\3m\3m\7m\u06e9\nm\fm\16m\u06ec\13m\3m\3m\3m\3m\7m\u06f2\nm\fm"+
		"\16m\u06f5\13m\7m\u06f7\nm\fm\16m\u06fa\13m\3n\3n\3o\3o\3p\3p\3p\3p\3"+
		"p\3p\3p\3p\3p\3p\3p\5p\u070b\np\3p\3p\3p\3p\3p\3p\5p\u0713\np\3p\3p\3"+
		"p\7p\u0718\np\fp\16p\u071b\13p\3q\3q\7q\u071f\nq\fq\16q\u0722\13q\3q\3"+
		"q\7q\u0726\nq\fq\16q\u0729\13q\3q\5q\u072c\nq\3r\3r\3r\7r\u0731\nr\fr"+
		"\16r\u0734\13r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3"+
		"r\7r\u0749\nr\fr\16r\u074c\13r\3s\3s\3s\3s\7s\u0752\ns\fs\16s\u0755\13"+
		"s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\5s\u0764\ns\3t\3t\3u\3u\3u\3"+
		"u\5u\u076c\nu\3v\3v\3v\5v\u0771\nv\3w\3w\7w\u0775\nw\fw\16w\u0778\13w"+
		"\3x\3x\5x\u077c\nx\3y\3y\3z\3z\3z\3z\3z\3z\5z\u0786\nz\3z\2\5B\u00d8\u00de"+
		"{\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\2\26\4\2\35\35\u0083\u0083\4\2\65\65VV\4\2::TT\4\2"+
		"\37\37$%\3\2 !\3\2&)\3\2*-\4\2SS\u00a7\u00a7\5\2LN\u0081\u0081\u00cb\u00cd"+
		"\4\2 \"\177\177\4\2\u00c9\u00c9\u00cc\u00cc\4\2**,,\3\2\u00be\u00bf\f"+
		"\2\4\4\7\t\f\25\32\34\36\"$%(*,,\u00c9\u00c9\u00cb\u00cb\3\2\u00c3\u00c4"+
		"\3\2*/\3\2./\5\2\26\26##()\4\2\37!$$\4\2\u00b2\u00b3\u00c6\u00c8\2\u0862"+
		"\2\u00f8\3\2\2\2\4\u0100\3\2\2\2\6\u011f\3\2\2\2\b\u0121\3\2\2\2\n\u0136"+
		"\3\2\2\2\f\u013b\3\2\2\2\16\u013e\3\2\2\2\20\u014c\3\2\2\2\22\u0163\3"+
		"\2\2\2\24\u0165\3\2\2\2\26\u016c\3\2\2\2\30\u0173\3\2\2\2\32\u017a\3\2"+
		"\2\2\34\u017c\3\2\2\2\36\u019d\3\2\2\2 \u01a3\3\2\2\2\"\u01a9\3\2\2\2"+
		"$\u01b0\3\2\2\2&\u01bd\3\2\2\2(\u01d2\3\2\2\2*\u0208\3\2\2\2,\u0267\3"+
		"\2\2\2.\u0269\3\2\2\2\60\u027d\3\2\2\2\62\u029c\3\2\2\2\64\u02a0\3\2\2"+
		"\2\66\u02b1\3\2\2\28\u02b8\3\2\2\2:\u02ba\3\2\2\2<\u02bd\3\2\2\2>\u02bf"+
		"\3\2\2\2@\u02d7\3\2\2\2B\u02f2\3\2\2\2D\u0329\3\2\2\2F\u0331\3\2\2\2H"+
		"\u0343\3\2\2\2J\u037b\3\2\2\2L\u037d\3\2\2\2N\u0387\3\2\2\2P\u0394\3\2"+
		"\2\2R\u03a0\3\2\2\2T\u03ae\3\2\2\2V\u03bf\3\2\2\2X\u03cc\3\2\2\2Z\u03d1"+
		"\3\2\2\2\\\u03db\3\2\2\2^\u03eb\3\2\2\2`\u041c\3\2\2\2b\u041e\3\2\2\2"+
		"d\u0432\3\2\2\2f\u0436\3\2\2\2h\u048d\3\2\2\2j\u0494\3\2\2\2l\u0496\3"+
		"\2\2\2n\u0498\3\2\2\2p\u049a\3\2\2\2r\u049c\3\2\2\2t\u049e\3\2\2\2v\u04a0"+
		"\3\2\2\2x\u04a2\3\2\2\2z\u04a4\3\2\2\2|\u04a6\3\2\2\2~\u04a8\3\2\2\2\u0080"+
		"\u04aa\3\2\2\2\u0082\u04ac\3\2\2\2\u0084\u04ae\3\2\2\2\u0086\u04b0\3\2"+
		"\2\2\u0088\u04b2\3\2\2\2\u008a\u04b4\3\2\2\2\u008c\u04c0\3\2\2\2\u008e"+
		"\u04c3\3\2\2\2\u0090\u04cc\3\2\2\2\u0092\u04d5\3\2\2\2\u0094\u04db\3\2"+
		"\2\2\u0096\u04e8\3\2\2\2\u0098\u04ea\3\2\2\2\u009a\u04f9\3\2\2\2\u009c"+
		"\u0508\3\2\2\2\u009e\u051a\3\2\2\2\u00a0\u0530\3\2\2\2\u00a2\u0542\3\2"+
		"\2\2\u00a4\u0544\3\2\2\2\u00a6\u054e\3\2\2\2\u00a8\u0554\3\2\2\2\u00aa"+
		"\u0557\3\2\2\2\u00ac\u055e\3\2\2\2\u00ae\u0567\3\2\2\2\u00b0\u056e\3\2"+
		"\2\2\u00b2\u0578\3\2\2\2\u00b4\u0581\3\2\2\2\u00b6\u0592\3\2\2\2\u00b8"+
		"\u05a4\3\2\2\2\u00ba\u05b1\3\2\2\2\u00bc\u05c2\3\2\2\2\u00be\u05cb\3\2"+
		"\2\2\u00c0\u05d0\3\2\2\2\u00c2\u05e4\3\2\2\2\u00c4\u05f8\3\2\2\2\u00c6"+
		"\u0607\3\2\2\2\u00c8\u060e\3\2\2\2\u00ca\u0619\3\2\2\2\u00cc\u061d\3\2"+
		"\2\2\u00ce\u062c\3\2\2\2\u00d0\u0636\3\2\2\2\u00d2\u0639\3\2\2\2\u00d4"+
		"\u0641\3\2\2\2\u00d6\u064c\3\2\2\2\u00d8\u06d9\3\2\2\2\u00da\u06fb\3\2"+
		"\2\2\u00dc\u06fd\3\2\2\2\u00de\u0712\3\2\2\2\u00e0\u072b\3\2\2\2\u00e2"+
		"\u074a\3\2\2\2\u00e4\u0763\3\2\2\2\u00e6\u0765\3\2\2\2\u00e8\u076b\3\2"+
		"\2\2\u00ea\u076d\3\2\2\2\u00ec\u0772\3\2\2\2\u00ee\u077b\3\2\2\2\u00f0"+
		"\u077d\3\2\2\2\u00f2\u0785\3\2\2\2\u00f4\u00f7\5\4\3\2\u00f5\u00f7\5\u008a"+
		"F\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\u00fc\7\2\2\3\u00fc\3\3\2\2\2\u00fd\u00ff\7\31\2\2\u00fe\u00fd"+
		"\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u010c\5\6\4\2\u0104\u0106\7\31"+
		"\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\5\6\4\2\u010a\u0105\3\2"+
		"\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u0112\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0111\7\31\2\2\u0110\u010f\3"+
		"\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\5\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0120\5\u00e0q\2\u0116\u0120\5$\23"+
		"\2\u0117\u0120\5&\24\2\u0118\u0120\5\34\17\2\u0119\u0120\5\16\b\2\u011a"+
		"\u0120\5\"\22\2\u011b\u0120\5\b\5\2\u011c\u0120\5(\25\2\u011d\u0120\5"+
		".\30\2\u011e\u0120\5\20\t\2\u011f\u0115\3\2\2\2\u011f\u0116\3\2\2\2\u011f"+
		"\u0117\3\2\2\2\u011f\u0118\3\2\2\2\u011f\u0119\3\2\2\2\u011f\u011a\3\2"+
		"\2\2\u011f\u011b\3\2\2\2\u011f\u011c\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u011e\3\2\2\2\u0120\7\3\2\2\2\u0121\u0122\7\66\2\2\u0122\u0126\7\u009c"+
		"\2\2\u0123\u0124\5v<\2\u0124\u0125\7\32\2\2\u0125\u0127\3\2\2\2\u0126"+
		"\u0123\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0134\5x"+
		"=\2\u0129\u012a\7\u0093\2\2\u012a\u012b\7\u00a2\2\2\u012b\u0135\5~@\2"+
		"\u012c\u0135\5\f\7\2\u012d\u0135\5\n\6\2\u012e\u0135\5\n\6\2\u012f\u0131"+
		"\7\63\2\2\u0130\u0132\7F\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0135\5\60\31\2\u0134\u0129\3\2\2\2\u0134\u012c\3"+
		"\2\2\2\u0134\u012d\3\2\2\2\u0134\u012e\3\2\2\2\u0134\u012f\3\2\2\2\u0135"+
		"\t\3\2\2\2\u0136\u0137\7\63\2\2\u0137\u0138\7I\2\2\u0138\u0139\5\u00f2"+
		"z\2\u0139\u013a\5N(\2\u013a\13\3\2\2\2\u013b\u013c\7\63\2\2\u013c\u013d"+
		"\5N(\2\u013d\r\3\2\2\2\u013e\u013f\7J\2\2\u013f\u0140\7\u009d\2\2\u0140"+
		"\u0141\5z>\2\u0141\u0142\7\33\2\2\u0142\u0147\5\60\31\2\u0143\u0144\7"+
		"\35\2\2\u0144\u0146\5\60\31\2\u0145\u0143\3\2\2\2\u0146\u0149\3\2\2\2"+
		"\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147"+
		"\3\2\2\2\u014a\u014b\7\34\2\2\u014b\17\3\2\2\2\u014c\u014d\7J\2\2\u014d"+
		"\u014e\7\u00c5\2\2\u014e\u014f\5t;\2\u014f\u0150\7\33\2\2\u0150\u0151"+
		"\5\32\16\2\u0151\u0152\7\35\2\2\u0152\u0153\5\30\r\2\u0153\u0154\7\35"+
		"\2\2\u0154\u0155\5\26\f\2\u0155\u0156\7\35\2\2\u0156\u0157\5\24\13\2\u0157"+
		"\u0158\7\3\2\2\u0158\u015d\5\22\n\2\u0159\u015a\7\35\2\2\u015a\u015c\5"+
		"\22\n\2\u015b\u0159\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7\4"+
		"\2\2\u0161\u0162\7\34\2\2\u0162\21\3\2\2\2\u0163\u0164\5\u00f0y\2\u0164"+
		"\23\3\2\2\2\u0165\u0166\5\u00f0y\2\u0166\25\3\2\2\2\u0167\u016d\5\u00f2"+
		"z\2\u0168\u0169\7\5\2\2\u0169\u016a\5\u00caf\2\u016a\u016b\7\5\2\2\u016b"+
		"\u016d\3\2\2\2\u016c\u0167\3\2\2\2\u016c\u0168\3\2\2\2\u016d\27\3\2\2"+
		"\2\u016e\u0174\5\u00f2z\2\u016f\u0170\7\5\2\2\u0170\u0171\5\u00caf\2\u0171"+
		"\u0172\7\5\2\2\u0172\u0174\3\2\2\2\u0173\u016e\3\2\2\2\u0173\u016f\3\2"+
		"\2\2\u0174\31\3\2\2\2\u0175\u017b\5\u00f2z\2\u0176\u0177\7\5\2\2\u0177"+
		"\u0178\5\u00caf\2\u0178\u0179\7\5\2\2\u0179\u017b\3\2\2\2\u017a\u0175"+
		"\3\2\2\2\u017a\u0176\3\2\2\2\u017b\33\3\2\2\2\u017c\u017d\7J\2\2\u017d"+
		"\u0181\7\u009c\2\2\u017e\u017f\7i\2\2\u017f\u0180\7\177\2\2\u0180\u0182"+
		"\7_\2\2\u0181\u017e\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0186\3\2\2\2\u0183"+
		"\u0184\5v<\2\u0184\u0185\7\32\2\2\u0185\u0187\3\2\2\2\u0186\u0183\3\2"+
		"\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0198\5|?\2\u0189\u018a"+
		"\7\33\2\2\u018a\u0191\5\60\31\2\u018b\u018c\7\35\2\2\u018c\u0190\5N(\2"+
		"\u018d\u018e\7\35\2\2\u018e\u0190\5\60\31\2\u018f\u018b\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\7\34\2\2\u0195"+
		"\u0199\3\2\2\2\u0196\u0197\79\2\2\u0197\u0199\5*\26\2\u0198\u0189\3\2"+
		"\2\2\u0198\u0196\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\5\36\20\2\u019b"+
		"\u019c\5 \21\2\u019c\35\3\2\2\2\u019d\u019e\7\u009d\2\2\u019e\u019f\7"+
		"\36\2\2\u019f\u01a0\7\5\2\2\u01a0\u01a1\5\u00caf\2\u01a1\u01a2\7\5\2\2"+
		"\u01a2\37\3\2\2\2\u01a3\u01a4\7\u009e\2\2\u01a4\u01a5\7\36\2\2\u01a5\u01a6"+
		"\7\5\2\2\u01a6\u01a7\5\u00caf\2\u01a7\u01a8\7\5\2\2\u01a8!\3\2\2\2\u01a9"+
		"\u01aa\7S\2\2\u01aa\u01ab\7d\2\2\u01ab\u01ae\5Z.\2\u01ac\u01ad\7\u00ae"+
		"\2\2\u01ad\u01af\5B\"\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"#\3\2\2\2\u01b0\u01b1\7W\2\2\u01b1\u01b4\7\u009c\2\2\u01b2\u01b3\7i\2"+
		"\2\u01b3\u01b5\7_\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b9"+
		"\3\2\2\2\u01b6\u01b7\5v<\2\u01b7\u01b8\7\32\2\2\u01b8\u01ba\3\2\2\2\u01b9"+
		"\u01b6\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\5|"+
		"?\2\u01bc%\3\2\2\2\u01bd\u01c8\5h\65\2\u01be\u01bf\7\u0087\2\2\u01bf\u01c0"+
		"\7@\2\2\u01c0\u01c5\5\\/\2\u01c1\u01c2\7\35\2\2\u01c2\u01c4\5\\/\2\u01c3"+
		"\u01c1\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2"+
		"\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01be\3\2\2\2\u01c8"+
		"\u01c9\3\2\2\2\u01c9\u01d0\3\2\2\2\u01ca\u01cb\7z\2\2\u01cb\u01ce\5B\""+
		"\2\u01cc\u01cd\t\2\2\2\u01cd\u01cf\5B\"\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf"+
		"\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ca\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\'\3\2\2\2\u01d2\u01d3\7q\2\2\u01d3\u01d7\7t\2\2\u01d4\u01d5\5v<\2\u01d5"+
		"\u01d6\7\32\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d8\3"+
		"\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01e5\5|?\2\u01da\u01db\7\33\2\2\u01db"+
		"\u01e0\5\u0080A\2\u01dc\u01dd\7\35\2\2\u01dd\u01df\5\u0080A\2\u01de\u01dc"+
		"\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01e3\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4\7\34\2\2\u01e4\u01e6\3"+
		"\2\2\2\u01e5\u01da\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u0206\3\2\2\2\u01e7"+
		"\u01e8\7\u00aa\2\2\u01e8\u01e9\7\33\2\2\u01e9\u01ee\5B\"\2\u01ea\u01eb"+
		"\7\35\2\2\u01eb\u01ed\5B\"\2\u01ec\u01ea\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ee\3\2"+
		"\2\2\u01f1\u0200\7\34\2\2\u01f2\u01f3\7\35\2\2\u01f3\u01f4\7\33\2\2\u01f4"+
		"\u01f9\5B\"\2\u01f5\u01f6\7\35\2\2\u01f6\u01f8\5B\"\2\u01f7\u01f5\3\2"+
		"\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u01fc\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fd\7\34\2\2\u01fd\u01ff\3"+
		"\2\2\2\u01fe\u01f2\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200"+
		"\u0201\3\2\2\2\u0201\u0207\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0207\5*"+
		"\26\2\u0204\u0205\7P\2\2\u0205\u0207\7\u00aa\2\2\u0206\u01e7\3\2\2\2\u0206"+
		"\u0203\3\2\2\2\u0206\u0204\3\2\2\2\u0207)\3\2\2\2\u0208\u0213\5,\27\2"+
		"\u0209\u020a\7\u0087\2\2\u020a\u020b\7@\2\2\u020b\u0210\5\\/\2\u020c\u020d"+
		"\7\35\2\2\u020d\u020f\5\\/\2\u020e\u020c\3\2\2\2\u020f\u0212\3\2\2\2\u0210"+
		"\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2"+
		"\2\2\u0213\u0209\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u021b\3\2\2\2\u0215"+
		"\u0216\7z\2\2\u0216\u0219\5B\"\2\u0217\u0218\t\2\2\2\u0218\u021a\5B\""+
		"\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u0215"+
		"\3\2\2\2\u021b\u021c\3\2\2\2\u021c+\3\2\2\2\u021d\u021f\7\u009a\2\2\u021e"+
		"\u0220\t\3\2\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\3\2"+
		"\2\2\u0221\u0226\5^\60\2\u0222\u0223\7\35\2\2\u0223\u0225\5^\60\2\u0224"+
		"\u0222\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2"+
		"\2\2\u0227\u0235\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u0233\7d\2\2\u022a"+
		"\u022f\5`\61\2\u022b\u022c\7\35\2\2\u022c\u022e\5`\61\2\u022d\u022b\3"+
		"\2\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u0234\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0234\5b\62\2\u0233\u022a\3\2"+
		"\2\2\u0233\u0232\3\2\2\2\u0234\u0236\3\2\2\2\u0235\u0229\3\2\2\2\u0235"+
		"\u0236\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0238\7\u00ae\2\2\u0238\u023a"+
		"\5B\"\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u0249\3\2\2\2\u023b"+
		"\u023c\7g\2\2\u023c\u023d\7@\2\2\u023d\u0242\5B\"\2\u023e\u023f\7\35\2"+
		"\2\u023f\u0241\5B\"\2\u0240\u023e\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240"+
		"\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0247\3\2\2\2\u0244\u0242\3\2\2\2\u0245"+
		"\u0246\7h\2\2\u0246\u0248\5B\"\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2"+
		"\2\u0248\u024a\3\2\2\2\u0249\u023b\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u0268"+
		"\3\2\2\2\u024b\u024c\7\u00aa\2\2\u024c\u024d\7\33\2\2\u024d\u0252\5B\""+
		"\2\u024e\u024f\7\35\2\2\u024f\u0251\5B\"\2\u0250\u024e\3\2\2\2\u0251\u0254"+
		"\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254"+
		"\u0252\3\2\2\2\u0255\u0264\7\34\2\2\u0256\u0257\7\35\2\2\u0257\u0258\7"+
		"\33\2\2\u0258\u025d\5B\"\2\u0259\u025a\7\35\2\2\u025a\u025c\5B\"\2\u025b"+
		"\u0259\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2"+
		"\2\2\u025e\u0260\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0261\7\34\2\2\u0261"+
		"\u0263\3\2\2\2\u0262\u0256\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2"+
		"\2\2\u0264\u0265\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0267"+
		"\u021d\3\2\2\2\u0267\u024b\3\2\2\2\u0268-\3\2\2\2\u0269\u026a\7\u00a7"+
		"\2\2\u026a\u026b\5Z.\2\u026b\u026c\7\u009b\2\2\u026c\u026d\5\u0080A\2"+
		"\u026d\u026e\7\36\2\2\u026e\u0276\5B\"\2\u026f\u0270\7\35\2\2\u0270\u0271"+
		"\5\u0080A\2\u0271\u0272\7\36\2\2\u0272\u0273\5B\"\2\u0273\u0275\3\2\2"+
		"\2\u0274\u026f\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277"+
		"\3\2\2\2\u0277\u027b\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027a\7\u00ae\2"+
		"\2\u027a\u027c\5B\"\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c/\3"+
		"\2\2\2\u027d\u0282\5\u0080A\2\u027e\u0281\5\64\33\2\u027f\u0281\5\62\32"+
		"\2\u0280\u027e\3\2\2\2\u0280\u027f\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280"+
		"\3\2\2\2\u0282\u0283\3\2\2\2\u0283\61\3\2\2\2\u0284\u0282\3\2\2\2\u0285"+
		"\u0299\5r:\2\u0286\u0287\7\33\2\2\u0287\u0289\5j\66\2\u0288\u028a\5\u00f2"+
		"z\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\3\2\2\2\u028b"+
		"\u028c\7\34\2\2\u028c\u029a\3\2\2\2\u028d\u028e\7\33\2\2\u028e\u0290\5"+
		"j\66\2\u028f\u0291\5\u00f2z\2\u0290\u028f\3\2\2\2\u0290\u0291\3\2\2\2"+
		"\u0291\u0292\3\2\2\2\u0292\u0293\7\35\2\2\u0293\u0295\5j\66\2\u0294\u0296"+
		"\5\u00f2z\2\u0295\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\3\2\2"+
		"\2\u0297\u0298\7\34\2\2\u0298\u029a\3\2\2\2\u0299\u0286\3\2\2\2\u0299"+
		"\u028d\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u029d\5\u00f0"+
		"y\2\u029c\u0285\3\2\2\2\u029c\u029b\3\2\2\2\u029d\63\3\2\2\2\u029e\u029f"+
		"\7I\2\2\u029f\u02a1\5r:\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1"+
		"\u02af\3\2\2\2\u02a2\u02b0\5\66\34\2\u02a3\u02b0\58\35\2\u02a4\u02b0\5"+
		":\36\2\u02a5\u02b0\5<\37\2\u02a6\u02b0\7\u00a6\2\2\u02a7\u02a8\7D\2\2"+
		"\u02a8\u02a9\7\33\2\2\u02a9\u02aa\5B\"\2\u02aa\u02ab\7\34\2\2\u02ab\u02b0"+
		"\3\2\2\2\u02ac\u02b0\5> \2\u02ad\u02ae\7E\2\2\u02ae\u02b0\5\u0082B\2\u02af"+
		"\u02a2\3\2\2\2\u02af\u02a3\3\2\2\2\u02af\u02a4\3\2\2\2\u02af\u02a5\3\2"+
		"\2\2\u02af\u02a6\3\2\2\2\u02af\u02a7\3\2\2\2\u02af\u02ac\3\2\2\2\u02af"+
		"\u02ad\3\2\2\2\u02b0\65\3\2\2\2\u02b1\u02b3\7\u008b\2\2\u02b2\u02b4\t"+
		"\4\2\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5"+
		"\u02b7\7<\2\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\67\3\2\2\2"+
		"\u02b8\u02b9\5H%\2\u02b99\3\2\2\2\u02ba\u02bb\7\177\2\2\u02bb\u02bc\7"+
		"\u0081\2\2\u02bc;\3\2\2\2\u02bd\u02be\7\u0081\2\2\u02be=\3\2\2\2\u02bf"+
		"\u02cb\7P\2\2\u02c0\u02cc\5@!\2\u02c1\u02c2\7\33\2\2\u02c2\u02c3\5B\""+
		"\2\u02c3\u02c4\7\34\2\2\u02c4\u02cc\3\2\2\2\u02c5\u02c6\7}\2\2\u02c6\u02c7"+
		"\7\33\2\2\u02c7\u02c8\5B\"\2\u02c8\u02c9\7\34\2\2\u02c9\u02cc\3\2\2\2"+
		"\u02ca\u02cc\5\u00f2z\2\u02cb\u02c0\3\2\2\2\u02cb\u02c1\3\2\2\2\u02cb"+
		"\u02c5\3\2\2\2\u02cb\u02ca\3\2\2\2\u02cc\u02d3\3\2\2\2\u02cd\u02cf\7\6"+
		"\2\2\u02ce\u02d0\5\u00f2z\2\u02cf\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1"+
		"\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d4\3\2\2\2\u02d3\u02cd\3\2"+
		"\2\2\u02d3\u02d4\3\2\2\2\u02d4?\3\2\2\2\u02d5\u02d8\5j\66\2\u02d6\u02d8"+
		"\5l\67\2\u02d7\u02d5\3\2\2\2\u02d7\u02d6\3\2\2\2\u02d8A\3\2\2\2\u02d9"+
		"\u02da\b\"\1\2\u02da\u02f3\5l\67\2\u02db\u02dc\5v<\2\u02dc\u02dd\7\32"+
		"\2\2\u02dd\u02df\3\2\2\2\u02de\u02db\3\2\2\2\u02de\u02df\3\2\2\2\u02df"+
		"\u02e0\3\2\2\2\u02e0\u02e1\5|?\2\u02e1\u02e2\7\32\2\2\u02e2\u02e4\3\2"+
		"\2\2\u02e3\u02de\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5"+
		"\u02f3\5\u0080A\2\u02e6\u02e7\5n8\2\u02e7\u02e8\5B\"\20\u02e8\u02f3\3"+
		"\2\2\2\u02e9\u02f3\5F$\2\u02ea\u02eb\7\33\2\2\u02eb\u02ec\5B\"\2\u02ec"+
		"\u02ed\7\34\2\2\u02ed\u02f3\3\2\2\2\u02ee\u02ef\7\5\2\2\u02ef\u02f0\5"+
		"\u00caf\2\u02f0\u02f1\7\5\2\2\u02f1\u02f3\3\2\2\2\u02f2\u02d9\3\2\2\2"+
		"\u02f2\u02e3\3\2\2\2\u02f2\u02e6\3\2\2\2\u02f2\u02e9\3\2\2\2\u02f2\u02ea"+
		"\3\2\2\2\u02f2\u02ee\3\2\2\2\u02f3\u0326\3\2\2\2\u02f4\u02f5\f\17\2\2"+
		"\u02f5\u02f6\7#\2\2\u02f6\u0325\5B\"\20\u02f7\u02f8\f\16\2\2\u02f8\u02f9"+
		"\t\5\2\2\u02f9\u0325\5B\"\17\u02fa\u02fb\f\r\2\2\u02fb\u02fc\t\6\2\2\u02fc"+
		"\u0325\5B\"\16\u02fd\u02fe\f\f\2\2\u02fe\u02ff\t\7\2\2\u02ff\u0325\5B"+
		"\"\r\u0300\u0301\f\13\2\2\u0301\u0302\t\b\2\2\u0302\u0325\5B\"\f\u0303"+
		"\u030f\f\n\2\2\u0304\u0310\7\36\2\2\u0305\u0310\7.\2\2\u0306\u0310\7/"+
		"\2\2\u0307\u0310\7\60\2\2\u0308\u0310\7u\2\2\u0309\u030a\7u\2\2\u030a"+
		"\u0310\7\177\2\2\u030b\u0310\7y\2\2\u030c\u0310\7f\2\2\u030d\u0310\7{"+
		"\2\2\u030e\u0310\7\u0090\2\2\u030f\u0304\3\2\2\2\u030f\u0305\3\2\2\2\u030f"+
		"\u0306\3\2\2\2\u030f\u0307\3\2\2\2\u030f\u0308\3\2\2\2\u030f\u0309\3\2"+
		"\2\2\u030f\u030b\3\2\2\2\u030f\u030c\3\2\2\2\u030f\u030d\3\2\2\2\u030f"+
		"\u030e\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0325\5B\"\13\u0312\u0313\f\b"+
		"\2\2\u0313\u0314\78\2\2\u0314\u0325\5B\"\t\u0315\u0316\f\7\2\2\u0316\u0317"+
		"\7\u0086\2\2\u0317\u0325\5B\"\b\u0318\u0319\f\t\2\2\u0319\u031a\7l\2\2"+
		"\u031a\u031b\7\33\2\2\u031b\u031c\5D#\2\u031c\u031d\7\34\2\2\u031d\u0325"+
		"\3\2\2\2\u031e\u031f\f\4\2\2\u031f\u0320\7l\2\2\u0320\u0321\7\33\2\2\u0321"+
		"\u0322\5h\65\2\u0322\u0323\7\34\2\2\u0323\u0325\3\2\2\2\u0324\u02f4\3"+
		"\2\2\2\u0324\u02f7\3\2\2\2\u0324\u02fa\3\2\2\2\u0324\u02fd\3\2\2\2\u0324"+
		"\u0300\3\2\2\2\u0324\u0303\3\2\2\2\u0324\u0312\3\2\2\2\u0324\u0315\3\2"+
		"\2\2\u0324\u0318\3\2\2\2\u0324\u031e\3\2\2\2\u0325\u0328\3\2\2\2\u0326"+
		"\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327C\3\2\2\2\u0328\u0326\3\2\2\2"+
		"\u0329\u032e\5B\"\2\u032a\u032b\7\35\2\2\u032b\u032d\5B\"\2\u032c\u032a"+
		"\3\2\2\2\u032d\u0330\3\2\2\2\u032e\u032c\3\2\2\2\u032e\u032f\3\2\2\2\u032f"+
		"E\3\2\2\2\u0330\u032e\3\2\2\2\u0331\u0332\5t;\2\u0332\u033f\7\33\2\2\u0333"+
		"\u0335\7V\2\2\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\3\2"+
		"\2\2\u0336\u033b\5B\"\2\u0337\u0338\7\35\2\2\u0338\u033a\5B\"\2\u0339"+
		"\u0337\3\2\2\2\u033a\u033d\3\2\2\2\u033b\u0339\3\2\2\2\u033b\u033c\3\2"+
		"\2\2\u033c\u0340\3\2\2\2\u033d\u033b\3\2\2\2\u033e\u0340\7\37\2\2\u033f"+
		"\u0334\3\2\2\2\u033f\u033e\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0341\3\2"+
		"\2\2\u0341\u0342\7\34\2\2\u0342G\3\2\2\2\u0343\u0347\7\u008f\2\2\u0344"+
		"\u0345\5v<\2\u0345\u0346\7\32\2\2\u0346\u0348\3\2\2\2\u0347\u0344\3\2"+
		"\2\2\u0347\u0348\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u0355\5\u0084C\2\u034a"+
		"\u034b\7\33\2\2\u034b\u0350\5J&\2\u034c\u034d\7\35\2\2\u034d\u034f\5J"+
		"&\2\u034e\u034c\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0350"+
		"\u0351\3\2\2\2\u0351\u0353\3\2\2\2\u0352\u0350\3\2\2\2\u0353\u0354\7\34"+
		"\2\2\u0354\u0356\3\2\2\2\u0355\u034a\3\2\2\2\u0355\u0356\3\2\2\2\u0356"+
		"\u0369\3\2\2\2\u0357\u0358\7\u0084\2\2\u0358\u0361\t\t\2\2\u0359\u035a"+
		"\7\u009b\2\2\u035a\u0362\7\u0081\2\2\u035b\u035c\7\u009b\2\2\u035c\u0362"+
		"\7P\2\2\u035d\u0362\7A\2\2\u035e\u0362\7\u0095\2\2\u035f\u0360\7~\2\2"+
		"\u0360\u0362\7\62\2\2\u0361\u0359\3\2\2\2\u0361\u035b\3\2\2\2\u0361\u035d"+
		"\3\2\2\2\u0361\u035e\3\2\2\2\u0361\u035f\3\2\2\2\u0362\u0366\3\2\2\2\u0363"+
		"\u0364\7{\2\2\u0364\u0366\5r:\2\u0365\u0357\3\2\2\2\u0365\u0363\3\2\2"+
		"\2\u0366\u0368\3\2\2\2\u0367\u0365\3\2\2\2\u0368\u036b\3\2\2\2\u0369\u0367"+
		"\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u0379\3\2\2\2\u036b\u0369\3\2\2\2\u036c"+
		"\u036e\7\177\2\2\u036d\u036c\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u036f\3"+
		"\2\2\2\u036f\u0374\7Q\2\2\u0370\u0371\7o\2\2\u0371\u0375\7R\2\2\u0372"+
		"\u0373\7o\2\2\u0373\u0375\7k\2\2\u0374\u0370\3\2\2\2\u0374\u0372\3\2\2"+
		"\2\u0374\u0375\3\2\2\2\u0375\u0377\3\2\2\2\u0376\u0378\7[\2\2\u0377\u0376"+
		"\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u037a\3\2\2\2\u0379\u036d\3\2\2\2\u0379"+
		"\u037a\3\2\2\2\u037aI\3\2\2\2\u037b\u037c\5r:\2\u037cK\3\2\2\2\u037d\u0380"+
		"\5\u0080A\2\u037e\u037f\7E\2\2\u037f\u0381\5\u0082B\2\u0380\u037e\3\2"+
		"\2\2\u0380\u0381\3\2\2\2\u0381\u0383\3\2\2\2\u0382\u0384\t\4\2\2\u0383"+
		"\u0382\3\2\2\2\u0383\u0384\3\2\2\2\u0384M\3\2\2\2\u0385\u0386\7I\2\2\u0386"+
		"\u0388\5r:\2\u0387\u0385\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u0392\3\2\2"+
		"\2\u0389\u0393\5P)\2\u038a\u0393\5V,\2\u038b\u0393\5T+\2\u038c\u038d\7"+
		"D\2\2\u038d\u038e\7\33\2\2\u038e\u038f\5B\"\2\u038f\u0390\7\34\2\2\u0390"+
		"\u0393\3\2\2\2\u0391\u0393\5R*\2\u0392\u0389\3\2\2\2\u0392\u038a\3\2\2"+
		"\2\u0392\u038b\3\2\2\2\u0392\u038c\3\2\2\2\u0392\u0391\3\2\2\2\u0393O"+
		"\3\2\2\2\u0394\u0395\7\u008b\2\2\u0395\u0396\7\33\2\2\u0396\u039b\5L\'"+
		"\2\u0397\u0398\7\35\2\2\u0398\u039a\5L\'\2\u0399\u0397\3\2\2\2\u039a\u039d"+
		"\3\2\2\2\u039b\u0399\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039e\3\2\2\2\u039d"+
		"\u039b\3\2\2\2\u039e\u039f\7\34\2\2\u039fQ\3\2\2\2\u03a0\u03a1\7c\2\2"+
		"\u03a1\u03a2\7\33\2\2\u03a2\u03a7\5X-\2\u03a3\u03a4\7\35\2\2\u03a4\u03a6"+
		"\5X-\2\u03a5\u03a3\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7"+
		"\u03a8\3\2\2\2\u03a8\u03aa\3\2\2\2\u03a9\u03a7\3\2\2\2\u03aa\u03ab\7\34"+
		"\2\2\u03ab\u03ac\5H%\2\u03acS\3\2\2\2\u03ad\u03af\7\u00a6\2\2\u03ae\u03ad"+
		"\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b1\3\2\2\2\u03b0\u03b2\5r:\2\u03b1"+
		"\u03b0\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b4\7\33"+
		"\2\2\u03b4\u03b9\5L\'\2\u03b5\u03b6\7\35\2\2\u03b6\u03b8\5L\'\2\u03b7"+
		"\u03b5\3\2\2\2\u03b8\u03bb\3\2\2\2\u03b9\u03b7\3\2\2\2\u03b9\u03ba\3\2"+
		"\2\2\u03ba\u03bc\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bc\u03bd\7\34\2\2\u03bd"+
		"U\3\2\2\2\u03be\u03c0\5r:\2\u03bf\u03be\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0"+
		"\u03c1\3\2\2\2\u03c1\u03c2\7\33\2\2\u03c2\u03c7\5L\'\2\u03c3\u03c4\7\35"+
		"\2\2\u03c4\u03c6\5L\'\2\u03c5\u03c3\3\2\2\2\u03c6\u03c9\3\2\2\2\u03c7"+
		"\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03ca\3\2\2\2\u03c9\u03c7\3\2"+
		"\2\2\u03ca\u03cb\7\34\2\2\u03cbW\3\2\2\2\u03cc\u03cd\5\u0080A\2\u03cd"+
		"Y\3\2\2\2\u03ce\u03cf\5v<\2\u03cf\u03d0\7\32\2\2\u03d0\u03d2\3\2\2\2\u03d1"+
		"\u03ce\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d9\5|"+
		"?\2\u03d4\u03d5\7n\2\2\u03d5\u03d6\7@\2\2\u03d6\u03da\5\u0086D\2\u03d7"+
		"\u03d8\7\177\2\2\u03d8\u03da\7n\2\2\u03d9\u03d4\3\2\2\2\u03d9\u03d7\3"+
		"\2\2\2\u03d9\u03da\3\2\2\2\u03da[\3\2\2\2\u03db\u03dd\5B\"\2\u03dc\u03de"+
		"\t\4\2\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de]\3\2\2\2\u03df"+
		"\u03ec\7\37\2\2\u03e0\u03e1\5|?\2\u03e1\u03e2\7\32\2\2\u03e2\u03e3\7\37"+
		"\2\2\u03e3\u03ec\3\2\2\2\u03e4\u03e9\5B\"\2\u03e5\u03e7\79\2\2\u03e6\u03e5"+
		"\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03ea\5p9\2\u03e9"+
		"\u03e6\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03ec\3\2\2\2\u03eb\u03df\3\2"+
		"\2\2\u03eb\u03e0\3\2\2\2\u03eb\u03e4\3\2\2\2\u03ec_\3\2\2\2\u03ed\u03ee"+
		"\5v<\2\u03ee\u03ef\7\32\2\2\u03ef\u03f1\3\2\2\2\u03f0\u03ed\3\2\2\2\u03f0"+
		"\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f7\5|?\2\u03f3\u03f5\79\2"+
		"\2\u03f4\u03f3\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f8"+
		"\5\u0088E\2\u03f7\u03f4\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03fe\3\2\2"+
		"\2\u03f9\u03fa\7n\2\2\u03fa\u03fb\7@\2\2\u03fb\u03ff\5\u0086D\2\u03fc"+
		"\u03fd\7\177\2\2\u03fd\u03ff\7n\2\2\u03fe\u03f9\3\2\2\2\u03fe\u03fc\3"+
		"\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u041d\3\2\2\2\u0400\u040a\7\33\2\2\u0401"+
		"\u0406\5`\61\2\u0402\u0403\7\35\2\2\u0403\u0405\5`\61\2\u0404\u0402\3"+
		"\2\2\2\u0405\u0408\3\2\2\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2\2\2\u0407"+
		"\u040b\3\2\2\2\u0408\u0406\3\2\2\2\u0409\u040b\5b\62\2\u040a\u0401\3\2"+
		"\2\2\u040a\u0409\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u0411\7\34\2\2\u040d"+
		"\u040f\79\2\2\u040e\u040d\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0410\3\2"+
		"\2\2\u0410\u0412\5\u0088E\2\u0411\u040e\3\2\2\2\u0411\u0412\3\2\2\2\u0412"+
		"\u041d\3\2\2\2\u0413\u0414\7\33\2\2\u0414\u0415\5*\26\2\u0415\u041a\7"+
		"\34\2\2\u0416\u0418\79\2\2\u0417\u0416\3\2\2\2\u0417\u0418\3\2\2\2\u0418"+
		"\u0419\3\2\2\2\u0419\u041b\5\u0088E\2\u041a\u0417\3\2\2\2\u041a\u041b"+
		"\3\2\2\2\u041b\u041d\3\2\2\2\u041c\u03f0\3\2\2\2\u041c\u0400\3\2\2\2\u041c"+
		"\u0413\3\2\2\2\u041da\3\2\2\2\u041e\u0425\5`\61\2\u041f\u0420\5d\63\2"+
		"\u0420\u0421\5`\61\2\u0421\u0422\5f\64\2\u0422\u0424\3\2\2\2\u0423\u041f"+
		"\3\2\2\2\u0424\u0427\3\2\2\2\u0425\u0423\3\2\2\2\u0425\u0426\3\2\2\2\u0426"+
		"c\3\2\2\2\u0427\u0425\3\2\2\2\u0428\u0433\7\35\2\2\u0429\u042b\7x\2\2"+
		"\u042a\u042c\7\u0088\2\2\u042b\u042a\3\2\2\2\u042b\u042c\3\2\2\2\u042c"+
		"\u0430\3\2\2\2\u042d\u0430\7p\2\2\u042e\u0430\7\u0096\2\2\u042f\u0429"+
		"\3\2\2\2\u042f\u042d\3\2\2\2\u042f\u042e\3\2\2\2\u042f\u0430\3\2\2\2\u0430"+
		"\u0431\3\2\2\2\u0431\u0433\7w\2\2\u0432\u0428\3\2\2\2\u0432\u042f\3\2"+
		"\2\2\u0433e\3\2\2\2\u0434\u0435\7\u0084\2\2\u0435\u0437\5B\"\2\u0436\u0434"+
		"\3\2\2\2\u0436\u0437\3\2\2\2\u0437g\3\2\2\2\u0438\u0439\7\u00be\2\2\u0439"+
		"\u043a\5\u00f2z\2\u043a\u043b\7\36\2\2\u043b\u043d\3\2\2\2\u043c\u0438"+
		"\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u0441\3\2\2\2\u043e\u043f\5\u00f2z"+
		"\2\u043f\u0440\7\36\2\2\u0440\u0442\3\2\2\2\u0441\u043e\3\2\2\2\u0441"+
		"\u0442\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0445\7\u009a\2\2\u0444\u0446"+
		"\t\3\2\2\u0445\u0444\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0447\3\2\2\2\u0447"+
		"\u044c\5^\60\2\u0448\u0449\7\35\2\2\u0449\u044b\5^\60\2\u044a\u0448\3"+
		"\2\2\2\u044b\u044e\3\2\2\2\u044c\u044a\3\2\2\2\u044c\u044d\3\2\2\2\u044d"+
		"\u045b\3\2\2\2\u044e\u044c\3\2\2\2\u044f\u0459\7d\2\2\u0450\u0455\5`\61"+
		"\2\u0451\u0452\7\35\2\2\u0452\u0454\5`\61\2\u0453\u0451\3\2\2\2\u0454"+
		"\u0457\3\2\2\2\u0455\u0453\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u045a\3\2"+
		"\2\2\u0457\u0455\3\2\2\2\u0458\u045a\5b\62\2\u0459\u0450\3\2\2\2\u0459"+
		"\u0458\3\2\2\2\u045a\u045c\3\2\2\2\u045b\u044f\3\2\2\2\u045b\u045c\3\2"+
		"\2\2\u045c\u045f\3\2\2\2\u045d\u045e\7\u00ae\2\2\u045e\u0460\5B\"\2\u045f"+
		"\u045d\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u046f\3\2\2\2\u0461\u0462\7g"+
		"\2\2\u0462\u0463\7@\2\2\u0463\u0468\5B\"\2\u0464\u0465\7\35\2\2\u0465"+
		"\u0467\5B\"\2\u0466\u0464\3\2\2\2\u0467\u046a\3\2\2\2\u0468\u0466\3\2"+
		"\2\2\u0468\u0469\3\2\2\2\u0469\u046d\3\2\2\2\u046a\u0468\3\2\2\2\u046b"+
		"\u046c\7h\2\2\u046c\u046e\5B\"\2\u046d\u046b\3\2\2\2\u046d\u046e\3\2\2"+
		"\2\u046e\u0470\3\2\2\2\u046f\u0461\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u048e"+
		"\3\2\2\2\u0471\u0472\7\u00aa\2\2\u0472\u0473\7\33\2\2\u0473\u0478\5B\""+
		"\2\u0474\u0475\7\35\2\2\u0475\u0477\5B\"\2\u0476\u0474\3\2\2\2\u0477\u047a"+
		"\3\2\2\2\u0478\u0476\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047b\3\2\2\2\u047a"+
		"\u0478\3\2\2\2\u047b\u048a\7\34\2\2\u047c\u047d\7\35\2\2\u047d\u047e\7"+
		"\33\2\2\u047e\u0483\5B\"\2\u047f\u0480\7\35\2\2\u0480\u0482\5B\"\2\u0481"+
		"\u047f\3\2\2\2\u0482\u0485\3\2\2\2\u0483\u0481\3\2\2\2\u0483\u0484\3\2"+
		"\2\2\u0484\u0486\3\2\2\2\u0485\u0483\3\2\2\2\u0486\u0487\7\34\2\2\u0487"+
		"\u0489\3\2\2\2\u0488\u047c\3\2\2\2\u0489\u048c\3\2\2\2\u048a\u0488\3\2"+
		"\2\2\u048a\u048b\3\2\2\2\u048b\u048e\3\2\2\2\u048c\u048a\3\2\2\2\u048d"+
		"\u043c\3\2\2\2\u048d\u0471\3\2\2\2\u048ei\3\2\2\2\u048f\u0491\t\6\2\2"+
		"\u0490\u048f\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0495"+
		"\7\u00cb\2\2\u0493\u0495\7\37\2\2\u0494\u0490\3\2\2\2\u0494\u0493\3\2"+
		"\2\2\u0495k\3\2\2\2\u0496\u0497\t\n\2\2\u0497m\3\2\2\2\u0498\u0499\t\13"+
		"\2\2\u0499o\3\2\2\2\u049a\u049b\t\f\2\2\u049bq\3\2\2\2\u049c\u049d\5\u00f2"+
		"z\2\u049ds\3\2\2\2\u049e\u049f\5\u00f2z\2\u049fu\3\2\2\2\u04a0\u04a1\5"+
		"\u00f2z\2\u04a1w\3\2\2\2\u04a2\u04a3\5\u00f2z\2\u04a3y\3\2\2\2\u04a4\u04a5"+
		"\5\u00f2z\2\u04a5{\3\2\2\2\u04a6\u04a7\5\u00f2z\2\u04a7}\3\2\2\2\u04a8"+
		"\u04a9\5\u00f2z\2\u04a9\177\3\2\2\2\u04aa\u04ab\5\u00f2z\2\u04ab\u0081"+
		"\3\2\2\2\u04ac\u04ad\5\u00f2z\2\u04ad\u0083\3\2\2\2\u04ae\u04af\5\u00f2"+
		"z\2\u04af\u0085\3\2\2\2\u04b0\u04b1\5\u00f2z\2\u04b1\u0087\3\2\2\2\u04b2"+
		"\u04b3\7\u00c9\2\2\u04b3\u0089\3\2\2\2\u04b4\u04b9\5\u008cG\2\u04b5\u04b6"+
		"\7\31\2\2\u04b6\u04b8\5\u008cG\2\u04b7\u04b5\3\2\2\2\u04b8\u04bb\3\2\2"+
		"\2\u04b9\u04b7\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bc\3\2\2\2\u04bb\u04b9"+
		"\3\2\2\2\u04bc\u04bd\7\31\2\2\u04bd\u008b\3\2\2\2\u04be\u04c1\5\u008e"+
		"H\2\u04bf\u04c1\5\u00e2r\2\u04c0\u04be\3\2\2\2\u04c0\u04bf\3\2\2\2\u04c1"+
		"\u008d\3\2\2\2\u04c2\u04c4\5\u00f0y\2\u04c3\u04c2\3\2\2\2\u04c3\u04c4"+
		"\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c6\7\u00c9\2\2\u04c6\u04c7\7\33"+
		"\2\2\u04c7\u04c8\5\u0090I\2\u04c8\u04c9\7\34\2\2\u04c9\u04ca\5\u00e2r"+
		"\2\u04ca\u008f\3\2\2\2\u04cb\u04cd\5\u0092J\2\u04cc\u04cb\3\2\2\2\u04cc"+
		"\u04cd\3\2\2\2\u04cd\u04d2\3\2\2\2\u04ce\u04cf\7\35\2\2\u04cf\u04d1\5"+
		"\u0092J\2\u04d0\u04ce\3\2\2\2\u04d1\u04d4\3\2\2\2\u04d2\u04d0\3\2\2\2"+
		"\u04d2\u04d3\3\2\2\2\u04d3\u0091\3\2\2\2\u04d4\u04d2\3\2\2\2\u04d5\u04d6"+
		"\5\u00eex\2\u04d6\u04d9\7\u00c9\2\2\u04d7\u04d8\7\36\2\2\u04d8\u04da\5"+
		"\u00d8m\2\u04d9\u04d7\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u0093\3\2\2\2"+
		"\u04db\u04dc\7\u00c9\2\2\u04dc\u04dd\7\33\2\2\u04dd\u04de\5\u0096L\2\u04de"+
		"\u04df\7\34\2\2\u04df\u0095\3\2\2\2\u04e0\u04e5\5\u00d8m\2\u04e1\u04e2"+
		"\7\35\2\2\u04e2\u04e4\5\u00d8m\2\u04e3\u04e1\3\2\2\2\u04e4\u04e7\3\2\2"+
		"\2\u04e5\u04e3\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e9\3\2\2\2\u04e7\u04e5"+
		"\3\2\2\2\u04e8\u04e0\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u0097\3\2\2\2\u04ea"+
		"\u04eb\5\u00eex\2\u04eb\u04f0\5\u00eav\2\u04ec\u04ed\7\35\2\2\u04ed\u04ef"+
		"\5\u00eav\2\u04ee\u04ec\3\2\2\2\u04ef\u04f2\3\2\2\2\u04f0\u04ee\3\2\2"+
		"\2\u04f0\u04f1\3\2\2\2\u04f1\u04f6\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f3\u04f5"+
		"\7\31\2\2\u04f4\u04f3\3\2\2\2\u04f5\u04f8\3\2\2\2\u04f6\u04f4\3\2\2\2"+
		"\u04f6\u04f7\3\2\2\2\u04f7\u0099\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f9\u04fa"+
		"\7\u00b4\2\2\u04fa\u04fc\7\33\2\2\u04fb\u04fd\5\u00dep\2\u04fc\u04fb\3"+
		"\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u04fc\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff"+
		"\u0500\3\2\2\2\u0500\u0506\7\34\2\2\u0501\u0502\7\7\2\2\u0502\u0503\5"+
		"\u00e2r\2\u0503\u0504\7\b\2\2\u0504\u0507\3\2\2\2\u0505\u0507\5\u00e4"+
		"s\2\u0506\u0501\3\2\2\2\u0506\u0505\3\2\2\2\u0507\u009b\3\2\2\2\u0508"+
		"\u050e\7\u00bb\2\2\u0509\u050a\7\7\2\2\u050a\u050b\5\u00e2r\2\u050b\u050c"+
		"\7\b\2\2\u050c\u050f\3\2\2\2\u050d\u050f\5\u00e4s\2\u050e\u0509\3\2\2"+
		"\2\u050e\u050d\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0511\7\u00b4\2\2\u0511"+
		"\u0513\7\33\2\2\u0512\u0514\5\u00dep\2\u0513\u0512\3\2\2\2\u0514\u0515"+
		"\3\2\2\2\u0515\u0513\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0517\3\2\2\2\u0517"+
		"\u0518\7\34\2\2\u0518\u0519\7\31\2\2\u0519\u009d\3\2\2\2\u051a\u051b\7"+
		"b\2\2\u051b\u051c\7\33\2\2\u051c\u051d\5\u00e4s\2\u051d\u051f\7\31\2\2"+
		"\u051e\u0520\5\u00dep\2\u051f\u051e\3\2\2\2\u0520\u0521\3\2\2\2\u0521"+
		"\u051f\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0524\3\2\2\2\u0523\u0525\5\u00e4"+
		"s\2\u0524\u0523\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0526\3\2\2\2\u0526"+
		"\u0527\7\31\2\2\u0527\u0528\5\u00e4s\2\u0528\u052e\7\34\2\2\u0529\u052a"+
		"\7\7\2\2\u052a\u052b\5\u00e2r\2\u052b\u052c\7\b\2\2\u052c\u052f\3\2\2"+
		"\2\u052d\u052f\5\u00e4s\2\u052e\u0529\3\2\2\2\u052e\u052d\3\2\2\2\u052f"+
		"\u009f\3\2\2\2\u0530\u0531\7\u00c2\2\2\u0531\u0532\7\33\2\2\u0532\u0533"+
		"\7\u00be\2\2\u0533\u0534\7\u00c9\2\2\u0534\u0535\7l\2\2\u0535\u0536\7"+
		"\u00c9\2\2\u0536\u053c\7\34\2\2\u0537\u0538\7\7\2\2\u0538\u0539\5\u00e2"+
		"r\2\u0539\u053a\7\b\2\2\u053a\u053d\3\2\2\2\u053b\u053d\5\u00e4s\2\u053c"+
		"\u0537\3\2\2\2\u053c\u053b\3\2\2\2\u053d\u00a1\3\2\2\2\u053e\u0543\5\u009a"+
		"N\2\u053f\u0543\5\u009cO\2\u0540\u0543\5\u009eP\2\u0541\u0543\5\u00a0"+
		"Q\2\u0542\u053e\3\2\2\2\u0542\u053f\3\2\2\2\u0542\u0540\3\2\2\2\u0542"+
		"\u0541\3\2\2\2\u0543\u00a3\3\2\2\2\u0544\u0549\7\u00bd\2\2\u0545\u0548"+
		"\5\u00d8m\2\u0546\u0548\5\u00dep\2\u0547\u0545\3\2\2\2\u0547\u0546\3\2"+
		"\2\2\u0548\u054b\3\2\2\2\u0549\u0547\3\2\2\2\u0549\u054a\3\2\2\2\u054a"+
		"\u054c\3\2\2\2\u054b\u0549\3\2\2\2\u054c\u054d\7\31\2\2\u054d\u00a5\3"+
		"\2\2\2\u054e\u054f\5\u00a8U\2\u054f\u0552\5\u00aaV\2\u0550\u0551\7\u00b8"+
		"\2\2\u0551\u0553\5\u00e2r\2\u0552\u0550\3\2\2\2\u0552\u0553\3\2\2\2\u0553"+
		"\u00a7\3\2\2\2\u0554\u0555\7\u00b5\2\2\u0555\u0556\5\u00e2r\2\u0556\u00a9"+
		"\3\2\2\2\u0557\u0558\7\u00b6\2\2\u0558\u0559\7\33\2\2\u0559\u055a\7\u00b7"+
		"\2\2\u055a\u055b\7\u00c9\2\2\u055b\u055c\7\34\2\2\u055c\u055d\5\u00e2"+
		"r\2\u055d\u00ab\3\2\2\2\u055e\u055f\7\u00b9\2\2\u055f\u0560\7\33\2\2\u0560"+
		"\u0561\5\u00d8m\2\u0561\u0562\7\34\2\2\u0562\u0563\7\7\2\2\u0563\u0564"+
		"\5\u00aeX\2\u0564\u0565\7\b\2\2\u0565\u00ad\3\2\2\2\u0566\u0568\5\u00b0"+
		"Y\2\u0567\u0566\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u0567\3\2\2\2\u0569"+
		"\u056a\3\2\2\2\u056a\u056c\3\2\2\2\u056b\u056d\5\u00b2Z\2\u056c\u056b"+
		"\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u00af\3\2\2\2\u056e\u056f\7B\2\2\u056f"+
		"\u0570\5\u00d8m\2\u0570\u0571\7\t\2\2\u0571\u0575\5\u00e2r\2\u0572\u0574"+
		"\7\31\2\2\u0573\u0572\3\2\2\2\u0574\u0577\3\2\2\2\u0575\u0573\3\2\2\2"+
		"\u0575\u0576\3\2\2\2\u0576\u00b1\3\2\2\2\u0577\u0575\3\2\2\2\u0578\u0579"+
		"\7P\2\2\u0579\u057f\7\t\2\2\u057a\u057b\7\7\2\2\u057b\u057c\5\u00e2r\2"+
		"\u057c\u057d\7\b\2\2\u057d\u0580\3\2\2\2\u057e\u0580\5\u00e4s\2\u057f"+
		"\u057a\3\2\2\2\u057f\u057e\3\2\2\2\u0580\u00b3\3\2\2\2\u0581\u0582\7\u00bc"+
		"\2\2\u0582\u0583\7\33\2\2\u0583\u0588\5\u00d8m\2\u0584\u0585\7 \2\2\u0585"+
		"\u0587\5\u00d8m\2\u0586\u0584\3\2\2\2\u0587\u058a\3\2\2\2\u0588\u0586"+
		"\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058b\3\2\2\2\u058a\u0588\3\2\2\2\u058b"+
		"\u058f\7\34\2\2\u058c\u058e\7\31\2\2\u058d\u058c\3\2\2\2\u058e\u0591\3"+
		"\2\2\2\u058f\u058d\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u00b5\3\2\2\2\u0591"+
		"\u058f\3\2\2\2\u0592\u0593\7\u00c9\2\2\u0593\u0594\7\33\2\2\u0594\u0595"+
		"\7\u00c9\2\2\u0595\u0596\7\35\2\2\u0596\u0597\7\u00c0\2\2\u0597\u0598"+
		"\7\33\2\2\u0598\u0599\7\u00c9\2\2\u0599\u059a\7\35\2\2\u059a\u059b\7\u00c9"+
		"\2\2\u059b\u059c\7\34\2\2\u059c\u059d\7\7\2\2\u059d\u059e\7\u00bd\2\2"+
		"\u059e\u059f\7\u00c9\2\2\u059f\u05a0\t\r\2\2\u05a0\u05a1\7\u00c9\2\2\u05a1"+
		"\u05a2\7\31\2\2\u05a2\u05a3\7\n\2\2\u05a3\u00b7\3\2\2\2\u05a4\u05a5\t"+
		"\16\2\2\u05a5\u05a6\7\u00c9\2\2\u05a6\u05a9\7\13\2\2\u05a7\u05a8\7\36"+
		"\2\2\u05a8\u05aa\5\u00ba^\2\u05a9\u05a7\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa"+
		"\u05ae\3\2\2\2\u05ab\u05ad\7\31\2\2\u05ac\u05ab\3\2\2\2\u05ad\u05b0\3"+
		"\2\2\2\u05ae\u05ac\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u00b9\3\2\2\2\u05b0"+
		"\u05ae\3\2\2\2\u05b1\u05b4\7\f\2\2\u05b2\u05b5\5\u00d8m\2\u05b3\u05b5"+
		"\5\u00c2b\2\u05b4\u05b2\3\2\2\2\u05b4\u05b3\3\2\2\2\u05b5\u05bd\3\2\2"+
		"\2\u05b6\u05b9\7\35\2\2\u05b7\u05ba\5\u00d8m\2\u05b8\u05ba\5\u00c2b\2"+
		"\u05b9\u05b7\3\2\2\2\u05b9\u05b8\3\2\2\2\u05ba\u05bc\3\2\2\2\u05bb\u05b6"+
		"\3\2\2\2\u05bc\u05bf\3\2\2\2\u05bd\u05bb\3\2\2\2\u05bd\u05be\3\2\2\2\u05be"+
		"\u05c0\3\2\2\2\u05bf\u05bd\3\2\2\2\u05c0\u05c1\7\4\2\2\u05c1\u00bb\3\2"+
		"\2\2\u05c2\u05c3\5\u00be`\2\u05c3\u05c4\7\36\2\2\u05c4\u05c8\5\u00d8m"+
		"\2\u05c5\u05c7\7\31\2\2\u05c6\u05c5\3\2\2\2\u05c7\u05ca\3\2\2\2\u05c8"+
		"\u05c6\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u00bd\3\2\2\2\u05ca\u05c8\3\2"+
		"\2\2\u05cb\u05cc\7\u00c9\2\2\u05cc\u05cd\7\f\2\2\u05cd\u05ce\5\u00d8m"+
		"\2\u05ce\u05cf\7\4\2\2\u05cf\u00bf\3\2\2\2\u05d0\u05d1\7\u00c9\2\2\u05d1"+
		"\u05d8\7\t\2\2\u05d2\u05d9\7\u00cb\2\2\u05d3\u05d9\5\u00d8m\2\u05d4\u05d5"+
		"\7\5\2\2\u05d5\u05d6\5\u00caf\2\u05d6\u05d7\7\5\2\2\u05d7\u05d9\3\2\2"+
		"\2\u05d8\u05d2\3\2\2\2\u05d8\u05d3\3\2\2\2\u05d8\u05d4\3\2\2\2\u05d9\u00c1"+
		"\3\2\2\2\u05da\u05e5\5\u00c0a\2\u05db\u05dc\7\u00c9\2\2\u05dc\u05e2\7"+
		"\t\2\2\u05dd\u05de\7\7\2\2\u05de\u05df\5\u00c2b\2\u05df\u05e0\7\b\2\2"+
		"\u05e0\u05e3\3\2\2\2\u05e1\u05e3\5\u00ba^\2\u05e2\u05dd\3\2\2\2\u05e2"+
		"\u05e1\3\2\2\2\u05e3\u05e5\3\2\2\2\u05e4\u05da\3\2\2\2\u05e4\u05db\3\2"+
		"\2\2\u05e5\u05f4\3\2\2\2\u05e6\u05e7\7\35\2\2\u05e7\u05f3\5\u00c0a\2\u05e8"+
		"\u05e9\7\35\2\2\u05e9\u05ea\7\u00c9\2\2\u05ea\u05f0\7\t\2\2\u05eb\u05ec"+
		"\7\7\2\2\u05ec\u05ed\5\u00c2b\2\u05ed\u05ee\7\b\2\2\u05ee\u05f1\3\2\2"+
		"\2\u05ef\u05f1\5\u00ba^\2\u05f0\u05eb\3\2\2\2\u05f0\u05ef\3\2\2\2\u05f1"+
		"\u05f3\3\2\2\2\u05f2\u05e6\3\2\2\2\u05f2\u05e8\3\2\2\2\u05f3\u05f6\3\2"+
		"\2\2\u05f4\u05f2\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u00c3\3\2\2\2\u05f6"+
		"\u05f4\3\2\2\2\u05f7\u05f9\7\u00be\2\2\u05f8\u05f7\3\2\2\2\u05f8\u05f9"+
		"\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05fb\7\u00c9\2\2\u05fb\u05fc\7\36"+
		"\2\2\u05fc\u05fe\7\7\2\2\u05fd\u05ff\5\u00c2b\2\u05fe\u05fd\3\2\2\2\u05fe"+
		"\u05ff\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0604\7\b\2\2\u0601\u0603\7\31"+
		"\2\2\u0602\u0601\3\2\2\2\u0603\u0606\3\2\2\2\u0604\u0602\3\2\2\2\u0604"+
		"\u0605\3\2\2\2\u0605\u00c5\3\2\2\2\u0606\u0604\3\2\2\2\u0607\u060a\7\u00c9"+
		"\2\2\u0608\u0609\7\32\2\2\u0609\u060b\7\u00c9\2\2\u060a\u0608\3\2\2\2"+
		"\u060b\u060c\3\2\2\2\u060c\u060a\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u00c7"+
		"\3\2\2\2\u060e\u0611\7\u00c9\2\2\u060f\u0610\7\32\2\2\u0610\u0612\7\u00c9"+
		"\2\2\u0611\u060f\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0611\3\2\2\2\u0613"+
		"\u0614\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0616\7\36\2\2\u0616\u0617\5"+
		"\u00d8m\2\u0617\u00c9\3\2\2\2\u0618\u061a\t\17\2\2\u0619\u0618\3\2\2\2"+
		"\u061a\u061b\3\2\2\2\u061b\u0619\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u00cb"+
		"\3\2\2\2\u061d\u061e\7i\2\2\u061e\u0620\7\33\2\2\u061f\u0621\5\u00dep"+
		"\2\u0620\u061f\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u0620\3\2\2\2\u0622\u0623"+
		"\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u062a\7\34\2\2\u0625\u0626\7\7\2\2"+
		"\u0626\u0627\5\u00e2r\2\u0627\u0628\7\b\2\2\u0628\u062b\3\2\2\2\u0629"+
		"\u062b\5\u00e4s\2\u062a\u0625\3\2\2\2\u062a\u0629\3\2\2\2\u062b\u00cd"+
		"\3\2\2\2\u062c\u0630\5\u00ccg\2\u062d\u062f\5\u00d0i\2\u062e\u062d\3\2"+
		"\2\2\u062f\u0632\3\2\2\2\u0630\u062e\3\2\2\2\u0630\u0631\3\2\2\2\u0631"+
		"\u0634\3\2\2\2\u0632\u0630\3\2\2\2\u0633\u0635\5\u00d2j\2\u0634\u0633"+
		"\3\2\2\2\u0634\u0635\3\2\2\2\u0635\u00cf\3\2\2\2\u0636\u0637\7Y\2\2\u0637"+
		"\u0638\5\u00ccg\2\u0638\u00d1\3\2\2\2\u0639\u063f\7Y\2\2\u063a\u063b\7"+
		"\7\2\2\u063b\u063c\5\u00e2r\2\u063c\u063d\7\b\2\2\u063d\u0640\3\2\2\2"+
		"\u063e\u0640\5\u00e4s\2\u063f\u063a\3\2\2\2\u063f\u063e\3\2\2\2\u0640"+
		"\u00d3\3\2\2\2\u0641\u0642\5\u00eex\2\u0642\u0643\7\u00c9\2\2\u0643\u0644"+
		"\7\36\2\2\u0644\u0648\5\u00d6l\2\u0645\u0647\7\31\2\2\u0646\u0645\3\2"+
		"\2\2\u0647\u064a\3\2\2\2\u0648\u0646\3\2\2\2\u0648\u0649\3\2\2\2\u0649"+
		"\u00d5\3\2\2\2\u064a\u0648\3\2\2\2\u064b\u064d\5\u00dep\2\u064c\u064b"+
		"\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u064c\3\2\2\2\u064e\u064f\3\2\2\2\u064f"+
		"\u0650\3\2\2\2\u0650\u065a\7\17\2\2\u0651\u0652\7\7\2\2\u0652\u0653\5"+
		"\u00e2r\2\u0653\u0654\7\b\2\2\u0654\u065b\3\2\2\2\u0655\u065b\5\u00e4"+
		"s\2\u0656\u0657\7\33\2\2\u0657\u0658\5\u00d6l\2\u0658\u0659\7\34\2\2\u0659"+
		"\u065b\3\2\2\2\u065a\u0651\3\2\2\2\u065a\u0655\3\2\2\2\u065a\u0656\3\2"+
		"\2\2\u065b\u065c\3\2\2\2\u065c\u0666\7\t\2\2\u065d\u065e\7\7\2\2\u065e"+
		"\u065f\5\u00e2r\2\u065f\u0660\7\b\2\2\u0660\u0667\3\2\2\2\u0661\u0667"+
		"\5\u00e4s\2\u0662\u0663\7\33\2\2\u0663\u0664\5\u00d6l\2\u0664\u0665\7"+
		"\34\2\2\u0665\u0667\3\2\2\2\u0666\u065d\3\2\2\2\u0666\u0661\3\2\2\2\u0666"+
		"\u0662\3\2\2\2\u0667\u00d7\3\2\2\2\u0668\u066a\bm\1\2\u0669\u066b\5\u00ee"+
		"x\2\u066a\u0669\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u066c\3\2\2\2\u066c"+
		"\u066e\7\u00c9\2\2\u066d\u066f\5\u00e6t\2\u066e\u066d\3\2\2\2\u066e\u066f"+
		"\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u0671\7\36\2\2\u0671\u0675\5\u00d8"+
		"m\2\u0672\u0674\7\31\2\2\u0673\u0672\3\2\2\2\u0674\u0677\3\2\2\2\u0675"+
		"\u0673\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u06da\3\2\2\2\u0677\u0675\3\2"+
		"\2\2\u0678\u0679\7\33\2\2\u0679\u067a\5\u00d8m\2\u067a\u067e\7\34\2\2"+
		"\u067b\u067d\7\31\2\2\u067c\u067b\3\2\2\2\u067d\u0680\3\2\2\2\u067e\u067c"+
		"\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u06da\3\2\2\2\u0680\u067e\3\2\2\2\u0681"+
		"\u0682\5\u00e8u\2\u0682\u0688\7\u00c9\2\2\u0683\u0686\7\36\2\2\u0684\u0687"+
		"\5\u00d8m\2\u0685\u0687\7\u00c9\2\2\u0686\u0684\3\2\2\2\u0686\u0685\3"+
		"\2\2\2\u0687\u0689\3\2\2\2\u0688\u0683\3\2\2\2\u0688\u0689\3\2\2\2\u0689"+
		"\u068d\3\2\2\2\u068a\u068c\7\31\2\2\u068b\u068a\3\2\2\2\u068c\u068f\3"+
		"\2\2\2\u068d\u068b\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u06da\3\2\2\2\u068f"+
		"\u068d\3\2\2\2\u0690\u0691\5\u00f2z\2\u0691\u0697\5\u00e8u\2\u0692\u0695"+
		"\7\36\2\2\u0693\u0696\5\u00d8m\2\u0694\u0696\7\u00c9\2\2\u0695\u0693\3"+
		"\2\2\2\u0695\u0694\3\2\2\2\u0696\u0698\3\2\2\2\u0697\u0692\3\2\2\2\u0697"+
		"\u0698\3\2\2\2\u0698\u069c\3\2\2\2\u0699\u069b\7\31\2\2\u069a\u0699\3"+
		"\2\2\2\u069b\u069e\3\2\2\2\u069c\u069a\3\2\2\2\u069c\u069d\3\2\2\2\u069d"+
		"\u06da\3\2\2\2\u069e\u069c\3\2\2\2\u069f\u06a3\5\u0094K\2\u06a0\u06a2"+
		"\7\31\2\2\u06a1\u06a0\3\2\2\2\u06a2\u06a5\3\2\2\2\u06a3\u06a1\3\2\2\2"+
		"\u06a3\u06a4\3\2\2\2\u06a4\u06da\3\2\2\2\u06a5\u06a3\3\2\2\2\u06a6\u06aa"+
		"\5\u00c6d\2\u06a7\u06a9\7\31\2\2\u06a8\u06a7\3\2\2\2\u06a9\u06ac\3\2\2"+
		"\2\u06aa\u06a8\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06da\3\2\2\2\u06ac\u06aa"+
		"\3\2\2\2\u06ad\u06b1\5\u00be`\2\u06ae\u06b0\7\31\2\2\u06af\u06ae\3\2\2"+
		"\2\u06b0\u06b3\3\2\2\2\u06b1\u06af\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06da"+
		"\3\2\2\2\u06b3\u06b1\3\2\2\2\u06b4\u06b8\5\u00f2z\2\u06b5\u06b7\7\31\2"+
		"\2\u06b6\u06b5\3\2\2\2\u06b7\u06ba\3\2\2\2\u06b8\u06b6\3\2\2\2\u06b8\u06b9"+
		"\3\2\2\2\u06b9\u06da\3\2\2\2\u06ba\u06b8\3\2\2\2\u06bb\u06bf\5\u00dan"+
		"\2\u06bc\u06be\7\31\2\2\u06bd\u06bc\3\2\2\2\u06be\u06c1\3\2\2\2\u06bf"+
		"\u06bd\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06da\3\2\2\2\u06c1\u06bf\3\2"+
		"\2\2\u06c2\u06c3\7\5\2\2\u06c3\u06c4\5\u00caf\2\u06c4\u06c8\7\5\2\2\u06c5"+
		"\u06c7\7\31\2\2\u06c6\u06c5\3\2\2\2\u06c7\u06ca\3\2\2\2\u06c8\u06c6\3"+
		"\2\2\2\u06c8\u06c9\3\2\2\2\u06c9\u06da\3\2\2\2\u06ca\u06c8\3\2\2\2\u06cb"+
		"\u06cf\5\u00dco\2\u06cc\u06ce\7\31\2\2\u06cd\u06cc\3\2\2\2\u06ce\u06d1"+
		"\3\2\2\2\u06cf\u06cd\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06da\3\2\2\2\u06d1"+
		"\u06cf\3\2\2\2\u06d2\u06d6\7\u0081\2\2\u06d3\u06d5\7\31\2\2\u06d4\u06d3"+
		"\3\2\2\2\u06d5\u06d8\3\2\2\2\u06d6\u06d4\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7"+
		"\u06da\3\2\2\2\u06d8\u06d6\3\2\2\2\u06d9\u0668\3\2\2\2\u06d9\u0678\3\2"+
		"\2\2\u06d9\u0681\3\2\2\2\u06d9\u0690\3\2\2\2\u06d9\u069f\3\2\2\2\u06d9"+
		"\u06a6\3\2\2\2\u06d9\u06ad\3\2\2\2\u06d9\u06b4\3\2\2\2\u06d9\u06bb\3\2"+
		"\2\2\u06d9\u06c2\3\2\2\2\u06d9\u06cb\3\2\2\2\u06d9\u06d2\3\2\2\2\u06da"+
		"\u06f8\3\2\2\2\u06db\u06dc\f\17\2\2\u06dc\u06dd\7\37\2\2\u06dd\u06e1\5"+
		"\u00d8m\2\u06de\u06e0\7\31\2\2\u06df\u06de\3\2\2\2\u06e0\u06e3\3\2\2\2"+
		"\u06e1\u06df\3\2\2\2\u06e1\u06e2\3\2\2\2\u06e2\u06f7\3\2\2\2\u06e3\u06e1"+
		"\3\2\2\2\u06e4\u06e5\f\16\2\2\u06e5\u06e6\7$\2\2\u06e6\u06ea\5\u00d8m"+
		"\2\u06e7\u06e9\7\31\2\2\u06e8\u06e7\3\2\2\2\u06e9\u06ec\3\2\2\2\u06ea"+
		"\u06e8\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06f7\3\2\2\2\u06ec\u06ea\3\2"+
		"\2\2\u06ed\u06ee\f\r\2\2\u06ee\u06ef\5\u00e6t\2\u06ef\u06f3\5\u00d8m\2"+
		"\u06f0\u06f2\7\31\2\2\u06f1\u06f0\3\2\2\2\u06f2\u06f5\3\2\2\2\u06f3\u06f1"+
		"\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f7\3\2\2\2\u06f5\u06f3\3\2\2\2\u06f6"+
		"\u06db\3\2\2\2\u06f6\u06e4\3\2\2\2\u06f6\u06ed\3\2\2\2\u06f7\u06fa\3\2"+
		"\2\2\u06f8\u06f6\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9\u00d9\3\2\2\2\u06fa"+
		"\u06f8\3\2\2\2\u06fb\u06fc\7\u00cb\2\2\u06fc\u00db\3\2\2\2\u06fd\u06fe"+
		"\t\20\2\2\u06fe\u00dd\3\2\2\2\u06ff\u0700\bp\1\2\u0700\u0701\5\u00d8m"+
		"\2\u0701\u0702\t\21\2\2\u0702\u0703\5\u00d8m\2\u0703\u0713\3\2\2\2\u0704"+
		"\u0713\5\u0094K\2\u0705\u0713\5\u00f2z\2\u0706\u070a\5\u00d8m\2\u0707"+
		"\u0708\t\22\2\2\u0708\u070b\7\u0081\2\2\u0709\u070b\7v\2\2\u070a\u0707"+
		"\3\2\2\2\u070a\u0709\3\2\2\2\u070b\u0713\3\2\2\2\u070c\u070d\7\33\2\2"+
		"\u070d\u070e\5\u00dep\2\u070e\u070f\7\34\2\2\u070f\u0713\3\2\2\2\u0710"+
		"\u0713\5\u00dan\2\u0711\u0713\5\u00dco\2\u0712\u06ff\3\2\2\2\u0712\u0704"+
		"\3\2\2\2\u0712\u0705\3\2\2\2\u0712\u0706\3\2\2\2\u0712\u070c\3\2\2\2\u0712"+
		"\u0710\3\2\2\2\u0712\u0711\3\2\2\2\u0713\u0719\3\2\2\2\u0714\u0715\f\6"+
		"\2\2\u0715\u0716\t\23\2\2\u0716\u0718\5\u00dep\7\u0717\u0714\3\2\2\2\u0718"+
		"\u071b\3\2\2\2\u0719\u0717\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u00df\3\2"+
		"\2\2\u071b\u0719\3\2\2\2\u071c\u0720\7\r\2\2\u071d\u071f\5\u00caf\2\u071e"+
		"\u071d\3\2\2\2\u071f\u0722\3\2\2\2\u0720\u071e\3\2\2\2\u0720\u0721\3\2"+
		"\2\2\u0721\u072c\3\2\2\2\u0722\u0720\3\2\2\2\u0723\u0727\7\27\2\2\u0724"+
		"\u0726\5\u00caf\2\u0725\u0724\3\2\2\2\u0726\u0729\3\2\2\2\u0727\u0725"+
		"\3\2\2\2\u0727\u0728\3\2\2\2\u0728\u072a\3\2\2\2\u0729\u0727\3\2\2\2\u072a"+
		"\u072c\7\30\2\2\u072b\u071c\3\2\2\2\u072b\u0723\3\2\2\2\u072c\u00e1\3"+
		"\2\2\2\u072d\u0749\5\u00e0q\2\u072e\u0732\5&\24\2\u072f\u0731\7\31\2\2"+
		"\u0730\u072f\3\2\2\2\u0731\u0734\3\2\2\2\u0732\u0730\3\2\2\2\u0732\u0733"+
		"\3\2\2\2\u0733\u0749\3\2\2\2\u0734\u0732\3\2\2\2\u0735\u0749\5\u0098M"+
		"\2\u0736\u0749\5\u00d8m\2\u0737\u0749\5\u00a2R\2\u0738\u0749\5\u00ceh"+
		"\2\u0739\u0749\5\u00d4k\2\u073a\u0749\5\u00a6T\2\u073b\u0749\5\u00acW"+
		"\2\u073c\u0749\5\u00b4[\2\u073d\u0749\5\u00b6\\\2\u073e\u0749\5\u00b8"+
		"]\2\u073f\u0749\5\u00c4c\2\u0740\u0749\5\u00c8e\2\u0741\u0749\5\u00a4"+
		"S\2\u0742\u0749\5\u00ecw\2\u0743\u0749\5\u00bc_\2\u0744\u0745\7\7\2\2"+
		"\u0745\u0746\5\u00e2r\2\u0746\u0747\7\b\2\2\u0747\u0749\3\2\2\2\u0748"+
		"\u072d\3\2\2\2\u0748\u072e\3\2\2\2\u0748\u0735\3\2\2\2\u0748\u0736\3\2"+
		"\2\2\u0748\u0737\3\2\2\2\u0748\u0738\3\2\2\2\u0748\u0739\3\2\2\2\u0748"+
		"\u073a\3\2\2\2\u0748\u073b\3\2\2\2\u0748\u073c\3\2\2\2\u0748\u073d\3\2"+
		"\2\2\u0748\u073e\3\2\2\2\u0748\u073f\3\2\2\2\u0748\u0740\3\2\2\2\u0748"+
		"\u0741\3\2\2\2\u0748\u0742\3\2\2\2\u0748\u0743\3\2\2\2\u0748\u0744\3\2"+
		"\2\2\u0749\u074c\3\2\2\2\u074a\u0748\3\2\2\2\u074a\u074b\3\2\2\2\u074b"+
		"\u00e3\3\2\2\2\u074c\u074a\3\2\2\2\u074d\u0764\5\u00e0q\2\u074e\u0764"+
		"\5\u0098M\2\u074f\u0753\5&\24\2\u0750\u0752\7\31\2\2\u0751\u0750\3\2\2"+
		"\2\u0752\u0755\3\2\2\2\u0753\u0751\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0764"+
		"\3\2\2\2\u0755\u0753\3\2\2\2\u0756\u0764\5\u00d8m\2\u0757\u0764\5\u00a2"+
		"R\2\u0758\u0764\5\u00ceh\2\u0759\u0764\5\u00d4k\2\u075a\u0764\5\u00a6"+
		"T\2\u075b\u0764\5\u00acW\2\u075c\u0764\5\u00b4[\2\u075d\u0764\5\u00b8"+
		"]\2\u075e\u0764\5\u00b6\\\2\u075f\u0764\5\u00c4c\2\u0760\u0764\5\u00a4"+
		"S\2\u0761\u0764\5\u00c8e\2\u0762\u0764\5\u00ecw\2\u0763\u074d\3\2\2\2"+
		"\u0763\u074e\3\2\2\2\u0763\u074f\3\2\2\2\u0763\u0756\3\2\2\2\u0763\u0757"+
		"\3\2\2\2\u0763\u0758\3\2\2\2\u0763\u0759\3\2\2\2\u0763\u075a\3\2\2\2\u0763"+
		"\u075b\3\2\2\2\u0763\u075c\3\2\2\2\u0763\u075d\3\2\2\2\u0763\u075e\3\2"+
		"\2\2\u0763\u075f\3\2\2\2\u0763\u0760\3\2\2\2\u0763\u0761\3\2\2\2\u0763"+
		"\u0762\3\2\2\2\u0764\u00e5\3\2\2\2\u0765\u0766\t\24\2\2\u0766\u00e7\3"+
		"\2\2\2\u0767\u0768\7 \2\2\u0768\u076c\7 \2\2\u0769\u076a\7!\2\2\u076a"+
		"\u076c\7!\2\2\u076b\u0767\3\2\2\2\u076b\u0769\3\2\2\2\u076c\u00e9\3\2"+
		"\2\2\u076d\u0770\5\u00f2z\2\u076e\u076f\7\36\2\2\u076f\u0771\5\u00d8m"+
		"\2\u0770\u076e\3\2\2\2\u0770\u0771\3\2\2\2\u0771\u00eb\3\2\2\2\u0772\u0776"+
		"\7\u00ba\2\2\u0773\u0775\7\31\2\2\u0774\u0773\3\2\2\2\u0775\u0778\3\2"+
		"\2\2\u0776\u0774\3\2\2\2\u0776\u0777\3\2\2\2\u0777\u00ed\3\2\2\2\u0778"+
		"\u0776\3\2\2\2\u0779\u077c\5\u00f0y\2\u077a\u077c\7\u00be\2\2\u077b\u0779"+
		"\3\2\2\2\u077b\u077a\3\2\2\2\u077c\u00ef\3\2\2\2\u077d\u077e\t\25\2\2"+
		"\u077e\u00f1\3\2\2\2\u077f\u0786\7\u00c9\2\2\u0780\u0786\7\u00cc\2\2\u0781"+
		"\u0782\7\33\2\2\u0782\u0783\5\u00f2z\2\u0783\u0784\7\34\2\2\u0784\u0786"+
		"\3\2\2\2\u0785\u077f\3\2\2\2\u0785\u0780\3\2\2\2\u0785\u0781\3\2\2\2\u0786"+
		"\u00f3\3\2\2\2\u00eb\u00f6\u00f8\u0100\u0107\u010c\u0112\u011f\u0126\u0131"+
		"\u0134\u0147\u015d\u016c\u0173\u017a\u0181\u0186\u018f\u0191\u0198\u01ae"+
		"\u01b4\u01b9\u01c5\u01c8\u01ce\u01d0\u01d7\u01e0\u01e5\u01ee\u01f9\u0200"+
		"\u0206\u0210\u0213\u0219\u021b\u021f\u0226\u022f\u0233\u0235\u0239\u0242"+
		"\u0247\u0249\u0252\u025d\u0264\u0267\u0276\u027b\u0280\u0282\u0289\u0290"+
		"\u0295\u0299\u029c\u02a0\u02af\u02b3\u02b6\u02cb\u02d1\u02d3\u02d7\u02de"+
		"\u02e3\u02f2\u030f\u0324\u0326\u032e\u0334\u033b\u033f\u0347\u0350\u0355"+
		"\u0361\u0365\u0369\u036d\u0374\u0377\u0379\u0380\u0383\u0387\u0392\u039b"+
		"\u03a7\u03ae\u03b1\u03b9\u03bf\u03c7\u03d1\u03d9\u03dd\u03e6\u03e9\u03eb"+
		"\u03f0\u03f4\u03f7\u03fe\u0406\u040a\u040e\u0411\u0417\u041a\u041c\u0425"+
		"\u042b\u042f\u0432\u0436\u043c\u0441\u0445\u044c\u0455\u0459\u045b\u045f"+
		"\u0468\u046d\u046f\u0478\u0483\u048a\u048d\u0490\u0494\u04b9\u04c0\u04c3"+
		"\u04cc\u04d2\u04d9\u04e5\u04e8\u04f0\u04f6\u04fe\u0506\u050e\u0515\u0521"+
		"\u0524\u052e\u053c\u0542\u0547\u0549\u0552\u0569\u056c\u0575\u057f\u0588"+
		"\u058f\u05a9\u05ae\u05b4\u05b9\u05bd\u05c8\u05d8\u05e2\u05e4\u05f0\u05f2"+
		"\u05f4\u05f8\u05fe\u0604\u060c\u0613\u061b\u0622\u062a\u0630\u0634\u063f"+
		"\u0648\u064e\u065a\u0666\u066a\u066e\u0675\u067e\u0686\u0688\u068d\u0695"+
		"\u0697\u069c\u06a3\u06aa\u06b1\u06b8\u06bf\u06c8\u06cf\u06d6\u06d9\u06e1"+
		"\u06ea\u06f3\u06f6\u06f8\u070a\u0712\u0719\u0720\u0727\u072b\u0732\u0748"+
		"\u074a\u0753\u0763\u076b\u0770\u0776\u077b\u0785";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}