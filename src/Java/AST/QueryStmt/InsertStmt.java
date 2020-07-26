package Java.AST.QueryStmt;

import Java.AST.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class InsertStmt extends Statement {
        public String TableName = "";
        public List<String> Columns = new ArrayList<>();
        public List<Row> Values = new ArrayList<>();
        public SelectStmt selectStmt = null;
        @Override
        public void accept(ASTVisitor astVisitor){
                astVisitor.visit(this);
        }
}
