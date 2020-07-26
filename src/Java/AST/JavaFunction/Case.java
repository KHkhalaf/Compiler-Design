package Java.AST.JavaFunction;

import Java.AST.ASTVisitor;
import Java.AST.Node;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class Case extends Statement {
    public Expression Expr = new Expression();
    public List<Node> nodeList = new ArrayList<>();
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
