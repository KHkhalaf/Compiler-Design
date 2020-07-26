package Java.AST.QueryStmt;

import Java.AST.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class SelectStmt extends Statement {
      public SelectOrValues selectOrValues = null;
      public List<OrderingTerm> OrderingTerms = new ArrayList<>();

      @Override
      public void accept(ASTVisitor astVisitor){
            astVisitor.visit(this);
      }
}
