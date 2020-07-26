package Java.AST.JavaFunction;

import Java.AST.ASTVisitor;
import Java.AST.Node;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class DoWhile extends Statement {
    public  Condition condition = null;
    public List<Node> nodeList = new ArrayList<>();
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
