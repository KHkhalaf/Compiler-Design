package Java.AST.JavaFunction;

import Java.AST.ASTVisitor;
import Java.AST.QueryStmt.Statement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Expression extends Statement {

    public List<String> Variables = new ArrayList<>();
    public String Operation = "";
    public ProtoTypeFunction protoTypeFunction = null;
    public Array_getValue array_getValue = null;
    public Expression expressionLeft = null;
    public Expression expressionRight = null;
    @Override
    public void accept(ASTVisitor astVisitor)
    {
        astVisitor.visit(this);
        if(this.protoTypeFunction!=null){
            this.protoTypeFunction.accept(astVisitor);
        }
        if(this.expressionRight!=null){
           expressionRight.accept(astVisitor);
        }
        if(this.expressionLeft!=null){
            expressionLeft.accept(astVisitor);
        }

    }
}
