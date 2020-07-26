package Java.AST.QueryStmt;

import Java.AST.ASTVisitor;
import generated.SQLParser;

import java.util.ArrayList;
import java.util.List;

public class FactoredSelectStmt extends Statement {

    public SelectOrValues selectOrValues = null;
    public ArrayList<OrderingTerm> OrderingTerms = new ArrayList<>();

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
