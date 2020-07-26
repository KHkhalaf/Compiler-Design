package Java.AST.JavaFunction;

import Java.AST.Node;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class ElseStatement extends Statement {

    public List<Node> elseBody = new ArrayList<>();
}
