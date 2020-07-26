package Java.AST.JavaFunction;

import Java.AST.ASTVisitor;
import Java.AST.QueryStmt.Statement;

public class Array_getValue extends Statement {

    public String arrName = null;
    public Expression exprIndex = null;

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
