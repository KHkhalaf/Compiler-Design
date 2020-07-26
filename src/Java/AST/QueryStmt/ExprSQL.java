package Java.AST.QueryStmt;

import Java.AST.ASTVisitor;
import Java.AST.JavaFunction.Condition;

import java.util.ArrayList;
import java.util.List;

public class ExprSQL extends Statement {
    public String variable = "";
    public String valueString = null;
    public double valueNumber;
    public ExprSQL exprSQL_left = null;
    public ExprSQL exprSQL_right = null;
    public String Operator = "";
    public String Operation = "";
    public FunctionExpr functionExpr  = null;
    public SelectOrValues selectCore  = null;
    public ArrayList<ExprSQL> exprInStatm = new ArrayList<>();
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}

