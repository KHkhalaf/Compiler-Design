package Java.AST.QueryStmt;

import java.util.ArrayList;
import java.util.List;

public class FunctionExpr extends Statement {
    public String functionName = null;
    public List<ExprSQL> exprSQLList = new ArrayList<>();
}
