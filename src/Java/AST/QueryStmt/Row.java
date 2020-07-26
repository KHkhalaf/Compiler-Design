package Java.AST.QueryStmt;

import Java.AST.ASTVisitor;
import Java.AST.JavaFunction.Expression;

import java.util.ArrayList;
import java.util.List;

public class Row extends Statement {
    public List<Expression> Rows = new ArrayList<>();
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
