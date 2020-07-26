package Java.AST.TableConstraint;

import Java.AST.ASTVisitor;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class TableConstraint extends Statement {

    public String name = null;
    public String type = null;
    public TableConstraint tableConstraint = null;
    public List<String> Indexed_column = new ArrayList<>();
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }
}