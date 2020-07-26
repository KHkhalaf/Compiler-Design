package Java.AST.QueryStmt;

import Java.AST.ASTVisitor;

public class DropTable extends Statement {
    public String TableName = "";
    public boolean CheckIfExist = false;
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
