package Java.SymbolTable;

public class Symbol {

    private String name;
    public String typeSymbol = null;
    private Type typeTable = null;
    private Scope scope;
    private boolean isParam;



    public String getName() {
        return name;
    }

    public Type getType() {
        return typeTable;
    }

    public Scope getScope() {
        return scope;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.typeTable = type;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public boolean getIsParam() {
        return isParam;
    }

    public void setIsParam(boolean param) {
        isParam = param;
    }
}
