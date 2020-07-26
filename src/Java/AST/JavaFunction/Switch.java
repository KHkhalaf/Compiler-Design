package Java.AST.JavaFunction;

import Java.AST.ASTVisitor;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class Switch extends Statement {
    public Expression expression = null;
    public List<Case> caseList = new ArrayList<>();
    public Default_Statement default_statement = new Default_Statement();
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
