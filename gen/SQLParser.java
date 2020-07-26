// Generated from C:/Users/hp/Documents/Intellij Projects/Compiler/src\SQL.g4 by ANTLR 4.7.2
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
		SCOL=18, DOT=19, OPEN_PAR=20, CLOSE_PAR=21, COMMA=22, ASSIGN=23, STAR=24, 
		PLUS=25, MINUS=26, TILDE=27, PIPE2=28, DIV=29, MOD=30, LT2=31, GT2=32, 
		AMP=33, PIPE=34, LT=35, LT_EQ=36, GT=37, GT_EQ=38, EQ=39, NOT_EQ1=40, 
		NOT_EQ2=41, K_ABORT=42, K_ACTION=43, K_ADD=44, K_AFTER=45, K_ALL=46, K_ALTER=47, 
		K_ANALYZE=48, K_AND=49, K_AS=50, K_ASC=51, K_ATTACH=52, K_AUTOINCREMENT=53, 
		K_BEFORE=54, K_BEGIN=55, K_BETWEEN=56, K_BY=57, K_CASCADE=58, K_CASE=59, 
		K_CAST=60, K_CHECK=61, K_COLLATE=62, K_COLUMN=63, K_COMMIT=64, K_CONFLICT=65, 
		K_CONSTRAINT=66, K_CREATE=67, K_CROSS=68, K_CURRENT_DATE=69, K_CURRENT_TIME=70, 
		K_CURRENT_TIMESTAMP=71, K_DATABASE=72, K_DEFAULT=73, K_DEFERRABLE=74, 
		K_DEFERRED=75, K_DELETE=76, K_DESC=77, K_DETACH=78, K_DISTINCT=79, K_DROP=80, 
		K_EACH=81, K_ELSE=82, K_END=83, K_ENABLE=84, K_ESCAPE=85, K_EXCEPT=86, 
		K_EXCLUSIVE=87, K_EXISTS=88, K_EXPLAIN=89, K_FAIL=90, K_FOR=91, K_FOREIGN=92, 
		K_FROM=93, K_FULL=94, K_GLOB=95, K_GROUP=96, K_HAVING=97, K_IF=98, K_IGNORE=99, 
		K_IMMEDIATE=100, K_IN=101, K_INDEX=102, K_INDEXED=103, K_INITIALLY=104, 
		K_INNER=105, K_INSERT=106, K_INSTEAD=107, K_INTERSECT=108, K_INTO=109, 
		K_IS=110, K_ISNULL=111, K_JOIN=112, K_KEY=113, K_LEFT=114, K_LIKE=115, 
		K_LIMIT=116, K_MATCH=117, K_NATURAL=118, K_NEXTVAL=119, K_NO=120, K_NOT=121, 
		K_NOTNULL=122, K_NULL=123, K_OF=124, K_OFFSET=125, K_ON=126, K_ONLY=127, 
		K_OR=128, K_ORDER=129, K_OUTER=130, K_PLAN=131, K_PRAGMA=132, K_PRIMARY=133, 
		K_QUERY=134, K_RAISE=135, K_RECURSIVE=136, K_REFERENCES=137, K_REGEXP=138, 
		K_REINDEX=139, K_RELEASE=140, K_RENAME=141, K_REPLACE=142, K_RESTRICT=143, 
		K_RIGHT=144, K_ROLLBACK=145, K_ROW=146, K_SAVEPOINT=147, K_SELECT=148, 
		K_SET=149, K_TABLE=150, K_TEMP=151, K_TEMPORARY=152, K_THEN=153, K_TO=154, 
		K_TRANSACTION=155, K_TRIGGER=156, K_UNION=157, K_UNIQUE=158, K_UPDATE=159, 
		K_USING=160, K_VACUUM=161, K_VALUES=162, K_VIEW=163, K_VIRTUAL=164, K_WHEN=165, 
		K_WHERE=166, K_WITH=167, K_WITHOUT=168, K_VOID=169, K_INT=170, K_FLOAT=171, 
		K_WHILE=172, K_TRY=173, K_CATCH=174, K_EXCEPTION=175, K_FINALY=176, K_SWITCH=177, 
		K_BREAK=178, K_DO=179, K_PRINT=180, K_RETURN=181, K_VAR=182, K_ARRAY=183, 
		K_FUNCTION=184, K_CONTENUOE=185, K_FORECH=186, K_ID=187, K_NAME=188, IDENTIFIER=189, 
		CHAR=190, NUMERIC_LITERAL=191, STRING_LITERAL=192, BLOB_LITERAL=193, MULTILINE_COMMENT=194, 
		SPACES=195, UNEXPECTED_CHAR=196;
	public static final int
		RULE_parse = 0, RULE_sql_stmt_list = 1, RULE_sql_stmt = 2, RULE_alter_table_stmt = 3, 
		RULE_alter_table_add_constraint = 4, RULE_alter_table_add = 5, RULE_create_table_stmt = 6, 
		RULE_delete_stmt = 7, RULE_drop_table_stmt = 8, RULE_factored_select_stmt = 9, 
		RULE_insert_stmt = 10, RULE_select_stmt = 11, RULE_select_or_values = 12, 
		RULE_update_stmt = 13, RULE_column_def = 14, RULE_type_name = 15, RULE_column_constraint = 16, 
		RULE_column_constraint_primary_key = 17, RULE_column_constraint_foreign_key = 18, 
		RULE_column_constraint_not_null = 19, RULE_column_constraint_null = 20, 
		RULE_column_default = 21, RULE_column_default_value = 22, RULE_expr = 23, 
		RULE_foreign_key_clause = 24, RULE_fk_target_column_name = 25, RULE_indexed_column = 26, 
		RULE_table_constraint = 27, RULE_table_constraint_primary_key = 28, RULE_table_constraint_foreign_key = 29, 
		RULE_table_constraint_unique = 30, RULE_table_constraint_key = 31, RULE_fk_origin_column_name = 32, 
		RULE_qualified_table_name = 33, RULE_ordering_term = 34, RULE_result_column = 35, 
		RULE_table_or_subquery = 36, RULE_join_clause = 37, RULE_join_operator = 38, 
		RULE_join_constraint = 39, RULE_select_core = 40, RULE_signed_number = 41, 
		RULE_literal_value = 42, RULE_unary_operator = 43, RULE_column_alias = 44, 
		RULE_name = 45, RULE_function_name = 46, RULE_database_name = 47, RULE_source_table_name = 48, 
		RULE_table_name = 49, RULE_new_table_name = 50, RULE_column_name = 51, 
		RULE_collation_name = 52, RULE_foreign_table = 53, RULE_index_name = 54, 
		RULE_table_alias = 55, RULE_statements_of_code_list = 56, RULE_statements_of_code = 57, 
		RULE_def_function = 58, RULE_listOfParameters = 59, RULE_parameter = 60, 
		RULE_prototype_func = 61, RULE_def_var_core = 62, RULE_while_repeat = 63, 
		RULE_do_while = 64, RULE_for_repeat = 65, RULE_foreach = 66, RULE_repeat = 67, 
		RULE_return_value = 68, RULE_try_catch = 69, RULE_switch_case = 70, RULE_switch_body = 71, 
		RULE_cases = 72, RULE_print_func = 73, RULE_sort_func_def = 74, RULE_array_def = 75, 
		RULE_bodyArray = 76, RULE_key_value = 77, RULE_body_for_json = 78, RULE_obj_json = 79, 
		RULE_read_obj_json = 80, RULE_write_obj_json = 81, RULE_character = 82, 
		RULE_if_statement_core = 83, RULE_if_statement = 84, RULE_else_if_statement = 85, 
		RULE_else_statement = 86, RULE_if_statement_one_line = 87, RULE_body_onelineCond = 88, 
		RULE_exp = 89, RULE_cond = 90, RULE_def_stmt_list = 91, RULE_def_stmt = 92, 
		RULE_op = 93, RULE_op_double = 94, RULE_def_var = 95, RULE_breakKeyWord = 96, 
		RULE_keyword_def = 97, RULE_any_name = 98;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "alter_table_add_constraint", 
			"alter_table_add", "create_table_stmt", "delete_stmt", "drop_table_stmt", 
			"factored_select_stmt", "insert_stmt", "select_stmt", "select_or_values", 
			"update_stmt", "column_def", "type_name", "column_constraint", "column_constraint_primary_key", 
			"column_constraint_foreign_key", "column_constraint_not_null", "column_constraint_null", 
			"column_default", "column_default_value", "expr", "foreign_key_clause", 
			"fk_target_column_name", "indexed_column", "table_constraint", "table_constraint_primary_key", 
			"table_constraint_foreign_key", "table_constraint_unique", "table_constraint_key", 
			"fk_origin_column_name", "qualified_table_name", "ordering_term", "result_column", 
			"table_or_subquery", "join_clause", "join_operator", "join_constraint", 
			"select_core", "signed_number", "literal_value", "unary_operator", "column_alias", 
			"name", "function_name", "database_name", "source_table_name", "table_name", 
			"new_table_name", "column_name", "collation_name", "foreign_table", "index_name", 
			"table_alias", "statements_of_code_list", "statements_of_code", "def_function", 
			"listOfParameters", "parameter", "prototype_func", "def_var_core", "while_repeat", 
			"do_while", "for_repeat", "foreach", "repeat", "return_value", "try_catch", 
			"switch_case", "switch_body", "cases", "print_func", "sort_func_def", 
			"array_def", "bodyArray", "key_value", "body_for_json", "obj_json", "read_obj_json", 
			"write_obj_json", "character", "if_statement_core", "if_statement", "else_if_statement", 
			"else_statement", "if_statement_one_line", "body_onelineCond", "exp", 
			"cond", "def_stmt_list", "def_stmt", "op", "op_double", "def_var", "breakKeyWord", 
			"keyword_def", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'::'", "'{'", "'}'", "':'", "'})'", "'[]'", "'\"'", "'?'", "'!'", 
			"'@'", "'#'", "'$'", "'^'", "'_'", "'['", "']'", "'&&'", "';'", "'.'", 
			"'('", "')'", "','", "'='", "'*'", "'+'", "'-'", "'~'", "'||'", "'/'", 
			"'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'=='", 
			"'!='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", 
			"COMMA", "ASSIGN", "STAR", "PLUS", "MINUS", "TILDE", "PIPE2", "DIV", 
			"MOD", "LT2", "GT2", "AMP", "PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", 
			"NOT_EQ1", "NOT_EQ2", "K_ABORT", "K_ACTION", "K_ADD", "K_AFTER", "K_ALL", 
			"K_ALTER", "K_ANALYZE", "K_AND", "K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", 
			"K_BEFORE", "K_BEGIN", "K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", 
			"K_CHECK", "K_COLLATE", "K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", 
			"K_CREATE", "K_CROSS", "K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", 
			"K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", 
			"K_DESC", "K_DETACH", "K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", 
			"K_ENABLE", "K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", 
			"K_FAIL", "K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", "K_GROUP", 
			"K_HAVING", "K_IF", "K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", 
			"K_INITIALLY", "K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", 
			"K_IS", "K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", 
			"K_MATCH", "K_NATURAL", "K_NEXTVAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", 
			"K_OF", "K_OFFSET", "K_ON", "K_ONLY", "K_OR", "K_ORDER", "K_OUTER", "K_PLAN", 
			"K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", "K_RECURSIVE", "K_REFERENCES", 
			"K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", "K_REPLACE", "K_RESTRICT", 
			"K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", "K_SELECT", "K_SET", 
			"K_TABLE", "K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", "K_TRANSACTION", 
			"K_TRIGGER", "K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", "K_VACUUM", 
			"K_VALUES", "K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", 
			"K_VOID", "K_INT", "K_FLOAT", "K_WHILE", "K_TRY", "K_CATCH", "K_EXCEPTION", 
			"K_FINALY", "K_SWITCH", "K_BREAK", "K_DO", "K_PRINT", "K_RETURN", "K_VAR", 
			"K_ARRAY", "K_FUNCTION", "K_CONTENUOE", "K_FORECH", "K_ID", "K_NAME", 
			"IDENTIFIER", "CHAR", "NUMERIC_LITERAL", "STRING_LITERAL", "BLOB_LITERAL", 
			"MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
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
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << SCOL) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << K_ALTER))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (K_CREATE - 67)) | (1L << (K_DELETE - 67)) | (1L << (K_DROP - 67)) | (1L << (K_FOR - 67)) | (1L << (K_IF - 67)) | (1L << (K_INSERT - 67)) | (1L << (K_NULL - 67)))) != 0) || ((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (K_SELECT - 148)) | (1L << (K_UPDATE - 148)) | (1L << (K_VALUES - 148)) | (1L << (K_VOID - 148)) | (1L << (K_INT - 148)) | (1L << (K_FLOAT - 148)) | (1L << (K_WHILE - 148)) | (1L << (K_TRY - 148)) | (1L << (K_SWITCH - 148)) | (1L << (K_BREAK - 148)) | (1L << (K_DO - 148)) | (1L << (K_PRINT - 148)) | (1L << (K_RETURN - 148)) | (1L << (K_VAR - 148)) | (1L << (K_ARRAY - 148)) | (1L << (K_FORECH - 148)) | (1L << (IDENTIFIER - 148)) | (1L << (NUMERIC_LITERAL - 148)))) != 0)) {
				{
				setState(200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(198);
					sql_stmt_list();
					}
					break;
				case 2:
					{
					setState(199);
					statements_of_code_list();
					}
					break;
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
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
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(207);
				match(SCOL);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			sql_stmt();
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(215); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(214);
						match(SCOL);
						}
						}
						setState(217); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(219);
					sql_stmt();
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					match(SCOL);
					}
					} 
				}
				setState(230);
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
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
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
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DROP:
				{
				setState(231);
				drop_table_stmt();
				}
				break;
			case K_SELECT:
			case K_VALUES:
				{
				setState(232);
				factored_select_stmt();
				}
				break;
			case K_CREATE:
				{
				setState(233);
				create_table_stmt();
				}
				break;
			case K_DELETE:
				{
				setState(234);
				delete_stmt();
				}
				break;
			case K_ALTER:
				{
				setState(235);
				alter_table_stmt();
				}
				break;
			case K_INSERT:
				{
				setState(236);
				insert_stmt();
				}
				break;
			case K_UPDATE:
				{
				setState(237);
				update_stmt();
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
			setState(240);
			match(K_ALTER);
			setState(241);
			match(K_TABLE);
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(242);
				database_name();
				setState(243);
				match(DOT);
				}
				break;
			}
			setState(247);
			source_table_name();
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(248);
				match(K_RENAME);
				setState(249);
				match(K_TO);
				setState(250);
				new_table_name();
				}
				break;
			case 2:
				{
				setState(251);
				alter_table_add();
				}
				break;
			case 3:
				{
				setState(252);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
				setState(253);
				match(K_ADD);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLUMN) {
					{
					setState(254);
					match(K_COLUMN);
					}
				}

				setState(257);
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
			setState(260);
			match(K_ADD);
			setState(261);
			match(K_CONSTRAINT);
			setState(262);
			any_name();
			setState(263);
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
			setState(265);
			match(K_ADD);
			setState(266);
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

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
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
		enterRule(_localctx, 12, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(K_CREATE);
			setState(269);
			match(K_TABLE);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(270);
				match(K_IF);
				setState(271);
				match(K_NOT);
				setState(272);
				match(K_EXISTS);
				}
			}

			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(275);
				database_name();
				setState(276);
				match(DOT);
				}
				break;
			}
			setState(280);
			table_name();
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(281);
				match(OPEN_PAR);
				setState(282);
				column_def();
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(287);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(283);
						match(COMMA);
						setState(284);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(285);
						match(COMMA);
						setState(286);
						column_def();
						}
						break;
					}
					}
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(292);
				match(CLOSE_PAR);
				}
				break;
			case K_AS:
				{
				setState(294);
				match(K_AS);
				setState(295);
				select_stmt();
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
		enterRule(_localctx, 14, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(K_DELETE);
			setState(299);
			match(K_FROM);
			setState(300);
			qualified_table_name();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(301);
				match(K_WHERE);
				setState(302);
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
		enterRule(_localctx, 16, RULE_drop_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(K_DROP);
			setState(306);
			match(K_TABLE);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(307);
				match(K_IF);
				setState(308);
				match(K_EXISTS);
				}
			}

			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(311);
				database_name();
				setState(312);
				match(DOT);
				}
				break;
			}
			setState(316);
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
		enterRule(_localctx, 18, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			select_core();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(319);
				match(K_ORDER);
				setState(320);
				match(K_BY);
				setState(321);
				ordering_term();
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(322);
					match(COMMA);
					setState(323);
					ordering_term();
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(331);
				match(K_LIMIT);
				setState(332);
				expr(0);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(333);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(334);
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
		enterRule(_localctx, 20, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(K_INSERT);
			setState(340);
			match(K_INTO);
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(341);
				database_name();
				setState(342);
				match(DOT);
				}
				break;
			}
			setState(346);
			table_name();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(347);
				match(OPEN_PAR);
				setState(348);
				column_name();
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(349);
					match(COMMA);
					setState(350);
					column_name();
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(356);
				match(CLOSE_PAR);
				}
			}

			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(360);
				match(K_VALUES);
				setState(361);
				match(OPEN_PAR);
				setState(362);
				expr(0);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(363);
					match(COMMA);
					setState(364);
					expr(0);
					}
					}
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(370);
				match(CLOSE_PAR);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(371);
					match(COMMA);
					setState(372);
					match(OPEN_PAR);
					setState(373);
					expr(0);
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(374);
						match(COMMA);
						setState(375);
						expr(0);
						}
						}
						setState(380);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(381);
					match(CLOSE_PAR);
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(388);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(389);
				match(K_DEFAULT);
				setState(390);
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
		enterRule(_localctx, 22, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			select_or_values();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(394);
				match(K_ORDER);
				setState(395);
				match(K_BY);
				setState(396);
				ordering_term();
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(397);
					match(COMMA);
					setState(398);
					ordering_term();
					}
					}
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(406);
				match(K_LIMIT);
				setState(407);
				expr(0);
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(408);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(409);
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
		enterRule(_localctx, 24, RULE_select_or_values);
		int _la;
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				match(K_SELECT);
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(415);
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

				setState(418);
				result_column();
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(419);
					match(COMMA);
					setState(420);
					result_column();
					}
					}
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(426);
					match(K_FROM);
					setState(436);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(427);
						table_or_subquery();
						setState(432);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(428);
							match(COMMA);
							setState(429);
							table_or_subquery();
							}
							}
							setState(434);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(435);
						join_clause();
						}
						break;
					}
					}
				}

				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(440);
					match(K_WHERE);
					setState(441);
					expr(0);
					}
				}

				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(444);
					match(K_GROUP);
					setState(445);
					match(K_BY);
					setState(446);
					expr(0);
					setState(451);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(447);
						match(COMMA);
						setState(448);
						expr(0);
						}
						}
						setState(453);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(456);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(454);
						match(K_HAVING);
						setState(455);
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
				setState(460);
				match(K_VALUES);
				setState(461);
				match(OPEN_PAR);
				setState(462);
				expr(0);
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(463);
					match(COMMA);
					setState(464);
					expr(0);
					}
					}
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(470);
				match(CLOSE_PAR);
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(471);
					match(COMMA);
					setState(472);
					match(OPEN_PAR);
					setState(473);
					expr(0);
					setState(478);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(474);
						match(COMMA);
						setState(475);
						expr(0);
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
					setState(487);
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
		enterRule(_localctx, 26, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(K_UPDATE);
			setState(491);
			qualified_table_name();
			setState(492);
			match(K_SET);
			setState(493);
			column_name();
			setState(494);
			match(ASSIGN);
			setState(495);
			expr(0);
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(496);
				match(COMMA);
				setState(497);
				column_name();
				setState(498);
				match(ASSIGN);
				setState(499);
				expr(0);
				}
				}
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(506);
				match(K_WHERE);
				setState(507);
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
		enterRule(_localctx, 28, RULE_column_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			column_name();
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(513);
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
						setState(511);
						column_constraint();
						}
						break;
					case OPEN_PAR:
					case IDENTIFIER:
					case STRING_LITERAL:
						{
						setState(512);
						type_name();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		enterRule(_localctx, 30, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			name();
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(519);
				match(OPEN_PAR);
				setState(520);
				signed_number();
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(521);
					any_name();
					}
				}

				setState(524);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(526);
				match(OPEN_PAR);
				setState(527);
				signed_number();
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(528);
					any_name();
					}
				}

				setState(531);
				match(COMMA);
				setState(532);
				signed_number();
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(533);
					any_name();
					}
				}

				setState(536);
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
		enterRule(_localctx, 32, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(540);
				match(K_CONSTRAINT);
				setState(541);
				name();
				}
			}

			setState(557);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(544);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(545);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(546);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(547);
				column_constraint_null();
				}
				break;
			case K_UNIQUE:
				{
				setState(548);
				match(K_UNIQUE);
				}
				break;
			case K_CHECK:
				{
				setState(549);
				match(K_CHECK);
				setState(550);
				match(OPEN_PAR);
				setState(551);
				expr(0);
				setState(552);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(554);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(555);
				match(K_COLLATE);
				setState(556);
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
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
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
		enterRule(_localctx, 34, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(K_PRIMARY);
			setState(560);
			match(K_KEY);
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(561);
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

			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AUTOINCREMENT) {
				{
				setState(564);
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
		enterRule(_localctx, 36, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
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
		enterRule(_localctx, 38, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(K_NOT);
			setState(570);
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
		enterRule(_localctx, 40, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
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
		enterRule(_localctx, 42, RULE_column_default);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(K_DEFAULT);
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(575);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(576);
				match(OPEN_PAR);
				setState(577);
				expr(0);
				setState(578);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(580);
				match(K_NEXTVAL);
				setState(581);
				match(OPEN_PAR);
				setState(582);
				expr(0);
				setState(583);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				setState(585);
				any_name();
				}
				break;
			}
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(588);
				match(T__0);
				setState(590); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(589);
						any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(592); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
		enterRule(_localctx, 44, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(596);
				signed_number();
				}
				break;
			case 2:
				{
				setState(597);
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
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode PIPE2() { return getToken(SQLParser.PIPE2, 0); }
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
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(601);
				literal_value();
				}
				break;
			case 2:
				{
				setState(610);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(605);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(602);
						database_name();
						setState(603);
						match(DOT);
						}
						break;
					}
					setState(607);
					table_name();
					setState(608);
					match(DOT);
					}
					break;
				}
				setState(612);
				column_name();
				}
				break;
			case 3:
				{
				setState(613);
				unary_operator();
				setState(614);
				expr(12);
				}
				break;
			case 4:
				{
				setState(616);
				function_name();
				setState(617);
				match(OPEN_PAR);
				setState(630);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
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
				case K_SELECT:
				case K_VALUES:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(619);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(618);
						match(K_DISTINCT);
						}
					}

					setState(621);
					expr(0);
					setState(626);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(622);
						match(COMMA);
						setState(623);
						expr(0);
						}
						}
						setState(628);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(629);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(632);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				{
				setState(634);
				match(OPEN_PAR);
				setState(635);
				expr(0);
				setState(636);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(638);
				select_core();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(680);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(678);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(641);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(642);
						match(PIPE2);
						setState(643);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(644);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(645);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(646);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(647);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(648);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(649);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(650);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(651);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(652);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(653);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(654);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(655);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(656);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(669);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
						case 1:
							{
							setState(657);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(658);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(659);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(660);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(661);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(662);
							match(K_IS);
							setState(663);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(664);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(665);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(666);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(667);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(668);
							match(K_REGEXP);
							}
							break;
						}
						setState(671);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(672);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(673);
						match(K_AND);
						setState(674);
						expr(6);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(675);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(676);
						match(K_OR);
						setState(677);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(682);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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
		enterRule(_localctx, 48, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(K_REFERENCES);
			setState(687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(684);
				database_name();
				setState(685);
				match(DOT);
				}
				break;
			}
			setState(689);
			foreign_table();
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(690);
				match(OPEN_PAR);
				setState(691);
				fk_target_column_name();
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(692);
					match(COMMA);
					setState(693);
					fk_target_column_name();
					}
					}
					setState(698);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(699);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(717);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(703);
					match(K_ON);
					setState(704);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(713);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						setState(705);
						match(K_SET);
						setState(706);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(707);
						match(K_SET);
						setState(708);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(709);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(710);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(711);
						match(K_NO);
						setState(712);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(715);
					match(K_MATCH);
					setState(716);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(724);
					match(K_NOT);
					}
				}

				setState(727);
				match(K_DEFERRABLE);
				setState(732);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(728);
					match(K_INITIALLY);
					setState(729);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(730);
					match(K_INITIALLY);
					setState(731);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ENABLE) {
					{
					setState(734);
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
		enterRule(_localctx, 50, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
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
		enterRule(_localctx, 52, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			column_name();
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(742);
				match(K_COLLATE);
				setState(743);
				collation_name();
				}
			}

			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(746);
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
		enterRule(_localctx, 54, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(749);
				match(K_CONSTRAINT);
				setState(750);
				name();
				}
			}

			setState(762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(753);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(754);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(755);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(756);
				match(K_CHECK);
				setState(757);
				match(OPEN_PAR);
				setState(758);
				expr(0);
				setState(759);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(761);
				table_constraint_foreign_key();
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

	public static class Table_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
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
		enterRule(_localctx, 56, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(K_PRIMARY);
			setState(765);
			match(K_KEY);
			setState(766);
			match(OPEN_PAR);
			setState(767);
			indexed_column();
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(768);
				match(COMMA);
				setState(769);
				indexed_column();
				}
				}
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(775);
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
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
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
		enterRule(_localctx, 58, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(K_FOREIGN);
			setState(778);
			match(K_KEY);
			setState(779);
			match(OPEN_PAR);
			setState(780);
			fk_origin_column_name();
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(781);
				match(COMMA);
				setState(782);
				fk_origin_column_name();
				}
				}
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(788);
			match(CLOSE_PAR);
			setState(789);
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
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
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
		enterRule(_localctx, 60, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(K_UNIQUE);
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_KEY) {
				{
				setState(792);
				match(K_KEY);
				}
			}

			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(795);
				name();
				}
				break;
			}
			setState(798);
			match(OPEN_PAR);
			setState(799);
			indexed_column();
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(800);
				match(COMMA);
				setState(801);
				indexed_column();
				}
				}
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(807);
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
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
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
		enterRule(_localctx, 62, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(K_KEY);
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(810);
				name();
				}
				break;
			}
			setState(813);
			match(OPEN_PAR);
			setState(814);
			indexed_column();
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(815);
				match(COMMA);
				setState(816);
				indexed_column();
				}
				}
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(822);
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
		enterRule(_localctx, 64, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
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
		enterRule(_localctx, 66, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(826);
				database_name();
				setState(827);
				match(DOT);
				}
				break;
			}
			setState(831);
			table_name();
			setState(837);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(832);
				match(K_INDEXED);
				setState(833);
				match(K_BY);
				setState(834);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(835);
				match(K_NOT);
				setState(836);
				match(K_INDEXED);
				}
				break;
			case EOF:
			case T__1:
			case T__6:
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
			case K_VOID:
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
			case IDENTIFIER:
			case NUMERIC_LITERAL:
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
		enterRule(_localctx, 68, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			expr(0);
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(840);
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
		enterRule(_localctx, 70, RULE_result_column);
		int _la;
		try {
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(843);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(844);
				table_name();
				setState(845);
				match(DOT);
				setState(846);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(848);
				expr(0);
				setState(853);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(850);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(849);
						match(K_AS);
						}
					}

					setState(852);
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
		enterRule(_localctx, 72, RULE_table_or_subquery);
		int _la;
		try {
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(860);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(857);
					database_name();
					setState(858);
					match(DOT);
					}
					break;
				}
				setState(862);
				table_name();
				setState(867);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(864);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(863);
						match(K_AS);
						}
					}

					setState(866);
					table_alias();
					}
					break;
				}
				setState(874);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(869);
					match(K_INDEXED);
					setState(870);
					match(K_BY);
					setState(871);
					index_name();
					}
					break;
				case 2:
					{
					setState(872);
					match(K_NOT);
					setState(873);
					match(K_INDEXED);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(876);
				match(OPEN_PAR);
				setState(886);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(877);
					table_or_subquery();
					setState(882);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(878);
						match(COMMA);
						setState(879);
						table_or_subquery();
						}
						}
						setState(884);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(885);
					join_clause();
					}
					break;
				}
				setState(888);
				match(CLOSE_PAR);
				setState(893);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(890);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(889);
						match(K_AS);
						}
					}

					setState(892);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(895);
				match(OPEN_PAR);
				setState(896);
				select_stmt();
				setState(897);
				match(CLOSE_PAR);
				setState(902);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(899);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(898);
						match(K_AS);
						}
					}

					setState(901);
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
		enterRule(_localctx, 74, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			table_or_subquery();
			setState(913);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(907);
					join_operator();
					setState(908);
					table_or_subquery();
					setState(909);
					join_constraint();
					}
					} 
				}
				setState(915);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
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
		enterRule(_localctx, 76, RULE_join_operator);
		int _la;
		try {
			setState(925);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(916);
				match(COMMA);
				}
				break;
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(922);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(917);
					match(K_LEFT);
					setState(919);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(918);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(921);
					match(K_INNER);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(924);
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
		enterRule(_localctx, 78, RULE_join_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(927);
				match(K_ON);
				setState(928);
				expr(0);
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

	public static class Select_coreContext extends ParserRuleContext {
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
		enterRule(_localctx, 80, RULE_select_core);
		int _la;
		try {
			int _alt;
			setState(1005);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(931);
				match(K_SELECT);
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(932);
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

				setState(935);
				result_column();
				setState(940);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(936);
						match(COMMA);
						setState(937);
						result_column();
						}
						} 
					}
					setState(942);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				}
				setState(955);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(943);
					match(K_FROM);
					setState(953);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
					case 1:
						{
						setState(944);
						table_or_subquery();
						setState(949);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(945);
								match(COMMA);
								setState(946);
								table_or_subquery();
								}
								} 
							}
							setState(951);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(952);
						join_clause();
						}
						break;
					}
					}
					break;
				}
				setState(959);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(957);
					match(K_WHERE);
					setState(958);
					expr(0);
					}
					break;
				}
				setState(975);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(961);
					match(K_GROUP);
					setState(962);
					match(K_BY);
					setState(963);
					expr(0);
					setState(968);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(964);
							match(COMMA);
							setState(965);
							expr(0);
							}
							} 
						}
						setState(970);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
					}
					setState(973);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
					case 1:
						{
						setState(971);
						match(K_HAVING);
						setState(972);
						expr(0);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(977);
				match(K_VALUES);
				setState(978);
				match(OPEN_PAR);
				setState(979);
				expr(0);
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(980);
					match(COMMA);
					setState(981);
					expr(0);
					}
					}
					setState(986);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(987);
				match(CLOSE_PAR);
				setState(1002);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(988);
						match(COMMA);
						setState(989);
						match(OPEN_PAR);
						setState(990);
						expr(0);
						setState(995);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(991);
							match(COMMA);
							setState(992);
							expr(0);
							}
							}
							setState(997);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(998);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(1004);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
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
		enterRule(_localctx, 82, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(1008);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1007);
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

				setState(1010);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(1011);
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
		enterRule(_localctx, 84, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (K_CURRENT_DATE - 69)) | (1L << (K_CURRENT_TIME - 69)) | (1L << (K_CURRENT_TIMESTAMP - 69)) | (1L << (K_NULL - 69)))) != 0) || ((((_la - 191)) & ~0x3f) == 0 && ((1L << (_la - 191)) & ((1L << (NUMERIC_LITERAL - 191)) | (1L << (STRING_LITERAL - 191)) | (1L << (BLOB_LITERAL - 191)))) != 0)) ) {
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
		enterRule(_localctx, 86, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
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
		enterRule(_localctx, 88, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
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
		enterRule(_localctx, 90, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
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
		enterRule(_localctx, 92, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
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
		enterRule(_localctx, 94, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
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
		enterRule(_localctx, 96, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
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
		enterRule(_localctx, 98, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
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
		enterRule(_localctx, 100, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
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
		enterRule(_localctx, 102, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
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
		enterRule(_localctx, 104, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
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
		enterRule(_localctx, 106, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
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
		enterRule(_localctx, 108, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
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
		enterRule(_localctx, 110, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
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
		enterRule(_localctx, 112, RULE_statements_of_code_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			statements_of_code();
			setState(1047);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1043);
					match(SCOL);
					setState(1044);
					statements_of_code();
					}
					} 
				}
				setState(1049);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			}
			setState(1050);
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
		public Def_stmt_listContext def_stmt_list() {
			return getRuleContext(Def_stmt_listContext.class,0);
		}
		public Def_functionContext def_function() {
			return getRuleContext(Def_functionContext.class,0);
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
		enterRule(_localctx, 114, RULE_statements_of_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__6:
			case SCOL:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case K_FOR:
			case K_IF:
			case K_NULL:
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
			case IDENTIFIER:
			case NUMERIC_LITERAL:
				{
				setState(1052);
				def_stmt_list();
				}
				break;
			case K_VOID:
				{
				setState(1053);
				def_function();
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

	public static class Def_functionContext extends ParserRuleContext {
		public TerminalNode K_VOID() { return getToken(SQLParser.K_VOID, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ListOfParametersContext listOfParameters() {
			return getRuleContext(ListOfParametersContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Def_stmt_listContext def_stmt_list() {
			return getRuleContext(Def_stmt_listContext.class,0);
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
		enterRule(_localctx, 116, RULE_def_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(K_VOID);
			setState(1057);
			match(IDENTIFIER);
			setState(1058);
			match(OPEN_PAR);
			setState(1059);
			listOfParameters();
			setState(1060);
			match(CLOSE_PAR);
			setState(1061);
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
		enterRule(_localctx, 118, RULE_listOfParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (K_INT - 170)) | (1L << (K_FLOAT - 170)) | (1L << (K_VAR - 170)))) != 0)) {
				{
				setState(1063);
				parameter();
				}
			}

			setState(1070);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1066);
				match(COMMA);
				setState(1067);
				parameter();
				}
				}
				setState(1072);
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
		enterRule(_localctx, 120, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1073);
			keyword_def();
			setState(1074);
			match(IDENTIFIER);
			setState(1077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1075);
				match(ASSIGN);
				setState(1076);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
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
		enterRule(_localctx, 122, RULE_prototype_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			match(IDENTIFIER);
			setState(1080);
			match(OPEN_PAR);
			setState(1085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1082);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(1081);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case 2:
				{
				setState(1084);
				exp(0);
				}
				break;
			}
			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1087);
				match(COMMA);
				setState(1090);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1088);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(1089);
					exp(0);
					}
					break;
				}
				}
				}
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1097);
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
		enterRule(_localctx, 124, RULE_def_var_core);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			keyword_def();
			setState(1100);
			def_var();
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1101);
				match(COMMA);
				setState(1102);
				def_var();
				}
				}
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1108);
					match(SCOL);
					}
					} 
				}
				setState(1113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
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
		public Def_stmt_listContext def_stmt_list() {
			return getRuleContext(Def_stmt_listContext.class,0);
		}
		public Def_stmtContext def_stmt() {
			return getRuleContext(Def_stmtContext.class,0);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
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
		enterRule(_localctx, 126, RULE_while_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			match(K_WHILE);
			setState(1115);
			match(OPEN_PAR);
			setState(1117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1116);
				cond(0);
				}
				}
				setState(1119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (K_NULL - 123)) | (1L << (K_INT - 123)) | (1L << (K_FLOAT - 123)) | (1L << (K_VAR - 123)))) != 0) || _la==IDENTIFIER || _la==NUMERIC_LITERAL );
			setState(1121);
			match(CLOSE_PAR);
			setState(1127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(1122);
				match(T__1);
				setState(1123);
				def_stmt_list();
				setState(1124);
				match(T__2);
				}
				break;
			case T__6:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case K_FOR:
			case K_IF:
			case K_NULL:
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
			case IDENTIFIER:
			case NUMERIC_LITERAL:
				{
				setState(1126);
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
		public Def_stmt_listContext def_stmt_list() {
			return getRuleContext(Def_stmt_listContext.class,0);
		}
		public Def_stmtContext def_stmt() {
			return getRuleContext(Def_stmtContext.class,0);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
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
		enterRule(_localctx, 128, RULE_do_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1129);
			match(K_DO);
			setState(1135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(1130);
				match(T__1);
				setState(1131);
				def_stmt_list();
				setState(1132);
				match(T__2);
				}
				break;
			case T__6:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case K_FOR:
			case K_IF:
			case K_NULL:
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
			case IDENTIFIER:
			case NUMERIC_LITERAL:
				{
				setState(1134);
				def_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1137);
			match(K_WHILE);
			setState(1138);
			match(OPEN_PAR);
			setState(1140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1139);
				cond(0);
				}
				}
				setState(1142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (K_NULL - 123)) | (1L << (K_INT - 123)) | (1L << (K_FLOAT - 123)) | (1L << (K_VAR - 123)))) != 0) || _la==IDENTIFIER || _la==NUMERIC_LITERAL );
			setState(1144);
			match(CLOSE_PAR);
			setState(1145);
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
		public Def_stmt_listContext def_stmt_list() {
			return getRuleContext(Def_stmt_listContext.class,0);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
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
		enterRule(_localctx, 130, RULE_for_repeat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			match(K_FOR);
			setState(1148);
			match(OPEN_PAR);
			setState(1149);
			def_stmt();
			setState(1150);
			match(SCOL);
			setState(1152); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1151);
					cond(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1154); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (K_FOR - 91)) | (1L << (K_IF - 91)) | (1L << (K_NULL - 91)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (K_INT - 170)) | (1L << (K_FLOAT - 170)) | (1L << (K_WHILE - 170)) | (1L << (K_TRY - 170)) | (1L << (K_SWITCH - 170)) | (1L << (K_BREAK - 170)) | (1L << (K_DO - 170)) | (1L << (K_PRINT - 170)) | (1L << (K_RETURN - 170)) | (1L << (K_VAR - 170)) | (1L << (K_ARRAY - 170)) | (1L << (K_FORECH - 170)) | (1L << (IDENTIFIER - 170)) | (1L << (NUMERIC_LITERAL - 170)))) != 0)) {
				{
				setState(1156);
				def_stmt();
				}
			}

			setState(1159);
			match(SCOL);
			setState(1160);
			def_stmt();
			setState(1161);
			match(CLOSE_PAR);
			setState(1167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(1162);
				match(T__1);
				setState(1163);
				def_stmt_list();
				setState(1164);
				match(T__2);
				}
				break;
			case T__6:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case K_FOR:
			case K_IF:
			case K_NULL:
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
			case IDENTIFIER:
			case NUMERIC_LITERAL:
				{
				setState(1166);
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
		public Def_stmt_listContext def_stmt_list() {
			return getRuleContext(Def_stmt_listContext.class,0);
		}
		public Def_stmtContext def_stmt() {
			return getRuleContext(Def_stmtContext.class,0);
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
		enterRule(_localctx, 132, RULE_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			match(K_FORECH);
			setState(1170);
			match(OPEN_PAR);
			setState(1171);
			match(K_VAR);
			setState(1172);
			match(IDENTIFIER);
			setState(1173);
			match(K_IN);
			setState(1174);
			match(IDENTIFIER);
			setState(1175);
			match(CLOSE_PAR);
			setState(1181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(1176);
				match(T__1);
				setState(1177);
				def_stmt_list();
				setState(1178);
				match(T__2);
				}
				break;
			case T__6:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case K_FOR:
			case K_IF:
			case K_NULL:
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
			case IDENTIFIER:
			case NUMERIC_LITERAL:
				{
				setState(1180);
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
		enterRule(_localctx, 134, RULE_repeat);
		try {
			setState(1187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1183);
				while_repeat();
				}
				break;
			case K_DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(1184);
				do_while();
				}
				break;
			case K_FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1185);
				for_repeat();
				}
				break;
			case K_FORECH:
				enterOuterAlt(_localctx, 4);
				{
				setState(1186);
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
		enterRule(_localctx, 136, RULE_return_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			match(K_RETURN);
			setState(1194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (K_NULL - 123)) | (1L << (K_INT - 123)) | (1L << (K_FLOAT - 123)) | (1L << (K_VAR - 123)))) != 0) || _la==IDENTIFIER || _la==NUMERIC_LITERAL) {
				{
				setState(1192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(1190);
					exp(0);
					}
					break;
				case 2:
					{
					setState(1191);
					cond(0);
					}
					break;
				}
				}
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1197);
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
		public TerminalNode K_TRY() { return getToken(SQLParser.K_TRY, 0); }
		public List<Def_stmt_listContext> def_stmt_list() {
			return getRuleContexts(Def_stmt_listContext.class);
		}
		public Def_stmt_listContext def_stmt_list(int i) {
			return getRuleContext(Def_stmt_listContext.class,i);
		}
		public TerminalNode K_CATCH() { return getToken(SQLParser.K_CATCH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode K_EXCEPTION() { return getToken(SQLParser.K_EXCEPTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_FINALY() { return getToken(SQLParser.K_FINALY, 0); }
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
		enterRule(_localctx, 138, RULE_try_catch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			match(K_TRY);
			setState(1200);
			def_stmt_list();
			setState(1201);
			match(K_CATCH);
			setState(1202);
			match(OPEN_PAR);
			setState(1203);
			match(K_EXCEPTION);
			setState(1204);
			match(IDENTIFIER);
			setState(1205);
			match(CLOSE_PAR);
			setState(1206);
			def_stmt_list();
			setState(1209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1207);
				match(K_FINALY);
				setState(1208);
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
		enterRule(_localctx, 140, RULE_switch_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			match(K_SWITCH);
			setState(1212);
			match(OPEN_PAR);
			setState(1213);
			exp(0);
			setState(1214);
			match(CLOSE_PAR);
			setState(1215);
			match(T__1);
			setState(1216);
			switch_body();
			setState(1217);
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

	public static class Switch_bodyContext extends ParserRuleContext {
		public List<CasesContext> cases() {
			return getRuleContexts(CasesContext.class);
		}
		public CasesContext cases(int i) {
			return getRuleContext(CasesContext.class,i);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public Def_stmt_listContext def_stmt_list() {
			return getRuleContext(Def_stmt_listContext.class,0);
		}
		public Def_stmtContext def_stmt() {
			return getRuleContext(Def_stmtContext.class,0);
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
		enterRule(_localctx, 142, RULE_switch_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1219);
				cases();
				}
				}
				setState(1222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_CASE );
			setState(1233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFAULT) {
				{
				setState(1224);
				match(K_DEFAULT);
				setState(1225);
				match(T__3);
				setState(1231);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(1226);
					match(T__1);
					setState(1227);
					def_stmt_list();
					setState(1228);
					match(T__2);
					}
					break;
				case T__6:
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case K_FOR:
				case K_IF:
				case K_NULL:
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
				case IDENTIFIER:
				case NUMERIC_LITERAL:
					{
					setState(1230);
					def_stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		enterRule(_localctx, 144, RULE_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			match(K_CASE);
			setState(1236);
			exp(0);
			setState(1237);
			match(T__3);
			setState(1238);
			def_stmt_list();
			setState(1242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(1239);
				match(SCOL);
				}
				}
				setState(1244);
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
		enterRule(_localctx, 146, RULE_print_func);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			match(K_PRINT);
			setState(1246);
			match(OPEN_PAR);
			setState(1247);
			exp(0);
			setState(1252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(1248);
				match(PLUS);
				setState(1249);
				exp(0);
				}
				}
				setState(1254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1255);
			match(CLOSE_PAR);
			setState(1259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1256);
					match(SCOL);
					}
					} 
				}
				setState(1261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
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
		enterRule(_localctx, 148, RULE_sort_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			match(IDENTIFIER);
			setState(1263);
			match(OPEN_PAR);
			setState(1264);
			match(IDENTIFIER);
			setState(1265);
			match(COMMA);
			setState(1266);
			match(K_FUNCTION);
			setState(1267);
			match(OPEN_PAR);
			setState(1268);
			match(IDENTIFIER);
			setState(1269);
			match(COMMA);
			setState(1270);
			match(IDENTIFIER);
			setState(1271);
			match(CLOSE_PAR);
			setState(1272);
			match(T__1);
			setState(1273);
			match(K_RETURN);
			setState(1274);
			match(IDENTIFIER);
			setState(1275);
			_la = _input.LA(1);
			if ( !(_la==LT || _la==GT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1276);
			match(IDENTIFIER);
			setState(1277);
			match(SCOL);
			setState(1278);
			match(T__4);
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
		public TerminalNode K_ARRAY() { return getToken(SQLParser.K_ARRAY, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 150, RULE_array_def);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			match(K_ARRAY);
			setState(1281);
			match(IDENTIFIER);
			setState(1282);
			match(T__5);
			setState(1285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1283);
				match(ASSIGN);
				setState(1284);
				bodyArray();
				}
			}

			setState(1290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1287);
					match(SCOL);
					}
					} 
				}
				setState(1292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
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
		enterRule(_localctx, 152, RULE_bodyArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			match(T__1);
			setState(1296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case K_NULL:
			case K_INT:
			case K_FLOAT:
			case K_VAR:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
				{
				setState(1294);
				exp(0);
				}
				break;
			case K_ID:
				{
				setState(1295);
				body_for_json();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1298);
				match(COMMA);
				setState(1301);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case K_NULL:
				case K_INT:
				case K_FLOAT:
				case K_VAR:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
					{
					setState(1299);
					exp(0);
					}
					break;
				case K_ID:
					{
					setState(1300);
					body_for_json();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1308);
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

	public static class Key_valueContext extends ParserRuleContext {
		public TerminalNode K_ID() { return getToken(SQLParser.K_ID, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public TerminalNode K_NAME() { return getToken(SQLParser.K_NAME, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
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
		enterRule(_localctx, 154, RULE_key_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			match(K_ID);
			setState(1311);
			match(T__3);
			setState(1312);
			match(NUMERIC_LITERAL);
			setState(1313);
			match(COMMA);
			setState(1314);
			match(K_NAME);
			setState(1315);
			match(T__3);
			setState(1316);
			match(T__6);
			setState(1317);
			exp(0);
			setState(1318);
			match(T__6);
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
		public Key_valueContext key_value() {
			return getRuleContext(Key_valueContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
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
		enterRule(_localctx, 156, RULE_body_for_json);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			key_value();
			setState(1333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1321);
					match(COMMA);
					setState(1322);
					match(IDENTIFIER);
					setState(1323);
					match(T__3);
					setState(1329);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
					case 1:
						{
						{
						setState(1324);
						match(T__1);
						setState(1325);
						body_for_json();
						setState(1326);
						match(T__2);
						}
						}
						break;
					case 2:
						{
						setState(1328);
						bodyArray();
						}
						break;
					}
					}
					} 
				}
				setState(1335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
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
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public Body_for_jsonContext body_for_json() {
			return getRuleContext(Body_for_jsonContext.class,0);
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
		enterRule(_localctx, 158, RULE_obj_json);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			match(K_VAR);
			setState(1337);
			match(IDENTIFIER);
			setState(1338);
			match(ASSIGN);
			setState(1339);
			match(T__1);
			setState(1341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ID) {
				{
				setState(1340);
				body_for_json();
				}
			}

			setState(1343);
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
		enterRule(_localctx, 160, RULE_read_obj_json);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
			match(IDENTIFIER);
			setState(1348); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1346);
					match(DOT);
					setState(1347);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1350); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
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
		enterRule(_localctx, 162, RULE_write_obj_json);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			match(IDENTIFIER);
			setState(1355); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1353);
				match(DOT);
				setState(1354);
				match(IDENTIFIER);
				}
				}
				setState(1357); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOT );
			setState(1359);
			match(ASSIGN);
			setState(1360);
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
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode AMP() { return getToken(SQLParser.AMP, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode TILDE() { return getToken(SQLParser.TILDE, 0); }
		public TerminalNode PIPE() { return getToken(SQLParser.PIPE, 0); }
		public TerminalNode MOD() { return getToken(SQLParser.MOD, 0); }
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
		enterRule(_localctx, 164, RULE_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << DOT) | (1L << OPEN_PAR) | (1L << CLOSE_PAR) | (1L << ASSIGN) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << DIV) | (1L << MOD) | (1L << AMP) | (1L << PIPE) | (1L << LT) | (1L << GT))) != 0) || _la==IDENTIFIER || _la==NUMERIC_LITERAL) ) {
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

	public static class If_statement_coreContext extends ParserRuleContext {
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Def_stmt_listContext def_stmt_list() {
			return getRuleContext(Def_stmt_listContext.class,0);
		}
		public Def_stmtContext def_stmt() {
			return getRuleContext(Def_stmtContext.class,0);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
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
		enterRule(_localctx, 166, RULE_if_statement_core);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			match(K_IF);
			setState(1365);
			match(OPEN_PAR);
			setState(1367); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1366);
				cond(0);
				}
				}
				setState(1369); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (K_NULL - 123)) | (1L << (K_INT - 123)) | (1L << (K_FLOAT - 123)) | (1L << (K_VAR - 123)))) != 0) || _la==IDENTIFIER || _la==NUMERIC_LITERAL );
			setState(1371);
			match(CLOSE_PAR);
			setState(1377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(1372);
				match(T__1);
				setState(1373);
				def_stmt_list();
				setState(1374);
				match(T__2);
				}
				break;
			case T__6:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case K_FOR:
			case K_IF:
			case K_NULL:
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
			case IDENTIFIER:
			case NUMERIC_LITERAL:
				{
				setState(1376);
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
		enterRule(_localctx, 168, RULE_if_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			if_statement_core();
			setState(1383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1380);
					else_if_statement();
					}
					} 
				}
				setState(1385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			}
			setState(1387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1386);
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
		enterRule(_localctx, 170, RULE_else_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1389);
			match(K_ELSE);
			setState(1390);
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
		public Def_stmt_listContext def_stmt_list() {
			return getRuleContext(Def_stmt_listContext.class,0);
		}
		public Def_stmtContext def_stmt() {
			return getRuleContext(Def_stmtContext.class,0);
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
		enterRule(_localctx, 172, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
			match(K_ELSE);
			setState(1398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(1393);
				match(T__1);
				setState(1394);
				def_stmt_list();
				setState(1395);
				match(T__2);
				}
				break;
			case T__6:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case K_FOR:
			case K_IF:
			case K_NULL:
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
			case IDENTIFIER:
			case NUMERIC_LITERAL:
				{
				setState(1397);
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
		enterRule(_localctx, 174, RULE_if_statement_one_line);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1400);
			keyword_def();
			setState(1401);
			match(IDENTIFIER);
			setState(1402);
			match(ASSIGN);
			{
			setState(1403);
			body_onelineCond();
			}
			setState(1407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1404);
					match(SCOL);
					}
					} 
				}
				setState(1409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
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
		enterRule(_localctx, 176, RULE_body_onelineCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1411); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1410);
				cond(0);
				}
				}
				setState(1413); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (K_NULL - 123)) | (1L << (K_INT - 123)) | (1L << (K_FLOAT - 123)) | (1L << (K_VAR - 123)))) != 0) || _la==IDENTIFIER || _la==NUMERIC_LITERAL );
			setState(1415);
			match(T__7);
			setState(1425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1416);
				match(T__1);
				setState(1417);
				def_stmt_list();
				setState(1418);
				match(T__2);
				}
				break;
			case 2:
				{
				setState(1420);
				def_stmt();
				}
				break;
			case 3:
				{
				setState(1421);
				match(OPEN_PAR);
				setState(1422);
				body_onelineCond();
				setState(1423);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(1427);
			match(T__3);
			setState(1437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1428);
				match(T__1);
				setState(1429);
				def_stmt_list();
				setState(1430);
				match(T__2);
				}
				break;
			case 2:
				{
				setState(1432);
				def_stmt();
				}
				break;
			case 3:
				{
				setState(1433);
				match(OPEN_PAR);
				setState(1434);
				body_onelineCond();
				setState(1435);
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
		public Prototype_funcContext prototype_func() {
			return getRuleContext(Prototype_funcContext.class,0);
		}
		public Read_obj_jsonContext read_obj_json() {
			return getRuleContext(Read_obj_jsonContext.class,0);
		}
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public List<CharacterContext> character() {
			return getRuleContexts(CharacterContext.class);
		}
		public CharacterContext character(int i) {
			return getRuleContext(CharacterContext.class,i);
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
		int _startState = 178;
		enterRecursionRule(_localctx, 178, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (K_INT - 170)) | (1L << (K_FLOAT - 170)) | (1L << (K_VAR - 170)))) != 0)) {
					{
					setState(1440);
					keyword_def();
					}
				}

				setState(1443);
				match(IDENTIFIER);
				setState(1445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << DIV))) != 0)) {
					{
					setState(1444);
					op();
					}
				}

				setState(1447);
				match(ASSIGN);
				setState(1448);
				exp(0);
				setState(1452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(1455);
				match(OPEN_PAR);
				setState(1456);
				exp(0);
				setState(1457);
				match(CLOSE_PAR);
				setState(1461);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1458);
						match(SCOL);
						}
						} 
					}
					setState(1463);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(1464);
				op_double();
				setState(1465);
				match(IDENTIFIER);
				setState(1471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1466);
					match(ASSIGN);
					setState(1469);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
					case 1:
						{
						setState(1467);
						exp(0);
						}
						break;
					case 2:
						{
						setState(1468);
						match(IDENTIFIER);
						}
						break;
					}
					}
					break;
				}
				setState(1476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1473);
						match(SCOL);
						}
						} 
					}
					setState(1478);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				}
				}
				break;
			case 4:
				{
				setState(1479);
				match(IDENTIFIER);
				setState(1480);
				op_double();
				setState(1486);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1481);
					match(ASSIGN);
					setState(1484);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
					case 1:
						{
						setState(1482);
						exp(0);
						}
						break;
					case 2:
						{
						setState(1483);
						match(IDENTIFIER);
						}
						break;
					}
					}
					break;
				}
				setState(1491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1488);
						match(SCOL);
						}
						} 
					}
					setState(1493);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
				}
				}
				break;
			case 5:
				{
				setState(1494);
				prototype_func();
				setState(1498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1495);
						match(SCOL);
						}
						} 
					}
					setState(1500);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				}
				}
				break;
			case 6:
				{
				setState(1501);
				read_obj_json();
				setState(1505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1502);
						match(SCOL);
						}
						} 
					}
					setState(1507);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
				}
				}
				break;
			case 7:
				{
				setState(1508);
				match(IDENTIFIER);
				setState(1512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1509);
						match(SCOL);
						}
						} 
					}
					setState(1514);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				}
				}
				break;
			case 8:
				{
				setState(1515);
				match(NUMERIC_LITERAL);
				setState(1519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1516);
						match(SCOL);
						}
						} 
					}
					setState(1521);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				}
				}
				break;
			case 9:
				{
				setState(1522);
				match(T__6);
				setState(1526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << DOT) | (1L << OPEN_PAR) | (1L << CLOSE_PAR) | (1L << ASSIGN) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << DIV) | (1L << MOD) | (1L << AMP) | (1L << PIPE) | (1L << LT) | (1L << GT))) != 0) || _la==IDENTIFIER || _la==NUMERIC_LITERAL) {
					{
					{
					setState(1523);
					character();
					}
					}
					setState(1528);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1529);
				match(T__6);
				setState(1533);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1530);
						match(SCOL);
						}
						} 
					}
					setState(1535);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				}
				}
				break;
			case 10:
				{
				setState(1536);
				match(K_NULL);
				setState(1540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1537);
						match(SCOL);
						}
						} 
					}
					setState(1542);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1574);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1572);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(1545);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1546);
						match(STAR);
						setState(1547);
						exp(0);
						setState(1551);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1548);
								match(SCOL);
								}
								} 
							}
							setState(1553);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
						}
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(1554);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1555);
						match(DIV);
						setState(1556);
						exp(0);
						setState(1560);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1557);
								match(SCOL);
								}
								} 
							}
							setState(1562);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
						}
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(1563);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1564);
						op();
						setState(1565);
						exp(0);
						setState(1569);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1566);
								match(SCOL);
								}
								} 
							}
							setState(1571);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(1576);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
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
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public Prototype_funcContext prototype_func() {
			return getRuleContext(Prototype_funcContext.class,0);
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
		public TerminalNode PIPE2() { return getToken(SQLParser.PIPE2, 0); }
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
		int _startState = 180;
		enterRecursionRule(_localctx, 180, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1578);
				exp(0);
				setState(1579);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1580);
				exp(0);
				}
				break;
			case 2:
				{
				setState(1582);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(1583);
				prototype_func();
				}
				break;
			case 4:
				{
				setState(1584);
				exp(0);
				setState(1588);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQ:
				case NOT_EQ1:
					{
					{
					setState(1585);
					_la = _input.LA(1);
					if ( !(_la==EQ || _la==NOT_EQ1) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1586);
					match(K_NULL);
					}
					}
					break;
				case K_ISNULL:
					{
					setState(1587);
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
				setState(1590);
				match(OPEN_PAR);
				setState(1591);
				cond(0);
				setState(1592);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1601);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cond);
					setState(1596);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1597);
					_la = _input.LA(1);
					if ( !(_la==T__16 || _la==PIPE2) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1598);
					cond(3);
					}
					} 
				}
				setState(1603);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
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

	public static class Def_stmt_listContext extends ParserRuleContext {
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
		public List<Def_stmt_listContext> def_stmt_list() {
			return getRuleContexts(Def_stmt_listContext.class);
		}
		public Def_stmt_listContext def_stmt_list(int i) {
			return getRuleContext(Def_stmt_listContext.class,i);
		}
		public List<BreakKeyWordContext> breakKeyWord() {
			return getRuleContexts(BreakKeyWordContext.class);
		}
		public BreakKeyWordContext breakKeyWord(int i) {
			return getRuleContext(BreakKeyWordContext.class,i);
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
		enterRule(_localctx, 182, RULE_def_stmt_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1622);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
					case 1:
						{
						setState(1604);
						def_var_core();
						}
						break;
					case 2:
						{
						setState(1605);
						exp(0);
						}
						break;
					case 3:
						{
						setState(1606);
						repeat();
						}
						break;
					case 4:
						{
						setState(1607);
						if_statement();
						}
						break;
					case 5:
						{
						setState(1608);
						if_statement_one_line();
						}
						break;
					case 6:
						{
						setState(1609);
						try_catch();
						}
						break;
					case 7:
						{
						setState(1610);
						switch_case();
						}
						break;
					case 8:
						{
						setState(1611);
						print_func();
						}
						break;
					case 9:
						{
						setState(1612);
						sort_func_def();
						}
						break;
					case 10:
						{
						setState(1613);
						array_def();
						}
						break;
					case 11:
						{
						setState(1614);
						obj_json();
						}
						break;
					case 12:
						{
						setState(1615);
						write_obj_json();
						}
						break;
					case 13:
						{
						setState(1616);
						return_value();
						}
						break;
					case 14:
						{
						setState(1617);
						match(T__1);
						setState(1618);
						def_stmt_list();
						setState(1619);
						match(T__2);
						}
						break;
					case 15:
						{
						setState(1621);
						breakKeyWord();
						}
						break;
					}
					} 
				}
				setState(1626);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
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
		public Def_var_coreContext def_var_core() {
			return getRuleContext(Def_var_coreContext.class,0);
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
		enterRule(_localctx, 184, RULE_def_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1627);
				def_var_core();
				}
				break;
			case 2:
				{
				setState(1628);
				exp(0);
				}
				break;
			case 3:
				{
				setState(1629);
				repeat();
				}
				break;
			case 4:
				{
				setState(1630);
				if_statement();
				}
				break;
			case 5:
				{
				setState(1631);
				if_statement_one_line();
				}
				break;
			case 6:
				{
				setState(1632);
				try_catch();
				}
				break;
			case 7:
				{
				setState(1633);
				switch_case();
				}
				break;
			case 8:
				{
				setState(1634);
				print_func();
				}
				break;
			case 9:
				{
				setState(1635);
				array_def();
				}
				break;
			case 10:
				{
				setState(1636);
				sort_func_def();
				}
				break;
			case 11:
				{
				setState(1637);
				obj_json();
				}
				break;
			case 12:
				{
				setState(1638);
				return_value();
				}
				break;
			case 13:
				{
				setState(1639);
				write_obj_json();
				}
				break;
			case 14:
				{
				setState(1640);
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
		enterRule(_localctx, 186, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1643);
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
		enterRule(_localctx, 188, RULE_op_double);
		try {
			setState(1649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1645);
				match(PLUS);
				setState(1646);
				match(PLUS);
				}
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1647);
				match(MINUS);
				setState(1648);
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
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 190, RULE_def_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
			match(IDENTIFIER);
			setState(1654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1652);
				match(ASSIGN);
				setState(1653);
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
		enterRule(_localctx, 192, RULE_breakKeyWord);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			match(K_BREAK);
			setState(1660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
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
		public TerminalNode K_INT() { return getToken(SQLParser.K_INT, 0); }
		public TerminalNode K_FLOAT() { return getToken(SQLParser.K_FLOAT, 0); }
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
		enterRule(_localctx, 194, RULE_keyword_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
			_la = _input.LA(1);
			if ( !(((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (K_INT - 170)) | (1L << (K_FLOAT - 170)) | (1L << (K_VAR - 170)))) != 0)) ) {
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
		enterRule(_localctx, 196, RULE_any_name);
		try {
			setState(1671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1665);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1666);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1667);
				match(OPEN_PAR);
				setState(1668);
				any_name();
				setState(1669);
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
		case 23:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 89:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 90:
			return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c6\u068c\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\3\2\7\2\u00cb\n\2\f\2\16\2\u00ce\13\2"+
		"\3\2\3\2\3\3\7\3\u00d3\n\3\f\3\16\3\u00d6\13\3\3\3\3\3\6\3\u00da\n\3\r"+
		"\3\16\3\u00db\3\3\7\3\u00df\n\3\f\3\16\3\u00e2\13\3\3\3\7\3\u00e5\n\3"+
		"\f\3\16\3\u00e8\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00f1\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u00f8\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0102\n"+
		"\5\3\5\5\5\u0105\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u0114\n\b\3\b\3\b\3\b\5\b\u0119\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\7\b\u0122\n\b\f\b\16\b\u0125\13\b\3\b\3\b\3\b\3\b\5\b\u012b\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0132\n\t\3\n\3\n\3\n\3\n\5\n\u0138\n\n\3\n\3\n\3\n"+
		"\5\n\u013d\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0147\n\13\f"+
		"\13\16\13\u014a\13\13\5\13\u014c\n\13\3\13\3\13\3\13\3\13\5\13\u0152\n"+
		"\13\5\13\u0154\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u015b\n\f\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u0162\n\f\f\f\16\f\u0165\13\f\3\f\3\f\5\f\u0169\n\f\3\f\3\f\3"+
		"\f\3\f\3\f\7\f\u0170\n\f\f\f\16\f\u0173\13\f\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u017b\n\f\f\f\16\f\u017e\13\f\3\f\3\f\7\f\u0182\n\f\f\f\16\f\u0185"+
		"\13\f\3\f\3\f\3\f\5\f\u018a\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0192\n\r"+
		"\f\r\16\r\u0195\13\r\5\r\u0197\n\r\3\r\3\r\3\r\3\r\5\r\u019d\n\r\5\r\u019f"+
		"\n\r\3\16\3\16\5\16\u01a3\n\16\3\16\3\16\3\16\7\16\u01a8\n\16\f\16\16"+
		"\16\u01ab\13\16\3\16\3\16\3\16\3\16\7\16\u01b1\n\16\f\16\16\16\u01b4\13"+
		"\16\3\16\5\16\u01b7\n\16\5\16\u01b9\n\16\3\16\3\16\5\16\u01bd\n\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u01c4\n\16\f\16\16\16\u01c7\13\16\3\16\3\16"+
		"\5\16\u01cb\n\16\5\16\u01cd\n\16\3\16\3\16\3\16\3\16\3\16\7\16\u01d4\n"+
		"\16\f\16\16\16\u01d7\13\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u01df\n"+
		"\16\f\16\16\16\u01e2\13\16\3\16\3\16\7\16\u01e6\n\16\f\16\16\16\u01e9"+
		"\13\16\5\16\u01eb\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\7\17\u01f8\n\17\f\17\16\17\u01fb\13\17\3\17\3\17\5\17\u01ff\n"+
		"\17\3\20\3\20\3\20\7\20\u0204\n\20\f\20\16\20\u0207\13\20\3\21\3\21\3"+
		"\21\3\21\5\21\u020d\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u0214\n\21\3\21"+
		"\3\21\3\21\5\21\u0219\n\21\3\21\3\21\5\21\u021d\n\21\3\22\3\22\5\22\u0221"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0230\n\22\3\23\3\23\3\23\5\23\u0235\n\23\3\23\5\23\u0238\n\23\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u024d\n\27\3\27\3\27\6\27\u0251\n\27\r\27"+
		"\16\27\u0252\5\27\u0255\n\27\3\30\3\30\5\30\u0259\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u0260\n\31\3\31\3\31\3\31\5\31\u0265\n\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\5\31\u026e\n\31\3\31\3\31\3\31\7\31\u0273\n\31"+
		"\f\31\16\31\u0276\13\31\3\31\5\31\u0279\n\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u0282\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u02a0\n\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\7\31\u02a9\n\31\f\31\16\31\u02ac\13\31\3\32\3\32\3\32\3\32\5\32"+
		"\u02b2\n\32\3\32\3\32\3\32\3\32\3\32\7\32\u02b9\n\32\f\32\16\32\u02bc"+
		"\13\32\3\32\3\32\5\32\u02c0\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\5\32\u02cc\n\32\3\32\3\32\5\32\u02d0\n\32\7\32\u02d2\n\32"+
		"\f\32\16\32\u02d5\13\32\3\32\5\32\u02d8\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u02df\n\32\3\32\5\32\u02e2\n\32\5\32\u02e4\n\32\3\33\3\33\3\34\3"+
		"\34\3\34\5\34\u02eb\n\34\3\34\5\34\u02ee\n\34\3\35\3\35\5\35\u02f2\n\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u02fd\n\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\7\36\u0305\n\36\f\36\16\36\u0308\13\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0312\n\37\f\37\16\37\u0315\13\37"+
		"\3\37\3\37\3\37\3 \3 \5 \u031c\n \3 \5 \u031f\n \3 \3 \3 \3 \7 \u0325"+
		"\n \f \16 \u0328\13 \3 \3 \3!\3!\5!\u032e\n!\3!\3!\3!\3!\7!\u0334\n!\f"+
		"!\16!\u0337\13!\3!\3!\3\"\3\"\3#\3#\3#\5#\u0340\n#\3#\3#\3#\3#\3#\3#\5"+
		"#\u0348\n#\3$\3$\5$\u034c\n$\3%\3%\3%\3%\3%\3%\3%\5%\u0355\n%\3%\5%\u0358"+
		"\n%\5%\u035a\n%\3&\3&\3&\5&\u035f\n&\3&\3&\5&\u0363\n&\3&\5&\u0366\n&"+
		"\3&\3&\3&\3&\3&\5&\u036d\n&\3&\3&\3&\3&\7&\u0373\n&\f&\16&\u0376\13&\3"+
		"&\5&\u0379\n&\3&\3&\5&\u037d\n&\3&\5&\u0380\n&\3&\3&\3&\3&\5&\u0386\n"+
		"&\3&\5&\u0389\n&\5&\u038b\n&\3\'\3\'\3\'\3\'\3\'\7\'\u0392\n\'\f\'\16"+
		"\'\u0395\13\'\3(\3(\3(\5(\u039a\n(\3(\5(\u039d\n(\3(\5(\u03a0\n(\3)\3"+
		")\5)\u03a4\n)\3*\3*\5*\u03a8\n*\3*\3*\3*\7*\u03ad\n*\f*\16*\u03b0\13*"+
		"\3*\3*\3*\3*\7*\u03b6\n*\f*\16*\u03b9\13*\3*\5*\u03bc\n*\5*\u03be\n*\3"+
		"*\3*\5*\u03c2\n*\3*\3*\3*\3*\3*\7*\u03c9\n*\f*\16*\u03cc\13*\3*\3*\5*"+
		"\u03d0\n*\5*\u03d2\n*\3*\3*\3*\3*\3*\7*\u03d9\n*\f*\16*\u03dc\13*\3*\3"+
		"*\3*\3*\3*\3*\7*\u03e4\n*\f*\16*\u03e7\13*\3*\3*\7*\u03eb\n*\f*\16*\u03ee"+
		"\13*\5*\u03f0\n*\3+\5+\u03f3\n+\3+\3+\5+\u03f7\n+\3,\3,\3-\3-\3.\3.\3"+
		"/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\3:\3:\3:\7:\u0418\n:\f:\16:\u041b\13:\3:\3"+
		":\3;\3;\5;\u0421\n;\3<\3<\3<\3<\3<\3<\3<\3=\5=\u042b\n=\3=\3=\7=\u042f"+
		"\n=\f=\16=\u0432\13=\3>\3>\3>\3>\5>\u0438\n>\3?\3?\3?\5?\u043d\n?\3?\5"+
		"?\u0440\n?\3?\3?\3?\5?\u0445\n?\7?\u0447\n?\f?\16?\u044a\13?\3?\3?\3@"+
		"\3@\3@\3@\7@\u0452\n@\f@\16@\u0455\13@\3@\7@\u0458\n@\f@\16@\u045b\13"+
		"@\3A\3A\3A\6A\u0460\nA\rA\16A\u0461\3A\3A\3A\3A\3A\3A\5A\u046a\nA\3B\3"+
		"B\3B\3B\3B\3B\5B\u0472\nB\3B\3B\3B\6B\u0477\nB\rB\16B\u0478\3B\3B\3B\3"+
		"C\3C\3C\3C\3C\6C\u0483\nC\rC\16C\u0484\3C\5C\u0488\nC\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\5C\u0492\nC\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u04a0\nD\3"+
		"E\3E\3E\3E\5E\u04a6\nE\3F\3F\3F\7F\u04ab\nF\fF\16F\u04ae\13F\3F\3F\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u04bc\nG\3H\3H\3H\3H\3H\3H\3H\3H\3I\6I"+
		"\u04c7\nI\rI\16I\u04c8\3I\3I\3I\3I\3I\3I\3I\5I\u04d2\nI\5I\u04d4\nI\3"+
		"J\3J\3J\3J\3J\7J\u04db\nJ\fJ\16J\u04de\13J\3K\3K\3K\3K\3K\7K\u04e5\nK"+
		"\fK\16K\u04e8\13K\3K\3K\7K\u04ec\nK\fK\16K\u04ef\13K\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\5M\u0508\nM\3M\7"+
		"M\u050b\nM\fM\16M\u050e\13M\3N\3N\3N\5N\u0513\nN\3N\3N\3N\5N\u0518\nN"+
		"\7N\u051a\nN\fN\16N\u051d\13N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3P\3"+
		"P\3P\3P\3P\3P\3P\3P\3P\5P\u0534\nP\7P\u0536\nP\fP\16P\u0539\13P\3Q\3Q"+
		"\3Q\3Q\3Q\5Q\u0540\nQ\3Q\3Q\3R\3R\3R\6R\u0547\nR\rR\16R\u0548\3S\3S\3"+
		"S\6S\u054e\nS\rS\16S\u054f\3S\3S\3S\3T\3T\3U\3U\3U\6U\u055a\nU\rU\16U"+
		"\u055b\3U\3U\3U\3U\3U\3U\5U\u0564\nU\3V\3V\7V\u0568\nV\fV\16V\u056b\13"+
		"V\3V\5V\u056e\nV\3W\3W\3W\3X\3X\3X\3X\3X\3X\5X\u0579\nX\3Y\3Y\3Y\3Y\3"+
		"Y\7Y\u0580\nY\fY\16Y\u0583\13Y\3Z\6Z\u0586\nZ\rZ\16Z\u0587\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0594\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u05a0"+
		"\nZ\3[\3[\5[\u05a4\n[\3[\3[\5[\u05a8\n[\3[\3[\3[\7[\u05ad\n[\f[\16[\u05b0"+
		"\13[\3[\3[\3[\3[\7[\u05b6\n[\f[\16[\u05b9\13[\3[\3[\3[\3[\3[\5[\u05c0"+
		"\n[\5[\u05c2\n[\3[\7[\u05c5\n[\f[\16[\u05c8\13[\3[\3[\3[\3[\3[\5[\u05cf"+
		"\n[\5[\u05d1\n[\3[\7[\u05d4\n[\f[\16[\u05d7\13[\3[\3[\7[\u05db\n[\f[\16"+
		"[\u05de\13[\3[\3[\7[\u05e2\n[\f[\16[\u05e5\13[\3[\3[\7[\u05e9\n[\f[\16"+
		"[\u05ec\13[\3[\3[\7[\u05f0\n[\f[\16[\u05f3\13[\3[\3[\7[\u05f7\n[\f[\16"+
		"[\u05fa\13[\3[\3[\7[\u05fe\n[\f[\16[\u0601\13[\3[\3[\7[\u0605\n[\f[\16"+
		"[\u0608\13[\5[\u060a\n[\3[\3[\3[\3[\7[\u0610\n[\f[\16[\u0613\13[\3[\3"+
		"[\3[\3[\7[\u0619\n[\f[\16[\u061c\13[\3[\3[\3[\3[\7[\u0622\n[\f[\16[\u0625"+
		"\13[\7[\u0627\n[\f[\16[\u062a\13[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\5\\\u0637\n\\\3\\\3\\\3\\\3\\\5\\\u063d\n\\\3\\\3\\\3\\\7\\\u0642"+
		"\n\\\f\\\16\\\u0645\13\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]"+
		"\3]\3]\3]\7]\u0659\n]\f]\16]\u065c\13]\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\3^\5^\u066c\n^\3_\3_\3`\3`\3`\3`\5`\u0674\n`\3a\3a\3a\5a\u0679"+
		"\na\3b\3b\7b\u067d\nb\fb\16b\u0680\13b\3c\3c\3d\3d\3d\3d\3d\3d\5d\u068a"+
		"\nd\3d\2\5\60\u00b4\u00b6e\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\2\24\4\2\30\30"+
		"\177\177\4\2\60\60QQ\4\2\65\65OO\4\2\32\32\37 \3\2\33\34\3\2!$\3\2%(\4"+
		"\2NN\u00a1\u00a1\5\2GI}}\u00c1\u00c3\4\2\33\35{{\4\2\u00bf\u00bf\u00c2"+
		"\u00c2\4\2%%\'\'\13\2\4\5\n\22\25\27\31\35\37 #%\'\'\u00bf\u00bf\u00c1"+
		"\u00c1\3\2%*\3\2)*\4\2\23\23\36\36\4\2\32\34\37\37\4\2\u00ac\u00ad\u00b8"+
		"\u00b8\2\u0755\2\u00cc\3\2\2\2\4\u00d4\3\2\2\2\6\u00f0\3\2\2\2\b\u00f2"+
		"\3\2\2\2\n\u0106\3\2\2\2\f\u010b\3\2\2\2\16\u010e\3\2\2\2\20\u012c\3\2"+
		"\2\2\22\u0133\3\2\2\2\24\u0140\3\2\2\2\26\u0155\3\2\2\2\30\u018b\3\2\2"+
		"\2\32\u01ea\3\2\2\2\34\u01ec\3\2\2\2\36\u0200\3\2\2\2 \u0208\3\2\2\2\""+
		"\u0220\3\2\2\2$\u0231\3\2\2\2&\u0239\3\2\2\2(\u023b\3\2\2\2*\u023e\3\2"+
		"\2\2,\u0240\3\2\2\2.\u0258\3\2\2\2\60\u0281\3\2\2\2\62\u02ad\3\2\2\2\64"+
		"\u02e5\3\2\2\2\66\u02e7\3\2\2\28\u02f1\3\2\2\2:\u02fe\3\2\2\2<\u030b\3"+
		"\2\2\2>\u0319\3\2\2\2@\u032b\3\2\2\2B\u033a\3\2\2\2D\u033f\3\2\2\2F\u0349"+
		"\3\2\2\2H\u0359\3\2\2\2J\u038a\3\2\2\2L\u038c\3\2\2\2N\u039f\3\2\2\2P"+
		"\u03a3\3\2\2\2R\u03ef\3\2\2\2T\u03f6\3\2\2\2V\u03f8\3\2\2\2X\u03fa\3\2"+
		"\2\2Z\u03fc\3\2\2\2\\\u03fe\3\2\2\2^\u0400\3\2\2\2`\u0402\3\2\2\2b\u0404"+
		"\3\2\2\2d\u0406\3\2\2\2f\u0408\3\2\2\2h\u040a\3\2\2\2j\u040c\3\2\2\2l"+
		"\u040e\3\2\2\2n\u0410\3\2\2\2p\u0412\3\2\2\2r\u0414\3\2\2\2t\u0420\3\2"+
		"\2\2v\u0422\3\2\2\2x\u042a\3\2\2\2z\u0433\3\2\2\2|\u0439\3\2\2\2~\u044d"+
		"\3\2\2\2\u0080\u045c\3\2\2\2\u0082\u046b\3\2\2\2\u0084\u047d\3\2\2\2\u0086"+
		"\u0493\3\2\2\2\u0088\u04a5\3\2\2\2\u008a\u04a7\3\2\2\2\u008c\u04b1\3\2"+
		"\2\2\u008e\u04bd\3\2\2\2\u0090\u04c6\3\2\2\2\u0092\u04d5\3\2\2\2\u0094"+
		"\u04df\3\2\2\2\u0096\u04f0\3\2\2\2\u0098\u0502\3\2\2\2\u009a\u050f\3\2"+
		"\2\2\u009c\u0520\3\2\2\2\u009e\u052a\3\2\2\2\u00a0\u053a\3\2\2\2\u00a2"+
		"\u0543\3\2\2\2\u00a4\u054a\3\2\2\2\u00a6\u0554\3\2\2\2\u00a8\u0556\3\2"+
		"\2\2\u00aa\u0565\3\2\2\2\u00ac\u056f\3\2\2\2\u00ae\u0572\3\2\2\2\u00b0"+
		"\u057a\3\2\2\2\u00b2\u0585\3\2\2\2\u00b4\u0609\3\2\2\2\u00b6\u063c\3\2"+
		"\2\2\u00b8\u065a\3\2\2\2\u00ba\u066b\3\2\2\2\u00bc\u066d\3\2\2\2\u00be"+
		"\u0673\3\2\2\2\u00c0\u0675\3\2\2\2\u00c2\u067a\3\2\2\2\u00c4\u0681\3\2"+
		"\2\2\u00c6\u0689\3\2\2\2\u00c8\u00cb\5\4\3\2\u00c9\u00cb\5r:\2\u00ca\u00c8"+
		"\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7\2"+
		"\2\3\u00d0\3\3\2\2\2\u00d1\u00d3\7\24\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00e0\5\6\4\2\u00d8\u00da\7\24\2\2\u00d9\u00d8\3"+
		"\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00df\5\6\4\2\u00de\u00d9\3\2\2\2\u00df\u00e2\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e6\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e5\7\24\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3"+
		"\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\5\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9\u00f1\5\22\n\2\u00ea\u00f1\5\24\13\2\u00eb\u00f1\5\16\b"+
		"\2\u00ec\u00f1\5\20\t\2\u00ed\u00f1\5\b\5\2\u00ee\u00f1\5\26\f\2\u00ef"+
		"\u00f1\5\34\17\2\u00f0\u00e9\3\2\2\2\u00f0\u00ea\3\2\2\2\u00f0\u00eb\3"+
		"\2\2\2\u00f0\u00ec\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00ef\3\2\2\2\u00f1\7\3\2\2\2\u00f2\u00f3\7\61\2\2\u00f3\u00f7\7\u0098"+
		"\2\2\u00f4\u00f5\5`\61\2\u00f5\u00f6\7\25\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00f4\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u0104\5b"+
		"\62\2\u00fa\u00fb\7\u008f\2\2\u00fb\u00fc\7\u009c\2\2\u00fc\u0105\5f\64"+
		"\2\u00fd\u0105\5\f\7\2\u00fe\u0105\5\n\6\2\u00ff\u0101\7.\2\2\u0100\u0102"+
		"\7A\2\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0105\5\36\20\2\u0104\u00fa\3\2\2\2\u0104\u00fd\3\2\2\2\u0104\u00fe\3"+
		"\2\2\2\u0104\u00ff\3\2\2\2\u0105\t\3\2\2\2\u0106\u0107\7.\2\2\u0107\u0108"+
		"\7D\2\2\u0108\u0109\5\u00c6d\2\u0109\u010a\58\35\2\u010a\13\3\2\2\2\u010b"+
		"\u010c\7.\2\2\u010c\u010d\58\35\2\u010d\r\3\2\2\2\u010e\u010f\7E\2\2\u010f"+
		"\u0113\7\u0098\2\2\u0110\u0111\7d\2\2\u0111\u0112\7{\2\2\u0112\u0114\7"+
		"Z\2\2\u0113\u0110\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0118\3\2\2\2\u0115"+
		"\u0116\5`\61\2\u0116\u0117\7\25\2\2\u0117\u0119\3\2\2\2\u0118\u0115\3"+
		"\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u012a\5d\63\2\u011b"+
		"\u011c\7\26\2\2\u011c\u0123\5\36\20\2\u011d\u011e\7\30\2\2\u011e\u0122"+
		"\58\35\2\u011f\u0120\7\30\2\2\u0120\u0122\5\36\20\2\u0121\u011d\3\2\2"+
		"\2\u0121\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7\27\2\2"+
		"\u0127\u012b\3\2\2\2\u0128\u0129\7\64\2\2\u0129\u012b\5\30\r\2\u012a\u011b"+
		"\3\2\2\2\u012a\u0128\3\2\2\2\u012b\17\3\2\2\2\u012c\u012d\7N\2\2\u012d"+
		"\u012e\7_\2\2\u012e\u0131\5D#\2\u012f\u0130\7\u00a8\2\2\u0130\u0132\5"+
		"\60\31\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\21\3\2\2\2\u0133"+
		"\u0134\7R\2\2\u0134\u0137\7\u0098\2\2\u0135\u0136\7d\2\2\u0136\u0138\7"+
		"Z\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013c\3\2\2\2\u0139"+
		"\u013a\5`\61\2\u013a\u013b\7\25\2\2\u013b\u013d\3\2\2\2\u013c\u0139\3"+
		"\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\5d\63\2\u013f"+
		"\23\3\2\2\2\u0140\u014b\5R*\2\u0141\u0142\7\u0083\2\2\u0142\u0143\7;\2"+
		"\2\u0143\u0148\5F$\2\u0144\u0145\7\30\2\2\u0145\u0147\5F$\2\u0146\u0144"+
		"\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u0141\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u0153\3\2\2\2\u014d\u014e\7v\2\2\u014e\u0151\5\60\31\2\u014f"+
		"\u0150\t\2\2\2\u0150\u0152\5\60\31\2\u0151\u014f\3\2\2\2\u0151\u0152\3"+
		"\2\2\2\u0152\u0154\3\2\2\2\u0153\u014d\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\25\3\2\2\2\u0155\u0156\7l\2\2\u0156\u015a\7o\2\2\u0157\u0158\5`\61\2"+
		"\u0158\u0159\7\25\2\2\u0159\u015b\3\2\2\2\u015a\u0157\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u0168\5d\63\2\u015d\u015e\7\26\2\2"+
		"\u015e\u0163\5h\65\2\u015f\u0160\7\30\2\2\u0160\u0162\5h\65\2\u0161\u015f"+
		"\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\7\27\2\2\u0167\u0169\3"+
		"\2\2\2\u0168\u015d\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0189\3\2\2\2\u016a"+
		"\u016b\7\u00a4\2\2\u016b\u016c\7\26\2\2\u016c\u0171\5\60\31\2\u016d\u016e"+
		"\7\30\2\2\u016e\u0170\5\60\31\2\u016f\u016d\3\2\2\2\u0170\u0173\3\2\2"+
		"\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0174\u0183\7\27\2\2\u0175\u0176\7\30\2\2\u0176\u0177\7\26\2"+
		"\2\u0177\u017c\5\60\31\2\u0178\u0179\7\30\2\2\u0179\u017b\5\60\31\2\u017a"+
		"\u0178\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\7\27\2\2\u0180"+
		"\u0182\3\2\2\2\u0181\u0175\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u018a\3\2\2\2\u0185\u0183\3\2\2\2\u0186"+
		"\u018a\5\30\r\2\u0187\u0188\7K\2\2\u0188\u018a\7\u00a4\2\2\u0189\u016a"+
		"\3\2\2\2\u0189\u0186\3\2\2\2\u0189\u0187\3\2\2\2\u018a\27\3\2\2\2\u018b"+
		"\u0196\5\32\16\2\u018c\u018d\7\u0083\2\2\u018d\u018e\7;\2\2\u018e\u0193"+
		"\5F$\2\u018f\u0190\7\30\2\2\u0190\u0192\5F$\2\u0191\u018f\3\2\2\2\u0192"+
		"\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0197\3\2"+
		"\2\2\u0195\u0193\3\2\2\2\u0196\u018c\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u019e\3\2\2\2\u0198\u0199\7v\2\2\u0199\u019c\5\60\31\2\u019a\u019b\t"+
		"\2\2\2\u019b\u019d\5\60\31\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019f\3\2\2\2\u019e\u0198\3\2\2\2\u019e\u019f\3\2\2\2\u019f\31\3\2\2"+
		"\2\u01a0\u01a2\7\u0096\2\2\u01a1\u01a3\t\3\2\2\u01a2\u01a1\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a9\5H%\2\u01a5\u01a6\7\30"+
		"\2\2\u01a6\u01a8\5H%\2\u01a7\u01a5\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7"+
		"\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01b8\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac"+
		"\u01b6\7_\2\2\u01ad\u01b2\5J&\2\u01ae\u01af\7\30\2\2\u01af\u01b1\5J&\2"+
		"\u01b0\u01ae\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3\u01b7\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b7\5L\'\2\u01b6"+
		"\u01ad\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01ac\3\2"+
		"\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01bb\7\u00a8\2\2\u01bb"+
		"\u01bd\5\60\31\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01cc\3"+
		"\2\2\2\u01be\u01bf\7b\2\2\u01bf\u01c0\7;\2\2\u01c0\u01c5\5\60\31\2\u01c1"+
		"\u01c2\7\30\2\2\u01c2\u01c4\5\60\31\2\u01c3\u01c1\3\2\2\2\u01c4\u01c7"+
		"\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01ca\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c8\u01c9\7c\2\2\u01c9\u01cb\5\60\31\2\u01ca\u01c8\3"+
		"\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01be\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cd\u01eb\3\2\2\2\u01ce\u01cf\7\u00a4\2\2\u01cf\u01d0"+
		"\7\26\2\2\u01d0\u01d5\5\60\31\2\u01d1\u01d2\7\30\2\2\u01d2\u01d4\5\60"+
		"\31\2\u01d3\u01d1\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01e7\7\27"+
		"\2\2\u01d9\u01da\7\30\2\2\u01da\u01db\7\26\2\2\u01db\u01e0\5\60\31\2\u01dc"+
		"\u01dd\7\30\2\2\u01dd\u01df\5\60\31\2\u01de\u01dc\3\2\2\2\u01df\u01e2"+
		"\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2"+
		"\u01e0\3\2\2\2\u01e3\u01e4\7\27\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01d9\3"+
		"\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01a0\3\2\2\2\u01ea\u01ce\3\2"+
		"\2\2\u01eb\33\3\2\2\2\u01ec\u01ed\7\u00a1\2\2\u01ed\u01ee\5D#\2\u01ee"+
		"\u01ef\7\u0097\2\2\u01ef\u01f0\5h\65\2\u01f0\u01f1\7\31\2\2\u01f1\u01f9"+
		"\5\60\31\2\u01f2\u01f3\7\30\2\2\u01f3\u01f4\5h\65\2\u01f4\u01f5\7\31\2"+
		"\2\u01f5\u01f6\5\60\31\2\u01f6\u01f8\3\2\2\2\u01f7\u01f2\3\2\2\2\u01f8"+
		"\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fe\3\2"+
		"\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fd\7\u00a8\2\2\u01fd\u01ff\5\60\31\2"+
		"\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\35\3\2\2\2\u0200\u0205"+
		"\5h\65\2\u0201\u0204\5\"\22\2\u0202\u0204\5 \21\2\u0203\u0201\3\2\2\2"+
		"\u0203\u0202\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206"+
		"\3\2\2\2\u0206\37\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u021c\5\\/\2\u0209"+
		"\u020a\7\26\2\2\u020a\u020c\5T+\2\u020b\u020d\5\u00c6d\2\u020c\u020b\3"+
		"\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\7\27\2\2\u020f"+
		"\u021d\3\2\2\2\u0210\u0211\7\26\2\2\u0211\u0213\5T+\2\u0212\u0214\5\u00c6"+
		"d\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"\u0216\7\30\2\2\u0216\u0218\5T+\2\u0217\u0219\5\u00c6d\2\u0218\u0217\3"+
		"\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\7\27\2\2\u021b"+
		"\u021d\3\2\2\2\u021c\u0209\3\2\2\2\u021c\u0210\3\2\2\2\u021c\u021d\3\2"+
		"\2\2\u021d!\3\2\2\2\u021e\u021f\7D\2\2\u021f\u0221\5\\/\2\u0220\u021e"+
		"\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u022f\3\2\2\2\u0222\u0230\5$\23\2\u0223"+
		"\u0230\5&\24\2\u0224\u0230\5(\25\2\u0225\u0230\5*\26\2\u0226\u0230\7\u00a0"+
		"\2\2\u0227\u0228\7?\2\2\u0228\u0229\7\26\2\2\u0229\u022a\5\60\31\2\u022a"+
		"\u022b\7\27\2\2\u022b\u0230\3\2\2\2\u022c\u0230\5,\27\2\u022d\u022e\7"+
		"@\2\2\u022e\u0230\5j\66\2\u022f\u0222\3\2\2\2\u022f\u0223\3\2\2\2\u022f"+
		"\u0224\3\2\2\2\u022f\u0225\3\2\2\2\u022f\u0226\3\2\2\2\u022f\u0227\3\2"+
		"\2\2\u022f\u022c\3\2\2\2\u022f\u022d\3\2\2\2\u0230#\3\2\2\2\u0231\u0232"+
		"\7\u0087\2\2\u0232\u0234\7s\2\2\u0233\u0235\t\4\2\2\u0234\u0233\3\2\2"+
		"\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236\u0238\7\67\2\2\u0237"+
		"\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238%\3\2\2\2\u0239\u023a\5\62\32"+
		"\2\u023a\'\3\2\2\2\u023b\u023c\7{\2\2\u023c\u023d\7}\2\2\u023d)\3\2\2"+
		"\2\u023e\u023f\7}\2\2\u023f+\3\2\2\2\u0240\u024c\7K\2\2\u0241\u024d\5"+
		".\30\2\u0242\u0243\7\26\2\2\u0243\u0244\5\60\31\2\u0244\u0245\7\27\2\2"+
		"\u0245\u024d\3\2\2\2\u0246\u0247\7y\2\2\u0247\u0248\7\26\2\2\u0248\u0249"+
		"\5\60\31\2\u0249\u024a\7\27\2\2\u024a\u024d\3\2\2\2\u024b\u024d\5\u00c6"+
		"d\2\u024c\u0241\3\2\2\2\u024c\u0242\3\2\2\2\u024c\u0246\3\2\2\2\u024c"+
		"\u024b\3\2\2\2\u024d\u0254\3\2\2\2\u024e\u0250\7\3\2\2\u024f\u0251\5\u00c6"+
		"d\2\u0250\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0250\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254\u024e\3\2\2\2\u0254\u0255\3\2"+
		"\2\2\u0255-\3\2\2\2\u0256\u0259\5T+\2\u0257\u0259\5V,\2\u0258\u0256\3"+
		"\2\2\2\u0258\u0257\3\2\2\2\u0259/\3\2\2\2\u025a\u025b\b\31\1\2\u025b\u0282"+
		"\5V,\2\u025c\u025d\5`\61\2\u025d\u025e\7\25\2\2\u025e\u0260\3\2\2\2\u025f"+
		"\u025c\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\5d"+
		"\63\2\u0262\u0263\7\25\2\2\u0263\u0265\3\2\2\2\u0264\u025f\3\2\2\2\u0264"+
		"\u0265\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0282\5h\65\2\u0267\u0268\5X"+
		"-\2\u0268\u0269\5\60\31\16\u0269\u0282\3\2\2\2\u026a\u026b\5^\60\2\u026b"+
		"\u0278\7\26\2\2\u026c\u026e\7Q\2\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2"+
		"\2\2\u026e\u026f\3\2\2\2\u026f\u0274\5\60\31\2\u0270\u0271\7\30\2\2\u0271"+
		"\u0273\5\60\31\2\u0272\u0270\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3"+
		"\2\2\2\u0274\u0275\3\2\2\2\u0275\u0279\3\2\2\2\u0276\u0274\3\2\2\2\u0277"+
		"\u0279\7\32\2\2\u0278\u026d\3\2\2\2\u0278\u0277\3\2\2\2\u0278\u0279\3"+
		"\2\2\2\u0279\u027a\3\2\2\2\u027a\u027b\7\27\2\2\u027b\u0282\3\2\2\2\u027c"+
		"\u027d\7\26\2\2\u027d\u027e\5\60\31\2\u027e\u027f\7\27\2\2\u027f\u0282"+
		"\3\2\2\2\u0280\u0282\5R*\2\u0281\u025a\3\2\2\2\u0281\u0264\3\2\2\2\u0281"+
		"\u0267\3\2\2\2\u0281\u026a\3\2\2\2\u0281\u027c\3\2\2\2\u0281\u0280\3\2"+
		"\2\2\u0282\u02aa\3\2\2\2\u0283\u0284\f\r\2\2\u0284\u0285\7\36\2\2\u0285"+
		"\u02a9\5\60\31\16\u0286\u0287\f\f\2\2\u0287\u0288\t\5\2\2\u0288\u02a9"+
		"\5\60\31\r\u0289\u028a\f\13\2\2\u028a\u028b\t\6\2\2\u028b\u02a9\5\60\31"+
		"\f\u028c\u028d\f\n\2\2\u028d\u028e\t\7\2\2\u028e\u02a9\5\60\31\13\u028f"+
		"\u0290\f\t\2\2\u0290\u0291\t\b\2\2\u0291\u02a9\5\60\31\n\u0292\u029f\f"+
		"\b\2\2\u0293\u02a0\7\31\2\2\u0294\u02a0\7)\2\2\u0295\u02a0\7*\2\2\u0296"+
		"\u02a0\7+\2\2\u0297\u02a0\7p\2\2\u0298\u0299\7p\2\2\u0299\u02a0\7{\2\2"+
		"\u029a\u02a0\7g\2\2\u029b\u02a0\7u\2\2\u029c\u02a0\7a\2\2\u029d\u02a0"+
		"\7w\2\2\u029e\u02a0\7\u008c\2\2\u029f\u0293\3\2\2\2\u029f\u0294\3\2\2"+
		"\2\u029f\u0295\3\2\2\2\u029f\u0296\3\2\2\2\u029f\u0297\3\2\2\2\u029f\u0298"+
		"\3\2\2\2\u029f\u029a\3\2\2\2\u029f\u029b\3\2\2\2\u029f\u029c\3\2\2\2\u029f"+
		"\u029d\3\2\2\2\u029f\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a9\5\60"+
		"\31\t\u02a2\u02a3\f\7\2\2\u02a3\u02a4\7\63\2\2\u02a4\u02a9\5\60\31\b\u02a5"+
		"\u02a6\f\6\2\2\u02a6\u02a7\7\u0082\2\2\u02a7\u02a9\5\60\31\7\u02a8\u0283"+
		"\3\2\2\2\u02a8\u0286\3\2\2\2\u02a8\u0289\3\2\2\2\u02a8\u028c\3\2\2\2\u02a8"+
		"\u028f\3\2\2\2\u02a8\u0292\3\2\2\2\u02a8\u02a2\3\2\2\2\u02a8\u02a5\3\2"+
		"\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"\61\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02b1\7\u008b\2\2\u02ae\u02af\5"+
		"`\61\2\u02af\u02b0\7\25\2\2\u02b0\u02b2\3\2\2\2\u02b1\u02ae\3\2\2\2\u02b1"+
		"\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02bf\5l\67\2\u02b4\u02b5\7\26"+
		"\2\2\u02b5\u02ba\5\64\33\2\u02b6\u02b7\7\30\2\2\u02b7\u02b9\5\64\33\2"+
		"\u02b8\u02b6\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb"+
		"\3\2\2\2\u02bb\u02bd\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02be\7\27\2\2"+
		"\u02be\u02c0\3\2\2\2\u02bf\u02b4\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02d3"+
		"\3\2\2\2\u02c1\u02c2\7\u0080\2\2\u02c2\u02cb\t\t\2\2\u02c3\u02c4\7\u0097"+
		"\2\2\u02c4\u02cc\7}\2\2\u02c5\u02c6\7\u0097\2\2\u02c6\u02cc\7K\2\2\u02c7"+
		"\u02cc\7<\2\2\u02c8\u02cc\7\u0091\2\2\u02c9\u02ca\7z\2\2\u02ca\u02cc\7"+
		"-\2\2\u02cb\u02c3\3\2\2\2\u02cb\u02c5\3\2\2\2\u02cb\u02c7\3\2\2\2\u02cb"+
		"\u02c8\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cc\u02d0\3\2\2\2\u02cd\u02ce\7w"+
		"\2\2\u02ce\u02d0\5\\/\2\u02cf\u02c1\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0"+
		"\u02d2\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2"+
		"\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02e3\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6"+
		"\u02d8\7{\2\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\3\2"+
		"\2\2\u02d9\u02de\7L\2\2\u02da\u02db\7j\2\2\u02db\u02df\7M\2\2\u02dc\u02dd"+
		"\7j\2\2\u02dd\u02df\7f\2\2\u02de\u02da\3\2\2\2\u02de\u02dc\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02df\u02e1\3\2\2\2\u02e0\u02e2\7V\2\2\u02e1\u02e0\3\2"+
		"\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e4\3\2\2\2\u02e3\u02d7\3\2\2\2\u02e3"+
		"\u02e4\3\2\2\2\u02e4\63\3\2\2\2\u02e5\u02e6\5\\/\2\u02e6\65\3\2\2\2\u02e7"+
		"\u02ea\5h\65\2\u02e8\u02e9\7@\2\2\u02e9\u02eb\5j\66\2\u02ea\u02e8\3\2"+
		"\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02ee\t\4\2\2\u02ed"+
		"\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\67\3\2\2\2\u02ef\u02f0\7D\2\2"+
		"\u02f0\u02f2\5\\/\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02fc"+
		"\3\2\2\2\u02f3\u02fd\5:\36\2\u02f4\u02fd\5@!\2\u02f5\u02fd\5> \2\u02f6"+
		"\u02f7\7?\2\2\u02f7\u02f8\7\26\2\2\u02f8\u02f9\5\60\31\2\u02f9\u02fa\7"+
		"\27\2\2\u02fa\u02fd\3\2\2\2\u02fb\u02fd\5<\37\2\u02fc\u02f3\3\2\2\2\u02fc"+
		"\u02f4\3\2\2\2\u02fc\u02f5\3\2\2\2\u02fc\u02f6\3\2\2\2\u02fc\u02fb\3\2"+
		"\2\2\u02fd9\3\2\2\2\u02fe\u02ff\7\u0087\2\2\u02ff\u0300\7s\2\2\u0300\u0301"+
		"\7\26\2\2\u0301\u0306\5\66\34\2\u0302\u0303\7\30\2\2\u0303\u0305\5\66"+
		"\34\2\u0304\u0302\3\2\2\2\u0305\u0308\3\2\2\2\u0306\u0304\3\2\2\2\u0306"+
		"\u0307\3\2\2\2\u0307\u0309\3\2\2\2\u0308\u0306\3\2\2\2\u0309\u030a\7\27"+
		"\2\2\u030a;\3\2\2\2\u030b\u030c\7^\2\2\u030c\u030d\7s\2\2\u030d\u030e"+
		"\7\26\2\2\u030e\u0313\5B\"\2\u030f\u0310\7\30\2\2\u0310\u0312\5B\"\2\u0311"+
		"\u030f\3\2\2\2\u0312\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2"+
		"\2\2\u0314\u0316\3\2\2\2\u0315\u0313\3\2\2\2\u0316\u0317\7\27\2\2\u0317"+
		"\u0318\5\62\32\2\u0318=\3\2\2\2\u0319\u031b\7\u00a0\2\2\u031a\u031c\7"+
		"s\2\2\u031b\u031a\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031e\3\2\2\2\u031d"+
		"\u031f\5\\/\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\3\2"+
		"\2\2\u0320\u0321\7\26\2\2\u0321\u0326\5\66\34\2\u0322\u0323\7\30\2\2\u0323"+
		"\u0325\5\66\34\2\u0324\u0322\3\2\2\2\u0325\u0328\3\2\2\2\u0326\u0324\3"+
		"\2\2\2\u0326\u0327\3\2\2\2\u0327\u0329\3\2\2\2\u0328\u0326\3\2\2\2\u0329"+
		"\u032a\7\27\2\2\u032a?\3\2\2\2\u032b\u032d\7s\2\2\u032c\u032e\5\\/\2\u032d"+
		"\u032c\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0330\7\26"+
		"\2\2\u0330\u0335\5\66\34\2\u0331\u0332\7\30\2\2\u0332\u0334\5\66\34\2"+
		"\u0333\u0331\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2\2\2\u0335\u0336"+
		"\3\2\2\2\u0336\u0338\3\2\2\2\u0337\u0335\3\2\2\2\u0338\u0339\7\27\2\2"+
		"\u0339A\3\2\2\2\u033a\u033b\5h\65\2\u033bC\3\2\2\2\u033c\u033d\5`\61\2"+
		"\u033d\u033e\7\25\2\2\u033e\u0340\3\2\2\2\u033f\u033c\3\2\2\2\u033f\u0340"+
		"\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0347\5d\63\2\u0342\u0343\7i\2\2\u0343"+
		"\u0344\7;\2\2\u0344\u0348\5n8\2\u0345\u0346\7{\2\2\u0346\u0348\7i\2\2"+
		"\u0347\u0342\3\2\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348E\3"+
		"\2\2\2\u0349\u034b\5\60\31\2\u034a\u034c\t\4\2\2\u034b\u034a\3\2\2\2\u034b"+
		"\u034c\3\2\2\2\u034cG\3\2\2\2\u034d\u035a\7\32\2\2\u034e\u034f\5d\63\2"+
		"\u034f\u0350\7\25\2\2\u0350\u0351\7\32\2\2\u0351\u035a\3\2\2\2\u0352\u0357"+
		"\5\60\31\2\u0353\u0355\7\64\2\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2"+
		"\2\u0355\u0356\3\2\2\2\u0356\u0358\5Z.\2\u0357\u0354\3\2\2\2\u0357\u0358"+
		"\3\2\2\2\u0358\u035a\3\2\2\2\u0359\u034d\3\2\2\2\u0359\u034e\3\2\2\2\u0359"+
		"\u0352\3\2\2\2\u035aI\3\2\2\2\u035b\u035c\5`\61\2\u035c\u035d\7\25\2\2"+
		"\u035d\u035f\3\2\2\2\u035e\u035b\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0360"+
		"\3\2\2\2\u0360\u0365\5d\63\2\u0361\u0363\7\64\2\2\u0362\u0361\3\2\2\2"+
		"\u0362\u0363\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0366\5p9\2\u0365\u0362"+
		"\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u036c\3\2\2\2\u0367\u0368\7i\2\2\u0368"+
		"\u0369\7;\2\2\u0369\u036d\5n8\2\u036a\u036b\7{\2\2\u036b\u036d\7i\2\2"+
		"\u036c\u0367\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u038b"+
		"\3\2\2\2\u036e\u0378\7\26\2\2\u036f\u0374\5J&\2\u0370\u0371\7\30\2\2\u0371"+
		"\u0373\5J&\2\u0372\u0370\3\2\2\2\u0373\u0376\3\2\2\2\u0374\u0372\3\2\2"+
		"\2\u0374\u0375\3\2\2\2\u0375\u0379\3\2\2\2\u0376\u0374\3\2\2\2\u0377\u0379"+
		"\5L\'\2\u0378\u036f\3\2\2\2\u0378\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037a"+
		"\u037f\7\27\2\2\u037b\u037d\7\64\2\2\u037c\u037b\3\2\2\2\u037c\u037d\3"+
		"\2\2\2\u037d\u037e\3\2\2\2\u037e\u0380\5p9\2\u037f\u037c\3\2\2\2\u037f"+
		"\u0380\3\2\2\2\u0380\u038b\3\2\2\2\u0381\u0382\7\26\2\2\u0382\u0383\5"+
		"\30\r\2\u0383\u0388\7\27\2\2\u0384\u0386\7\64\2\2\u0385\u0384\3\2\2\2"+
		"\u0385\u0386\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0389\5p9\2\u0388\u0385"+
		"\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038b\3\2\2\2\u038a\u035e\3\2\2\2\u038a"+
		"\u036e\3\2\2\2\u038a\u0381\3\2\2\2\u038bK\3\2\2\2\u038c\u0393\5J&\2\u038d"+
		"\u038e\5N(\2\u038e\u038f\5J&\2\u038f\u0390\5P)\2\u0390\u0392\3\2\2\2\u0391"+
		"\u038d\3\2\2\2\u0392\u0395\3\2\2\2\u0393\u0391\3\2\2\2\u0393\u0394\3\2"+
		"\2\2\u0394M\3\2\2\2\u0395\u0393\3\2\2\2\u0396\u03a0\7\30\2\2\u0397\u0399"+
		"\7t\2\2\u0398\u039a\7\u0084\2\2\u0399\u0398\3\2\2\2\u0399\u039a\3\2\2"+
		"\2\u039a\u039d\3\2\2\2\u039b\u039d\7k\2\2\u039c\u0397\3\2\2\2\u039c\u039b"+
		"\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a0\7r\2\2\u039f"+
		"\u0396\3\2\2\2\u039f\u039c\3\2\2\2\u03a0O\3\2\2\2\u03a1\u03a2\7\u0080"+
		"\2\2\u03a2\u03a4\5\60\31\2\u03a3\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4"+
		"Q\3\2\2\2\u03a5\u03a7\7\u0096\2\2\u03a6\u03a8\t\3\2\2\u03a7\u03a6\3\2"+
		"\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03ae\5H%\2\u03aa\u03ab"+
		"\7\30\2\2\u03ab\u03ad\5H%\2\u03ac\u03aa\3\2\2\2\u03ad\u03b0\3\2\2\2\u03ae"+
		"\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03bd\3\2\2\2\u03b0\u03ae\3\2"+
		"\2\2\u03b1\u03bb\7_\2\2\u03b2\u03b7\5J&\2\u03b3\u03b4\7\30\2\2\u03b4\u03b6"+
		"\5J&\2\u03b5\u03b3\3\2\2\2\u03b6\u03b9\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b7"+
		"\u03b8\3\2\2\2\u03b8\u03bc\3\2\2\2\u03b9\u03b7\3\2\2\2\u03ba\u03bc\5L"+
		"\'\2\u03bb\u03b2\3\2\2\2\u03bb\u03ba\3\2\2\2\u03bc\u03be\3\2\2\2\u03bd"+
		"\u03b1\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c1\3\2\2\2\u03bf\u03c0\7\u00a8"+
		"\2\2\u03c0\u03c2\5\60\31\2\u03c1\u03bf\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2"+
		"\u03d1\3\2\2\2\u03c3\u03c4\7b\2\2\u03c4\u03c5\7;\2\2\u03c5\u03ca\5\60"+
		"\31\2\u03c6\u03c7\7\30\2\2\u03c7\u03c9\5\60\31\2\u03c8\u03c6\3\2\2\2\u03c9"+
		"\u03cc\3\2\2\2\u03ca\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cf\3\2"+
		"\2\2\u03cc\u03ca\3\2\2\2\u03cd\u03ce\7c\2\2\u03ce\u03d0\5\60\31\2\u03cf"+
		"\u03cd\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d2\3\2\2\2\u03d1\u03c3\3\2"+
		"\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03f0\3\2\2\2\u03d3\u03d4\7\u00a4\2\2\u03d4"+
		"\u03d5\7\26\2\2\u03d5\u03da\5\60\31\2\u03d6\u03d7\7\30\2\2\u03d7\u03d9"+
		"\5\60\31\2\u03d8\u03d6\3\2\2\2\u03d9\u03dc\3\2\2\2\u03da\u03d8\3\2\2\2"+
		"\u03da\u03db\3\2\2\2\u03db\u03dd\3\2\2\2\u03dc\u03da\3\2\2\2\u03dd\u03ec"+
		"\7\27\2\2\u03de\u03df\7\30\2\2\u03df\u03e0\7\26\2\2\u03e0\u03e5\5\60\31"+
		"\2\u03e1\u03e2\7\30\2\2\u03e2\u03e4\5\60\31\2\u03e3\u03e1\3\2\2\2\u03e4"+
		"\u03e7\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e8\3\2"+
		"\2\2\u03e7\u03e5\3\2\2\2\u03e8\u03e9\7\27\2\2\u03e9\u03eb\3\2\2\2\u03ea"+
		"\u03de\3\2\2\2\u03eb\u03ee\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2"+
		"\2\2\u03ed\u03f0\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ef\u03a5\3\2\2\2\u03ef"+
		"\u03d3\3\2\2\2\u03f0S\3\2\2\2\u03f1\u03f3\t\6\2\2\u03f2\u03f1\3\2\2\2"+
		"\u03f2\u03f3\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f7\7\u00c1\2\2\u03f5"+
		"\u03f7\7\32\2\2\u03f6\u03f2\3\2\2\2\u03f6\u03f5\3\2\2\2\u03f7U\3\2\2\2"+
		"\u03f8\u03f9\t\n\2\2\u03f9W\3\2\2\2\u03fa\u03fb\t\13\2\2\u03fbY\3\2\2"+
		"\2\u03fc\u03fd\t\f\2\2\u03fd[\3\2\2\2\u03fe\u03ff\5\u00c6d\2\u03ff]\3"+
		"\2\2\2\u0400\u0401\5\u00c6d\2\u0401_\3\2\2\2\u0402\u0403\5\u00c6d\2\u0403"+
		"a\3\2\2\2\u0404\u0405\5\u00c6d\2\u0405c\3\2\2\2\u0406\u0407\5\u00c6d\2"+
		"\u0407e\3\2\2\2\u0408\u0409\5\u00c6d\2\u0409g\3\2\2\2\u040a\u040b\5\u00c6"+
		"d\2\u040bi\3\2\2\2\u040c\u040d\5\u00c6d\2\u040dk\3\2\2\2\u040e\u040f\5"+
		"\u00c6d\2\u040fm\3\2\2\2\u0410\u0411\5\u00c6d\2\u0411o\3\2\2\2\u0412\u0413"+
		"\7\u00bf\2\2\u0413q\3\2\2\2\u0414\u0419\5t;\2\u0415\u0416\7\24\2\2\u0416"+
		"\u0418\5t;\2\u0417\u0415\3\2\2\2\u0418\u041b\3\2\2\2\u0419\u0417\3\2\2"+
		"\2\u0419\u041a\3\2\2\2\u041a\u041c\3\2\2\2\u041b\u0419\3\2\2\2\u041c\u041d"+
		"\7\24\2\2\u041ds\3\2\2\2\u041e\u0421\5\u00b8]\2\u041f\u0421\5v<\2\u0420"+
		"\u041e\3\2\2\2\u0420\u041f\3\2\2\2\u0421u\3\2\2\2\u0422\u0423\7\u00ab"+
		"\2\2\u0423\u0424\7\u00bf\2\2\u0424\u0425\7\26\2\2\u0425\u0426\5x=\2\u0426"+
		"\u0427\7\27\2\2\u0427\u0428\5\u00b8]\2\u0428w\3\2\2\2\u0429\u042b\5z>"+
		"\2\u042a\u0429\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u0430\3\2\2\2\u042c\u042d"+
		"\7\30\2\2\u042d\u042f\5z>\2\u042e\u042c\3\2\2\2\u042f\u0432\3\2\2\2\u0430"+
		"\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431y\3\2\2\2\u0432\u0430\3\2\2\2"+
		"\u0433\u0434\5\u00c4c\2\u0434\u0437\7\u00bf\2\2\u0435\u0436\7\31\2\2\u0436"+
		"\u0438\5\u00b4[\2\u0437\u0435\3\2\2\2\u0437\u0438\3\2\2\2\u0438{\3\2\2"+
		"\2\u0439\u043a\7\u00bf\2\2\u043a\u043f\7\26\2\2\u043b\u043d\7\u00bf\2"+
		"\2\u043c\u043b\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u0440\3\2\2\2\u043e\u0440"+
		"\5\u00b4[\2\u043f\u043c\3\2\2\2\u043f\u043e\3\2\2\2\u0440\u0448\3\2\2"+
		"\2\u0441\u0444\7\30\2\2\u0442\u0445\7\u00bf\2\2\u0443\u0445\5\u00b4[\2"+
		"\u0444\u0442\3\2\2\2\u0444\u0443\3\2\2\2\u0445\u0447\3\2\2\2\u0446\u0441"+
		"\3\2\2\2\u0447\u044a\3\2\2\2\u0448\u0446\3\2\2\2\u0448\u0449\3\2\2\2\u0449"+
		"\u044b\3\2\2\2\u044a\u0448\3\2\2\2\u044b\u044c\7\27\2\2\u044c}\3\2\2\2"+
		"\u044d\u044e\5\u00c4c\2\u044e\u0453\5\u00c0a\2\u044f\u0450\7\30\2\2\u0450"+
		"\u0452\5\u00c0a\2\u0451\u044f\3\2\2\2\u0452\u0455\3\2\2\2\u0453\u0451"+
		"\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0459\3\2\2\2\u0455\u0453\3\2\2\2\u0456"+
		"\u0458\7\24\2\2\u0457\u0456\3\2\2\2\u0458\u045b\3\2\2\2\u0459\u0457\3"+
		"\2\2\2\u0459\u045a\3\2\2\2\u045a\177\3\2\2\2\u045b\u0459\3\2\2\2\u045c"+
		"\u045d\7\u00ae\2\2\u045d\u045f\7\26\2\2\u045e\u0460\5\u00b6\\\2\u045f"+
		"\u045e\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u045f\3\2\2\2\u0461\u0462\3\2"+
		"\2\2\u0462\u0463\3\2\2\2\u0463\u0469\7\27\2\2\u0464\u0465\7\4\2\2\u0465"+
		"\u0466\5\u00b8]\2\u0466\u0467\7\5\2\2\u0467\u046a\3\2\2\2\u0468\u046a"+
		"\5\u00ba^\2\u0469\u0464\3\2\2\2\u0469\u0468\3\2\2\2\u046a\u0081\3\2\2"+
		"\2\u046b\u0471\7\u00b5\2\2\u046c\u046d\7\4\2\2\u046d\u046e\5\u00b8]\2"+
		"\u046e\u046f\7\5\2\2\u046f\u0472\3\2\2\2\u0470\u0472\5\u00ba^\2\u0471"+
		"\u046c\3\2\2\2\u0471\u0470\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0474\7\u00ae"+
		"\2\2\u0474\u0476\7\26\2\2\u0475\u0477\5\u00b6\\\2\u0476\u0475\3\2\2\2"+
		"\u0477\u0478\3\2\2\2\u0478\u0476\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047a"+
		"\3\2\2\2\u047a\u047b\7\27\2\2\u047b\u047c\7\24\2\2\u047c\u0083\3\2\2\2"+
		"\u047d\u047e\7]\2\2\u047e\u047f\7\26\2\2\u047f\u0480\5\u00ba^\2\u0480"+
		"\u0482\7\24\2\2\u0481\u0483\5\u00b6\\\2\u0482\u0481\3\2\2\2\u0483\u0484"+
		"\3\2\2\2\u0484\u0482\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0487\3\2\2\2\u0486"+
		"\u0488\5\u00ba^\2\u0487\u0486\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u0489"+
		"\3\2\2\2\u0489\u048a\7\24\2\2\u048a\u048b\5\u00ba^\2\u048b\u0491\7\27"+
		"\2\2\u048c\u048d\7\4\2\2\u048d\u048e\5\u00b8]\2\u048e\u048f\7\5\2\2\u048f"+
		"\u0492\3\2\2\2\u0490\u0492\5\u00ba^\2\u0491\u048c\3\2\2\2\u0491\u0490"+
		"\3\2\2\2\u0492\u0085\3\2\2\2\u0493\u0494\7\u00bc\2\2\u0494\u0495\7\26"+
		"\2\2\u0495\u0496\7\u00b8\2\2\u0496\u0497\7\u00bf\2\2\u0497\u0498\7g\2"+
		"\2\u0498\u0499\7\u00bf\2\2\u0499\u049f\7\27\2\2\u049a\u049b\7\4\2\2\u049b"+
		"\u049c\5\u00b8]\2\u049c\u049d\7\5\2\2\u049d\u04a0\3\2\2\2\u049e\u04a0"+
		"\5\u00ba^\2\u049f\u049a\3\2\2\2\u049f\u049e\3\2\2\2\u04a0\u0087\3\2\2"+
		"\2\u04a1\u04a6\5\u0080A\2\u04a2\u04a6\5\u0082B\2\u04a3\u04a6\5\u0084C"+
		"\2\u04a4\u04a6\5\u0086D\2\u04a5\u04a1\3\2\2\2\u04a5\u04a2\3\2\2\2\u04a5"+
		"\u04a3\3\2\2\2\u04a5\u04a4\3\2\2\2\u04a6\u0089\3\2\2\2\u04a7\u04ac\7\u00b7"+
		"\2\2\u04a8\u04ab\5\u00b4[\2\u04a9\u04ab\5\u00b6\\\2\u04aa\u04a8\3\2\2"+
		"\2\u04aa\u04a9\3\2\2\2\u04ab\u04ae\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ac\u04ad"+
		"\3\2\2\2\u04ad\u04af\3\2\2\2\u04ae\u04ac\3\2\2\2\u04af\u04b0\7\24\2\2"+
		"\u04b0\u008b\3\2\2\2\u04b1\u04b2\7\u00af\2\2\u04b2\u04b3\5\u00b8]\2\u04b3"+
		"\u04b4\7\u00b0\2\2\u04b4\u04b5\7\26\2\2\u04b5\u04b6\7\u00b1\2\2\u04b6"+
		"\u04b7\7\u00bf\2\2\u04b7\u04b8\7\27\2\2\u04b8\u04bb\5\u00b8]\2\u04b9\u04ba"+
		"\7\u00b2\2\2\u04ba\u04bc\5\u00b8]\2\u04bb\u04b9\3\2\2\2\u04bb\u04bc\3"+
		"\2\2\2\u04bc\u008d\3\2\2\2\u04bd\u04be\7\u00b3\2\2\u04be\u04bf\7\26\2"+
		"\2\u04bf\u04c0\5\u00b4[\2\u04c0\u04c1\7\27\2\2\u04c1\u04c2\7\4\2\2\u04c2"+
		"\u04c3\5\u0090I\2\u04c3\u04c4\7\5\2\2\u04c4\u008f\3\2\2\2\u04c5\u04c7"+
		"\5\u0092J\2\u04c6\u04c5\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c6\3\2\2"+
		"\2\u04c8\u04c9\3\2\2\2\u04c9\u04d3\3\2\2\2\u04ca\u04cb\7K\2\2\u04cb\u04d1"+
		"\7\6\2\2\u04cc\u04cd\7\4\2\2\u04cd\u04ce\5\u00b8]\2\u04ce\u04cf\7\5\2"+
		"\2\u04cf\u04d2\3\2\2\2\u04d0\u04d2\5\u00ba^\2\u04d1\u04cc\3\2\2\2\u04d1"+
		"\u04d0\3\2\2\2\u04d2\u04d4\3\2\2\2\u04d3\u04ca\3\2\2\2\u04d3\u04d4\3\2"+
		"\2\2\u04d4\u0091\3\2\2\2\u04d5\u04d6\7=\2\2\u04d6\u04d7\5\u00b4[\2\u04d7"+
		"\u04d8\7\6\2\2\u04d8\u04dc\5\u00b8]\2\u04d9\u04db\7\24\2\2\u04da\u04d9"+
		"\3\2\2\2\u04db\u04de\3\2\2\2\u04dc\u04da\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd"+
		"\u0093\3\2\2\2\u04de\u04dc\3\2\2\2\u04df\u04e0\7\u00b6\2\2\u04e0\u04e1"+
		"\7\26\2\2\u04e1\u04e6\5\u00b4[\2\u04e2\u04e3\7\33\2\2\u04e3\u04e5\5\u00b4"+
		"[\2\u04e4\u04e2\3\2\2\2\u04e5\u04e8\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e6"+
		"\u04e7\3\2\2\2\u04e7\u04e9\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e9\u04ed\7\27"+
		"\2\2\u04ea\u04ec\7\24\2\2\u04eb\u04ea\3\2\2\2\u04ec\u04ef\3\2\2\2\u04ed"+
		"\u04eb\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u0095\3\2\2\2\u04ef\u04ed\3\2"+
		"\2\2\u04f0\u04f1\7\u00bf\2\2\u04f1\u04f2\7\26\2\2\u04f2\u04f3\7\u00bf"+
		"\2\2\u04f3\u04f4\7\30\2\2\u04f4\u04f5\7\u00ba\2\2\u04f5\u04f6\7\26\2\2"+
		"\u04f6\u04f7\7\u00bf\2\2\u04f7\u04f8\7\30\2\2\u04f8\u04f9\7\u00bf\2\2"+
		"\u04f9\u04fa\7\27\2\2\u04fa\u04fb\7\4\2\2\u04fb\u04fc\7\u00b7\2\2\u04fc"+
		"\u04fd\7\u00bf\2\2\u04fd\u04fe\t\r\2\2\u04fe\u04ff\7\u00bf\2\2\u04ff\u0500"+
		"\7\24\2\2\u0500\u0501\7\7\2\2\u0501\u0097\3\2\2\2\u0502\u0503\7\u00b9"+
		"\2\2\u0503\u0504\7\u00bf\2\2\u0504\u0507\7\b\2\2\u0505\u0506\7\31\2\2"+
		"\u0506\u0508\5\u009aN\2\u0507\u0505\3\2\2\2\u0507\u0508\3\2\2\2\u0508"+
		"\u050c\3\2\2\2\u0509\u050b\7\24\2\2\u050a\u0509\3\2\2\2\u050b\u050e\3"+
		"\2\2\2\u050c\u050a\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u0099\3\2\2\2\u050e"+
		"\u050c\3\2\2\2\u050f\u0512\7\4\2\2\u0510\u0513\5\u00b4[\2\u0511\u0513"+
		"\5\u009eP\2\u0512\u0510\3\2\2\2\u0512\u0511\3\2\2\2\u0513\u051b\3\2\2"+
		"\2\u0514\u0517\7\30\2\2\u0515\u0518\5\u00b4[\2\u0516\u0518\5\u009eP\2"+
		"\u0517\u0515\3\2\2\2\u0517\u0516\3\2\2\2\u0518\u051a\3\2\2\2\u0519\u0514"+
		"\3\2\2\2\u051a\u051d\3\2\2\2\u051b\u0519\3\2\2\2\u051b\u051c\3\2\2\2\u051c"+
		"\u051e\3\2\2\2\u051d\u051b\3\2\2\2\u051e\u051f\7\5\2\2\u051f\u009b\3\2"+
		"\2\2\u0520\u0521\7\u00bd\2\2\u0521\u0522\7\6\2\2\u0522\u0523\7\u00c1\2"+
		"\2\u0523\u0524\7\30\2\2\u0524\u0525\7\u00be\2\2\u0525\u0526\7\6\2\2\u0526"+
		"\u0527\7\t\2\2\u0527\u0528\5\u00b4[\2\u0528\u0529\7\t\2\2\u0529\u009d"+
		"\3\2\2\2\u052a\u0537\5\u009cO\2\u052b\u052c\7\30\2\2\u052c\u052d\7\u00bf"+
		"\2\2\u052d\u0533\7\6\2\2\u052e\u052f\7\4\2\2\u052f\u0530\5\u009eP\2\u0530"+
		"\u0531\7\5\2\2\u0531\u0534\3\2\2\2\u0532\u0534\5\u009aN\2\u0533\u052e"+
		"\3\2\2\2\u0533\u0532\3\2\2\2\u0534\u0536\3\2\2\2\u0535\u052b\3\2\2\2\u0536"+
		"\u0539\3\2\2\2\u0537\u0535\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u009f\3\2"+
		"\2\2\u0539\u0537\3\2\2\2\u053a\u053b\7\u00b8\2\2\u053b\u053c\7\u00bf\2"+
		"\2\u053c\u053d\7\31\2\2\u053d\u053f\7\4\2\2\u053e\u0540\5\u009eP\2\u053f"+
		"\u053e\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0542\7\5"+
		"\2\2\u0542\u00a1\3\2\2\2\u0543\u0546\7\u00bf\2\2\u0544\u0545\7\25\2\2"+
		"\u0545\u0547\7\u00bf\2\2\u0546\u0544\3\2\2\2\u0547\u0548\3\2\2\2\u0548"+
		"\u0546\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u00a3\3\2\2\2\u054a\u054d\7\u00bf"+
		"\2\2\u054b\u054c\7\25\2\2\u054c\u054e\7\u00bf\2\2\u054d\u054b\3\2\2\2"+
		"\u054e\u054f\3\2\2\2\u054f\u054d\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0551"+
		"\3\2\2\2\u0551\u0552\7\31\2\2\u0552\u0553\5\u00b4[\2\u0553\u00a5\3\2\2"+
		"\2\u0554\u0555\t\16\2\2\u0555\u00a7\3\2\2\2\u0556\u0557\7d\2\2\u0557\u0559"+
		"\7\26\2\2\u0558\u055a\5\u00b6\\\2\u0559\u0558\3\2\2\2\u055a\u055b\3\2"+
		"\2\2\u055b\u0559\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u055d\3\2\2\2\u055d"+
		"\u0563\7\27\2\2\u055e\u055f\7\4\2\2\u055f\u0560\5\u00b8]\2\u0560\u0561"+
		"\7\5\2\2\u0561\u0564\3\2\2\2\u0562\u0564\5\u00ba^\2\u0563\u055e\3\2\2"+
		"\2\u0563\u0562\3\2\2\2\u0564\u00a9\3\2\2\2\u0565\u0569\5\u00a8U\2\u0566"+
		"\u0568\5\u00acW\2\u0567\u0566\3\2\2\2\u0568\u056b\3\2\2\2\u0569\u0567"+
		"\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056d\3\2\2\2\u056b\u0569\3\2\2\2\u056c"+
		"\u056e\5\u00aeX\2\u056d\u056c\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u00ab"+
		"\3\2\2\2\u056f\u0570\7T\2\2\u0570\u0571\5\u00a8U\2\u0571\u00ad\3\2\2\2"+
		"\u0572\u0578\7T\2\2\u0573\u0574\7\4\2\2\u0574\u0575\5\u00b8]\2\u0575\u0576"+
		"\7\5\2\2\u0576\u0579\3\2\2\2\u0577\u0579\5\u00ba^\2\u0578\u0573\3\2\2"+
		"\2\u0578\u0577\3\2\2\2\u0579\u00af\3\2\2\2\u057a\u057b\5\u00c4c\2\u057b"+
		"\u057c\7\u00bf\2\2\u057c\u057d\7\31\2\2\u057d\u0581\5\u00b2Z\2\u057e\u0580"+
		"\7\24\2\2\u057f\u057e\3\2\2\2\u0580\u0583\3\2\2\2\u0581\u057f\3\2\2\2"+
		"\u0581\u0582\3\2\2\2\u0582\u00b1\3\2\2\2\u0583\u0581\3\2\2\2\u0584\u0586"+
		"\5\u00b6\\\2\u0585\u0584\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0585\3\2\2"+
		"\2\u0587\u0588\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u0593\7\n\2\2\u058a\u058b"+
		"\7\4\2\2\u058b\u058c\5\u00b8]\2\u058c\u058d\7\5\2\2\u058d\u0594\3\2\2"+
		"\2\u058e\u0594\5\u00ba^\2\u058f\u0590\7\26\2\2\u0590\u0591\5\u00b2Z\2"+
		"\u0591\u0592\7\27\2\2\u0592\u0594\3\2\2\2\u0593\u058a\3\2\2\2\u0593\u058e"+
		"\3\2\2\2\u0593\u058f\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u059f\7\6\2\2\u0596"+
		"\u0597\7\4\2\2\u0597\u0598\5\u00b8]\2\u0598\u0599\7\5\2\2\u0599\u05a0"+
		"\3\2\2\2\u059a\u05a0\5\u00ba^\2\u059b\u059c\7\26\2\2\u059c\u059d\5\u00b2"+
		"Z\2\u059d\u059e\7\27\2\2\u059e\u05a0\3\2\2\2\u059f\u0596\3\2\2\2\u059f"+
		"\u059a\3\2\2\2\u059f\u059b\3\2\2\2\u05a0\u00b3\3\2\2\2\u05a1\u05a3\b["+
		"\1\2\u05a2\u05a4\5\u00c4c\2\u05a3\u05a2\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4"+
		"\u05a5\3\2\2\2\u05a5\u05a7\7\u00bf\2\2\u05a6\u05a8\5\u00bc_\2\u05a7\u05a6"+
		"\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05aa\7\31\2\2"+
		"\u05aa\u05ae\5\u00b4[\2\u05ab\u05ad\7\24\2\2\u05ac\u05ab\3\2\2\2\u05ad"+
		"\u05b0\3\2\2\2\u05ae\u05ac\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u060a\3\2"+
		"\2\2\u05b0\u05ae\3\2\2\2\u05b1\u05b2\7\26\2\2\u05b2\u05b3\5\u00b4[\2\u05b3"+
		"\u05b7\7\27\2\2\u05b4\u05b6\7\24\2\2\u05b5\u05b4\3\2\2\2\u05b6\u05b9\3"+
		"\2\2\2\u05b7\u05b5\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u060a\3\2\2\2\u05b9"+
		"\u05b7\3\2\2\2\u05ba\u05bb\5\u00be`\2\u05bb\u05c1\7\u00bf\2\2\u05bc\u05bf"+
		"\7\31\2\2\u05bd\u05c0\5\u00b4[\2\u05be\u05c0\7\u00bf\2\2\u05bf\u05bd\3"+
		"\2\2\2\u05bf\u05be\3\2\2\2\u05c0\u05c2\3\2\2\2\u05c1\u05bc\3\2\2\2\u05c1"+
		"\u05c2\3\2\2\2\u05c2\u05c6\3\2\2\2\u05c3\u05c5\7\24\2\2\u05c4\u05c3\3"+
		"\2\2\2\u05c5\u05c8\3\2\2\2\u05c6\u05c4\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7"+
		"\u060a\3\2\2\2\u05c8\u05c6\3\2\2\2\u05c9\u05ca\7\u00bf\2\2\u05ca\u05d0"+
		"\5\u00be`\2\u05cb\u05ce\7\31\2\2\u05cc\u05cf\5\u00b4[\2\u05cd\u05cf\7"+
		"\u00bf\2\2\u05ce\u05cc\3\2\2\2\u05ce\u05cd\3\2\2\2\u05cf\u05d1\3\2\2\2"+
		"\u05d0\u05cb\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d5\3\2\2\2\u05d2\u05d4"+
		"\7\24\2\2\u05d3\u05d2\3\2\2\2\u05d4\u05d7\3\2\2\2\u05d5\u05d3\3\2\2\2"+
		"\u05d5\u05d6\3\2\2\2\u05d6\u060a\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d8\u05dc"+
		"\5|?\2\u05d9\u05db\7\24\2\2\u05da\u05d9\3\2\2\2\u05db\u05de\3\2\2\2\u05dc"+
		"\u05da\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u060a\3\2\2\2\u05de\u05dc\3\2"+
		"\2\2\u05df\u05e3\5\u00a2R\2\u05e0\u05e2\7\24\2\2\u05e1\u05e0\3\2\2\2\u05e2"+
		"\u05e5\3\2\2\2\u05e3\u05e1\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u060a\3\2"+
		"\2\2\u05e5\u05e3\3\2\2\2\u05e6\u05ea\7\u00bf\2\2\u05e7\u05e9\7\24\2\2"+
		"\u05e8\u05e7\3\2\2\2\u05e9\u05ec\3\2\2\2\u05ea\u05e8\3\2\2\2\u05ea\u05eb"+
		"\3\2\2\2\u05eb\u060a\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ed\u05f1\7\u00c1\2"+
		"\2\u05ee\u05f0\7\24\2\2\u05ef\u05ee\3\2\2\2\u05f0\u05f3\3\2\2\2\u05f1"+
		"\u05ef\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u060a\3\2\2\2\u05f3\u05f1\3\2"+
		"\2\2\u05f4\u05f8\7\t\2\2\u05f5\u05f7\5\u00a6T\2\u05f6\u05f5\3\2\2\2\u05f7"+
		"\u05fa\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05fb\3\2"+
		"\2\2\u05fa\u05f8\3\2\2\2\u05fb\u05ff\7\t\2\2\u05fc\u05fe\7\24\2\2\u05fd"+
		"\u05fc\3\2\2\2\u05fe\u0601\3\2\2\2\u05ff\u05fd\3\2\2\2\u05ff\u0600\3\2"+
		"\2\2\u0600\u060a\3\2\2\2\u0601\u05ff\3\2\2\2\u0602\u0606\7}\2\2\u0603"+
		"\u0605\7\24\2\2\u0604\u0603\3\2\2\2\u0605\u0608\3\2\2\2\u0606\u0604\3"+
		"\2\2\2\u0606\u0607\3\2\2\2\u0607\u060a\3\2\2\2\u0608\u0606\3\2\2\2\u0609"+
		"\u05a1\3\2\2\2\u0609\u05b1\3\2\2\2\u0609\u05ba\3\2\2\2\u0609\u05c9\3\2"+
		"\2\2\u0609\u05d8\3\2\2\2\u0609\u05df\3\2\2\2\u0609\u05e6\3\2\2\2\u0609"+
		"\u05ed\3\2\2\2\u0609\u05f4\3\2\2\2\u0609\u0602\3\2\2\2\u060a\u0628\3\2"+
		"\2\2\u060b\u060c\f\r\2\2\u060c\u060d\7\32\2\2\u060d\u0611\5\u00b4[\2\u060e"+
		"\u0610\7\24\2\2\u060f\u060e\3\2\2\2\u0610\u0613\3\2\2\2\u0611\u060f\3"+
		"\2\2\2\u0611\u0612\3\2\2\2\u0612\u0627\3\2\2\2\u0613\u0611\3\2\2\2\u0614"+
		"\u0615\f\f\2\2\u0615\u0616\7\37\2\2\u0616\u061a\5\u00b4[\2\u0617\u0619"+
		"\7\24\2\2\u0618\u0617\3\2\2\2\u0619\u061c\3\2\2\2\u061a\u0618\3\2\2\2"+
		"\u061a\u061b\3\2\2\2\u061b\u0627\3\2\2\2\u061c\u061a\3\2\2\2\u061d\u061e"+
		"\f\13\2\2\u061e\u061f\5\u00bc_\2\u061f\u0623\5\u00b4[\2\u0620\u0622\7"+
		"\24\2\2\u0621\u0620\3\2\2\2\u0622\u0625\3\2\2\2\u0623\u0621\3\2\2\2\u0623"+
		"\u0624\3\2\2\2\u0624\u0627\3\2\2\2\u0625\u0623\3\2\2\2\u0626\u060b\3\2"+
		"\2\2\u0626\u0614\3\2\2\2\u0626\u061d\3\2\2\2\u0627\u062a\3\2\2\2\u0628"+
		"\u0626\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u00b5\3\2\2\2\u062a\u0628\3\2"+
		"\2\2\u062b\u062c\b\\\1\2\u062c\u062d\5\u00b4[\2\u062d\u062e\t\17\2\2\u062e"+
		"\u062f\5\u00b4[\2\u062f\u063d\3\2\2\2\u0630\u063d\7\u00bf\2\2\u0631\u063d"+
		"\5|?\2\u0632\u0636\5\u00b4[\2\u0633\u0634\t\20\2\2\u0634\u0637\7}\2\2"+
		"\u0635\u0637\7q\2\2\u0636\u0633\3\2\2\2\u0636\u0635\3\2\2\2\u0637\u063d"+
		"\3\2\2\2\u0638\u0639\7\26\2\2\u0639\u063a\5\u00b6\\\2\u063a\u063b\7\27"+
		"\2\2\u063b\u063d\3\2\2\2\u063c\u062b\3\2\2\2\u063c\u0630\3\2\2\2\u063c"+
		"\u0631\3\2\2\2\u063c\u0632\3\2\2\2\u063c\u0638\3\2\2\2\u063d\u0643\3\2"+
		"\2\2\u063e\u063f\f\4\2\2\u063f\u0640\t\21\2\2\u0640\u0642\5\u00b6\\\5"+
		"\u0641\u063e\3\2\2\2\u0642\u0645\3\2\2\2\u0643\u0641\3\2\2\2\u0643\u0644"+
		"\3\2\2\2\u0644\u00b7\3\2\2\2\u0645\u0643\3\2\2\2\u0646\u0659\5~@\2\u0647"+
		"\u0659\5\u00b4[\2\u0648\u0659\5\u0088E\2\u0649\u0659\5\u00aaV\2\u064a"+
		"\u0659\5\u00b0Y\2\u064b\u0659\5\u008cG\2\u064c\u0659\5\u008eH\2\u064d"+
		"\u0659\5\u0094K\2\u064e\u0659\5\u0096L\2\u064f\u0659\5\u0098M\2\u0650"+
		"\u0659\5\u00a0Q\2\u0651\u0659\5\u00a4S\2\u0652\u0659\5\u008aF\2\u0653"+
		"\u0654\7\4\2\2\u0654\u0655\5\u00b8]\2\u0655\u0656\7\5\2\2\u0656\u0659"+
		"\3\2\2\2\u0657\u0659\5\u00c2b\2\u0658\u0646\3\2\2\2\u0658\u0647\3\2\2"+
		"\2\u0658\u0648\3\2\2\2\u0658\u0649\3\2\2\2\u0658\u064a\3\2\2\2\u0658\u064b"+
		"\3\2\2\2\u0658\u064c\3\2\2\2\u0658\u064d\3\2\2\2\u0658\u064e\3\2\2\2\u0658"+
		"\u064f\3\2\2\2\u0658\u0650\3\2\2\2\u0658\u0651\3\2\2\2\u0658\u0652\3\2"+
		"\2\2\u0658\u0653\3\2\2\2\u0658\u0657\3\2\2\2\u0659\u065c\3\2\2\2\u065a"+
		"\u0658\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u00b9\3\2\2\2\u065c\u065a\3\2"+
		"\2\2\u065d\u066c\5~@\2\u065e\u066c\5\u00b4[\2\u065f\u066c\5\u0088E\2\u0660"+
		"\u066c\5\u00aaV\2\u0661\u066c\5\u00b0Y\2\u0662\u066c\5\u008cG\2\u0663"+
		"\u066c\5\u008eH\2\u0664\u066c\5\u0094K\2\u0665\u066c\5\u0098M\2\u0666"+
		"\u066c\5\u0096L\2\u0667\u066c\5\u00a0Q\2\u0668\u066c\5\u008aF\2\u0669"+
		"\u066c\5\u00a4S\2\u066a\u066c\5\u00c2b\2\u066b\u065d\3\2\2\2\u066b\u065e"+
		"\3\2\2\2\u066b\u065f\3\2\2\2\u066b\u0660\3\2\2\2\u066b\u0661\3\2\2\2\u066b"+
		"\u0662\3\2\2\2\u066b\u0663\3\2\2\2\u066b\u0664\3\2\2\2\u066b\u0665\3\2"+
		"\2\2\u066b\u0666\3\2\2\2\u066b\u0667\3\2\2\2\u066b\u0668\3\2\2\2\u066b"+
		"\u0669\3\2\2\2\u066b\u066a\3\2\2\2\u066c\u00bb\3\2\2\2\u066d\u066e\t\22"+
		"\2\2\u066e\u00bd\3\2\2\2\u066f\u0670\7\33\2\2\u0670\u0674\7\33\2\2\u0671"+
		"\u0672\7\34\2\2\u0672\u0674\7\34\2\2\u0673\u066f\3\2\2\2\u0673\u0671\3"+
		"\2\2\2\u0674\u00bf\3\2\2\2\u0675\u0678\7\u00bf\2\2\u0676\u0677\7\31\2"+
		"\2\u0677\u0679\5\u00b4[\2\u0678\u0676\3\2\2\2\u0678\u0679\3\2\2\2\u0679"+
		"\u00c1\3\2\2\2\u067a\u067e\7\u00b4\2\2\u067b\u067d\7\24\2\2\u067c\u067b"+
		"\3\2\2\2\u067d\u0680\3\2\2\2\u067e\u067c\3\2\2\2\u067e\u067f\3\2\2\2\u067f"+
		"\u00c3\3\2\2\2\u0680\u067e\3\2\2\2\u0681\u0682\t\23\2\2\u0682\u00c5\3"+
		"\2\2\2\u0683\u068a\7\u00bf\2\2\u0684\u068a\7\u00c2\2\2\u0685\u0686\7\26"+
		"\2\2\u0686\u0687\5\u00c6d\2\u0687\u0688\7\27\2\2\u0688\u068a\3\2\2\2\u0689"+
		"\u0683\3\2\2\2\u0689\u0684\3\2\2\2\u0689\u0685\3\2\2\2\u068a\u00c7\3\2"+
		"\2\2\u00d4\u00ca\u00cc\u00d4\u00db\u00e0\u00e6\u00f0\u00f7\u0101\u0104"+
		"\u0113\u0118\u0121\u0123\u012a\u0131\u0137\u013c\u0148\u014b\u0151\u0153"+
		"\u015a\u0163\u0168\u0171\u017c\u0183\u0189\u0193\u0196\u019c\u019e\u01a2"+
		"\u01a9\u01b2\u01b6\u01b8\u01bc\u01c5\u01ca\u01cc\u01d5\u01e0\u01e7\u01ea"+
		"\u01f9\u01fe\u0203\u0205\u020c\u0213\u0218\u021c\u0220\u022f\u0234\u0237"+
		"\u024c\u0252\u0254\u0258\u025f\u0264\u026d\u0274\u0278\u0281\u029f\u02a8"+
		"\u02aa\u02b1\u02ba\u02bf\u02cb\u02cf\u02d3\u02d7\u02de\u02e1\u02e3\u02ea"+
		"\u02ed\u02f1\u02fc\u0306\u0313\u031b\u031e\u0326\u032d\u0335\u033f\u0347"+
		"\u034b\u0354\u0357\u0359\u035e\u0362\u0365\u036c\u0374\u0378\u037c\u037f"+
		"\u0385\u0388\u038a\u0393\u0399\u039c\u039f\u03a3\u03a7\u03ae\u03b7\u03bb"+
		"\u03bd\u03c1\u03ca\u03cf\u03d1\u03da\u03e5\u03ec\u03ef\u03f2\u03f6\u0419"+
		"\u0420\u042a\u0430\u0437\u043c\u043f\u0444\u0448\u0453\u0459\u0461\u0469"+
		"\u0471\u0478\u0484\u0487\u0491\u049f\u04a5\u04aa\u04ac\u04bb\u04c8\u04d1"+
		"\u04d3\u04dc\u04e6\u04ed\u0507\u050c\u0512\u0517\u051b\u0533\u0537\u053f"+
		"\u0548\u054f\u055b\u0563\u0569\u056d\u0578\u0581\u0587\u0593\u059f\u05a3"+
		"\u05a7\u05ae\u05b7\u05bf\u05c1\u05c6\u05ce\u05d0\u05d5\u05dc\u05e3\u05ea"+
		"\u05f1\u05f8\u05ff\u0606\u0609\u0611\u061a\u0623\u0626\u0628\u0636\u063c"+
		"\u0643\u0658\u065a\u066b\u0673\u0678\u067e\u0689";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}