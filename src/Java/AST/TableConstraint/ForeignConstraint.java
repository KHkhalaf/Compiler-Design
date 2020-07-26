package Java.AST.TableConstraint;

import Java.AST.ASTVisitor;
import Java.AST.QueryStmt.ForeignKeyClause;

import java.util.ArrayList;
import java.util.List;

public class ForeignConstraint extends TableConstraint{
    public List<String> columnName = new ArrayList<>();
    public ForeignKeyClause foreignKeyClause = null;
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
