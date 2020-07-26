package Java.AST.QueryStmt;

import Java.AST.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ForeignKeyClause extends Statement{

    public String tableName = "";
    public List<String> targets_column_name = new ArrayList<>();
    public String Action = null;
    public String Value = null;

    @Override
    public void accept(ASTVisitor astVisitor){
            astVisitor.visit(this);
        }
}
