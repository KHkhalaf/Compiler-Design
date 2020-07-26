package generated;// Generated from C:/Users/hp/Documents/Intellij Projects/Compiler/src\SQL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SQLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SQLParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add(SQLParser.Alter_table_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add(SQLParser.Alter_table_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_type_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type_stmt(SQLParser.Create_type_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_type_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type_stmt(SQLParser.Create_type_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_aggregation_fun}.
	 * @param ctx the parse tree
	 */
	void enterCreate_aggregation_fun(SQLParser.Create_aggregation_funContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_aggregation_fun}.
	 * @param ctx the parse tree
	 */
	void exitCreate_aggregation_fun(SQLParser.Create_aggregation_funContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#arrayParams}.
	 * @param ctx the parse tree
	 */
	void enterArrayParams(SQLParser.ArrayParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#arrayParams}.
	 * @param ctx the parse tree
	 */
	void exitArrayParams(SQLParser.ArrayParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(SQLParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(SQLParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(SQLParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(SQLParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(SQLParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(SQLParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#jarPath}.
	 * @param ctx the parse tree
	 */
	void enterJarPath(SQLParser.JarPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#jarPath}.
	 * @param ctx the parse tree
	 */
	void exitJarPath(SQLParser.JarPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SQLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SQLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(SQLParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(SQLParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(SQLParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(SQLParser.Select_or_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(SQLParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(SQLParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default_value(SQLParser.Column_default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default_value(SQLParser.Column_default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SQLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SQLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(SQLParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(SQLParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functionExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpr(SQLParser.FunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functionExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpr(SQLParser.FunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(SQLParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(SQLParser.Join_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(SQLParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(SQLParser.Select_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SQLParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SQLParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void enterSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void exitSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_type_name}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type_name(SQLParser.Create_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_type_name}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type_name(SQLParser.Create_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#statements_of_code_list}.
	 * @param ctx the parse tree
	 */
	void enterStatements_of_code_list(SQLParser.Statements_of_code_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#statements_of_code_list}.
	 * @param ctx the parse tree
	 */
	void exitStatements_of_code_list(SQLParser.Statements_of_code_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#statements_of_code}.
	 * @param ctx the parse tree
	 */
	void enterStatements_of_code(SQLParser.Statements_of_codeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#statements_of_code}.
	 * @param ctx the parse tree
	 */
	void exitStatements_of_code(SQLParser.Statements_of_codeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#def_function}.
	 * @param ctx the parse tree
	 */
	void enterDef_function(SQLParser.Def_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#def_function}.
	 * @param ctx the parse tree
	 */
	void exitDef_function(SQLParser.Def_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#listOfParameters}.
	 * @param ctx the parse tree
	 */
	void enterListOfParameters(SQLParser.ListOfParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#listOfParameters}.
	 * @param ctx the parse tree
	 */
	void exitListOfParameters(SQLParser.ListOfParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SQLParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SQLParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#prototype_func}.
	 * @param ctx the parse tree
	 */
	void enterPrototype_func(SQLParser.Prototype_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#prototype_func}.
	 * @param ctx the parse tree
	 */
	void exitPrototype_func(SQLParser.Prototype_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#prototype_func_parameters}.
	 * @param ctx the parse tree
	 */
	void enterPrototype_func_parameters(SQLParser.Prototype_func_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#prototype_func_parameters}.
	 * @param ctx the parse tree
	 */
	void exitPrototype_func_parameters(SQLParser.Prototype_func_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#def_var_core}.
	 * @param ctx the parse tree
	 */
	void enterDef_var_core(SQLParser.Def_var_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#def_var_core}.
	 * @param ctx the parse tree
	 */
	void exitDef_var_core(SQLParser.Def_var_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#while_repeat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_repeat(SQLParser.While_repeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#while_repeat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_repeat(SQLParser.While_repeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(SQLParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(SQLParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#for_repeat}.
	 * @param ctx the parse tree
	 */
	void enterFor_repeat(SQLParser.For_repeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#for_repeat}.
	 * @param ctx the parse tree
	 */
	void exitFor_repeat(SQLParser.For_repeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreach}.
	 * @param ctx the parse tree
	 */
	void enterForeach(SQLParser.ForeachContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreach}.
	 * @param ctx the parse tree
	 */
	void exitForeach(SQLParser.ForeachContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(SQLParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(SQLParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#return_value}.
	 * @param ctx the parse tree
	 */
	void enterReturn_value(SQLParser.Return_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#return_value}.
	 * @param ctx the parse tree
	 */
	void exitReturn_value(SQLParser.Return_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#try_catch}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch(SQLParser.Try_catchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#try_catch}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch(SQLParser.Try_catchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#try_Statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_Statement(SQLParser.Try_StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#try_Statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_Statement(SQLParser.Try_StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#catch_Statement}.
	 * @param ctx the parse tree
	 */
	void enterCatch_Statement(SQLParser.Catch_StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#catch_Statement}.
	 * @param ctx the parse tree
	 */
	void exitCatch_Statement(SQLParser.Catch_StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case(SQLParser.Switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case(SQLParser.Switch_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#switch_body}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_body(SQLParser.Switch_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#switch_body}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_body(SQLParser.Switch_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCases(SQLParser.CasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCases(SQLParser.CasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#default_statement}.
	 * @param ctx the parse tree
	 */
	void enterDefault_statement(SQLParser.Default_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#default_statement}.
	 * @param ctx the parse tree
	 */
	void exitDefault_statement(SQLParser.Default_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#print_func}.
	 * @param ctx the parse tree
	 */
	void enterPrint_func(SQLParser.Print_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#print_func}.
	 * @param ctx the parse tree
	 */
	void exitPrint_func(SQLParser.Print_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sort_func_def}.
	 * @param ctx the parse tree
	 */
	void enterSort_func_def(SQLParser.Sort_func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sort_func_def}.
	 * @param ctx the parse tree
	 */
	void exitSort_func_def(SQLParser.Sort_func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_def}.
	 * @param ctx the parse tree
	 */
	void enterArray_def(SQLParser.Array_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_def}.
	 * @param ctx the parse tree
	 */
	void exitArray_def(SQLParser.Array_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#bodyArray}.
	 * @param ctx the parse tree
	 */
	void enterBodyArray(SQLParser.BodyArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#bodyArray}.
	 * @param ctx the parse tree
	 */
	void exitBodyArray(SQLParser.BodyArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#arr_setValue}.
	 * @param ctx the parse tree
	 */
	void enterArr_setValue(SQLParser.Arr_setValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#arr_setValue}.
	 * @param ctx the parse tree
	 */
	void exitArr_setValue(SQLParser.Arr_setValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#arr_getValue}.
	 * @param ctx the parse tree
	 */
	void enterArr_getValue(SQLParser.Arr_getValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#arr_getValue}.
	 * @param ctx the parse tree
	 */
	void exitArr_getValue(SQLParser.Arr_getValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#key_value}.
	 * @param ctx the parse tree
	 */
	void enterKey_value(SQLParser.Key_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#key_value}.
	 * @param ctx the parse tree
	 */
	void exitKey_value(SQLParser.Key_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#body_for_json}.
	 * @param ctx the parse tree
	 */
	void enterBody_for_json(SQLParser.Body_for_jsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#body_for_json}.
	 * @param ctx the parse tree
	 */
	void exitBody_for_json(SQLParser.Body_for_jsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#obj_json}.
	 * @param ctx the parse tree
	 */
	void enterObj_json(SQLParser.Obj_jsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#obj_json}.
	 * @param ctx the parse tree
	 */
	void exitObj_json(SQLParser.Obj_jsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#read_obj_json}.
	 * @param ctx the parse tree
	 */
	void enterRead_obj_json(SQLParser.Read_obj_jsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#read_obj_json}.
	 * @param ctx the parse tree
	 */
	void exitRead_obj_json(SQLParser.Read_obj_jsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#write_obj_json}.
	 * @param ctx the parse tree
	 */
	void enterWrite_obj_json(SQLParser.Write_obj_jsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#write_obj_json}.
	 * @param ctx the parse tree
	 */
	void exitWrite_obj_json(SQLParser.Write_obj_jsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(SQLParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(SQLParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#if_statement_core}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement_core(SQLParser.If_statement_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if_statement_core}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement_core(SQLParser.If_statement_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(SQLParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(SQLParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#else_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_statement(SQLParser.Else_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#else_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_statement(SQLParser.Else_if_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(SQLParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(SQLParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#if_statement_one_line}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement_one_line(SQLParser.If_statement_one_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if_statement_one_line}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement_one_line(SQLParser.If_statement_one_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#body_onelineCond}.
	 * @param ctx the parse tree
	 */
	void enterBody_onelineCond(SQLParser.Body_onelineCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#body_onelineCond}.
	 * @param ctx the parse tree
	 */
	void exitBody_onelineCond(SQLParser.Body_onelineCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(SQLParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(SQLParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#numbers}.
	 * @param ctx the parse tree
	 */
	void enterNumbers(SQLParser.NumbersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#numbers}.
	 * @param ctx the parse tree
	 */
	void exitNumbers(SQLParser.NumbersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(SQLParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(SQLParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(SQLParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(SQLParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#comments}.
	 * @param ctx the parse tree
	 */
	void enterComments(SQLParser.CommentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#comments}.
	 * @param ctx the parse tree
	 */
	void exitComments(SQLParser.CommentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#def_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterDef_stmt_list(SQLParser.Def_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#def_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitDef_stmt_list(SQLParser.Def_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#def_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDef_stmt(SQLParser.Def_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#def_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDef_stmt(SQLParser.Def_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(SQLParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(SQLParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#op_double}.
	 * @param ctx the parse tree
	 */
	void enterOp_double(SQLParser.Op_doubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#op_double}.
	 * @param ctx the parse tree
	 */
	void exitOp_double(SQLParser.Op_doubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#def_var}.
	 * @param ctx the parse tree
	 */
	void enterDef_var(SQLParser.Def_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#def_var}.
	 * @param ctx the parse tree
	 */
	void exitDef_var(SQLParser.Def_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#breakKeyWord}.
	 * @param ctx the parse tree
	 */
	void enterBreakKeyWord(SQLParser.BreakKeyWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#breakKeyWord}.
	 * @param ctx the parse tree
	 */
	void exitBreakKeyWord(SQLParser.BreakKeyWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#keyword_def}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_def(SQLParser.Keyword_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#keyword_def}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_def(SQLParser.Keyword_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(SQLParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(SQLParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(SQLParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(SQLParser.Any_nameContext ctx);
}