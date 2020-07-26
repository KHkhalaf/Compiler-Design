package Java.AST.JavaFunction;

import Java.AST.ASTVisitor;
import Java.AST.Node;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class IFStatement extends Statement {
    public IFCore ifCore = null;
    public List<IFCore> elseIFCore = new ArrayList<>();
    public ElseStatement elseStatement = new ElseStatement();
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        if(ifCore!=null)
            ifCore.accept(astVisitor);
    }
}
