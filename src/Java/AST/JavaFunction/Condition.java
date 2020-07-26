package Java.AST.JavaFunction;

import Java.AST.ASTVisitor;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class Condition extends Statement {
    public Expression expressionLeft = null;
    public Expression expressionRight = null;
    public Condition condition_1 = null;
    public Condition condition_2 = null;
    public String Operator = null;
    public String Operation = null;
    public String Identifier = null;
    public String booleanValue = null;
    public ProtoTypeFunction protoTypeFunction = null;
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        if(expressionLeft!=null)
            expressionLeft.accept(astVisitor);
        if(expressionRight!=null)
            expressionRight.accept(astVisitor);
    }
}
