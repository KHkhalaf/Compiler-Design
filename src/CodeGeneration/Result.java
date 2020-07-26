package CodeGeneration;

import Java.AST.Parse;
import Java.AST.QueryStmt.FactoredSelectStmt;
import Java.Base.BaseVisitor;
import Java.Main;
import generated.SQLLexer;
import java.lang.reflect.Method;
import generated.SQLParser;
import javafx.util.Pair;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.json.JSONException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Field;
import Java.SymbolTable.Type;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Result {
    static List<Object> objects1 = new ArrayList<>();
    static List<Object> objects2 = new ArrayList<>();

 public static void main(String[] args)  throws FileNotFoundException, JSONException{
      try {
      Init();



           for (int i = 0; i < Main.symbolTable.Selectstatments.size(); i++) {
               FactoredSelectStmt select=null;
                if (Main.symbolTable.Selectstatments.get(i) instanceof FactoredSelectStmt) {
                select = (FactoredSelectStmt) Main.symbolTable.Selectstatments.get(i);
                if (select.selectOrValues.fromItem != null) {
                        InitObjects(select.selectOrValues.fromItem.fromItem,1);
                    }
                    else{
                        InitObjects(select.selectOrValues.joinClause.fromItems.get(0).fromItem,1);
                        InitObjects(select.selectOrValues.joinClause.fromItems.get(1).fromItem,2);
                    }
                }
                if (Main.symbolTable.Selectstatments.get(i) instanceof FactoredSelectStmt) {
                    Pair obj = (Pair) Main.GetTypeFromSelect(select.selectOrValues, objects1, objects2);
                    String type = obj.getValue().toString();
                    if (type.equals("newData")) {
                        ArrayList<Pair<Object, Object>> key = (ArrayList<Pair<Object, Object>>) obj.getKey();
                        for(int j=0;j<key.size();j++)
                            System.out.print(key.get(j).getKey()+"\t\t");
                        System.out.println();
                        for(int j=0;j<key.size();j++)
                            System.out.print(key.get(j).getValue()+"\t\t");
                    }
                    else if (type.equals("NewCities")) {
                        ArrayList<Object> key = (ArrayList<Object>) obj.getKey();
                        Class<?> clazz = key.get(0).getClass();
                        Field[] fields = clazz.getFields();
                        for(int j=0;j<fields.length-3;j++){
                            System.out.print(fields[j].getName()+"\t\t");
                        }
                        
                        System.out.println();
                        for(Object _obj : key){
                            clazz = _obj.getClass();
                            fields = clazz.getFields();
                            for(int j=0;j<fields.length-3;j++){
                                Object value = fields[j].get(_obj);
                                if(value.getClass().toString().toUpperCase().contains("STRING") ||
                                        value.getClass().toString().toUpperCase().contains("DOUBLE"))
                                      System.out.print(value+"\t\t");
                                else{
                                    clazz = value.getClass();
                                    fields = clazz.getFields();
                                    Object value1 = value;
                                    for(int l=0;l<fields.length;l++) {
                                        value = fields[l].get(value1);
                                        if (value.getClass().toString().toUpperCase().contains("STRING") ||
                                                value.getClass().toString().toUpperCase().contains("DOUBLE"))
                                            System.out.print(value + "\t\t");
                                        else{
                                            clazz = value.getClass();
                                            fields = clazz.getFields();

                                            value1 = value;
                                            for(int k=0;j<fields.length;j++) {
                                                value = fields[k].get(value1);
                                                if (value.getClass().toString().toUpperCase().contains("STRING") ||
                                                        value.getClass().toString().toUpperCase().contains("DOUBLE"))
                                                    System.out.print(value + "\t\t");
                                            }
                                        }
                                    }
                                }
                            }
                            System.out.println();
                        }
                    }
                    else {
                        ArrayList<ArrayList<Object>> key = (ArrayList<ArrayList<Object>>) obj.getKey();
                        //Thread object = new Thread(new CreateThread(select.selectOrValues.variable.getName(),key));
                        //object.start();
                        CreateClass.CreateTable(select.selectOrValues.variable.getName(),key);
                        for(ArrayList list:key) {
                            for (Object _obj : list) {
                                System.out.print(_obj.toString() + "\t\t");
                            }
                            System.out.println();
                        }
                    }

                    System.out.println();
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("---------------------------------------------------------------------");                }
            }



            System.out.println("---------------------------------------------------------------------");
            System.out.println("---------------------------------------------------------------------");
            System.out.println();
        } catch (IOException | NoSuchFieldException | ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
}

    
    public static void InitObjects(String tableName,int num) throws IOException, JSONException {
        try {
            Class<?> clazz = Class.forName("CodeGeneration."+tableName);
            Method m= clazz.getMethod("getData");
            Object instance = clazz.newInstance();
            if(num==1)
                objects1 = (List<Object>)m.invoke(instance);
            else
                objects2 = (List<Object>)m.invoke(instance);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }


public static void Init() throws IOException {
        String source = "samples//samples.txt";
        CharStream cs = fromFileName(source);
        SQLLexer lexer = new SQLLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        SQLParser parser = new SQLParser(token);
        ParseTree tree = parser.parse();
        Parse p = (Parse) new BaseVisitor().visit(tree);
    } 
}
