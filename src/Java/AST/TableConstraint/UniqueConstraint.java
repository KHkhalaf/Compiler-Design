package Java.AST.TableConstraint;

import Java.AST.ASTVisitor;

public class UniqueConstraint extends TableConstraint{
    public String constraintName = null;
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}

