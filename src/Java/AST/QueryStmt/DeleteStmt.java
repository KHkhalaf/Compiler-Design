package Java.AST.QueryStmt;

import Java.AST.ASTVisitor;

public class DeleteStmt extends Statement {
    public String TableName = "";
    public ExprSQL exprSQL = new ExprSQL();
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
