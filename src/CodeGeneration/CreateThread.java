package CodeGeneration;

import Java.AST.QueryStmt.ColumnDefinition;
import Java.AST.QueryStmt.CreateTable;
import Java.Main;
import Java.SymbolTable.Type;

import java.io.PrintWriter;
import java.lang.management.ThreadInfo;
import java.util.ArrayList;

public class CreateThread implements Runnable  {
    public  ArrayList<ArrayList<Object>> key;
    public String tableName;
    public CreateThread(String tableName, ArrayList<ArrayList<Object>> key){
        this.tableName = tableName;
        this.key = key;
    }

    @Override
    public void run() {
        try
        {

            ArrayList<Object> columnsNames = key.get(0);
            ArrayList<Object> columns = new ArrayList<>();
            if (key.size() > 1)
                columns = key.get(1);

            Type newType = new Type();
            newType.setName(tableName);
            newType.path = "samples//" + tableName + ".csv";
            newType.type = "csv";
            Main.symbolTable.addType(newType);

            CreateTable table = new CreateTable();
            table.TableName = tableName;
            table.path = "samples//" + tableName + ".csv";
            table.type = "csv";
            for (int i = 0; i < columns.size(); i++) {
                Object obj = columns.get(i);
                ColumnDefinition columnDefinition = new ColumnDefinition();
                columnDefinition.ColumnName = columnsNames.get(i).toString();
                Class<?> clazz = obj.getClass();
                if (clazz.toString().toUpperCase().contains("DOUBLE"))
                    columnDefinition.TypeName = "number";
                else if (clazz.toString().toUpperCase().contains("STRING"))
                    columnDefinition.TypeName = "string";
                else if (clazz.toString().toUpperCase().contains("BOOLEAN"))
                    columnDefinition.TypeName = "boolean";
                table.columnDefinitionList.add(columnDefinition);
            }
            CreateClass.createClass_Table(table);
            PrintWriter w = null;
            try {
                w = new PrintWriter("samples//" + tableName + ".csv", "UTF-8");
                for (int i = 1; i < key.size(); i++) {
                    ArrayList list = key.get(i);
                    for (int j = 0; j < list.size(); j++) {
                        Object _obj = list.get(j);
                        if (j == list.size() - 1)
                            w.print(_obj.toString());
                        else
                            w.print(_obj.toString() + ",");
                    }
                    w.println();
                }
                w.close();
            } catch (Exception e) {
                w.close();
            }
        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }
}
