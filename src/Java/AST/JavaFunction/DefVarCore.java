package Java.AST.JavaFunction;

import Java.AST.ASTVisitor;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class DefVarCore extends Statement {
    public  String TypeCore = null;
    public List<DefVariable> defVariable = new ArrayList<>();
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);

        if(this.defVariable.size()>0){
            for(int i=0 ; i<this.defVariable.size();i++){
                this.defVariable.get(i).accept(astVisitor);
            }
        }
    }
}
