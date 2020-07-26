package Java.AST.JavaFunction;

import Java.AST.ASTVisitor;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class ProtoTypeFunction extends Statement {

    public String functionName = null;
    public List<Expression> parameters = new ArrayList<>();

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);

    }
}
