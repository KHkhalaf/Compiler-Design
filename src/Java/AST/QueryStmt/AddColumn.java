package Java.AST.QueryStmt;

import Java.AST.ASTVisitor;

public class AddColumn extends Statement {
    public ColumnDefinition columnDefinition = new ColumnDefinition();
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}

