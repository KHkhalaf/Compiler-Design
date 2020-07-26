package Java.AST.JavaFunction;

import Java.AST.ASTVisitor;
import Java.AST.Node;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class WhileRepeat extends Statement {

    private Condition Condition = new Condition();
    public List<Node> Body = new ArrayList<>();

    public void SetCondition(Condition condition) {
        this.Condition=condition;
    }
    public Condition getCondition() {
        return Condition;
    }
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
