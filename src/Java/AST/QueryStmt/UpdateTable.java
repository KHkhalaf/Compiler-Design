package Java.AST.QueryStmt;

import Java.AST.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class UpdateTable extends Statement {
    public String TableName = "";
    public List<col_exprForUpdateStst> col_Exprs = new ArrayList<col_exprForUpdateStst>();
    public ExprSQL exprSQL = null;
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }

}
