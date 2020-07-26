package Java.AST.QueryStmt;

import Java.AST.ASTVisitor;
import Java.AST.TableConstraint.TableConstraint;

import java.util.ArrayList;
import java.util.List;

public class CreateTable extends Statement{
    public String TableName="";
    public List<ColumnDefinition> columnDefinitionList = new ArrayList<>();
    public List<TableConstraint> tableConstraintList = new ArrayList<>();
    public String type="";
    public String path="";

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
