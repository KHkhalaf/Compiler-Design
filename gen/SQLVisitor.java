// Generated from C:/Users/hp/Documents/Intellij Projects/Compiler/src\SQL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SQLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add(SQLParser.Alter_table_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_or_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_values(SQLParser.Select_or_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(SQLParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default_value(SQLParser.Column_default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SQLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(SQLParser.Join_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(SQLParser.Select_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SQLParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#statements_of_code_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements_of_code_list(SQLParser.Statements_of_code_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#statements_of_code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements_of_code(SQLParser.Statements_of_codeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#def_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_function(SQLParser.Def_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#listOfParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfParameters(SQLParser.ListOfParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(SQLParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#prototype_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrototype_func(SQLParser.Prototype_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#def_var_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_var_core(SQLParser.Def_var_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#while_repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_repeat(SQLParser.While_repeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(SQLParser.Do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#for_repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_repeat(SQLParser.For_repeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach(SQLParser.ForeachContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(SQLParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#return_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_value(SQLParser.Return_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#try_catch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_catch(SQLParser.Try_catchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_case(SQLParser.Switch_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#switch_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_body(SQLParser.Switch_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCases(SQLParser.CasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#print_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_func(SQLParser.Print_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sort_func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_func_def(SQLParser.Sort_func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_def(SQLParser.Array_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#bodyArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyArray(SQLParser.BodyArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#key_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_value(SQLParser.Key_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#body_for_json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_for_json(SQLParser.Body_for_jsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#obj_json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj_json(SQLParser.Obj_jsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#read_obj_json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_obj_json(SQLParser.Read_obj_jsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#write_obj_json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_obj_json(SQLParser.Write_obj_jsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(SQLParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_statement_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement_core(SQLParser.If_statement_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(SQLParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#else_if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if_statement(SQLParser.Else_if_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(SQLParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_statement_one_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement_one_line(SQLParser.If_statement_one_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#body_onelineCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_onelineCond(SQLParser.Body_onelineCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(SQLParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(SQLParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#def_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_stmt_list(SQLParser.Def_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#def_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_stmt(SQLParser.Def_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(SQLParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#op_double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_double(SQLParser.Op_doubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#def_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_var(SQLParser.Def_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#breakKeyWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakKeyWord(SQLParser.BreakKeyWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#keyword_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword_def(SQLParser.Keyword_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(SQLParser.Any_nameContext ctx);
}