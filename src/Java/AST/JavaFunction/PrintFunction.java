package Java.AST.JavaFunction;

import Java.AST.ASTVisitor;
import Java.AST.QueryStmt.Statement;

public class PrintFunction extends Statement {
    public Expression expression = new Expression();
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
