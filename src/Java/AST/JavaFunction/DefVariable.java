package Java.AST.JavaFunction;

import Java.AST.ASTVisitor;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class DefVariable extends Statement {
    public  String Type = "";
    public List<String> variableAndAssign = new ArrayList<String>();
    public Expression expression = null;
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        if(this.expression!=null){

            this.expression.accept(astVisitor);
        }
    }
}
