package Java.Base;

import Java.AST.JavaFunction.*;
import Java.AST.Node;
import Java.AST.Parse;
import Java.AST.QueryStmt.*;
import Java.AST.TableConstraint.*;
import Java.Main;
import Java.SymbolTable.Scope;
import Java.SymbolTable.Symbol;
import Java.SymbolTable.SymbolTable;
import Java.SymbolTable.Type;
import generated.SQLBaseVisitor;
import generated.SQLParser;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import javafx.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BaseVisitor extends SQLBaseVisitor {

    @Override public  Parse visitParse(SQLParser.ParseContext ctx) {
        Parse p = new Parse();


        List<Statement> sqlStmts = new ArrayList<>();
        List<FunctionDeclaration> functionDeclarations = new ArrayList<>();
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.Sql_stmt_listContext){
                List<Statement> sqlStmt = visitSql_stmt_list((SQLParser.Sql_stmt_listContext)ctx.children.get(i));
                sqlStmts.addAll(sqlStmt);
            }
            else if(ctx.children.get(i) instanceof SQLParser.Statements_of_code_listContext){
                List<FunctionDeclaration> functionDeclarationList = visitStatements_of_code_list(
                        (SQLParser.Statements_of_code_listContext)ctx.children.get(i));
                functionDeclarations.addAll(functionDeclarationList);
            }
        }
        p.setSqlStmts(sqlStmts);
        p.setFunctions(functionDeclarations);

        p.setLine(ctx.getStart().getLine());               //get line number
        p.setCol(ctx.getStart().getCharPositionInLine()); // get col number

        return p;
    }
    @Override public List<Statement> visitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx) {

        List<Statement> sqlStmt = new ArrayList<Statement>();
        for (int i =0; i < ctx.sql_stmt().size() ; i++){
            sqlStmt.add(visitSql_stmt(ctx.sql_stmt(i)));
        }

        return sqlStmt;
    }

    @Override public Statement visitSql_stmt(SQLParser.Sql_stmtContext ctx) {
        Statement statement = new Statement();
        if(ctx.drop_table_stmt()!=null){
            statement.setName("DropTable");
            statement = visitDrop_table_stmt(ctx.drop_table_stmt());
        }
        else if(ctx.create_table_stmt()!=null){
            statement.setName("CreateTable");
            statement = visitCreate_table_stmt(ctx.create_table_stmt());
            Main.symbolTable.Selectstatments.add(statement);
        }
        else if(ctx.create_type_stmt()!=null){
            statement.setName("CreateType");
            statement = visitCreate_type_stmt(ctx.create_type_stmt());
            Main.symbolTable.Selectstatments.add(statement);
        }
        else if(ctx.create_aggregation_fun()!=null){
            statement.setName("CreateAggregationFun");
            statement = visitCreate_aggregation_fun(ctx.create_aggregation_fun());
        }
        else if(ctx.factored_select_stmt() != null){
            statement.setName("Factored_select_stmt");
            statement = visitFactored_select_stmt(ctx.factored_select_stmt());
        }
        else if(ctx.delete_stmt() != null){
            statement.setName("DeleteStmt");
            statement = visitDelete_stmt(ctx.delete_stmt());
        }
        else if(ctx.alter_table_stmt() != null){
            statement.setName("AlterTable");
            statement = visitAlter_table_stmt(ctx.alter_table_stmt());
        }
        else if(ctx.insert_stmt() != null){
            statement.setName("InsertStmt");
            statement = visitInsert_stmt(ctx.insert_stmt());
        }
        else if(ctx.insert_stmt() != null){
            statement.setName("InsertBySelectStmt");
            statement = visitInsert_stmt(ctx.insert_stmt());
        }
        else if(ctx.update_stmt() != null){
            statement.setName("Update_stmt");
            statement = visitUpdate_stmt(ctx.update_stmt());
        }
        else if(ctx.comments() != null){
            statement.setName("comments");
            return statement;
        }
       return statement;
    }

    @Override
    public UpdateTable visitUpdate_stmt(SQLParser.Update_stmtContext ctx) {
        UpdateTable updateTable = new UpdateTable();
        updateTable.TableName = visitQualified_table_name((SQLParser.Qualified_table_nameContext)ctx.children.get(1));
        col_exprForUpdateStst col_expr = new col_exprForUpdateStst();
        for(int i=3;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.Column_nameContext)
                col_expr.ColumnName = visitColumn_name((SQLParser.Column_nameContext)ctx.children.get(i));
            else if(ctx.children.get(i) instanceof SQLParser.ExprContext)
                col_expr.expression = GetExpression((SQLParser.ExprContext)ctx.children.get(i));
            else if(ctx.children.get(i).toString().equals(",")){
                updateTable.col_Exprs.add(col_expr);
                col_expr = new col_exprForUpdateStst();
            }
            else if(ctx.children.get(i).toString().toLowerCase().equals("where"))
                break;
        }
        if(col_expr.expression != null)
            updateTable.col_Exprs.add(col_expr);
        updateTable.exprSQL = visitExpr((SQLParser.ExprContext)ctx.children.get(ctx.children.size()-1));
        return updateTable;
    }

    @Override
    public Statement visitInsert_stmt(SQLParser.Insert_stmtContext ctx) {
        InsertStmt insertStmt = new InsertStmt();
        if(ctx.database_name()!=null)
            insertStmt.TableName +=  visitDatabase_name(ctx.database_name())+".";
        if(ctx.table_name()!=null)
            insertStmt.TableName +=  ctx.table_name().any_name().getText();
        int indexValues=0;
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.Column_nameContext){
                insertStmt.Columns.add(visitColumn_name((SQLParser.Column_nameContext)ctx.children.get(i)));
            }
            else if(ctx.children.get(i).toString().toLowerCase().equals("values")){
                indexValues = i;
                break;
            }
        }
        if(ctx.select_stmt() != null){
            insertStmt.selectStmt = visitSelect_stmt(ctx.select_stmt());
            return insertStmt;
        }
        Row row = new Row();
        for(int i=indexValues;i<ctx.children.size();i++){
            if(ctx.children.get(i).toString().equals("(") && row.Rows.size() > 0){
                insertStmt.Values.add(row);
                row=new Row();
            }
            if(ctx.children.get(i)instanceof SQLParser.ExprContext)
                row.Rows.add(GetExpression((SQLParser.ExprContext)ctx.children.get(i)));
        }
        if(row.Rows.size() > 0)
        insertStmt.Values.add(row);

        return insertStmt;
    }

    public Expression GetExpression(SQLParser.ExprContext ctx){

        Expression expression = new Expression();
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.ExprContext) {
                if(i==0 || i==1)
                    expression.expressionLeft = GetExpression((SQLParser.ExprContext) ctx.children.get(i));
                else if(i==2)
                    expression.expressionRight = GetExpression((SQLParser.ExprContext) ctx.children.get(i));
            }
            else if(ctx.children.get(i) instanceof SQLParser.Literal_valueContext)
                expression.Variables.add(visitLiteral_value((SQLParser.Literal_valueContext)ctx.children.get(i)));
            else if(ctx.children.get(i) instanceof SQLParser.Function_nameContext){
                expression = GetExpressionByFunction(ctx);
            }
            else if(ctx.children.get(i) instanceof SQLParser.Column_nameContext)
                expression.Variables.add(visitColumn_name((SQLParser.Column_nameContext)ctx.children.get(i)));
            else if(ctx.children.get(i).toString().equals("*") || ctx.children.get(i).toString().equals("/")
                  ||ctx.children.get(i).toString().equals("-") || ctx.children.get(i).toString().equals("+"))
                        expression.Operation = ctx.children.get(i).toString();
        }
        return expression;
    }
    public Expression GetExpressionByFunction(SQLParser.ExprContext ctx){
        Expression expression = new Expression();
        expression.setName("ProtoType");
        expression.Variables.add(visitFunction_name((SQLParser.Function_nameContext)ctx.children.get(0))+";");
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.ExprContext)
                expression.Variables.add(
                  visitColumn_name((SQLParser.Column_nameContext)((SQLParser.ExprContext)ctx.children.get(i)).children.get(0))+";");
        }
        return expression;
    }
    @Override
    public String visitFunction_name(SQLParser.Function_nameContext ctx) {
        return ctx.any_name().IDENTIFIER().getText();
    }

    @Override
    public AlterTable visitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx) {
        AlterTable alterTable = new AlterTable();
        if(ctx.database_name()!=null)
            alterTable.TableName +=  visitDatabase_name(ctx.database_name())+".";
        if(ctx.source_table_name()!=null)
            alterTable.TableName +=  ctx.source_table_name().any_name().getText();

        if(ctx.K_RENAME()!=null){
            alterTable.TypeAlter="Rename";
            alterTable.renameTable.newTableName = ctx.new_table_name().any_name().getText();
        }
        else if(ctx.K_ADD()!=null && ctx.K_COLUMN()!=null){
            alterTable.TypeAlter="AddColumn";
            int size = ctx.children.size();
            alterTable.addColumn.columnDefinition = visitColumn_def((SQLParser.Column_defContext)ctx.children.get(size-1));
        }
        else if(ctx.alter_table_add() != null){
            visitAlter_table_add(ctx.alter_table_add());
            alterTable.alterTable_add = visitAlter_table_add(ctx.alter_table_add());;
        }
        return alterTable;
    }

    @Override
    public AlterTable_add visitAlter_table_add(SQLParser.Alter_table_addContext ctx) {
        AlterTable_add alterTable_add = new AlterTable_add();
        alterTable_add.tableConstraint = visitTable_constraint(ctx.table_constraint());
        return alterTable_add;
    }

    @Override
    public TableConstraint visitTable_constraint(SQLParser.Table_constraintContext ctx) {
        TableConstraint tableConstraint = new TableConstraint();
        if(ctx.name() != null)
            tableConstraint.name = ctx.name().any_name().getText();

        if(ctx.table_constraint_primary_key() != null){
            tableConstraint.type = "primary";
            tableConstraint.tableConstraint = visitTable_constraint_primary_key(ctx.table_constraint_primary_key());
        }
        else if(ctx.table_constraint_foreign_key() != null){
            tableConstraint.type = "foreign";
            tableConstraint.tableConstraint = visitTable_constraint_foreign_key(ctx.table_constraint_foreign_key());
        }
        else if(ctx.table_constraint_key() != null){
            tableConstraint.type = "default";
            tableConstraint.tableConstraint = visitTable_constraint_key(ctx.table_constraint_key());
        }
        else if(ctx.table_constraint_unique() != null){
            tableConstraint.type = "unique";
            tableConstraint.tableConstraint = visitTable_constraint_unique(ctx.table_constraint_unique());
        }
        return tableConstraint;
    }

    @Override
    public UniqueConstraint visitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx) {
        UniqueConstraint uniqueConstraint = new UniqueConstraint();
        if(ctx.name() != null)
            uniqueConstraint.constraintName = ctx.name().any_name().getText();
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.Indexed_columnContext)
                uniqueConstraint.Indexed_column.add(visitIndexed_column((SQLParser.Indexed_columnContext) ctx.children.get(i)));
        }
        return uniqueConstraint;
    }

    @Override
    public DefaultConstraint visitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx) {
        DefaultConstraint defaultConstraint = new DefaultConstraint();
        if(ctx.name() != null)
            defaultConstraint.constraintName = ctx.name().any_name().getText();
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.Indexed_columnContext)
                defaultConstraint.Indexed_column.add(visitIndexed_column((SQLParser.Indexed_columnContext) ctx.children.get(i)));
        }
        return defaultConstraint;
    }

    @Override
    public PrimaryKeyConstraint visitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx) {
        PrimaryKeyConstraint primaryKeyConstraint = new PrimaryKeyConstraint();
        for(int i=0;i<ctx.children.size();i++){
           if(ctx.children.get(i) instanceof SQLParser.Indexed_columnContext)
              primaryKeyConstraint.Indexed_column.add(visitIndexed_column((SQLParser.Indexed_columnContext) ctx.children.get(i)));
        }
        return primaryKeyConstraint;
    }

    @Override
    public ForeignConstraint visitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx) {
        ForeignConstraint foreignConstraint = new ForeignConstraint();
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.Fk_origin_column_nameContext)
               foreignConstraint.columnName.add(
                       visitFk_origin_column_name((SQLParser.Fk_origin_column_nameContext) ctx.children.get(i)));
        }
        if(ctx.foreign_key_clause() != null)
            foreignConstraint.foreignKeyClause = visitForeign_key_clause(ctx.foreign_key_clause());
        return foreignConstraint;
    }

    @Override
    public ForeignKeyClause visitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx) {
        ForeignKeyClause  foreignKeyClause = new ForeignKeyClause();
        if(ctx.database_name() != null)
            foreignKeyClause.tableName = ctx.database_name().getText()+".";
        foreignKeyClause.tableName += ctx.foreign_table().getText();
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.Fk_target_column_nameContext)
                 foreignKeyClause.targets_column_name.add(
                         visitFk_target_column_name((SQLParser.Fk_target_column_nameContext)ctx.children.get(i))
                 );
            else if(ctx.children.get(i).toString().toLowerCase().equals("delete"))
                foreignKeyClause.Action = "delete";
            else if(ctx.children.get(i).toString().toLowerCase().equals("update"))
                foreignKeyClause.Action = "update";
            else if(ctx.children.get(i).toString().toLowerCase().equals("null"))
                foreignKeyClause.Value = "null";
            else if(ctx.children.get(i).toString().toLowerCase().equals("default"))
                foreignKeyClause.Value = "default";
            else if(ctx.children.get(i).toString().toLowerCase().equals("cascade"))
                foreignKeyClause.Value = "cascade";
            else if(ctx.children.get(i).toString().toLowerCase().equals("restrict"))
                foreignKeyClause.Value = "restrict";
            else if(ctx.children.get(i).toString().toLowerCase().equals("no"))
                foreignKeyClause.Value = "noAction";
        }

        return foreignKeyClause;
    }

    @Override
    public String visitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx) {
        return ctx.column_name().any_name().IDENTIFIER().getText();
    }

    @Override
    public String visitIndexed_column(SQLParser.Indexed_columnContext ctx) {
        return ctx.column_name().any_name().IDENTIFIER().getText();
    }

    @Override
    public DeleteStmt visitDelete_stmt(SQLParser.Delete_stmtContext ctx) {
        DeleteStmt deleteStmt = new DeleteStmt();
        deleteStmt.TableName = visitQualified_table_name(ctx.qualified_table_name());
        if(ctx.expr()!=null)
            deleteStmt.exprSQL = visitExpr(ctx.expr());
        return deleteStmt;
    }

    @Override
    public String visitQualified_table_name(SQLParser.Qualified_table_nameContext ctx) {
        String TableName="";
        if(ctx.database_name()!=null)
            TableName +=  visitDatabase_name(ctx.database_name())+".";
        if(ctx.table_name()!=null)
            TableName +=  visitTable_name(ctx.table_name());
        return TableName;
    }


    @Override
    public AggregationFunction visitCreate_aggregation_fun(SQLParser.Create_aggregation_funContext ctx) {
    AggregationFunction aggregationFunction = new AggregationFunction();
    aggregationFunction.functionName = visitFunction_name(ctx.function_name());
    aggregationFunction.jarPath = visitJarPath(ctx.jarPath());
    aggregationFunction.className = visitClassName(ctx.className());
    aggregationFunction.methodName = visitMethodName(ctx.methodName());
    aggregationFunction.returnType = visitReturnType(ctx.returnType());
    for(int i=0;i<ctx.arrayParams().size();i++){
        aggregationFunction.params.add(visitArrayParams(ctx.arrayParams(i)));
    }
    Main.symbolTable.declaredAggregationFunction.add(aggregationFunction);
    return aggregationFunction;
    }

    @Override
    public String visitArrayParams(SQLParser.ArrayParamsContext ctx) {
        return visitTypes(ctx.types());
    }

    @Override
    public String visitReturnType(SQLParser.ReturnTypeContext ctx) {
        return visitTypes(ctx.types());
    }

    @Override
    public String visitMethodName(SQLParser.MethodNameContext ctx) {
        if(ctx.any_name()!=null)
            return visitAny_name(ctx.any_name());

        return visitCharacter(ctx.character());
    }

    @Override
    public String visitClassName(SQLParser.ClassNameContext ctx) {
        if(ctx.any_name()!=null)
            return visitAny_name(ctx.any_name());

        return visitCharacter(ctx.character());
    }

    @Override
    public String visitJarPath(SQLParser.JarPathContext ctx) {
        if(ctx.character()!=null)
            return visitCharacter(ctx.character());

        return  visitAny_name(ctx.any_name());
    }

    @Override
    public CreateTable visitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx) {

        CreateTable createTable =new CreateTable();
        if(ctx.database_name()!=null)
            createTable.TableName +=  visitDatabase_name(ctx.database_name())+".";
        if(ctx.table_name()!=null)
            createTable.TableName +=  visitTable_name(ctx.table_name());
        createTable.type = visitType(ctx.type());
        createTable.path = visitPath(ctx.path());
        Type tableType = new Type();
        tableType.setName(createTable.TableName);

        Main.SymbolTable_iteration++;
        Scope Create_tableScope = new Scope();
        Create_tableScope.setId("Create_table_"+createTable.TableName);
        Main.symbolTable.addScope(Create_tableScope);

        Scope currentScope = Main.symbolTable.getScopes().get(Main.SymbolTable_iteration);
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.Column_defContext){
                ColumnDefinition columnDefinition = visitColumn_def((SQLParser.Column_defContext)ctx.children.get(i));
                createTable.columnDefinitionList.add(columnDefinition);
                Symbol symbol = new Symbol();
                symbol.setName(columnDefinition.ColumnName);
                symbol.setIsParam(false);
                symbol.setScope(currentScope);
                Type type = new Type();
                type = type.GetType(columnDefinition.TypeName);
                if(type == null){}

                else
                    symbol.setType(type);
                    tableType.setColumn(new Pair<>(columnDefinition.ColumnName, type));
                    currentScope.addSymbol(columnDefinition.ColumnName,symbol);
            }
            else if(ctx.children.get(i) instanceof SQLParser.Table_constraintContext)
                createTable.tableConstraintList.add(
                        visitTable_constraint((SQLParser.Table_constraintContext)ctx.children.get(i)));
        }

        tableType.path = visitPath(ctx.path());
        tableType.type = visitType(ctx.type());
        Main.symbolTable.addType(tableType);
        createTable.PointerToSymbolTable = new Pair<>(Main.SymbolTable_iteration, -1);


        return createTable;
    }

    @Override
    public String visitType(SQLParser.TypeContext ctx) {
        return visitCharacter(ctx.character());
    }

    @Override
    public String visitPath(SQLParser.PathContext ctx) {
        return visitCharacter(ctx.character());
    }

    @Override
    public CreateType visitCreate_type_stmt(SQLParser.Create_type_stmtContext ctx) {
    CreateType createType =  new CreateType();
    createType.setName("create_type");
    if(ctx.create_type_name()!=null)
        createType.TypeName = ctx.create_type_name().any_name().getText();

    Type tableType = new Type();
    tableType.setName(createType.TypeName);

    Main.SymbolTable_iteration++;
    Scope Create_tableScope = new Scope();
    Create_tableScope.setId("Create_Type_"+createType.TypeName);
    Main.symbolTable.addScope(Create_tableScope);

    Scope currentScope = Main.symbolTable.getScopes().get(Main.SymbolTable_iteration);

    for(int i=0;i<ctx.children.size();i++){
        if(ctx.children.get(i) instanceof SQLParser.Column_defContext){
            ColumnDefinition columnDefinition = visitColumn_def((SQLParser.Column_defContext)ctx.children.get(i));
            createType.columnDefinitionList.add(columnDefinition);

            Symbol symbol = new Symbol();
            symbol.setName(columnDefinition.ColumnName);
            symbol.setIsParam(false);
            symbol.setScope(currentScope);
            Type type = new Type();
            type = type.GetType(columnDefinition.TypeName);
            symbol.setType(type);
            tableType.setColumn(new Pair<>(columnDefinition.ColumnName,type));

        }
    }
    Main.symbolTable.addType(tableType);
    createType.PointerToSymbolTable = new Pair<>(Main.SymbolTable_iteration, -1);
    return createType;
    }

    @Override
    public ColumnDefinition visitColumn_def(SQLParser.Column_defContext ctx) {

        ColumnDefinition columnDefinition = new ColumnDefinition();
        columnDefinition.ColumnName=visitColumn_name(ctx.column_name());
        if(ctx.children.get(ctx.children.size()-1) instanceof SQLParser.Type_nameContext)
             columnDefinition.TypeName=visitType_name((SQLParser.Type_nameContext)ctx.children.get(ctx.children.size()-1));
        if(ctx.column_constraint()!=null)
            for(int i=0;i<ctx.column_constraint().size();i++){
                columnDefinition.Constraints.add(visitColumn_constraint(ctx.column_constraint(i)));
            }

        Symbol varSymbol = new Symbol();
        Scope currentScope = Main.symbolTable.getScopes().get(Main.SymbolTable_iteration);
        String varName = columnDefinition.ColumnName;
        varSymbol.setIsParam(false);
        varSymbol.setName(varName);
        varSymbol.setScope(currentScope);
        varSymbol.typeSymbol = columnDefinition.TypeName;

        if(currentScope.getSymbolMap().containsKey(columnDefinition.ColumnName))
            {}
        else {
            columnDefinition.PointerToSymbolTable = new Pair<>(Main.SymbolTable_iteration, currentScope.symbolMap.size() - 1);
            currentScope.addSymbol(varName, varSymbol);
        }
        return columnDefinition;
    }

    @Override
    public String visitType_name(SQLParser.Type_nameContext ctx) {
        if(ctx.types()!=null)
           return visitTypes(ctx.types());
        return ctx.name().getText();
    }

    @Override
    public String visitAny_name(SQLParser.Any_nameContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitTypes(SQLParser.TypesContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitColumn_constraint(SQLParser.Column_constraintContext ctx) {
        if(ctx.column_constraint_primary_key()!=null)
            return "PrimaryKey";
        if(ctx.column_constraint_not_null()!=null)
            return "NotNull";
        if(ctx.column_constraint_null()!=null)
            return "Null";
        return ctx.getText();
    }

    @Override
    public DropTable visitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx) {
        DropTable dropTable = new DropTable();
        if(ctx.K_IF()!=null)
            dropTable.CheckIfExist = true;
        if(ctx.database_name()!=null)
            dropTable.TableName = visitDatabase_name(ctx.database_name())+".";
        if(ctx.table_name()!=null)
            dropTable.TableName += visitTable_name(ctx.table_name());
        return dropTable;
    }

    @Override
    public SelectOrValues visitSelect_core(SQLParser.Select_coreContext ctx) {

        Scope currentScope = null;
        Type tableType = null;
        Type oldType = null;
        boolean isExist=false;
        boolean exist = false;
        String Name = null;
        String type=null;
        if(ctx.join_clause()!=null)
        if(ctx.join_clause().table_or_subquery().size()>0)
            type = ctx.join_clause().table_or_subquery(0).table_name().any_name().getText();
        if(ctx.table_or_subquery().size()>0 || type!=null) {

            if (ctx.any_name().size() > 0)
                Name = ctx.any_name().get(0).getText();
            if (ctx.table_or_subquery().size() > 0)
                if (ctx.table_or_subquery(0).table_name() != null)
                    type = ctx.table_or_subquery(0).table_name().any_name().getText();
            for (int i = Main.SymbolTable_iteration; i >= 0; i--) {
                currentScope = Main.symbolTable.getScopes().get(i);
                if (currentScope.symbolMap.containsKey(Name)
                        && ctx.children.get(1) instanceof SQLParser.Any_nameContext && i == Main.SymbolTable_iteration) {

                }
                if (currentScope.symbolMap.containsKey(Name) && ctx.children.get(0) instanceof SQLParser.Any_nameContext) {
                    oldType = currentScope.symbolMap.get(Name).getType();
                    exist = true;
                }

                if (currentScope.symbolMap.containsKey(type)) {
                    tableType = currentScope.symbolMap.get(type).getType();
                    isExist = true;
                    break;
                }
                if (currentScope.isTop)
                    break;
            }
            if (!exist && ctx.children.get(0) instanceof SQLParser.Any_nameContext) {

            }
            for (int i = 0; i < Main.symbolTable.getDeclaredTypes().size(); i++) {
                if (Main.symbolTable.getDeclaredTypes().get(i).getName().equals(type))
                    isExist = true;
            }
            if (!isExist){}

            else if (ctx.table_or_subquery().size()>0 || ctx.join_clause()!=null) {
                boolean pass = false;
                if(ctx.table_or_subquery().size()>0)
                    if(ctx.table_or_subquery(0).table_name()!=null)
                        pass = true;
                if(ctx.join_clause()!=null)
                    if(ctx.join_clause().table_or_subquery().size()>0)
                        pass = true;
                    if(pass){

                for (int i = 0; i < Main.symbolTable.getDeclaredTypes().size(); i++) {
                    if (Main.symbolTable.getDeclaredTypes().get(i).getName().equals(type)) {
                        tableType = new Type();
                        tableType.setName(Name);
                        tableType.setColumns(Main.symbolTable.getDeclaredTypes().get(i).getColumns());
                        tableType.path = Name +"_"+ Main.symbolTable.getDeclaredTypes().get(i).path;
                        tableType.type = Main.symbolTable.getDeclaredTypes().get(i).type;
                        isExist = true;
                        break;
                    }
                    if (Main.symbolTable.getDeclaredTypes().get(i).getName().equals(Name)) {
                        oldType = Main.symbolTable.getDeclaredTypes().get(i);
                        exist = true;
                        break;
                    }
                }

                if (!tableType.equals(oldType) && ctx.children.get(0) instanceof SQLParser.Any_nameContext && exist && isExist)
                    {}

                currentScope = Main.symbolTable.getScopes().get(Main.SymbolTable_iteration);
                ArrayList<Pair<String, Type>> columns = checkIfColumnsIsCompatible(ctx, tableType, currentScope, Name);

                if (!exist && ctx.children.get(1) instanceof SQLParser.Any_nameContext
                        && columns.size() < tableType.getColumns().size() && columns.size() > 0) {
                    Type NewtableType = tableType;
                    NewtableType.setColumns(columns);

                }
                else if(tableType != null)
                {
                }
                if (tableType != null) {
                    Symbol varSymbol = new Symbol();
                    varSymbol.setIsParam(false);
                    varSymbol.setName(Name);
                    varSymbol.setScope(currentScope);
                    varSymbol.setType(tableType);

                    currentScope.addSymbol(Name, varSymbol);
                }

                if (ctx.K_WHERE() != null) {
                    checkColumnInTable(ctx.expr(0), tableType);
                }
            }
        }
            else if (ctx.table_or_subquery().size()>0) {
                if(ctx.table_or_subquery(0).table_name() != null){
                Type table = getTypeOfTable(ctx.table_or_subquery(0).select_stmt().select_or_values());
                if (table != null) {
                    for (int i = 0; i < ctx.result_column().size(); i++) {
                        isExist = false;
                        String columnName = ctx.result_column(i).expr().column_name().any_name().getText();
                        for (Pair<String, Type> column : table.getColumns())
                            if (columnName.equals(column.getKey()))
                                isExist = true;
                        if (!isExist){}
                        else
                            Main.symbolTable.addType(table);
                    }
                }
            }
            }
        }
        if(ctx.table_or_subquery().size()>0){
            ArrayList<Pair<String, Type>> columns = new ArrayList<>();
            if(ctx.table_or_subquery(0).select_stmt()!=null){
                Type subQueryType = GetTypeFromSubquery(ctx.table_or_subquery(0).select_stmt().select_or_values(),Name);
                for(int i=0;i<ctx.result_column().size();i++){
                    String columnName = visitResult_column(ctx.result_column(i)).columnName;
                    for (Pair<String,Type> column:subQueryType.getColumns())
                        if(column.getKey().equals(columnName))
                            columns.add(column);
                }
                Type newType = new Type();
                newType.setName(Name);
                newType.setColumns(columns);
                Main.symbolTable.addType(newType);
            }
        }
        SelectOrValues selectOrValues = new SelectOrValues();
        if(Name!=null){

            CreateTable createTable = new CreateTable();
            createTable.path="path";
            createTable.TableName = Name;
            Main.symbolTable.Selectstatments.add(createTable);

            selectOrValues.variable = new Type();
            selectOrValues.variable.setName(Name);
            Type _type = new Type();
            _type.path="path";
            _type.setName(Name);
            Main.symbolTable.addType(_type);
        }
        for(int i=1;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.Result_columnContext)
                selectOrValues.Columns.add(visitResult_column((SQLParser.Result_columnContext)ctx.children.get(i)));
            else if(ctx.children.get(i) instanceof SQLParser.Table_or_subqueryContext)
                selectOrValues.fromItem = visitTable_or_subquery((SQLParser.Table_or_subqueryContext)ctx.children.get(i));
            else if(ctx.children.get(i) instanceof SQLParser.Join_clauseContext)
                selectOrValues.joinClause = visitJoin_clause((SQLParser.Join_clauseContext)ctx.children.get(i));
            else if(ctx.children.get(i) instanceof SQLParser.ExprContext &&
                    ctx.children.get(i-1).getText().toLowerCase().equals("where"))
                selectOrValues.WhereExprSQL = visitExpr((SQLParser.ExprContext)ctx.children.get(i));
            else if(ctx.children.get(i-1).getText().toLowerCase().equals("by")){
                selectOrValues.GroupByExprSQL = visitExpr((SQLParser.ExprContext)ctx.children.get(i));
                if(i+2<ctx.children.size())
                    if(ctx.children.get(i+2) instanceof SQLParser.ExprContext){
                        selectOrValues.GroupByExprSQL.variable += "."+(
                                (SQLParser.ExprContext) ctx.children.get(i+2)
                        ).column_name().any_name().getText();
                    }
            }
            else if(ctx.children.get(i-1).getText().toLowerCase().equals("having")){
                selectOrValues.HavingExprSQL = visitExpr((SQLParser.ExprContext)ctx.children.get(i));
            }
        }

    return selectOrValues;
    }
    public Type GetTypeFromSubquery(SQLParser.Select_or_valuesContext ctx,String Name){
        Type type = new Type();
        String tableName = ctx.table_or_subquery(0).table_name().any_name().getText();
        Scope currentScope = Main.symbolTable.getScopes().get(Main.SymbolTable_iteration);
        for(int i=0;i<Main.symbolTable.getDeclaredTypes().size();i++){
            if(Main.symbolTable.getDeclaredTypes().get(i).getName().equals(tableName))
                type = Main.symbolTable.getDeclaredTypes().get(i);
        }
        ArrayList<Pair<String, Type>> columns = new ArrayList<>();
        if(ctx.result_column(0).equals("*")){
            return type;
        }
        else{
            for(int i=0;i<ctx.result_column().size();i++){
                String columnName = visitResult_column(ctx.result_column(i)).columnName;
                for (Pair<String,Type> column:type.getColumns())
                    if(column.getKey().equals(columnName))
                        columns.add(column);
            }
            type.setColumns(columns);
        }

        return type;
    }
    public Pair<String,String> type = null;boolean isExist = false;
    public void checkColumnInTable(SQLParser.ExprContext ctx, Type tableType){
        if(ctx.children.get(0) instanceof SQLParser.ExprContext)
            checkColumnInTable((SQLParser.ExprContext)ctx.children.get(0),tableType);
        else if(ctx.children.get(0) instanceof SQLParser.Column_nameContext){
            String columnName = ctx.column_name().any_name().getText();
            for(Pair<String,Type> column : tableType.getColumns()){
                if(column.getKey().equals(columnName))
                {isExist = true;type = new Pair<>(column.getKey(),column.getValue().getName());}
            }
            if(!isExist){}

        }
        if(ctx.children.get(ctx.children.size()-1) instanceof SQLParser.ExprContext){
            checkColumnInTable((SQLParser.ExprContext)ctx.children.get(ctx.children.size()-1),tableType);
        }
        if(ctx.character()!=null && type != null){
            if(!type.getValue().equals("String")){}
        }
        else if(ctx.literal_value()!=null && type != null){
            if(!type.getValue().equals("number")){}
        }
        else if(ctx.select_core()!=null){
            if(ctx.select_core().result_column(0).getText().equals("*")){
                return;
            }
            Pair<String,String> column = new Pair<> (
                    ctx.select_core().result_column(0).expr().column_name().any_name().getText(),null);
            String table = ctx.select_core().table_or_subquery(0).table_name().any_name().getText();
            isExist = false;
            for(int i=0;i<Main.symbolTable.getDeclaredTypes().size();i++){
                if(Main.symbolTable.getDeclaredTypes().get(i).getName().equals(table))
                {
                    tableType = Main.symbolTable.getDeclaredTypes().get(i);
                    isExist = true;
                }
            }
            if(!isExist){}
            isExist = false;
            for(int i=0;i<tableType.getColumns().size();i++){
                if(tableType.getColumns().get(i).getKey().equals(column.getKey()))
                {column = new Pair<>(column.getKey(),tableType.getColumns().get(i).getValue().getName()); isExist = true;}
            }
            if(!isExist){}
            if(type!=null){
                if(!type.getValue().equals(column.getValue())){}
            }
        }
    }

    public Type getTypeOfTable(SQLParser.Select_or_valuesContext ctx){
        Type table = null;isExist = false;
        String tableName = ctx.table_or_subquery(0).table_name().any_name().getText();
        for(int i=0;i<Main.symbolTable.getDeclaredTypes().size();i++){
            if(Main.symbolTable.getDeclaredTypes().get(i).getName().equals(tableName))
            {
                table = Main.symbolTable.getDeclaredTypes().get(i);
                isExist = true;
            }
        }
        if(!isExist){}
        if(!ctx.result_column(0).getText().equals("*"))
            return table;
        else if(table!=null){Type newTable = new Type();
            for(int i=0;i<ctx.result_column().size();i++){isExist = false;
                String columnName = ctx.result_column(i).expr().column_name().any_name().getText();
                for(Pair<String, Type> column:table.getColumns()){
                    if(columnName.equals(column.getKey())){
                        isExist = true;
                        newTable.setColumn(column);
                    }
                }
                if(!isExist){}
            }
        }

        return table;
    }

    @Override
    public JoinClause visitJoin_clause(SQLParser.Join_clauseContext ctx) {
        JoinClause joinClause = new JoinClause();
        for(int i=0;i< ctx.children.size(); i++){
            if(ctx.children.get(i) instanceof SQLParser.Table_or_subqueryContext)
                joinClause.fromItems.add(visitTable_or_subquery((SQLParser.Table_or_subqueryContext)ctx.children.get(i)));
            else if(ctx.children.get(i) instanceof SQLParser.Join_operatorContext){
                joinClause.joinOperator = visitJoin_operator((SQLParser.Join_operatorContext)ctx.children.get(i));
            }
            else if(ctx.children.get(i) instanceof SQLParser.Join_constraintContext &&
                    ((SQLParser.Join_constraintContext)ctx.children.get(i)).expr()!=null){
                joinClause.joinConstraints.add(visitJoin_constraint((SQLParser.Join_constraintContext)ctx.children.get(i)));
            }
        }
        return joinClause;
    }

    @Override
    public String visitJoin_operator(SQLParser.Join_operatorContext ctx) {
        String operator = "";
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i).getText().toLowerCase().equals("left"))
                operator +="left";
            if(ctx.children.get(i).getText().toLowerCase().equals("left"))
                operator +="Outer";
            if(ctx.children.get(i).getText().toLowerCase().equals("inner"))
                operator +="inner";
        }
        return operator;
    }

    @Override
    public JoinConstraint visitJoin_constraint(SQLParser.Join_constraintContext ctx) {
        JoinConstraint joinConstraint = new JoinConstraint();
        if(ctx.expr() != null && ctx.K_ON()!=null)
            joinConstraint.exprSQL = visitExpr(ctx.expr());
        else{}
        return joinConstraint;
    }

    @Override
    public ResultColumn visitResult_column(SQLParser.Result_columnContext ctx) {
        ResultColumn resultColumn = new ResultColumn();
            if(ctx.children.size()==1){
                if(ctx.children.get(0).getText().equals("*")){
                    resultColumn.columnName = "*";
                    return resultColumn;
                }
                if(ctx.expr().table_name()!=null)
                    resultColumn.columnName = ctx.expr().table_name().any_name().getText()+".";
                if(ctx.expr().column_name()!=null)
                    resultColumn.columnName += ctx.expr().column_name().any_name().getText();
                else if(ctx.expr().functionExpr()!=null)
                    resultColumn.functionExpr = visitFunctionExpr(ctx.expr().functionExpr());
                return resultColumn;
            }
            ExprSQL exprSQL =visitExpr(ctx.expr());
            if(exprSQL.variable != ""){
                resultColumn.columnName = exprSQL.variable;
                return resultColumn;
            }
            else if(exprSQL.variable != ""){
                resultColumn.columnName = exprSQL.variable;
                return resultColumn;
            }
            if(ctx.column_alias()!=null){
                resultColumn.columnName =ctx.column_alias().getText();
                resultColumn.functionExpr = visitFunctionExpr(ctx.expr().functionExpr());
                return resultColumn;
            }
        return resultColumn;
    }

    @Override
    public FunctionExpr visitFunctionExpr(SQLParser.FunctionExprContext ctx) {
        FunctionExpr functionExpr = new FunctionExpr();
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.Function_nameContext)
                functionExpr.functionName = visitFunction_name((SQLParser.Function_nameContext)ctx.children.get(i));
            else if(ctx. children.get(i) instanceof SQLParser.ExprContext)
                functionExpr.exprSQLList.add(visitExpr((SQLParser.ExprContext)ctx.children.get(i)));
            else if(ctx. children.get(i).getText().equals("*")){
                ExprSQL exprSQL = new ExprSQL();
                exprSQL.variable = "*";
                functionExpr.exprSQLList.add(exprSQL);
            }

        }
        return functionExpr;
    }

    @Override
    public ExprSQL visitExpr(SQLParser.ExprContext ctx) {
        ExprSQL exprSQL = new ExprSQL();
        if(ctx.functionExpr() != null){
            exprSQL.functionExpr = visitFunctionExpr(ctx.functionExpr());
        }

        if(ctx.character()!=null)
            exprSQL.valueString = visitCharacter(ctx.character());
        if(ctx.children.size()==1){
            if(ctx.literal_value()!=null)
                exprSQL.valueNumber = Double.parseDouble(visitLiteral_value(ctx.literal_value()));
            if(ctx.database_name()!=null)
                exprSQL.variable = visitDatabase_name(ctx.database_name())+".";
            if(ctx.table_name()!=null)
                exprSQL.variable += visitTable_name(ctx.table_name())+".";
            if(ctx.column_name()!=null)
                exprSQL.variable += visitColumn_name(ctx.column_name());
            return exprSQL;
        }
        else if(ctx.table_name()!=null){
            if(ctx.database_name()!=null)
                exprSQL.variable += visitDatabase_name(ctx.database_name())+".";
            if(ctx.table_name()!=null)
                exprSQL.variable += visitTable_name(ctx.table_name())+".";
            if(ctx.column_name()!=null)
                exprSQL.variable += visitColumn_name(ctx.column_name());
        }
        else if(ctx.children.get(1).toString() != "or" || ctx.children.get(1).toString() != "and")
            exprSQL.Operator=ctx.children.get(1).toString();
        else if(ctx.children.get(1).toString() != ".")
            exprSQL.Operation = ctx.children.get(1).toString();
        if(ctx.children.get(0) instanceof SQLParser.ExprContext && !ctx.children.get(1).getText().equals("in")){
            exprSQL.exprSQL_left = visitExpr((SQLParser.ExprContext)ctx.children.get(0));
            exprSQL.exprSQL_right = visitExpr((SQLParser.ExprContext)ctx.children.get(2));
        }
        else if(ctx.children.get(1).getText().equals("in") && ctx.expressions()!=null){
            exprSQL.exprSQL_left = visitExpr((SQLParser.ExprContext)ctx.children.get(0));
            exprSQL.exprInStatm = GetArrayOfExpr(ctx.expressions());
        }
        else if(ctx.children.get(1).getText().equals("in") && ctx.select_core()!=null){
            SymbolTable symbolTable = Main.symbolTable;
            exprSQL.exprSQL_left = visitExpr((SQLParser.ExprContext)ctx.children.get(0));
            exprSQL.selectCore = visitSelect_core(ctx.select_core());
        }
        return exprSQL;
    }
    public ArrayList<ExprSQL> GetArrayOfExpr(SQLParser.ExpressionsContext ctx){
        ArrayList<ExprSQL> expressions = new  ArrayList<ExprSQL>();
        for(int i=0;i<ctx.expr().size();i++){
            expressions.add(visitExpr(ctx.expr(i)));
        }
        return expressions;
    }
    @Override
    public String visitLiteral_value(SQLParser.Literal_valueContext ctx) {
        return ctx.getText();
    }

    @Override
    public FactoredSelectStmt visitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx) {
        FactoredSelectStmt factoredSelectStmt = new FactoredSelectStmt();
        factoredSelectStmt.selectOrValues = visitSelect_core(ctx.select_core());
        for(int i=0;i<ctx.children.size();i++) {
            if (ctx.children.get(i) instanceof SQLParser.Ordering_termContext)
                factoredSelectStmt.OrderingTerms.add(
                        visitOrdering_term((SQLParser.Ordering_termContext)ctx.children.get(i)));
        }
        Main.symbolTable.Selectstatments.add(factoredSelectStmt);
        return factoredSelectStmt;
    }

    @Override
    public OrderingTerm visitOrdering_term(SQLParser.Ordering_termContext ctx) {
        OrderingTerm orderingTerm = new OrderingTerm();
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.ExprContext)
                orderingTerm.exprSQL = visitExpr(ctx.expr());
            else if(ctx.children.get(i).getText().toLowerCase().equals("asc"))
                orderingTerm.DescOrAsc = "ASC";
            else if(ctx.children.get(i).getText().toLowerCase().equals("desc"))
                orderingTerm.DescOrAsc = "DESC";
        }
        return orderingTerm;
    }

    @Override
    public FromItem visitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx) {
        FromItem fromItem= new FromItem();
        if(ctx.table_alias()!=null)
            fromItem.tableAlias = ctx.table_alias().getText();
        if(ctx.database_name()!=null){
            fromItem.fromItem = ctx.database_name().any_name().IDENTIFIER().getSymbol().getText()+".";
            if(ctx.table_name()!=null)
                fromItem.fromItem += ctx.table_name().any_name().IDENTIFIER().getSymbol().getText();
        }
        else if(ctx.table_name()!=null)
            fromItem.fromItem = ctx.table_name().any_name().IDENTIFIER().getSymbol().getText();
        else if(ctx.select_stmt()!=null){
            fromItem.selectStmt = visitSelect_stmt(ctx.select_stmt());
        }
        return fromItem;
    }

    @Override
    public SelectStmt visitSelect_stmt(SQLParser.Select_stmtContext ctx) {
        SelectStmt selectStmt = new SelectStmt();
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof  SQLParser.Ordering_termContext)
                selectStmt.OrderingTerms.add(
                        visitOrdering_term((SQLParser.Ordering_termContext)ctx.children.get(i))
                );
            else if(ctx.children.get(i) instanceof SQLParser.Select_or_valuesContext)
                selectStmt.selectOrValues = visitSelect_or_values(
                        (SQLParser.Select_or_valuesContext)ctx.children.get(i)
                );
        }
        return selectStmt;
    }

    @Override
    public SelectOrValues visitSelect_or_values(SQLParser.Select_or_valuesContext ctx) {
        SelectOrValues selectOrValues = new SelectOrValues();
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.Result_columnContext)
                selectOrValues.Columns.add(visitResult_column((SQLParser.Result_columnContext)ctx.children.get(i)));
            else if(ctx.children.get(i) instanceof SQLParser.Table_or_subqueryContext)
                selectOrValues.fromItem = visitTable_or_subquery((SQLParser.Table_or_subqueryContext)ctx.children.get(i));
            else if(ctx.children.get(i) instanceof SQLParser.ExprContext)
                selectOrValues.WhereExprSQL = visitExpr((SQLParser.ExprContext)ctx.children.get(i));
        }
        return selectOrValues;
    }

    @Override
    public String visitDatabase_name(SQLParser.Database_nameContext ctx) {

        return ctx.any_name().IDENTIFIER().getText();
    }

    @Override public  String visitTable_name(SQLParser.Table_nameContext ctx) {
        return ctx.any_name().IDENTIFIER().getText();
    }

    @Override
    public String visitColumn_name(SQLParser.Column_nameContext ctx) {
        return ctx.any_name().IDENTIFIER().getText();
    }

    @Override
    public List<FunctionDeclaration> visitStatements_of_code_list(SQLParser.Statements_of_code_listContext ctx) {

        List<FunctionDeclaration> functions = new ArrayList<>();
        addAllScopes(ctx);
        //Main.SymbolTable_iteration += Main.symbolTable.getScopes().size();
        for (int i =0; i < ctx.statements_of_code().size() ; i++){

            functions.add((visitStatements_of_code(ctx.statements_of_code(i))));
        }
        return functions;
    }
    public void addAllScopes(SQLParser.Statements_of_code_listContext ctx){
        for(int i=0;i<ctx.statements_of_code().size();i++){
            if(ctx.statements_of_code(i).def_function()!=null){
               SQLParser.Def_functionContext defCTX = ctx.statements_of_code(i).def_function();

                Scope funScope = new Scope();
                funScope.isTop = true;
                String funName;
                if(defCTX.types()!=null){
                    funScope.returnType = visitTypes(defCTX.types());
                    funName = defCTX.children.get(1).getText();
                }
                else
                {
                    funScope.returnType = "void";
                    funName = defCTX.children.get(0).getText();
                }
                funScope.setId("fun_"+funName);
                Main.symbolTable.addScope(funScope);

                if(defCTX.listOfParameters().parameter()!=null){
                    for(int j=0;j<defCTX.listOfParameters().parameter().size();j++){
                        SQLParser.ParameterContext paramCTX = defCTX.listOfParameters().parameter().get(j);
                        Parameter parameter = new Parameter();
                        Symbol symbol = new Symbol();
                        parameter.setName("Parameter");
                        parameter.type = visitKeyword_def((SQLParser.Keyword_defContext)paramCTX.children.get(0));
                        if(parameter.type == null){
                            if(paramCTX.exp()!=null)
                                parameter.type = GetTypeByInit(paramCTX.exp());
                            if(parameter.type == null){}
                        }
                        parameter.parameter = paramCTX.children.get(1).toString();

                        String paramName = parameter.parameter;
                        symbol.setName(paramName);
                        symbol.setIsParam(true);
                        symbol.typeSymbol = parameter.type;
                        Scope currentScope = Main.symbolTable.getScopes().get(i);
                        symbol.setScope(currentScope);

                        parameter.PointerToSymbolTable=new Pair<>(i,currentScope.symbolMap.size()-1);

                        if(paramCTX.children.size()>2 && paramCTX.children.get(3) instanceof SQLParser.ExpContext)
                            parameter.expression = visitExp((SQLParser.ExpContext)paramCTX.children.get(3));

                        if(currentScope.getSymbolMap().containsKey(paramName)){}

                        currentScope.addSymbol(paramName,symbol);
                    }
                }
            }
        }
    }
    @Override
    public FunctionDeclaration visitStatements_of_code(SQLParser.Statements_of_codeContext ctx) {
        if(ctx.def_function()!=null){
            FunctionDeclaration fun= visitDef_function(ctx.def_function());
            return fun;
        }
        return  null;
    }
    @Override
    public FunctionDeclaration visitDef_function(SQLParser.Def_functionContext ctx) {
        FunctionDeclaration fun = new FunctionDeclaration();

        Main.SymbolTable_iteration++;

        fun.PointerToSymbolTable = new Pair<>(Main.SymbolTable_iteration, -1);
        fun.Parameters =  visitListOfParameters(ctx.listOfParameters());
        fun.Body=visitDef_stmt_list(ctx.def_stmt_list());

        return fun;
    }
    @Override
    public List<Parameter> visitListOfParameters(SQLParser.ListOfParametersContext ctx) {

        FunctionDeclaration function = new FunctionDeclaration();
        for(int i=0;i<ctx.parameter().size();i++)
            function.AddParameter(visitParameter(ctx.parameter(i)));
        return function.Parameters;
    }

    @Override
    public Parameter visitParameter(SQLParser.ParameterContext ctx) {
        Parameter parameter = new Parameter();
        Symbol symbol = new Symbol();
        parameter.setName("Parameter");
        parameter.type = visitKeyword_def((SQLParser.Keyword_defContext)ctx.children.get(0));
        parameter.parameter = ctx.children.get(1).toString();

        return parameter;
    }

    @Override
    public List<Node> visitDef_stmt_list(SQLParser.Def_stmt_listContext ctx1) {
        SQLParser.Def_stmt_listContext ctx=ctx1;
        if(ctx1.children.size()>1 && ctx1.children.get(1) instanceof SQLParser.Def_stmt_listContext)
            ctx = (SQLParser.Def_stmt_listContext)ctx1.children.get(1);
        if(ctx.children == null)
            return null;
        List<Node> nodeList = new ArrayList<>();
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.Def_var_coreContext){
                nodeList.add(visitDef_var_core((SQLParser.Def_var_coreContext) ctx.children.get(i)));
            }
            else if(ctx.children.get(i) instanceof SQLParser.If_statementContext){
                nodeList.add(visitIf_statement((SQLParser.If_statementContext)ctx.children.get(i)));
            }
            else if(ctx.children.get(i) instanceof SQLParser.ExpContext){
                Expression expression = new Expression();
                expression.setName("Expression");
                expression = visitExp((SQLParser.ExpContext) ctx.children.get(i));
                nodeList.add(expression);
            }
            else if(ctx.children.get(i) instanceof SQLParser.RepeatContext) {
                nodeList.add(visitRepeat((SQLParser.RepeatContext)ctx.children.get(i)));
            }
            else if(ctx.children.get(i) instanceof SQLParser.If_statement_one_lineContext){
                nodeList.add(visitIf_statement_one_line((SQLParser.If_statement_one_lineContext)ctx.children.get(i)));
            }
            else if(ctx.children.get(i) instanceof SQLParser.Return_valueContext){
                nodeList.add(visitReturn_value((SQLParser.Return_valueContext)ctx.children.get(i)));
            }
            else if(ctx.children.get(i) instanceof SQLParser.Switch_caseContext){
                nodeList.add(visitSwitch_case((SQLParser.Switch_caseContext)ctx.children.get(i)));
            }
            else if(ctx.children.get(i) instanceof SQLParser.Try_catchContext){
                nodeList.add(visitTry_catch((SQLParser.Try_catchContext)ctx.children.get(i)));
            }
            else if(ctx.children.get(i) instanceof SQLParser.Print_funcContext){
                nodeList.add(visitPrint_func((SQLParser.Print_funcContext)ctx.children.get(i)));
            }
            else if(ctx.children.get(i) instanceof SQLParser.Write_obj_jsonContext){
                nodeList.add(visitWrite_obj_json((SQLParser.Write_obj_jsonContext)ctx.children.get(i)));
            }
            else if(ctx.children.get(i) instanceof SQLParser.Sort_func_defContext){
                nodeList.add(visitSort_func_def((SQLParser.Sort_func_defContext)ctx.children.get(i)));
            }
            else if(ctx.children.get(i) instanceof SQLParser.Obj_jsonContext){
                nodeList.add(visitObj_json((SQLParser.Obj_jsonContext)ctx.children.get(i)));
            }
            else if(ctx.children.get(i) instanceof SQLParser.Array_defContext){
                nodeList.add(visitArray_def((SQLParser.Array_defContext)ctx.children.get(i)));
            }
            else if(ctx.children.get(i) instanceof SQLParser.BreakKeyWordContext){
                nodeList.add(visitBreakKeyWord((SQLParser.BreakKeyWordContext)ctx.children.get(i)));
            }
            else if(ctx.children.get(i) instanceof SQLParser.Arr_setValueContext){
                nodeList.add(visitArr_setValue((SQLParser.Arr_setValueContext)ctx.children.get(i)));
            }
            else if(ctx.children.get(i) instanceof SQLParser.Factored_select_stmtContext){
                nodeList.add(visitFactored_select_stmt((SQLParser.Factored_select_stmtContext)ctx.children.get(i)));
            }
            else if(ctx.children.get(i) instanceof SQLParser.CommentsContext){
                Statement statement = new Statement();
                statement.setName("comments");
                continue;
            }
        }
        return nodeList;
    }

    @Override
    public Array_setValue visitArr_setValue(SQLParser.Arr_setValueContext ctx) {
        Array_setValue array_setValue = new Array_setValue();
        if(ctx.exp() != null)
            array_setValue.exprValue = visitExp(ctx.exp());
        if(ctx.arr_getValue() != null)
            array_setValue.array_getValue = visitArr_getValue(ctx.arr_getValue());
        return array_setValue;
    }

    @Override
    public Array_getValue visitArr_getValue(SQLParser.Arr_getValueContext ctx) {
        Array_getValue array_getValue = new Array_getValue();
        array_getValue.arrName = ctx.children.get(0).toString();
        if(ctx.exp() != null)
            array_getValue.exprIndex = visitExp(ctx.exp());
        return array_getValue;
    }

    @Override
    public ArrayDefinition visitArray_def(SQLParser.Array_defContext ctx) {
        ArrayDefinition arrayDefinition = new ArrayDefinition();
        arrayDefinition.setName("ArrayDefinition");
        arrayDefinition.ArrayName = ctx.children.get(1).toString();
        if(ctx.bodyArray() != null)
            arrayDefinition.bodyArray = visitBodyArray(ctx.bodyArray());

        return arrayDefinition;
    }

    @Override
    public BodyArray visitBodyArray(SQLParser.BodyArrayContext ctx) {
        BodyArray bodyArray = new BodyArray();
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.ExpContext){
                Expression expression = new Expression();
                expression = visitExp((SQLParser.ExpContext)ctx.children.get(i));
                bodyArray.expressionList.add(expression);
            }
            else if(ctx.children.get(i) instanceof SQLParser.Body_for_jsonContext){
                bodyArray.bodyforjsons.add(visitBody_for_json((SQLParser.Body_for_jsonContext)ctx.children.get(i)));
            }
        }
        return bodyArray;
    }

    @Override
    public Node visitDef_stmt(SQLParser.Def_stmtContext ctx) {
        Node node = new Node();
        if(ctx.children.get(0) instanceof SQLParser.Def_var_coreContext){
            node=visitDef_var_core((SQLParser.Def_var_coreContext) ctx.children.get(0));
        }
        if(ctx.children.get(0) instanceof SQLParser.If_statementContext){
            node=visitIf_statement((SQLParser.If_statementContext)ctx.children.get(0));
        }
        if(ctx.children.get(0) instanceof SQLParser.ExpContext){
            Expression expression = new Expression();
            expression.setName("Expression");
            expression = visitExp((SQLParser.ExpContext) ctx.children.get(0));
            node=expression;
        }
        if(ctx.children.get(0) instanceof SQLParser.If_statement_one_lineContext){
            node = visitIf_statement_one_line((SQLParser.If_statement_one_lineContext)ctx.children.get(0));
        }
        if(ctx.children.get(0) instanceof SQLParser.Return_valueContext){
            node = visitReturn_value((SQLParser.Return_valueContext)ctx.children.get(0));
        }
        return node;
    }

    @Override
    public ObjectJson visitObj_json(SQLParser.Obj_jsonContext ctx) {
        ObjectJson objectJson = new ObjectJson();
        objectJson.setName("ObjectJson");
        int index=0;
        if(!ctx.children.get(1).toString().equals("="))
            index = 1;
        objectJson.NameObj = ctx.children.get(index).toString();
        objectJson.bodyforjson = visitBody_for_json((SQLParser.Body_for_jsonContext)ctx.children.get(index+3));
        return objectJson;
    }

    @Override
    public Bodyforjson visitBody_for_json(SQLParser.Body_for_jsonContext ctx) {
        Bodyforjson bodyforjson = new Bodyforjson();
        if(ctx.children.size() == 1)
            return bodyforjson;
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i)instanceof SQLParser.Key_valueContext){
                bodyforjson.KeyValue.add(visitKey_value((SQLParser.Key_valueContext)ctx.children.get(i)));
            }
            else if(ctx.children.get(i)instanceof SQLParser.Body_for_jsonContext){
                ObjectJson objectJson = new ObjectJson();
                objectJson.NameObj = ctx.children.get(i-3).toString();
                objectJson.bodyforjson = visitBody_for_json((SQLParser.Body_for_jsonContext)ctx.children.get(i));
                bodyforjson.objectJson.add(objectJson);
            }
            else if(ctx.children.get(i)instanceof SQLParser.BodyArrayContext){
                ObjectJson objectJson = new ObjectJson();
                objectJson.NameObj = ctx.children.get(i-2).toString();
                objectJson.bodyArray = visitBodyArray((SQLParser.BodyArrayContext)ctx.children.get(i));
                bodyforjson.objectJson.add(objectJson);
            }
        }
        return bodyforjson;
    }

    @Override
    public KeyValue visitKey_value(SQLParser.Key_valueContext ctx) {
        KeyValue KeyValue = new KeyValue();
        KeyValue.Key = ctx.children.get(0).toString();
        if(ctx.children.get(2) instanceof SQLParser.ExpContext)
           KeyValue.valueExpression = visitExp((SQLParser.ExpContext)ctx.children.get(2));
        else
            KeyValue.valueInt = Integer.parseInt(ctx.children.get(2).toString());
        return KeyValue;
    }

    @Override
    public SortFunction visitSort_func_def(SQLParser.Sort_func_defContext ctx) {
        SortFunction sortFunction = new SortFunction();
        sortFunction.Array=ctx.children.get(2).toString();
        sortFunction.var1 = ctx.children.get(6).toString();
        sortFunction.var2 = ctx.children.get(8).toString();
        sortFunction.operation = ctx.children.get(13).toString();
        sortFunction.setName("SortFunction");
        return sortFunction;
    }

    @Override
    public WriteObj_json visitWrite_obj_json(SQLParser.Write_obj_jsonContext ctx) {
        WriteObj_json writeObj_json = new WriteObj_json();
        writeObj_json.setName("WriteObj_json");
        int length = ctx.children.size();
        for(int i=0;i<length-2;i++){
                writeObj_json.KeyName+=ctx.children.get(i).toString();
        }
        writeObj_json.expression = visitExp((SQLParser.ExpContext)ctx.children.get(length-1));
        return writeObj_json;
    }

    @Override
    public PrintFunction visitPrint_func(SQLParser.Print_funcContext ctx) {
        PrintFunction printFunction = new PrintFunction();
        printFunction.setName("PrintFunction");
        printFunction.expression = visitExp((SQLParser.ExpContext)ctx.children.get(2));
        Main.symbolTable.Selectstatments.add(printFunction);
        return printFunction;
    }

    @Override
    public TryCatch visitTry_catch(SQLParser.Try_catchContext ctx) {

        TryCatch tryCatch = new TryCatch();
        tryCatch.setName("TryCatch");
        tryCatch.TryBody = visitTry_Statement(ctx.try_Statement());
        tryCatch.CatchBody = visitCatch_Statement(ctx.catch_Statement());

        return tryCatch;
    }

    @Override
    public Try_Statement visitTry_Statement(SQLParser.Try_StatementContext ctx) {

        Main.SymbolTable_iteration++;
        Scope Try_StatementScope = new Scope();
        Try_StatementScope.setId("Try_Statement_"+UUID.randomUUID());
        Main.symbolTable.addScope(Try_StatementScope);

        Try_Statement try_statement = new Try_Statement();
        try_statement.setName("tryStatement");
        try_statement.PointerToSymbolTable = new Pair<>(Main.SymbolTable_iteration, -1);
        try_statement.TryBody = visitDef_stmt_list((SQLParser.Def_stmt_listContext)ctx.children.get(1));
        Main.SymbolTable_iteration--;

        return try_statement;
    }

    @Override
    public Catch_Statement visitCatch_Statement(SQLParser.Catch_StatementContext ctx) {

        Main.SymbolTable_iteration++;
        Scope Catch_StatementScope = new Scope();
        Catch_StatementScope.setId("Catch_Statement_"+UUID.randomUUID());
        Main.symbolTable.addScope(Catch_StatementScope);

        Catch_Statement catch_statement = new Catch_Statement();
        catch_statement.setName("catchStatement");
        catch_statement.Exception = ctx.children.get(3).toString();
        catch_statement.catchBody = visitDef_stmt_list((SQLParser.Def_stmt_listContext)ctx.children.get(5));
        catch_statement.PointerToSymbolTable = new Pair<>(Main.SymbolTable_iteration, -1);
        Main.SymbolTable_iteration--;

        return catch_statement;
    }

    @Override
    public Switch visitSwitch_case(SQLParser.Switch_caseContext ctx) {
        Switch _switch = new Switch();
        _switch.setName("Switch");
        _switch.expression = visitExp((SQLParser.ExpContext)ctx.children.get(2));
        Switch S = new Switch();
        S = visitSwitch_body((SQLParser.Switch_bodyContext)ctx.children.get(5));
        _switch.caseList = S.caseList;

        return _switch;
    }

    @Override
    public Switch visitSwitch_body(SQLParser.Switch_bodyContext ctx) {

        Main.SymbolTable_iteration++;
        Scope Switch_bodyScope = new Scope();
        Switch_bodyScope.setId("Switch_body_"+UUID.randomUUID());
        Main.symbolTable.addScope(Switch_bodyScope);

        Switch _switch = new Switch();
        _switch.setName("SwitchBody");
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.CasesContext){
                _switch.caseList.add(visitCases((SQLParser.CasesContext)ctx.children.get(i)));
            }
        }
        if(ctx.default_statement() != null)
            _switch.default_statement = visitDefault_statement(ctx.default_statement());
        _switch.PointerToSymbolTable = new Pair<>(Main.SymbolTable_iteration, -1);
        Main.SymbolTable_iteration--;

        return _switch;
    }

    @Override
    public Case visitCases(SQLParser.CasesContext ctx) {

        Main.SymbolTable_iteration++;
        Scope Case_statementScope = new Scope();
        Case_statementScope.setId("Case_statement_"+UUID.randomUUID());
        Main.symbolTable.addScope(Case_statementScope);

        Case _case = new Case();
        _case.setName("Case");
        _case.Expr = visitExp((SQLParser.ExpContext)ctx.children.get(1));
        if(ctx.children.get(3) instanceof SQLParser.Def_stmtContext)
            _case.nodeList.add(visitDef_stmt((SQLParser.Def_stmtContext)ctx.children.get(3)));
        else if(ctx.children.get(3) instanceof SQLParser.Def_stmt_listContext)
            _case.nodeList.addAll(visitDef_stmt_list((SQLParser.Def_stmt_listContext)ctx.children.get(3)));
        _case.PointerToSymbolTable = new Pair<>(Main.SymbolTable_iteration, -1);
        Main.SymbolTable_iteration--;

        return _case;
    }

    @Override
    public Default_Statement visitDefault_statement(SQLParser.Default_statementContext ctx) {

        Main.SymbolTable_iteration++;
        Scope Default_statementScope = new Scope();
        Default_statementScope.setId("Default_statement_"+UUID.randomUUID());
        Main.symbolTable.addScope(Default_statementScope);

        Default_Statement default_statement = new Default_Statement();
        default_statement.setName("default_statement");
        if(ctx.children.get(ctx.children.size()-1) instanceof SQLParser.Def_stmtContext)
            default_statement.nodeList.add(visitDef_stmt((SQLParser.Def_stmtContext)ctx.children.get(ctx.children.size()-1)));
        else if(ctx.children.get(ctx.children.size()-2) instanceof SQLParser.Def_stmt_listContext)
            default_statement.nodeList.addAll(visitDef_stmt_list((SQLParser.Def_stmt_listContext)ctx.children.get(ctx.children.size()-2)));

        default_statement.PointerToSymbolTable = new Pair<>(Main.SymbolTable_iteration, -1);
        Main.SymbolTable_iteration--;

        return default_statement;
    }

    @Override
    public Node visitDef_var_core(SQLParser.Def_var_coreContext ctx) {
        DefVarCore defVarCore = new DefVarCore();
        Scope currentScope = Main.symbolTable.getScopes().get(Main.SymbolTable_iteration);
        String typeName;
        defVarCore.setName("DefVarCore");int j=0;
        for(int i=0;i<ctx.children.size();i++) {
            if (ctx.children.get(i) instanceof SQLParser.Keyword_defContext) {
                defVarCore.TypeCore = visitKeyword_def((SQLParser.Keyword_defContext) ctx.children.get(i));
            } else if (ctx.children.get(i) instanceof SQLParser.Def_varContext) {
                defVarCore.defVariable.add(visitDef_var((SQLParser.Def_varContext) ctx.children.get(i)));
                for(int k= Main.SymbolTable_iteration;k>=0;k--) {
                    Scope CurrentScope = Main.symbolTable.getScopes().get(k);
                    if (CurrentScope.symbolMap.containsKey(defVarCore.defVariable.get(j).variableAndAssign.get(0))
                            && k == Main.SymbolTable_iteration)
                        {}
                    if(currentScope.isTop)
                        break;
                }
                if (defVarCore.TypeCore != null) {
                    defVarCore.defVariable.get(j).Type = defVarCore.TypeCore;
                }
                else if (ctx.def_var(j).exp() != null)
                    defVarCore.TypeCore = GetTypeByInit(ctx.def_var(j).exp());
                if (defVarCore.TypeCore == null ){
                    if(ctx.def_var(j).exp() == null){}

                }

                //if (defVarCore.TypeCore != null) {
                    Symbol varSymbol = new Symbol();
                    String varName = defVarCore.defVariable.get(j).variableAndAssign.get(0);
                    varSymbol.setIsParam(false);
                    varSymbol.setName(varName);
                    varSymbol.setScope(currentScope);
                    varSymbol.typeSymbol = defVarCore.TypeCore;
                    currentScope.addSymbol(varName, varSymbol);
                    defVarCore.defVariable.get(j).PointerToSymbolTable = new Pair<>(Main.SymbolTable_iteration, currentScope.symbolMap.size() - 1);
                //}
                if(ctx.keyword_def().K_VAR()!=null)
                    defVarCore.TypeCore = null;
                j++;
            }
        }
        return defVarCore;
    }

    @Override
    public DefVariable visitDef_var(SQLParser.Def_varContext ctx) {
        DefVariable defVariable = new DefVariable();

        if(ctx.any_name()!=null)
            defVariable.variableAndAssign.add(visitAny_name(ctx.any_name()));
        if(ctx.exp()!=null)
            defVariable.expression = visitExp(ctx.exp());

            return defVariable;
    }

    @Override
    public String visitKeyword_def(SQLParser.Keyword_defContext ctx) {
        if(ctx.K_VAR()!=null)
            return null;
        return visitTypes(ctx.types());
    }

    @Override
    public Node visitRepeat(SQLParser.RepeatContext ctx) {
        if(ctx.children.get(0) instanceof SQLParser.While_repeatContext){
            return visitWhile_repeat((SQLParser.While_repeatContext)ctx.children.get(0));
        }
        if(ctx.children.get(0) instanceof SQLParser.For_repeatContext){
            return visitFor_repeat((SQLParser.For_repeatContext)ctx.children.get(0));
        }
        if(ctx.children.get(0) instanceof SQLParser.ForeachContext){
            return visitForeach((SQLParser.ForeachContext)ctx.children.get(0));
        }
        if(ctx.children.get(0) instanceof SQLParser.Do_whileContext){
            return visitDo_while((SQLParser.Do_whileContext)ctx.children.get(0));
        }
        return null;
    }

    @Override
    public DoWhile visitDo_while(SQLParser.Do_whileContext ctx) {

        Main.SymbolTable_iteration++;
        Scope Do_whileScope = new Scope();
        Do_whileScope.setId("Do_while_"+UUID.randomUUID());
        Main.symbolTable.addScope(Do_whileScope);

        DoWhile doWhile = new DoWhile();
        doWhile.setName("Dowhile");
        doWhile.condition = visitCond((SQLParser.CondContext)ctx.children.get(6));
        doWhile.nodeList = visitDef_stmt_list((SQLParser.Def_stmt_listContext)ctx.children.get(2));
        doWhile.PointerToSymbolTable = new Pair<>(Main.SymbolTable_iteration, -1);
        Main.SymbolTable_iteration--;

        return doWhile;
    }

    @Override
    public ForEach visitForeach(SQLParser.ForeachContext ctx) {

        Main.SymbolTable_iteration++;
        Scope forEachScope = new Scope();
        forEachScope.setId("forEach_"+UUID.randomUUID());
        Main.symbolTable.addScope(forEachScope);

        ForEach forEach = new ForEach();
        forEach.setName("Foreach");
        forEach.variable=ctx.children.get(3).toString();
        forEach.object = ctx.children.get(5).toString();
        forEach.PointerToSymbolTable = new Pair<>(Main.SymbolTable_iteration, -1);
        if(ctx.children.size()>9)
            forEach.nodeList=visitDef_stmt_list((SQLParser.Def_stmt_listContext)ctx.children.get(8));
        else
            forEach.nodeList.add(visitDef_stmt((SQLParser.Def_stmtContext)ctx.children.get(7)));
        Main.SymbolTable_iteration--;

        return forEach;
    }

    @Override
    public ForRepeat visitFor_repeat(SQLParser.For_repeatContext ctx) {

        Main.SymbolTable_iteration++;
        Scope forScope = new Scope();
        forScope.setId("for_"+UUID.randomUUID());
        Main.symbolTable.addScope(forScope);

        ForRepeat forRepeat = new ForRepeat();
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.Def_stmtContext)
                forRepeat.nodeList.add(visitDef_stmt((SQLParser.Def_stmtContext)ctx.children.get(i)));
            else if(ctx.children.get(i) instanceof SQLParser.CondContext)
                forRepeat.nodeList.add(visitCond((SQLParser.CondContext)ctx.children.get(i)));
            else if(ctx.children.get(i) instanceof SQLParser.Def_stmt_listContext){
                    SQLParser.Def_stmt_listContext ctx1 =(SQLParser.Def_stmt_listContext) ctx.children.get(i);
                    if(ctx1 !=null && ctx1.children != null)
                        forRepeat.Body=visitDef_stmt_list(ctx.def_stmt_list());
            }
        }
        forRepeat.PointerToSymbolTable = new Pair<>(Main.SymbolTable_iteration, -1);

        Main.SymbolTable_iteration--;

        return forRepeat;
    }

    @Override
    public WhileRepeat visitWhile_repeat(SQLParser.While_repeatContext ctx) {

        Main.SymbolTable_iteration++;
        Scope whileScope = new Scope();
        whileScope.setId("while_"+UUID.randomUUID());
        Main.symbolTable.addScope(whileScope);

        WhileRepeat whileRepeat = new WhileRepeat();
        whileRepeat.setName("While");
        if(ctx.children.get(2) instanceof SQLParser.CondContext)
            whileRepeat.SetCondition(visitCond((SQLParser.CondContext)ctx.children.get(2)));
        if(ctx.children.get(4) instanceof SQLParser.Def_stmtContext)
            whileRepeat.Body.add(visitDef_stmt(ctx.def_stmt()));
        if(ctx.def_stmt_list() !=null && ctx.def_stmt_list().children!=null)
            whileRepeat.Body = visitDef_stmt_list(ctx.def_stmt_list());

        whileRepeat.PointerToSymbolTable = new Pair<>(Main.SymbolTable_iteration, -1);
        Main.SymbolTable_iteration--;

        return whileRepeat;
    }

    @Override
    public Expression visitExp(SQLParser.ExpContext ctx) {
        if(ctx.children.get(0) instanceof TerminalNodeImpl &&
            ctx.children.get(ctx.children.size()-1) instanceof SQLParser.ExpContext){
            String oldType = null, newType;
            for(int i= Main.SymbolTable_iteration;i>=0;i--) {
                Scope currentScope = Main.symbolTable.getScopes().get(i);
                if (currentScope.symbolMap.containsKey(ctx.children.get(0).getText()))
                    oldType = currentScope.symbolMap.get(ctx.children.get(0).getText()).typeSymbol;
                if(currentScope.isTop)
                    break;
            }
                if(oldType==null){}
                else{
                    newType = GetTypeByInit(ctx.exp(0));
                    if(!oldType.equals(newType)){
                    }
                }
        }
        else if(ctx.children.get(0) instanceof SQLParser.Any_nameContext && ctx.children.size()==1){

            boolean isExist = false;
            for(int i= Main.SymbolTable_iteration;i>=0;i--) {
                Scope currentScope = Main.symbolTable.getScopes().get(i);
                if (currentScope.symbolMap.containsKey(ctx.any_name().getText()))
                    isExist = true;
            }
            if(!isExist){}
        }
        Expression expression = new Expression();
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.ExpContext)
            {
                if(i==0 || i==1)
                   expression.expressionLeft = visitExp((SQLParser.ExpContext)ctx.children.get(i));
                else if(i==2)
                   expression.expressionRight = visitExp((SQLParser.ExpContext)ctx.children.get(i));
            }
            else if(ctx.children.get(i) instanceof SQLParser.Prototype_funcContext)
                expression.protoTypeFunction = visitPrototype_func((SQLParser.Prototype_funcContext)ctx.children.get(i));
            else if(ctx.children.get(i) instanceof SQLParser.Arr_getValueContext)
                expression.array_getValue = visitArr_getValue((SQLParser.Arr_getValueContext)ctx.children.get(i));
            else if(ctx.children.get(i) instanceof SQLParser.OpContext)
                expression.Operation = visitOp((SQLParser.OpContext)ctx.children.get(i));
            else if(ctx.children.get(i) instanceof SQLParser.CharacterContext)
                expression.Variables.add(visitCharacter((SQLParser.CharacterContext)ctx.children.get(i)));
            else if(ctx.children.get(i) instanceof SQLParser.Read_obj_jsonContext)
                expression.Variables.addAll(visitRead_obj_json((SQLParser.Read_obj_jsonContext)ctx.children.get(i)));
            else if(ctx.children.get(i) instanceof SQLParser.Op_doubleContext)
                expression.Variables.addAll(visitOp_double((SQLParser.Op_doubleContext)ctx.children.get(i)));
            else if(ctx.children.get(i) instanceof SQLParser.BooleanValueContext)
                expression.Variables.add(visitBooleanValue((SQLParser.BooleanValueContext)ctx.children.get(i)));
            else if(ctx.children.get(i) instanceof SQLParser.NumbersContext)
                expression.Variables.add(visitNumbers((SQLParser.NumbersContext)ctx.children.get(i)));
            else if(ctx.children.get(i) instanceof TerminalNodeImpl)
                expression.Variables.add(ctx.children.get(i).toString());
            else if(ctx.children.get(i) instanceof SQLParser.Any_nameContext)
                expression.Variables.add(ctx.any_name().getText());
        }
    return expression;
    }

    @Override
    public String visitNumbers(SQLParser.NumbersContext ctx) {
        return ctx.children.get(0).toString();
    }

    @Override
    public String visitBooleanValue(SQLParser.BooleanValueContext ctx) {
        return ctx.children.get(0).toString();
    }

    @Override
    public String visitOp(SQLParser.OpContext ctx) {

        return ctx.children.get(0).toString();

    }

    @Override
    public List<String> visitOp_double(SQLParser.Op_doubleContext ctx) {
        List<String> listExpr = new ArrayList<>();
        listExpr.add(ctx.children.get(0).toString());
        listExpr.add(ctx.children.get(1).toString());
        return listExpr;
    }

    @Override
    public ProtoTypeFunction  visitPrototype_func(SQLParser.Prototype_funcContext ctx) {
        ProtoTypeFunction protoTypeFunction = new ProtoTypeFunction();
        protoTypeFunction.setName("protoTypeFunction");
        protoTypeFunction.functionName = ctx.children.get(0).toString();
        if(ctx.prototype_func_parameters() != null)
            protoTypeFunction.parameters = visitPrototype_func_parameters(ctx.prototype_func_parameters());
        return protoTypeFunction;
    }

    @Override
    public List<Expression> visitPrototype_func_parameters(SQLParser.Prototype_func_parametersContext ctx) {
        List<Expression> parameters = new ArrayList<>();

        for(int i=0;i<ctx.exp().size();i++){
                parameters.add(visitExp(ctx.exp(i)));
        }
        return parameters;
    }

    @Override
    public String visitCharacter(SQLParser.CharacterContext ctx) {
        String result="";
        for(int i=0;i<ctx.children.size();i++){
            result+=ctx.children.get(i);
        }
        return result;
    }

    @Override
    public List<String> visitRead_obj_json(SQLParser.Read_obj_jsonContext ctx) {
        List<String> listExpr = new ArrayList<>();
        for(int i=0;i<ctx.children.size();i++)
             listExpr.add(ctx.children.get(i).toString());
        return listExpr;
    }

    @Override
    public IFStatement visitIf_statement(SQLParser.If_statementContext ctx) {
        IFStatement ifStatement = new IFStatement();
        ifStatement.setName("IFStatement");
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.If_statement_coreContext)
               ifStatement.ifCore = visitIf_statement_core(ctx.if_statement_core());
            else if(ctx.children.get(i) instanceof SQLParser.Else_if_statementContext)
               ifStatement.elseIFCore.add(visitElse_if_statement((SQLParser.Else_if_statementContext) ctx.children.get(i)));
            else if(ctx.children.get(i) instanceof SQLParser.Else_statementContext)
            {
                ifStatement.elseStatement = visitElse_statement((SQLParser.Else_statementContext)ctx.children.get(i));
            }
        }
        return ifStatement;
    }

    @Override
    public IfOnelineCondition visitIf_statement_one_line(SQLParser.If_statement_one_lineContext ctx) {
        IfOnelineCondition ifOnelineCondition = new IfOnelineCondition();
        if(ctx.children.get(0) instanceof SQLParser.Keyword_defContext)
        {
            ifOnelineCondition.type = visitKeyword_def((SQLParser.Keyword_defContext)ctx.children.get(0));
            if(ifOnelineCondition.type == null){
                // check init value of variable ,ex:number,string,...
            }
        }
        else {
            ifOnelineCondition.variable = ctx.children.get(0).toString();
        }
        if(ctx.body_onelineCond() != null)
            ifOnelineCondition.body_oneLineCond = visitBody_onelineCond(ctx.body_onelineCond());
        return ifOnelineCondition;
    }

    @Override
    public Body_oneLineCond visitBody_onelineCond(SQLParser.Body_onelineCondContext ctx) {
        Body_oneLineCond body_oneLineCond = new Body_oneLineCond();
        int indexColon = -1;
        for(int i=0;i<ctx.children.size();i++){
            if(ctx.children.get(i) instanceof SQLParser.CondContext)
                body_oneLineCond.Condition = visitCond((SQLParser.CondContext)ctx.children.get(i));
            else if(ctx.children.get(i) instanceof SQLParser.Def_stmt_listContext||
                    ctx.children.get(i) instanceof SQLParser.Def_stmtContext||
                    ctx.children.get(i) instanceof SQLParser.Body_onelineCondContext){
                if(indexColon==-1){
                    body_oneLineCond.beforeColon = GetNodeFor_IfOneLineCond(ctx, i);
                    indexColon = i;
                }
                else{
                    body_oneLineCond.afterColon = GetNodeFor_IfOneLineCond(ctx, i);
                }
            }
        }
        return body_oneLineCond;
    }
    public List<Node> GetNodeFor_IfOneLineCond(SQLParser.Body_onelineCondContext ctx, int index){
        List<Node> nodes = new ArrayList<>();
        if(ctx.children.get(index) instanceof SQLParser.Def_stmtContext)
            nodes.add(visitDef_stmt((SQLParser.Def_stmtContext)ctx.children.get(index)));
        else if(ctx.children.get(index) instanceof SQLParser.Def_stmt_listContext)
            nodes = visitDef_stmt_list((SQLParser.Def_stmt_listContext)ctx.children.get(index));
        else if(ctx.children.get(index) instanceof SQLParser.Body_onelineCondContext)
            nodes.add(visitBody_onelineCond((SQLParser.Body_onelineCondContext)ctx.children.get(index)));

        return nodes;
    }
    @Override
    public IFCore visitIf_statement_core(SQLParser.If_statement_coreContext ctx) {

        Main.SymbolTable_iteration++;
        Scope If_statement_coreScope = new Scope();
        If_statement_coreScope.setId("If_statement_core_"+UUID.randomUUID());
        Main.symbolTable.addScope(If_statement_coreScope);

        IFCore ifStatement = new IFCore();
            if(ctx.children.get(2) instanceof SQLParser.CondContext)
                ifStatement.SetCondition(visitCond((SQLParser.CondContext)ctx.children.get(2)));
            if(ctx.children.get(4) instanceof SQLParser.Def_stmtContext)
                ifStatement.Body.add(visitDef_stmt(ctx.def_stmt()));
            if(ctx.def_stmt_list() !=null && ctx.def_stmt_list().children!=null)
                ifStatement.Body = visitDef_stmt_list(ctx.def_stmt_list());

        ifStatement.PointerToSymbolTable = new Pair<>(Main.SymbolTable_iteration, -1);
        Main.SymbolTable_iteration--;

        return ifStatement;
    }

    @Override
    public IFCore visitElse_if_statement(SQLParser.Else_if_statementContext ctx) {

        return visitIf_statement_core((SQLParser.If_statement_coreContext)ctx.children.get(1));
    }

    @Override
    public ElseStatement visitElse_statement(SQLParser.Else_statementContext ctx) {

        Main.SymbolTable_iteration++;
        Scope Else_statementScope = new Scope();
        Else_statementScope.setId("Else_statement_"+UUID.randomUUID());
        Main.symbolTable.addScope(Else_statementScope);
        ElseStatement elseStatement = new ElseStatement();
        List<Node> nodeList = new ArrayList<>();
        if(ctx.def_stmt()!=null && ctx.def_stmt_list() !=null)
        {
            elseStatement.elseBody.add(visitDef_stmt(ctx.def_stmt()));
          return elseStatement;
        }
        if(ctx.def_stmt_list() != null){
            elseStatement.elseBody = visitDef_stmt_list(ctx.def_stmt_list());
            return elseStatement;
        }

        elseStatement.PointerToSymbolTable = new Pair<>(Main.SymbolTable_iteration, -1);
        Main.SymbolTable_iteration--;

        return null;
    }

    @Override
    public Condition visitCond(SQLParser.CondContext ctx) {
        IsDefined(ctx);
        Condition condition = new Condition();
            if(ctx.children.get(0) instanceof TerminalNodeImpl)
            {
                if(ctx.children.get(0).toString().equals("("))
                      return visitCond((SQLParser.CondContext)ctx.children.get(1));
            }
            else if(ctx.any_name()!=null){
                    condition.Identifier = ctx.any_name().getText();
                    boolean isExist = false;
                    for(int i= Main.SymbolTable_iteration;i>=0;i--) {
                        Scope CurrentScope = Main.symbolTable.getScopes().get(i);
                        if (CurrentScope.symbolMap.containsKey(condition.Identifier))
                            isExist = true;
                        if(CurrentScope.isTop)
                            break;
                    }
                    if(!isExist){}
                    return condition;
            }
            else if(ctx.booleanValue()!=null){
                condition.booleanValue = ctx.booleanValue().getText();
            }
            else if(ctx.children.get(0) instanceof SQLParser.CondContext)
            {
                condition.condition_1 = visitCond((SQLParser.CondContext)ctx.children.get(0));
                condition.Operator = ctx.children.get(1).toString();
                condition.condition_2 = visitCond((SQLParser.CondContext)ctx.children.get(2));
            }
            else if(ctx.children.get(0) instanceof SQLParser.ExpContext)
            {
                condition.expressionLeft=visitExp((SQLParser.ExpContext)ctx.children.get(0));
            }
            else if(ctx.prototype_func()!=null){
                condition.protoTypeFunction = visitPrototype_func(ctx.prototype_func());
            }
            else if(ctx.children.get(1) instanceof TerminalNodeImpl && condition.condition_1==null)
            {
                condition.Operation = ctx.children.get(1).toString();
            }
            else if(ctx.children.get(2) instanceof SQLParser.ExpContext)
            {
                condition.expressionRight=visitExp((SQLParser.ExpContext)ctx.children.get(2));
            }
        return condition;
    }

    @Override
    public ReturnValue visitReturn_value(SQLParser.Return_valueContext ctx) {
        ReturnValue returnValue = new ReturnValue();Main.symbolTable.getScopes();
        returnValue.setName("ReturnValue");
        if(ctx.children.get(1) instanceof SQLParser.ExpContext)
            returnValue.expression = visitExp((SQLParser.ExpContext)ctx.children.get(1));
        else if(ctx.children.get(1) instanceof SQLParser.CondContext)
            returnValue.condition = visitCond((SQLParser.CondContext)ctx.children.get(1));
        return  returnValue;
    }

    @Override
    public Node visitBreakKeyWord(SQLParser.BreakKeyWordContext ctx) {
        Statement statement = new Statement();
        statement.setName("BreakKeyWord");
        return statement;
    }



    public String GetTypeByInit(SQLParser.ExpContext ctx){

        if(ctx.numbers()!=null)
            return "number";
        else if(ctx.character()!=null)
            return "string";
        else if(ctx.booleanValue()!=null)
            return "boolean";
        else if(ctx.prototype_func()!=null){
            boolean exist=false;
            for (int i=0;i< Main.symbolTable.getScopes().size();i++){
                String scopeFunc = Main.symbolTable.getScopes().get(i).getId();
                 if (scopeFunc.equals("fun_"+ctx.prototype_func().children.get(0).getText())) {
                     exist = true;
                     int parameters =0;
                     for (Map.Entry<String, Symbol> entry : Main.symbolTable.getScopes().get(i).getSymbolMap().entrySet()){
                         if(entry.getValue().getIsParam())
                             parameters++;
                     }
                     ArrayList<String> types = GettypeFromFunction(ctx.prototype_func().prototype_func_parameters());
                     if (types.size() != parameters) {
                         return null;
                     }
                     int j=0;
                     for (Map.Entry<String, Symbol> entry : Main.symbolTable.getScopes().get(i).getSymbolMap().entrySet()){
                         if(types.get(j)!=null)
                             if(!types.get(j).equals(entry.getValue().typeSymbol))
                                 {

                                     return null;
                                 }
                        j++;
                     }
                     return Main.symbolTable.getScopes().get(i).returnType;
                 }
            }
            if(!exist){}
        }
        else if(ctx.any_name()!=null){
            for(int i= Main.SymbolTable_iteration;i>=0;i--) {
                Scope currentScope = Main.symbolTable.getScopes().get(i);
                if (currentScope.symbolMap.containsKey(ctx.any_name().getText()))
                    return currentScope.symbolMap.get(ctx.any_name().getText()).typeSymbol;
                if(currentScope.isTop)
                    break;;
            }
        }
        else if(ctx.children.size()==3){
            if(ctx.exp()!=null && ctx.children.get(0) instanceof SQLParser.ExpContext
                    && ctx.children.get(2) instanceof SQLParser.ExpContext) {
                Object leftExp = GetTypeByInit(ctx.exp(0));
                Object rightExp = GetTypeByInit(ctx.exp(1));
                if(leftExp!=null&&rightExp!=null)
                    if(leftExp.equals(rightExp))
                        return (String)leftExp;
                    else{
                    }

            }
        }
        return null;
    }

    public void IsDefined(SQLParser.CondContext ctx){

         if(ctx.prototype_func()!=null){
            boolean exist=false;
            for (int i=0;i< Main.symbolTable.getScopes().size();i++){
                if (Main.symbolTable.getScopes().get(i).getId().equals("fun_"+ctx.prototype_func().children.get(0).getText())) {
                    exist = true;
                    int parameters =0;
                    for (Map.Entry<String, Symbol> entry : Main.symbolTable.getScopes().get(i).getSymbolMap().entrySet()){
                        if(entry.getValue().getIsParam())
                            parameters++;
                    }
                    ArrayList<String> types = GettypeFromFunction(ctx.prototype_func().prototype_func_parameters());
                    if (types.size() != parameters) {
                    }
                    int j=0;
                    for (Map.Entry<String, Symbol> entry : Main.symbolTable.getScopes().get(i).getSymbolMap().entrySet()){
                        if(types.get(j)!=null)
                            if(!types.get(j).equals(entry.getValue().typeSymbol))
                            {
                            }
                        j++;
                    }
                    return;
                }
            }
            if(!exist){
                GettypeFromFunction(ctx.prototype_func().prototype_func_parameters());
            }
        }
        else if(ctx.children.get(0) instanceof SQLParser.Any_nameContext){
            for(int i= Main.SymbolTable_iteration;i>=0;i--) {
                Scope currentScope = Main.symbolTable.getScopes().get(i);
                if (currentScope.symbolMap.containsKey(ctx.any_name().getText()))
                  return;
            }

        }
        else if(ctx.exp()!=null && ctx.exp().size()==3 && ctx.children.get(0) instanceof SQLParser.ExpContext
                && ctx.children.get(2) instanceof SQLParser.ExpContext) {
                GetTypeByInit(ctx.exp(0));
                GetTypeByInit(ctx.exp(2));
        }
         else if(ctx.cond()!=null && ctx.cond().size()==3 && ctx.children.get(0) instanceof SQLParser.CondContext
                 && ctx.children.get(2) instanceof SQLParser.CondContext) {
             IsDefined(ctx.cond(0));
             IsDefined(ctx.cond(2));
         }
    }

    public ArrayList<String> GettypeFromFunction(SQLParser.Prototype_func_parametersContext ctx){
        ArrayList<String> types = new ArrayList<>();
        for(int i=0;i<ctx.exp().size();i++){
            types.add(GetTypeByInit(ctx.exp(i)));
        }
        return types;
    }
    public ArrayList<Pair<String,Type>> checkIfColumnsIsCompatible(SQLParser.Select_coreContext ctx,Type tableType,Scope currentScope,String Name){
        boolean isExist;
        if(ctx.result_column(0).getText().equals("*"))
            return tableType.getColumns();
        ArrayList<Pair<String,Type>> columns = new ArrayList<>();
        for(int i=0;i<ctx.result_column().size();i++){
            String columnName = visitResult_column(ctx.result_column(i)).columnName;
            isExist = false;
            for (Pair<String,Type> column:tableType.getColumns()) {
                if(column.getKey().equals(columnName))
                {
                    columns.add(column);
                    isExist = true;
                }
            }
            if(!isExist)
            {
            }
            else {
                Symbol symbol = new Symbol();
                symbol.setName(Name);
                symbol.setIsParam(false);
                symbol.setScope(currentScope);
                symbol.setType(tableType);
                currentScope.addSymbol(Name, symbol);
            }
        }
        return columns;
    }
}

