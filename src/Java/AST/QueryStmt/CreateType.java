package Java.AST.QueryStmt;

import Java.AST.ASTVisitor;
import Java.AST.TableConstraint.TableConstraint;

import java.util.ArrayList;
import java.util.List;

public class CreateType extends Statement{
    public String TypeName="";
    public List<ColumnDefinition> columnDefinitionList = new ArrayList<>();

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
