package Java.AST.QueryStmt;

import Java.SymbolTable.Type;

import java.util.ArrayList;
import java.util.List;

public class SelectOrValues extends Statement {
    public Type variable = null;
    public FromItem fromItem = null;
    public List<ResultColumn> Columns = new ArrayList<>();
    public JoinClause joinClause = null;
    public ExprSQL WhereExprSQL = null;
    public ExprSQL GroupByExprSQL = null;
    public ExprSQL HavingExprSQL = null;
}
