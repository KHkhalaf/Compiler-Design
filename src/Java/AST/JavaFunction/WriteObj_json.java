package Java.AST.JavaFunction;

import Java.AST.ASTVisitor;
import Java.AST.JavaFunction.Expression;
import Java.AST.QueryStmt.Statement;

public class WriteObj_json extends Statement {
    public String KeyName = "";
    public Expression expression = new Expression();
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
