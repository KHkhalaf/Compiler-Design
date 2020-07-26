package Java.AST.JavaFunction;

import Java.AST.Node;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class Catch_Statement  extends Statement {
    public String Exception = null;
    public List<Node> catchBody = new ArrayList<>();
}
