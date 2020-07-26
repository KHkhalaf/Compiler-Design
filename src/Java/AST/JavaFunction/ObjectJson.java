package Java.AST.JavaFunction;

import Java.AST.ASTVisitor;
import Java.AST.QueryStmt.Statement;

public class ObjectJson extends Statement {
    public String NameObj = null;
    public Bodyforjson bodyforjson = null;
    public BodyArray bodyArray = null;
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
