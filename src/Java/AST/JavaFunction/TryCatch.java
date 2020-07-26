package Java.AST.JavaFunction;

import Java.AST.ASTVisitor;
import Java.AST.Node;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class TryCatch extends Statement {
    public Try_Statement TryBody = new Try_Statement();
    public Catch_Statement CatchBody = new Catch_Statement();
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
