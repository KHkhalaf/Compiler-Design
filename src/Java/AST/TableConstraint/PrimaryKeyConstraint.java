package Java.AST.TableConstraint;

import Java.AST.ASTVisitor;
import Java.AST.QueryStmt.Statement;

public class PrimaryKeyConstraint extends TableConstraint{

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
