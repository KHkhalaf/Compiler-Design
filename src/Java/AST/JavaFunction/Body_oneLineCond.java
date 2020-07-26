package Java.AST.JavaFunction;

import Java.AST.Node;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class Body_oneLineCond extends Statement {
    public Condition Condition = new Condition();
    public List<Node> beforeColon = new ArrayList<>();
    public List<Node> afterColon = new ArrayList<>();
}
