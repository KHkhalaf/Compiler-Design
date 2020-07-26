package Java.AST.JavaFunction;

import Java.AST.ASTVisitor;
import Java.AST.QueryStmt.Statement;

public class Array_setValue extends Statement {

    public Array_getValue array_getValue = null;
    public Expression exprValue = null;

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
