package Java.AST.QueryStmt;

import Java.AST.ASTVisitor;
import Java.AST.Node;

public class Statement extends Node {

    private String name;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }

}
