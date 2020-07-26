package Java.AST.QueryStmt;


import Java.AST.ASTVisitor;

public class RenameTable extends Statement {
    public String newTableName = "";
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
