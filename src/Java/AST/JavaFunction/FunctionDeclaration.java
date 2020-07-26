package Java.AST.JavaFunction;

import Java.AST.ASTVisitor;
import Java.AST.Node;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class FunctionDeclaration extends Statement {
    public List<Parameter> Parameters = new ArrayList<>();
    public List<Node> Body = new ArrayList<>();
    public void AddParameter(Parameter name) {
        this.Parameters.add(name);
    }
    public List<Parameter> getParameters() {
        return Parameters;
    }
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
        if(this.Body!=null){
            for(int i=0;i<this.Body.size();i++){
                this.Body.get(i).accept(astVisitor);
            }
        }
    }
}
