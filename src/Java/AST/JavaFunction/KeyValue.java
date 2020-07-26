package Java.AST.JavaFunction;

import Java.AST.ASTVisitor;
import Java.AST.QueryStmt.Statement;

public class KeyValue extends Statement {
    public String Key = null;
    public Expression valueExpression = null;
    public int valueInt = 0;
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
