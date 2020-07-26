package Java.SymbolTable;

import Java.AST.Node;
import Java.AST.QueryStmt.AggregationFunction;
import Java.AST.QueryStmt.Statement;

import javax.print.attribute.AttributeSetUtilities;
import java.util.ArrayList;
import java.util.List;


public class SymbolTable {


    private ArrayList<Scope> scopes = new ArrayList<>();

    private ArrayList<Type> declaredTypes = new ArrayList<>();
    public List<Statement> Selectstatments = new ArrayList<>();
    public ArrayList<AggregationFunction> declaredAggregationFunction = new ArrayList<>();


    public ArrayList<Scope> getScopes() {
        return scopes;
    }

    public void setScopes(ArrayList<Scope> scopes) {
        this.scopes = scopes;
    }

    public ArrayList<Type> getDeclaredTypes() {
        return declaredTypes;
    }

    public void setDeclaredTypes(ArrayList<Type> declaredTypes) {
        this.declaredTypes = declaredTypes;
    }


    public void addScope(Scope scope){
        this.scopes.add(scope);
    }
    public void addType(Type type){
        this.declaredTypes.add(type);
    }
}
