package Java.AST.QueryStmt;

import Java.AST.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ColumnDefinition extends Statement {
    public String ColumnName="";
    public List<String> Constraints = new ArrayList<>();
    public String TypeName = "";
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
