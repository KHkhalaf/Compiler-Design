package Java.AST.QueryStmt;

import Java.AST.ASTVisitor;

public class AlterTable extends Statement {
    public String TypeAlter="";
    public String TableName = "";
    public RenameTable renameTable = new RenameTable();
    public AddColumn addColumn = new AddColumn();
    public AlterTable_add alterTable_add = new AlterTable_add();

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}