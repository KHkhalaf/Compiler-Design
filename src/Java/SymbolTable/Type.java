package Java.SymbolTable;

import Java.Main;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Type {

    private String name;
    private ArrayList<Pair<String, Type>> columns = new ArrayList<>();
    public String path = null;
    public String type = null;

    public final static String NUMBER_CONST = "number";
    public final static String STRING_CONST = "string";
    public final static String BOOLEAN_CONST = "boolean";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Pair<String, Type>> getColumns() {
        return columns;
    }

    public void setColumn(Pair<String, Type> column) {
        this.columns.add(column);
    }
    public void setColumns(ArrayList<Pair<String, Type>> columns) {
        this.columns = columns;
    }
    public Type GetType(String type){

        if(type.toUpperCase().equals("INT") || type.toUpperCase().equals("FLOAT") || type.toUpperCase().equals("NUMBER")){
            Type newType = new Type();
            newType.setName(Type.NUMBER_CONST);
            return newType;
        }
        else if(type.toUpperCase().equals("STRING")){
            Type newType = new Type();
            newType.setName(Type.STRING_CONST);
            return newType;
        }
        else if(type.toUpperCase().equals("BOOLEAN")){
            Type newType = new Type();
            newType.setName(Type.BOOLEAN_CONST);
            return newType;
        }
        else if(Main.symbolTable.getDeclaredTypes().size()>0){
            for(int i=0;i< Main.symbolTable.getDeclaredTypes().size();i++){
                if(Main.symbolTable.getDeclaredTypes().get(i).getName().equals(type))
                    return Main.symbolTable.getDeclaredTypes().get(i);
            }
        }
        return null;
    }
}
