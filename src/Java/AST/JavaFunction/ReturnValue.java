package Java.AST.JavaFunction;

import Java.AST.ASTVisitor;
import Java.AST.QueryStmt.Statement;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class ReturnValue extends Statement {
    public Expression expression = null;
    public Condition condition = null;
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
