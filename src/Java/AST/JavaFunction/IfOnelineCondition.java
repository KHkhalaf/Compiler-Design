package Java.AST.JavaFunction;

import Java.AST.ASTVisitor;
import Java.AST.Node;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class IfOnelineCondition extends Statement {
    public String type = null;
    public String variable = null;
    public Body_oneLineCond body_oneLineCond = null;
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
