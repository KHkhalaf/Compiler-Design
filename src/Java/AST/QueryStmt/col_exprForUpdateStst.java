package Java.AST.QueryStmt;

import Java.AST.ASTVisitor;
import Java.AST.JavaFunction.Expression;

public class col_exprForUpdateStst extends Statement {
    public String ColumnName = null;
    public Expression expression = null;
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
