package Java.AST.QueryStmt;

import Java.AST.ASTVisitor;

public class FromItem extends Statement {
        public String fromItem = null;
        public String tableAlias = null;
        public SelectStmt selectStmt = null;
        @Override
        public void accept(ASTVisitor astVisitor){
                astVisitor.visit(this);
        }
}
