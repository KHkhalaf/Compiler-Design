package Java.AST.QueryStmt;

import Java.AST.ASTVisitor;

public class OrderingTerm extends Statement {
    public ExprSQL exprSQL = new ExprSQL();
    public String DescOrAsc = null;

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
