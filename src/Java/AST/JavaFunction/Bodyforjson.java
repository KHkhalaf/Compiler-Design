package Java.AST.JavaFunction;

import Java.AST.ASTVisitor;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class Bodyforjson extends Statement {
    public List<ObjectJson> objectJson = new ArrayList<>();
    public List<KeyValue> KeyValue = new ArrayList<>();
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
