package CodeGeneration;

import Java.AST.QueryStmt.ColumnDefinition;
import Java.AST.QueryStmt.CreateTable;
import Java.AST.QueryStmt.CreateType;
import Java.Main;
import Java.SymbolTable.Type;
import javafx.util.Pair;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CreateClass {
    /////func create class for each table
    public static void createClass_Table(CreateTable table) {
        String tablename = table.TableName;
        int sizeColumn = table.columnDefinitionList.size();
        String pathFile = table.path;
        String formatFile = table.type;

        List<ColumnDefinition> columnDef = table.columnDefinitionList;
        try {
            PrintWriter w = new PrintWriter("src/CodeGeneration/" + tablename + ".java", "UTF-8");
            w.println("package CodeGeneration;\n" +
                    "\n" +
                    "import java.io.*;\n" +
                    "import java.util.List;\n" +
                    "import java.util.ArrayList;\n" +
                    "import java.util.Arrays;\n\n\n" +
                    "import com.google.gson.JsonObject;\n" +
                    "import com.google.gson.JsonParser;\n" +
                    "import org.json.JSONException;\n" +
                    "import org.json.JSONObject;\n" +
                    "import CodeGeneration.loadJsonFile;\n");

            w.println("public class " + tablename + "{");
            //write column from table as variables in class
            for (int i = 0; i < sizeColumn; i++) {
                if (columnDef.get(i).TypeName.equals("string")) {
                    w.println("         public String " + columnDef.get(i).ColumnName + ";");
                } else if (columnDef.get(i).TypeName.equals("number")) {
                    w.println("         public double " + columnDef.get(i).ColumnName + ";");
                } else if (columnDef.get(i).TypeName.equals("boolean")) {
                    w.println("         public boolean " + columnDef.get(i).ColumnName + ";");
                } else {
                    w.println("         public " + columnDef.get(i).TypeName + " " + columnDef.get(i).ColumnName + " = new " + columnDef.get(i).TypeName + "();");

                }
            }
            //write path for file
            w.println("         public String path  = \"" + pathFile + "\";");
            //write format in file
            w.println("         public String format =  \"" + formatFile + "\";");

            //array list contain the rows from table
            w.println("         public static List<" + tablename + "> DataRows;");
            w.println();


            //********************* func load the file*********************************//

            w.print("         private List<" + tablename + ">" + " loadCsvFile(");

            w.println("){");


            //
            w.println("         BufferedReader br = null; \n" +
                    "         List<" + tablename + "> list = new ArrayList<>();\n" +
                    "         String line = \"\";  \n" +
                    "         String splitBy = \",\";  " +
                    tablename + " o;"
            );

            if (table.columnDefinitionList.size() > 0) {

                //open csv file
                w.println(" try {\n" +
                        "        br = new BufferedReader(new FileReader(path)); \n" +

                        "          while ((line = br.readLine()) != null)  \n" +
                        "           {  \n" +
                        "           String[] row = line.split(splitBy);\n" +
                        "           o = new " + tablename + "();"
                );
                for (int i = 0; i < sizeColumn; i++) {
                    if (columnDef.get(i).TypeName.equals("string")) {
                        w.println("           o." + columnDef.get(i).ColumnName + "= row[" + i + "] ;");
                    } else if (columnDef.get(i).TypeName.equals("number")) {
                        w.println("           o." + columnDef.get(i).ColumnName + "= Double.parseDouble(row[" + i + "]) ;");
                    } else if (columnDef.get(i).TypeName.equals("boolean")) {
                        w.println("           o." + columnDef.get(i).ColumnName + "= Boolean.parseBoolean(row[" + i + "]) ;");
                    }

                }
                //add row to list
                w.println("           list.add(o);");


                //block end while
                w.println("          }");

                //


                w.println("         }" +
                        "         catch (FileNotFoundException e) {\n" +
                        "            e.printStackTrace();\n" +
                        "        } catch (UnsupportedEncodingException e) {\n" +
                        "            e.printStackTrace();\n" +
                        "        }catch (IOException e) {\n" +
                        "         e.printStackTrace();\n" +
                        "         }");

            }
            w.println("         return list;");

            //End func load
            w.println("   }");
            //********************* func load the file*********************************//
            w.print("          private List<" + tablename + ">" + " loadJsonFile() throws FileNotFoundException, JSONException {");

            w.println(" loadJsonFile loadJsonFile = new loadJsonFile();\n" +
                    "        JsonParser jsonParser = new JsonParser();\n" +
                    "        Object object = jsonParser.parse(new FileReader(path));\n" +
                    "        String inpuString = object.toString();\n" +
                    "        JSONObject inputjson = new JSONObject(inpuString);\n" +
                    "        List<" + tablename + "> list = new ArrayList<>();");

            if (table.columnDefinitionList.size() > 0) {
                String tmpNameColumn = "";
                List<String> tmpTypeColumnType = new ArrayList<>();
                String tmpNameColumnType = "";
                for (int i = 0; i < sizeColumn; i++) {
                    if (columnDef.get(i).TypeName.equals("string")) {
                        w.println("List<String>" + columnDef.get(i).ColumnName + "s  = loadJsonFile.getKey(inputjson," + "\"" + columnDef.get(i).ColumnName + "\"" + ", new ArrayList<>());");
                    } else if (columnDef.get(i).TypeName.equals("number")) {
                        w.println("List<String>" + columnDef.get(i).ColumnName + "s = loadJsonFile.getKey(inputjson," + "\"" + columnDef.get(i).ColumnName + "\"" + ", new ArrayList<>());");
                        tmpNameColumn = columnDef.get(i).ColumnName;
                    } else if (columnDef.get(i).TypeName.equals("boolean")) {
                        w.println("List<String>" + columnDef.get(i).ColumnName + "s = loadJsonFile.getKey(inputjson," + "\"" + columnDef.get(i).ColumnName + "\"" + ", new ArrayList<>());");
                    } else {

                        tmpTypeColumnType.add(columnDef.get(i).TypeName);

                        for (int j = 0; j < Main.symbolTable.getDeclaredTypes().size(); j++) {
                            if (Main.symbolTable.getDeclaredTypes().get(j).getName().equals(columnDef.get(i).TypeName)) {

                                for (Pair<String, Type> entry : Main.symbolTable.getDeclaredTypes().get(j).getColumns()) {

                                    w.println("List<String> " + entry.getKey().toString() + "s = loadJsonFile.getKey(inputjson," + "\"" + entry.getKey().toString() + "\"" + ", new ArrayList<>());");
                                }
                            }
                        }


                    }
//
                }

                //Start For Loop
                w.println(" for (int i = 0; i <" + tmpNameColumn + "s.size(); i++) {");

                for (int k = 0; k < tmpTypeColumnType.size(); k++) {
                    w.println("  " + tmpTypeColumnType.get(k) + " tmp" + tmpTypeColumnType.get(k) + " = new " + tmpTypeColumnType.get(k) + "();");

                }
                w.println("" + tablename + " tmp = new " + tablename + "();");

                ////////********
                for (int i = 0; i < sizeColumn; i++) {

                    if (columnDef.get(i).TypeName.equals("string")) {
                        // w.println("List<String>" + columnDef.get(i).getColumnName() + "s  = loadJsonFile.getKey(inputjson," + "\"" + columnDef.get(i).getColumnName() + "\"" + ", new ArrayList<>());");
                        w.println("           tmp." + columnDef.get(i).ColumnName + "= " + columnDef.get(i).ColumnName + "s.get(i);");

                    } else if (columnDef.get(i).TypeName.equals("number")) {
                        //  w.println("List<String>" + columnDef.get(i).getColumnName() + "s = loadJsonFile.getKey(inputjson," + "\"" + columnDef.get(i).getColumnName() + "\"" + ", new ArrayList<>());");
                        w.println("           tmp." + columnDef.get(i).ColumnName + "= Double.parseDouble(" + columnDef.get(i).ColumnName + "s.get(i)) ;");

                    } else if (columnDef.get(i).TypeName.equals("boolean")) {
                        // w.println("List<String>" + columnDef.get(i).getColumnName() + "s = loadJsonFile.getKey(inputjson," + "\"" + columnDef.get(i).getColumnName() + "\"" + ", new ArrayList<>());");
                        w.println("           tmp." + columnDef.get(i).ColumnName + "= Boolean.parseBoolean(" + columnDef.get(i).ColumnName + "s.get(i)) ;");

                    } else {

                        for (int j = 0; j < Main.symbolTable.getDeclaredTypes().size(); j++) {
                            tmpNameColumnType = columnDef.get(i).ColumnName;
                            if (Main.symbolTable.getDeclaredTypes().get(j).getName().equals(columnDef.get(i).ColumnName)) {

                                for (Pair<String, Type> entry : Main.symbolTable.getDeclaredTypes().get(j).getColumns()) {

                                    if (entry.getValue().getName().equals("string")) {
                                        w.println("           tmp" + columnDef.get(i).ColumnName + "." + entry.getKey().toString() + "= " + entry.getKey().toString() + "s.get(i);");

                                    } else if (entry.getValue().getName().equals("number")) {
                                        w.println("           tmp" + columnDef.get(i).ColumnName + "." + entry.getKey().toString() + "= Double.parseDouble(" + entry.getKey().toString() + "s.get(i)) ;");

                                    } else if (entry.getValue().getName().equals("boolean")) {
                                        w.println("           tmp" + columnDef.get(i).TypeName + "." + entry.getKey().toString() + "= Boolean.parseBoolean(" + entry.getKey().toString() + "s.get(i)) ;");

                                    }

                                }
                            }
                        }


                        w.println("           tmp." + tmpNameColumnType + "= tmp" + columnDef.get(i).TypeName + ";");

                    }


                }

                w.println("list.add(tmp);");

                //End For Loop
                w.println("}");


            }
            w.println("return list;");
            //End func load
            w.println("   }");

            //create fun to getListData From listMyCustomer
            w.println("       public List<" + tablename + "> getData() throws FileNotFoundException, JSONException{");
            w.println("           if(DataRows== null){\n" +
                    "if(format.toUpperCase().equals(\"CSV\"))\n" +
                    "           DataRows= loadCsvFile();\n" +
                    "else if (format.toUpperCase().equals(\"JSON\"))\n" +
                    "           DataRows= loadJsonFile();\n" +
                    "else \n" +
                    "System.out.println(\"ERROR FORMAT FILE NOT SUPPORT *_*\");" +
                    "           }\n" +
                    "           return DataRows;");
            //End Fun getData
            w.println("          }");


            //End The Class
            w.print("}");
            w.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    public static void createClass_Type(CreateType type) {
        String tablename = type.TypeName;
        int sizeColumn = type.columnDefinitionList.size();
        List<ColumnDefinition> columnDef = type.columnDefinitionList;

        try {
            PrintWriter w = new PrintWriter("src/CodeGeneration/" + type.TypeName + ".java", "UTF-8");
            w.println("package CodeGeneration;\n" +
                    "\n" +
                    "import java.io.*;\n" +
                    "import java.util.List;");

            w.println("public class " + tablename + "{");
            //write column from table as variables in class
            for (int i = 0; i < sizeColumn; i++) {
                if (columnDef.get(i).TypeName.equals("string")) {
                    w.println("         public String " + columnDef.get(i).ColumnName + ";");
                } else if (columnDef.get(i).TypeName.equals("number")) {
                    w.println("         public double " + columnDef.get(i).ColumnName + ";");
                } else if (columnDef.get(i).TypeName.equals("boolean")) {
                    w.println("         public boolean " + columnDef.get(i).ColumnName + ";");
                } else {
                    w.println("         public " + columnDef.get(i).TypeName + " " + columnDef.get(i).ColumnName + ";");

                }
            }

            w.println();

            //End The Class
            w.print("}");
            w.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    public static void CreateMain(ArrayList<Type> tables) {
        PrintWriter w = null;
        try {
            w = new PrintWriter("src/CodeGeneration/Result.java", "UTF-8");

            w.println("package CodeGeneration;\n" +
                    "\n" +
                    "import Java.AST.Parse;\n" +
                    "import Java.AST.QueryStmt.FactoredSelectStmt;\n" +
                    "import Java.Base.BaseVisitor;\n" +
                    "import Java.Main;\n" +
                    "import generated.SQLLexer;\n" +
                    "import java.lang.reflect.Method;\n" +
                    "import generated.SQLParser;\n" +
                    "import javafx.util.Pair;\n" +
                    "import org.antlr.v4.runtime.CharStream;\n" +
                    "import org.antlr.v4.runtime.CommonTokenStream;\n" +
                    "import org.antlr.v4.runtime.tree.ParseTree;\n" +
                    "import org.json.JSONException;\n" +
                    "\n" +
                    "import java.io.FileNotFoundException;\n" +
                    "import java.io.IOException;\n" +
                    "import java.lang.reflect.InvocationTargetException;\n" +
                    "import java.util.ArrayList;\n" +
                    "import java.util.List;\n" +
                    "import java.lang.reflect.Field;\n" +
                    "import Java.SymbolTable.Type;\n" +
                    "\n" +
                    "import static org.antlr.v4.runtime.CharStreams.fromFileName;\n");

            w.println("public class Result {\n" +
                    "    static List<Object> objects1 = new ArrayList<>();\n" +
                    "    static List<Object> objects2 = new ArrayList<>();\n");
            w.println(" public static void main(String[] args)  throws FileNotFoundException, JSONException{");
            w.println("      try {\n      Init();\n");

            w.println("\n" +
                    "\n" +
                    "           for (int i = 0; i < Main.symbolTable.Selectstatments.size(); i++) {\n" +
                    "               FactoredSelectStmt select=null;\n" +
                    "                if (Main.symbolTable.Selectstatments.get(i) instanceof FactoredSelectStmt) {\n" +
                    "                select = (FactoredSelectStmt) Main.symbolTable.Selectstatments.get(i);\n" +
                    "                if (select.selectOrValues.fromItem != null) {\n" +
                    "                        InitObjects(select.selectOrValues.fromItem.fromItem,1);\n" +
                    "                    }\n" +
                    "                    else{\n" +
                    "                        InitObjects(select.selectOrValues.joinClause.fromItems.get(0).fromItem,1);\n" +
                    "                        InitObjects(select.selectOrValues.joinClause.fromItems.get(1).fromItem,2);\n" +
                    "                    }\n" +
                    "                }\n" +
                    "                if (Main.symbolTable.Selectstatments.get(i) instanceof FactoredSelectStmt) {\n" +
                    "                    Pair obj = (Pair) Main.GetTypeFromSelect(select.selectOrValues, objects1, objects2);\n" +
                    "                    String type = obj.getValue().toString();\n" +
                    "                    if (type.equals(\"newData\")) {\n" +
                    "                        ArrayList<Pair<Object, Object>> key = (ArrayList<Pair<Object, Object>>) obj.getKey();\n" +
                    "                        for(int j=0;j<key.size();j++)\n" +
                    "                            System.out.print(key.get(j).getKey()+\"\\t\\t\");\n" +
                    "                        System.out.println();\n" +
                    "                        for(int j=0;j<key.size();j++)\n" +
                    "                            System.out.print(key.get(j).getValue()+\"\\t\\t\");\n" +
                    "                    }\n" +
                    "                    else if (type.equals(\"NewCities\")) {\n" +
                    "                        ArrayList<Object> key = (ArrayList<Object>) obj.getKey();\n" +
                    "                        Class<?> clazz = key.get(0).getClass();\n" +
                    "                        Field[] fields = clazz.getFields();\n" +
                    "                        for(int j=0;j<fields.length-3;j++){\n" +
                    "                            System.out.print(fields[j].getName()+\"\\t\\t\");\n" +
                    "                        }\n" +
                    "                        \n" +
                    "                        System.out.println();\n" +
                    "                        for(Object _obj : key){\n" +
                    "                            clazz = _obj.getClass();\n" +
                    "                            fields = clazz.getFields();\n" +
                    "                            for(int j=0;j<fields.length-3;j++){\n" +
                    "                                Object value = fields[j].get(_obj);\n" +
                    "                                if(value.getClass().toString().toUpperCase().contains(\"STRING\") ||\n" +
                    "                                        value.getClass().toString().toUpperCase().contains(\"DOUBLE\"))\n" +
                    "                                      System.out.print(value+\"\\t\\t\");\n" +
                    "                                else{\n" +
                    "                                    clazz = value.getClass();\n" +
                    "                                    fields = clazz.getFields();\n" +
                    "                                    Object value1 = value;\n" +
                    "                                    for(int l=0;l<fields.length;l++) {\n" +
                    "                                        value = fields[l].get(value1);\n" +
                    "                                        if (value.getClass().toString().toUpperCase().contains(\"STRING\") ||\n" +
                    "                                                value.getClass().toString().toUpperCase().contains(\"DOUBLE\"))\n" +
                    "                                            System.out.print(value + \"\\t\\t\");\n" +
                    "                                        else{\n" +
                    "                                            clazz = value.getClass();\n" +
                    "                                            fields = clazz.getFields();\n" +
                    "\n" +
                    "                                            value1 = value;\n" +
                    "                                            for(int k=0;j<fields.length;j++) {\n" +
                    "                                                value = fields[k].get(value1);\n" +
                    "                                                if (value.getClass().toString().toUpperCase().contains(\"STRING\") ||\n" +
                    "                                                        value.getClass().toString().toUpperCase().contains(\"DOUBLE\"))\n" +
                    "                                                    System.out.print(value + \"\\t\\t\");\n" +
                    "                                            }\n" +
                    "                                        }\n" +
                    "                                    }\n" +
                    "                                }\n" +
                    "                            }\n" +
                    "                            System.out.println();\n" +
                    "                        }\n" +
                    "                    }\n" +
                    "                    else {\n" +
                    "                        ArrayList<ArrayList<Object>> key = (ArrayList<ArrayList<Object>>) obj.getKey();\n" +
                    "                        //Thread object = new Thread(new CreateThread(select.selectOrValues.variable.getName(),key));\n" +
                    "                        //object.start();\n" +
                    "                        CreateClass.CreateTable(select.selectOrValues.variable.getName(),key);\n" +
                    "                        for(ArrayList list:key) {\n" +
                    "                            for (Object _obj : list) {\n" +
                    "                                System.out.print(_obj.toString() + \"\\t\\t\");\n" +
                    "                            }\n" +
                    "                            System.out.println();\n" +
                    "                        }\n" +
                    "                    }\n\n" +
                    "                    System.out.println();\n" +
                    "                    System.out.println(\"---------------------------------------------------------------------\");\n" +
                    "                    System.out.println(\"---------------------------------------------------------------------\");" +
                    "                }\n" +
                    "            }\n" +
                    "\n" +
                    "\n" +
                    "            System.out.println(\"---------------------------------------------------------------------\");\n" +
                    "            System.out.println(\"---------------------------------------------------------------------\");\n" +
                    "            System.out.println();\n" +
                    "        } catch (IOException | NoSuchFieldException | ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {\n" +
                    "            e.printStackTrace();\n" +
                    "        }\n}");


            w.println("\n" +
                    "    \n" +
                    "    public static void InitObjects(String tableName,int num) throws IOException, JSONException {\n" +
                    "        try {\n" +
                    "            Class<?> clazz = Class.forName(\"CodeGeneration.\"+tableName);\n" +
                    "            Method m= clazz.getMethod(\"getData\");\n" +
                    "            Object instance = clazz.newInstance();\n" +
                    "            if(num==1)\n" +
                    "                objects1 = (List<Object>)m.invoke(instance);\n" +
                    "            else\n" +
                    "                objects2 = (List<Object>)m.invoke(instance);\n" +
                    "        } catch (ClassNotFoundException | NoSuchMethodException e) {\n" +
                    "            e.printStackTrace();\n" +
                    "        } catch (IllegalAccessException e) {\n" +
                    "            e.printStackTrace();\n" +
                    "        } catch (InvocationTargetException e) {\n" +
                    "            e.printStackTrace();\n" +
                    "        } catch (InstantiationException e) {\n" +
                    "            e.printStackTrace();\n" +
                    "        }\n" +
                    "    }\n");
            w.println("\npublic static void Init() throws IOException {\n" +
                    "        String source = \"samples//samples.txt\";\n" +
                    "        CharStream cs = fromFileName(source);\n" +
                    "        SQLLexer lexer = new SQLLexer(cs);\n" +
                    "        CommonTokenStream token = new CommonTokenStream(lexer);\n" +
                    "        SQLParser parser = new SQLParser(token);\n" +
                    "        ParseTree tree = parser.parse();\n" +
                    "        Parse p = (Parse) new BaseVisitor().visit(tree);\n" +
                    "    } \n}");
            w.close();
        } catch (Exception e) {
            w.close();
        }
    }


    public static void CreateTable(String tableName, ArrayList<ArrayList<Object>> key) {
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
        createClass_Table(table);
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

}
