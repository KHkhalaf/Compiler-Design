package Java.AST.JavaFunction;

import Java.AST.ASTVisitor;
import Java.AST.QueryStmt.Statement;

public class SortFunction extends Statement {
    public String Array =null;
    public String var1 = null;
    public String var2 = null;
    public String operation = null;
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
