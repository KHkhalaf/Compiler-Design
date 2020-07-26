package Java;

import CodeGeneration.CreateClass;
import Java.AST.Parse;
import Java.AST.QueryStmt.*;
import Java.Base.BaseVisitor;
import Java.SymbolTable.SymbolTable;
import Java.SymbolTable.Type;
import generated.SQLLexer;
import generated.SQLParser;
import javafx.util.Pair;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static SymbolTable symbolTable = new SymbolTable();
    public static int SymbolTable_iteration = -1;

    public static void main(String[] args) {
        try {
            String source = "samples//samples.txt";
            CharStream cs = fromFileName(source);
            SQLLexer lexer = new SQLLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            SQLParser parser = new SQLParser(token);
            ParseTree tree = parser.parse();

            System.out.println();

            Parse p = (Parse) new BaseVisitor().visit(tree);
            createClassesAndImplement();
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createClassesAndImplement() {
        for (int i = 0; i < symbolTable.Selectstatments.size(); i++) {
            if (symbolTable.Selectstatments.get(i) instanceof CreateTable) {
                CreateClass.createClass_Table((CreateTable) symbolTable.Selectstatments.get(i));
            } else if (symbolTable.Selectstatments.get(i) instanceof CreateType) {
                CreateClass.createClass_Type((CreateType) symbolTable.Selectstatments.get(i));
            }

        }
        CreateClass.CreateMain(symbolTable.getDeclaredTypes());
    }


    public static Object GetTypeFromSelect(SelectOrValues factoredSelectStmt, List<Object> table1, List<Object> table2) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, MalformedURLException, InvocationTargetException {
        Type type = new Type();
        ArrayList<Object> Data = new ArrayList<Object>();
        SelectOrValues selectOrValues = factoredSelectStmt;
        FromItem fromItem = factoredSelectStmt.fromItem;
        List<ResultColumn> Columns = factoredSelectStmt.Columns;
        JoinClause joinClause = factoredSelectStmt.joinClause;
        ExprSQL WhereExprSQL = factoredSelectStmt.WhereExprSQL;
        ExprSQL GroupByExprSQL = factoredSelectStmt.GroupByExprSQL;
        ExprSQL HavingExprSQL = factoredSelectStmt.HavingExprSQL;
        //ArrayList<OrderingTerm> orderingTerms = factoredSelectStmt.OrderingTerms;

        ArrayList<ArrayList<Object>> _newData = new ArrayList<>();
        if (joinClause != null) {

            if (table1.get(0).getClass().toString().contains(joinClause.fromItems.get(0).fromItem))
                Data.addAll(table1);
            else
                Data.addAll(table2);
            ExprSQL exprSQLParent = new ExprSQL();
            if (joinClause.joinConstraints.size() > 0) {
                exprSQLParent = joinClause.joinConstraints.get(0).exprSQL;
            }
            /*if (WhereExprSQL != null) {
                if (joinClause.joinConstraints.size() == 0)
                    exprSQLParent = WhereExprSQL;
                else {
                    exprSQLParent.exprSQL_left = joinClause.joinConstraints.get(0).exprSQL;
                    exprSQLParent.exprSQL_right = WhereExprSQL;
                    exprSQLParent.Operator = "AND";
                }
            }*/
            ArrayList<Pair<Object, Object>> result = new ArrayList<>();
            String OperatorParent = exprSQLParent.Operator;
            if (OperatorParent.toUpperCase().equals("AND") || OperatorParent.toLowerCase().equals("OR") || OperatorParent.toLowerCase().equals("=")) {
                Object value = null;
                if (OperatorParent.toUpperCase().equals("AND") || OperatorParent.toLowerCase().equals("OR")) {
                    ExprSQL exprSQLLeftParent = exprSQLParent.exprSQL_left;
                    ExprSQL exprSQLRightParent = exprSQLParent.exprSQL_right;
                    //   Left Side
                    ExprSQL exprSQLLeft = exprSQLLeftParent.exprSQL_left;
                    ExprSQL exprSQLRight = exprSQLLeftParent.exprSQL_right;

                    String Operator = exprSQLLeftParent.Operator;
                    String columnLeft = exprSQLLeft.variable;
                    String tableNameLeft = columnLeft.substring(0, columnLeft.indexOf("."));
                    String ColumnNameLeft = columnLeft.substring(columnLeft.indexOf(".") + 1);

                    String columnRight = exprSQLRight.variable;
                    String tableNameRight = columnRight.substring(0, columnRight.indexOf("."));
                    String ColumnNameRight = columnRight.substring(columnRight.indexOf(".") + 1);

                    //  Right Side
                    ExprSQL _exprSQLLeft = exprSQLRightParent.exprSQL_left;
                    ExprSQL _exprSQLRight = exprSQLRightParent.exprSQL_right;

                    String _Operator = exprSQLRightParent.Operator;
                    String _columnLeft = _exprSQLLeft.variable;
                    String _tableNameLeft = _columnLeft.substring(0, _columnLeft.indexOf("."));
                    String _ColumnNameLeft = _columnLeft.substring(_columnLeft.indexOf(".") + 1);

                    String _columnRight = _exprSQLRight.variable, _tableNameRight = "", _ColumnNameRight = "";
                    if (_columnRight.contains(".")) {
                        _tableNameRight = _columnRight.substring(0, _columnRight.indexOf("."));
                        _ColumnNameRight = _columnRight.substring(_columnRight.indexOf(".") + 1);
                    } else {
                        if (_exprSQLRight.valueNumber != 0.0)
                            value = _exprSQLRight.valueNumber;
                        else
                            value = _exprSQLRight.valueString;
                    }
                    if (!table1.get(0).getClass().toString().contains(tableNameLeft)) {
                        ArrayList<Object> temp = new ArrayList<>();
                        temp.addAll(table1);
                        table1 = table2;
                        table2 = temp;
                    }
                    for (Object obj : table1) {
                        Class<?> clazz = obj.getClass();
                        Field fieldTable = clazz.getField(ColumnNameLeft);
                        Object fieldValueColumn1 = fieldTable.get(obj);

                        for (Object _obj : table2) {
                            clazz = _obj.getClass();
                            fieldTable = clazz.getField(ColumnNameRight);
                            Object fieldValueColumn2 = fieldTable.get(_obj);
                            Object _fieldValueColumn1 = "", _fieldValueColumn2 = "";
                            if (table1.get(0).getClass().toString().contains(_tableNameLeft)) {
                                clazz = obj.getClass();
                                fieldTable = clazz.getField(_ColumnNameLeft);
                                _fieldValueColumn1 = fieldTable.get(obj);
                            } else {
                                clazz = _obj.getClass();
                                fieldTable = clazz.getField(_ColumnNameLeft);
                                _fieldValueColumn1 = fieldTable.get(_obj);
                            }
                            if (value != null)
                                _fieldValueColumn2 = value;
                            else {
                                if (table1.get(0).getClass().toString().contains(_tableNameRight)) {
                                    clazz = _obj.getClass();
                                    fieldTable = clazz.getField(_ColumnNameRight);
                                    _fieldValueColumn2 = fieldTable.get(_obj);
                                } else {
                                    clazz = _obj.getClass();
                                    fieldTable = clazz.getField(_ColumnNameRight);
                                    _fieldValueColumn2 = fieldTable.get(_obj);
                                }
                            }
                            if (OperatorParent.toUpperCase().equals("AND") &&
                                    ExprIsTrue(fieldValueColumn1, fieldValueColumn2, Operator) &&
                                    ExprIsTrue(_fieldValueColumn1, _fieldValueColumn2, _Operator)) {
                                result.add(new Pair<>(obj, _obj));
                            } else if (OperatorParent.toUpperCase().equals("OR") &&
                                    (ExprIsTrue(fieldValueColumn1, fieldValueColumn2, Operator) ||
                                    ExprIsTrue(_fieldValueColumn1, _fieldValueColumn2, _Operator))) {
                                result.add(new Pair<>(obj, _obj));
                            }
                        }
                    }
                }
                else if (OperatorParent.toLowerCase().equals("=")) {
                    ExprSQL exprSQLLeftParent = exprSQLParent.exprSQL_left;
                    ExprSQL exprSQLRightParent = exprSQLParent.exprSQL_right;

                    String columnLeft = exprSQLLeftParent.variable;
                    String tableNameLeft = columnLeft.substring(0, columnLeft.indexOf("."));
                    String ColumnNameLeft = columnLeft.substring(columnLeft.indexOf(".") + 1);

                    String columnRight = exprSQLRightParent.variable;
                    String tableNameRight = columnRight.substring(0, columnRight.indexOf("."));
                    String ColumnNameRight = columnRight.substring(columnRight.indexOf(".") + 1);

                    if (!joinClause.fromItems.get(0).fromItem.equals(tableNameLeft)) {
                        ArrayList<Object> temp = new ArrayList<>();
                        temp.addAll(table1);
                        table1 = table2;
                        table2 = temp;
                    }
                    for (Object obj : table1) {
                        Class<?> clazz = obj.getClass();
                        Field fieldTable = clazz.getField(ColumnNameLeft);
                        Object fieldValueColumn1 = fieldTable.get(obj);

                        for (Object _obj : table2) {
                            clazz = _obj.getClass();
                            fieldTable = clazz.getField(ColumnNameRight);
                            Object fieldValueColumn2 = fieldTable.get(_obj);

                            if (ExprIsTrue(fieldValueColumn1, fieldValueColumn2, OperatorParent)) {
                                result.add(new Pair<>(obj, _obj));
                            }
                        }
                    }
                    ArrayList<ArrayList<Pair<Object, Object>>> table = new ArrayList<>();
                    ArrayList<Pair<Object, Object>> row = new ArrayList<>();
                    value = null;
                    for (int i = 0; i < result.size(); i++) {
                        row = new ArrayList<>();
                        Object objKey = result.get(i).getKey();
                        Class<?> clazz = objKey.getClass();
                        Field[] fields = clazz.getDeclaredFields();
                        for (int j = 0; j < fields.length; j++) {
                            Field field = fields[j];
                            Object name = field.getName();
                            value = field.get(objKey);
                            row.add(new Pair<>(name, value));
                        }
                        Object objValue = result.get(i).getValue();
                        clazz = objValue.getClass();
                        fields = clazz.getDeclaredFields();
                        for (int j = 0; j < fields.length; j++) {
                            Field field = fields[j];
                            Object name = field.getName();
                            value = field.get(objValue);
                            row.add(new Pair<>(name, value));
                        }
                        table.add(row);
                    }
                }
                if(WhereExprSQL!=null){

                    if(WhereExprSQL.Operator.toUpperCase().equals("LIKE") || WhereExprSQL.Operator.toUpperCase().equals("=")) {
                        ExprSQL exprSQLLeft = WhereExprSQL.exprSQL_left;
                        ExprSQL exprSQLRight = WhereExprSQL.exprSQL_right;
                        String table = exprSQLLeft.variable;
                        Object _obj = null;
                        ArrayList<Pair<Object, Object>> _result = new ArrayList<>();
                        if(table.contains("."))
                            table = table.substring(0,table.indexOf("."));
                        for (Pair<Object,Object> obj : result) {
                            if(obj.getKey().getClass().toString().toUpperCase().contains(table.toUpperCase()))
                                _obj = obj.getKey();
                            else
                                _obj = obj.getValue();
                                if (ExprIsTrue(WhereExprSQL, _obj))
                                    _result.add(obj);
                        }
                        result = new ArrayList<>();
                        result.addAll(_result);
                    }

                }
                ArrayList<ArrayList<Pair<Object, Object>>> table = new ArrayList<>();
                ArrayList<Pair<Object, Object>> row = new ArrayList<>();
                for (int i = 0; i < result.size(); i++) {
                    row = new ArrayList<>();
                    Object objKey = result.get(i).getKey();
                    Class<?> clazz = objKey.getClass();
                    Field[] fields = clazz.getDeclaredFields();
                    for (int j = 0; j < fields.length; j++) {
                        Field field = fields[j];
                        Object name = field.getName();
                        value = field.get(objKey);
                        row.add(new Pair<>(name, value));
                    }
                    Object objValue = result.get(i).getValue();
                    clazz = objValue.getClass();
                    fields = clazz.getDeclaredFields();
                    for (int j = 0; j < fields.length; j++) {
                        Field field = fields[j];
                        Object name = field.getName();
                        value = field.get(objValue);
                        row.add(new Pair<>(name, value));
                    }
                    table.add(row);
                }
                ArrayList<ArrayList<Object>> results = new ArrayList<>();
                if (GroupByExprSQL != null) {
                    String ColumnNameView = "", column = "";
                    ArrayList<ArrayList<Pair<Object, Object>>> checked = null;
                    String groupBy = GroupByExprSQL.variable;
                    ArrayList<Object> _row = new ArrayList<>();
                    for (int i = 0; i < Columns.size(); i++) {
                        if (Columns.get(i).functionExpr == null) {
                            _row.add(Columns.get(i).columnName);
                        } else {
                            ColumnNameView = Columns.get(i).columnName.length() > 0 ?
                                    Columns.get(i).columnName : Columns.get(i).functionExpr.functionName;
                            _row.add(ColumnNameView);
                        }
                    }
                    _newData.add(_row);
                    for (int j = 0; j < table.size(); j++) {
                        ArrayList<Pair<Object, Object>> obj = table.get(j);
                        checked = new ArrayList<>();
                        checked.add(obj);
                        Object Value1 = null;
                        for (int i = 0; i < obj.size(); i++) {
                            Pair<Object, Object> p = obj.get(i);
                            if (p.getKey().equals(groupBy))
                                Value1 = p.getValue();
                        }
                        for (int k = j + 1; k < table.size(); k++) {
                            obj = table.get(k);
                            Object Value2 = null;
                            for (int i = 0; i < obj.size(); i++) {
                                Pair<Object, Object> p = obj.get(i);
                                if (p.getKey().equals(groupBy))
                                    Value2 = p.getValue();
                            }
                            if (Value1.equals(Value2)) {
                                checked.add(obj);
                            }
                        }
                        _row = new ArrayList<>();
                        ArrayList<Pair<Object, Object>> _obj = checked.get(0);
                        for (int i = 0; i < _obj.size(); i++) {
                            Pair<Object, Object> p = obj.get(i);
                            if (p.getKey().equals(groupBy)){
                                _row.add(p.getValue());
                                break;
                            }
                        }
                        for (int i = 0; i < Columns.size(); i++) {
                            ArrayList<Double> numbers = new ArrayList<>();
                            column = Columns.get(i).columnName;
                            if (column.contains("."))
                                column = column.substring(column.indexOf(".") + 1);
                            if (Columns.get(i).functionExpr != null) {
                                column = Columns.get(i).functionExpr.exprSQLList.get(0).variable;
                                if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("COUNT")) {
                                    for (int l = 1; l <= checked.size(); l++) {
                                        numbers.add(Double.parseDouble("1"));
                                    }
                                } else {
                                    for (ArrayList<Pair<Object, Object>> obj1 : checked)
                                        for (Pair<Object, Object> P : obj1)
                                            if (P.getKey().toString().equals(column))
                                                numbers.add(Double.parseDouble(P.getValue().toString()));
                                }

                                if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("AVG"))
                                    _row.add(GetAggregationFunction("AVG", numbers));
                                else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("SUM"))
                                    _row.add(GetAggregationFunction("SUM", numbers));
                                else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("MAX"))
                                    _row.add(GetAggregationFunction("MAX", numbers));
                                else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("MIN"))
                                    _row.add(GetAggregationFunction("MIN", numbers));
                                else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("COUNT"))
                                    _row.add(GetAggregationFunction("COUNT", numbers));
                                else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("STDDEV"))
                                    _row.add(GetAggregationFunction("STDDEV", numbers));
                            }
                        }
                        if (HavingExprSQL == null)
                            _newData.add(_row);
                        else {
                            ArrayList<Double> numbers = new ArrayList<>();
                            double res = 0;
                            column = HavingExprSQL.exprSQL_left.functionExpr.exprSQLList.get(0).variable;
                            if (HavingExprSQL.exprSQL_left.functionExpr.functionName.toUpperCase().equals("COUNT")) {
                                for (int l = 1; l <= checked.size(); l++) {
                                    numbers.add(Double.parseDouble("1"));
                                }
                            } else {
                                for (ArrayList<Pair<Object, Object>> obj1 : checked)
                                    for (Pair<Object, Object> P : obj1)
                                        if (P.getKey().toString().equals(column))
                                            numbers.add(Double.parseDouble(P.getValue().toString()));
                            }


                            if (HavingExprSQL.exprSQL_left.functionExpr.functionName.toUpperCase().equals("AVG"))
                                res = (double) GetAggregationFunction("AVG", numbers);
                            else if (HavingExprSQL.exprSQL_left.functionExpr.functionName.toUpperCase().equals("SUM"))
                                res = (double) GetAggregationFunction("SUM", numbers);
                            else if (HavingExprSQL.exprSQL_left.functionExpr.functionName.toUpperCase().equals("MAX"))
                                res = (double) GetAggregationFunction("MAX", numbers);
                            else if (HavingExprSQL.exprSQL_left.functionExpr.functionName.toUpperCase().equals("MIN"))
                                res = (double) GetAggregationFunction("MIN", numbers);
                            else if (HavingExprSQL.exprSQL_left.functionExpr.functionName.toUpperCase().equals("COUNT"))
                                res = (double) GetAggregationFunction("COUNT", numbers);
                            else if (HavingExprSQL.exprSQL_left.functionExpr.functionName.toUpperCase().equals("STDDEV"))
                                res = (double)GetAggregationFunction("STDDEV", numbers);

                            if (HavingExprSQL.Operator.equals("=") || HavingExprSQL.Operator.equals(">=") || HavingExprSQL.Operator.equals("<=")
                                    || HavingExprSQL.Operator.equals(">") || HavingExprSQL.Operator.equals("<")) {
                                double _value = HavingExprSQL.exprSQL_right.valueNumber;

                                if (res == _value && HavingExprSQL.Operator.equals("="))
                                    _newData.add(_row);
                                else if (res >= _value && HavingExprSQL.Operator.equals(">="))
                                    _newData.add(_row);
                                else if (res <= _value && HavingExprSQL.Operator.equals("<="))
                                    _newData.add(_row);
                                else if (res > _value && HavingExprSQL.Operator.equals(">"))
                                    _newData.add(_row);
                                else if (res < _value && HavingExprSQL.Operator.equals("<"))
                                    _newData.add(_row);
                            }
                        }
                    }
                    return new Pair<>(_newData, "_newData");
                } else {
                    String column = "";
                    ArrayList<Double> numbers = new ArrayList<Double>();
                    ArrayList<Object> _row = new ArrayList<>();
                    for (int i = 0; i < Columns.size(); i++) {
                        column = Columns.get(i).columnName.length() > 0 ?
                                Columns.get(i).columnName : Columns.get(i).functionExpr.functionName;
                        _row.add(column);
                    }
                    results.add(_row);
                    _row = new ArrayList<>();
                    for (int i = 0; i < Columns.size(); i++) {
                        numbers = new ArrayList<>();
                        column = Columns.get(i).columnName.length() > 0 ?
                                Columns.get(i).columnName : Columns.get(i).functionExpr.exprSQLList.get(0).variable;
                        if (Columns.get(i).functionExpr != null) {
                            column = Columns.get(i).functionExpr.exprSQLList.get(0).variable;
                            if (column.equals("*")) {
                                for (int j = 1; j <= table.size(); j++) {
                                    numbers.add((double) ((Integer) 1));
                                }
                            } else {
                                for (ArrayList<Pair<Object, Object>> obj : table) {
                                    for (Pair<Object, Object> P : obj) {
                                        if (P.getKey().toString().equals(column))
                                            numbers.add(Double.parseDouble(P.getValue().toString()));
                                    }
                                }
                            }
                            if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("AVG"))
                                _row.add(GetAggregationFunction("AVG", numbers));
                            else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("SUM"))
                                _row.add(GetAggregationFunction("SUM", numbers));
                            else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("MAX"))
                                _row.add(GetAggregationFunction("MAX", numbers));
                            else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("MIN"))
                                _row.add(GetAggregationFunction("MIN", numbers));
                            else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("COUNT"))
                                _row.add(GetAggregationFunction("COUNT", numbers));
                            else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("STDDEV"))
                                _row.add(GetAggregationFunction("STDDEV", numbers));
                        } else {
                            for (int l = 0; l < table.size(); l++) {
                                _row = new ArrayList<>();
                                for (int j = 0; j < Columns.size(); j++) {
                                    column = Columns.get(j).columnName;
                                    if (column.contains("."))
                                        column = column.substring(column.indexOf(".") + 1);
                                    for (int k = 0; k < table.get(l).size(); k++)
                                        if (column.equals(table.get(l).get(k).getKey().toString()))
                                            _row.add(table.get(l).get(k).getValue());
                                }
                                results.add(_row);
                            }
                            _row = null;
                        }
                    }
                    if (_row != null)
                        results.add(_row);

                    return new Pair<>(results, "results");
                }
            }
        }

        if (table1.get(0).getClass().toString().contains(fromItem.fromItem))
            Data.addAll(table1);
        else
            Data.addAll(table2);
        ArrayList<Object> NewCities = new ArrayList<>();

        if (WhereExprSQL != null) {
            if (WhereExprSQL.Operator.equals("=") || WhereExprSQL.Operator.equals(">=") || WhereExprSQL.Operator.equals("<=")
                    || WhereExprSQL.Operator.equals(">") || WhereExprSQL.Operator.equals("<")) {
                String column = WhereExprSQL.exprSQL_left.variable;
                Object value;
                if (WhereExprSQL.exprSQL_right.valueString != null)
                    value = WhereExprSQL.exprSQL_right.valueString;
                else
                    value = WhereExprSQL.exprSQL_right.valueNumber;
                for (Object obj : Data) {
                    Class<?> clazz = obj.getClass();
                    Field field = clazz.getField(column);
                    Object fieldValue = field.get(obj);

                    if (String.valueOf(fieldValue).equals(value.toString()) && WhereExprSQL.Operator.equals("="))
                        NewCities.add(obj);
                    else if (Double.parseDouble(fieldValue.toString()) >= Double.parseDouble(value.toString()) && WhereExprSQL.Operator.equals(">="))
                        NewCities.add(obj);
                    else if (Double.parseDouble(fieldValue.toString()) <= Double.parseDouble(value.toString()) && WhereExprSQL.Operator.equals("<="))
                        NewCities.add(obj);
                    else if (Double.parseDouble(fieldValue.toString()) > Double.parseDouble(value.toString()) && WhereExprSQL.Operator.equals(">"))
                        NewCities.add(obj);
                    else if (Double.parseDouble(fieldValue.toString()) < Double.parseDouble(value.toString()) && WhereExprSQL.Operator.equals("<"))
                        NewCities.add(obj);
                }
            }
            else if (WhereExprSQL.Operator.equals("like")) {
                String column = WhereExprSQL.exprSQL_left.variable;
                Object value;
                if (WhereExprSQL.exprSQL_right.valueString != null)
                    value = WhereExprSQL.exprSQL_right.valueString;
                else
                    value = WhereExprSQL.exprSQL_right.valueNumber;
                value = value.toString().startsWith("%") ? value.toString().substring(1) : value;
                value = value.toString().endsWith("%") ? value.toString().substring(0, value.toString().length() - 1) : value;
                if (!column.contains(".")) {
                    for (Object obj : Data) {
                        Class<?> clazz = obj.getClass();
                        Field field = clazz.getField(column);
                        Object fieldValue = field.get(obj);
                        if ((String.valueOf(fieldValue)).toUpperCase().contains(value.toString().toUpperCase()))
                            NewCities.add(obj);
                    }
                } else {
                    String tableName = column.substring(0, column.indexOf("."));
                    String ColumnName = column.substring(column.indexOf(".") + 1);
                    for (Object obj : Data) {
                        Class<?> clazz = obj.getClass();
                        Field fieldTable = clazz.getField(tableName);
                        Object fieldValueTable = fieldTable.get(obj);
                        Class<?> clazzColumn = fieldValueTable.getClass();
                        Field fieldColumn = clazzColumn.getField(ColumnName);
                        Object fieldValueColumn = fieldColumn.get(fieldValueTable);
                        if (String.valueOf(fieldValueColumn).contains(value.toString()))
                            NewCities.add(obj);
                    }
                }
            }
            else if (WhereExprSQL.Operator.toUpperCase().equals("AND") || WhereExprSQL.Operator.toUpperCase().equals("OR")) {
                ExprSQL exprSQLLeft = WhereExprSQL.exprSQL_left;
                ExprSQL exprSQLRight = WhereExprSQL.exprSQL_right;

                for (Object obj : Data) {
                    if (ExprIsTrue(exprSQLLeft, obj) && ExprIsTrue(exprSQLRight, obj) && WhereExprSQL.Operator.toUpperCase().equals("AND"))
                        NewCities.add(obj);
                    if ((ExprIsTrue(exprSQLLeft, obj) || ExprIsTrue(exprSQLRight, obj)) && WhereExprSQL.Operator.toUpperCase().equals("OR"))
                        NewCities.add(obj);
                }
            }
            else if (WhereExprSQL.Operator.toUpperCase().equals("IN")) {
                if (WhereExprSQL.exprInStatm.size() > 0) {
                    String database = null, table=null,column = WhereExprSQL.exprSQL_left.variable;
                    if(column.contains(".")){
                        table = column.substring(0,column.indexOf("."));
                        column = column.substring(column.indexOf(".")+1);
                        if(column.contains(".")){
                            database = table;
                            table = column.substring(0,column.indexOf("."));
                            column = column.substring(column.indexOf(".")+1);
                        }
                    }
                    for (Object obj : Data) {
                        Class<?> clazz = obj.getClass();
                        Field field;Object fieldValue;
                        if(database!=null){
                            field = clazz.getField(database);
                            fieldValue = field.get(obj);
                            clazz = fieldValue.getClass();
                            field = clazz.getField(table);
                            fieldValue = field.get(fieldValue);
                            clazz = fieldValue.getClass();
                            field = clazz.getField(column);
                            fieldValue = field.get(fieldValue);
                            clazz = fieldValue.getClass();
                            field = clazz.getField("___name");
                            fieldValue = field.get(fieldValue);
                        }
                        else if(table!=null){
                            field = clazz.getField(table);
                            fieldValue = field.get(obj);
                            clazz = fieldValue.getClass();
                            field = clazz.getField(column);
                            fieldValue = field.get(fieldValue);
                            clazz = fieldValue.getClass();
                            field = clazz.getField("___name");
                            fieldValue = field.get(fieldValue);
                        }
                        else{
                            field = clazz.getField(column);
                            fieldValue = field.get(obj);
                        }
                        for (ExprSQL exprSQL : WhereExprSQL.exprInStatm) {
                            Object value;
                            if (exprSQL.valueString != null)
                                value = exprSQL.valueString;
                            else
                                value = exprSQL.valueNumber;
                            if (fieldValue.equals(value))
                                NewCities.add(obj);
                        }
                    }
                } else if (WhereExprSQL.selectCore != null) {
                    FactoredSelectStmt _factoredSelectStmt = new FactoredSelectStmt();
                    _factoredSelectStmt.selectOrValues = WhereExprSQL.selectCore;
                    ArrayList<Object> subTable = (ArrayList<Object>) GetTypeFromSelect(_factoredSelectStmt.selectOrValues, Data, null);
                    String column = WhereExprSQL.exprSQL_left.variable;
                    for (Object Obj : Data) {
                        Class<?> clazz = Obj.getClass();
                        Field field = clazz.getField(column);
                        Object fieldValue1 = field.get(Obj);

                        for (Object subObj : subTable) {
                            clazz = subObj.getClass();
                            field = clazz.getField(column);
                            Object fieldValue2 = field.get(subObj);

                            if (fieldValue1.equals(fieldValue2))
                                NewCities.add(Obj);
                        }
                    }
                }
            }
        } else {
            NewCities = Data;
        }
        if (Columns.get(0).columnName.equals("*"))
            return new Pair<>(NewCities, "NewCities");
        _newData = new ArrayList<>();
        if (GroupByExprSQL != null) {
            String ColumnNameView = "", column = "";
            ArrayList<Object> checked = null;
            String _groupBy = GroupByExprSQL.variable;
            String groupBy = _groupBy;
            String groupBy1 = GroupByExprSQL.variable;
            if (groupBy.contains(".")) {
                groupBy = _groupBy.substring(0, _groupBy.indexOf("."));
                groupBy1 = _groupBy.substring(_groupBy.indexOf(".") + 1);
            }
            ArrayList<Object> row = new ArrayList<>();
            for (int i = 0; i < Columns.size(); i++) {
                if (Columns.get(i).functionExpr == null) {
                    row.add(Columns.get(i).columnName);
                } else {
                    ColumnNameView = Columns.get(i).columnName.length() > 0 ?
                            Columns.get(i).columnName : Columns.get(i).functionExpr.functionName;
                    row.add(ColumnNameView);
                }
            }
            _newData.add(row);

            if (_groupBy.contains(".")) {
                for (int j = 0; j < NewCities.size(); j++) {
                    Object obj1 = NewCities.get(j);
                    checked = new ArrayList<>();
                    checked.add(obj1);
                    Class<?> clazz = obj1.getClass();
                    Field field = clazz.getField(groupBy);
                    Object fieldValue1 = field.get(obj1);
                    for (int k = 1; k < NewCities.size(); k++) {
                        Object obj2 = NewCities.get(k);
                        clazz = obj2.getClass();
                        field = clazz.getField(groupBy);
                        Object fieldValue2 = field.get(obj2);
                        if (fieldValue1.equals(fieldValue2)) {
                            checked.add(obj2);
                        }
                    }
                    row = new ArrayList<>();
                    ArrayList<Object> _checked = null;
                    for (int k = 0; k < checked.size(); k++) {
                        obj1 = checked.get(k);
                        _checked = new ArrayList<>();
                        _checked.add(obj1);
                        clazz = obj1.getClass();
                        field = clazz.getField(groupBy1);
                        fieldValue1 = field.get(obj1);
                        for (int l = 1; l < checked.size(); l++) {
                            Object obj2 = checked.get(l);
                            clazz = obj2.getClass();
                            field = clazz.getField(groupBy1);
                            Object fieldValue2 = field.get(obj2);
                            if (fieldValue1.equals(fieldValue2)) {
                                _checked.add(obj2);
                            }
                        }
                        row = new ArrayList<>();
                        Object _obj = _checked.get(0);
                        clazz = _obj.getClass();
                        field = clazz.getField(groupBy);
                        Object _fieldValue = field.get(_obj);
                        row.add(_fieldValue);
                        field = clazz.getField(groupBy1);
                        _fieldValue = field.get(_obj);
                        row.add(_fieldValue);

                        for (int i = 0; i < Columns.size(); i++) {
                            ArrayList<Double> numbers = new ArrayList<>();
                            if (Columns.get(i).functionExpr != null) {
                                column = Columns.get(i).functionExpr.exprSQLList.get(0).variable;
                                if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("COUNT")) {
                                    for (int l = 1; l <= checked.size(); l++) {
                                        numbers.add(Double.parseDouble("1"));
                                    }
                                } else {
                                    for (Object obj : _checked) {
                                        clazz = obj.getClass();
                                        field = clazz.getField(column);
                                        Object fieldValue = field.get(obj);
                                        numbers.add(Double.parseDouble(fieldValue.toString()));
                                    }
                                }
                                if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("AVG"))
                                    row.add(GetAggregationFunction("AVG", numbers));
                                else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("SUM"))
                                    row.add(GetAggregationFunction("SUM", numbers));
                                else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("MAX"))
                                    row.add(GetAggregationFunction("MAX", numbers));
                                else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("MIN"))
                                    row.add(GetAggregationFunction("MIN", numbers));
                                else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("COUNT"))
                                    row.add(GetAggregationFunction("COUNT", numbers));
                                else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("STDDEV"))
                                    row.add(GetAggregationFunction("STDDEV", numbers));
                            }
                        }
                        if (HavingExprSQL == null)
                            _newData.add(row);
                        else {
                            ArrayList<Double> numbers = new ArrayList<>();
                            double result = 0;
                            column = HavingExprSQL.exprSQL_left.functionExpr.exprSQLList.get(0).variable;
                            if (HavingExprSQL.exprSQL_left.functionExpr.functionName.toUpperCase().equals("COUNT")) {
                                for (int l = 1; l <= checked.size(); l++) {
                                    numbers.add(Double.parseDouble("1"));
                                }
                            } else {
                                for (Object obj : _checked) {
                                    clazz = obj.getClass();
                                    field = clazz.getField(column);
                                    Object fieldValue = field.get(obj);
                                    numbers.add(Double.parseDouble(fieldValue.toString()));
                                }
                            }

                            if (HavingExprSQL.exprSQL_left.functionExpr.functionName.toUpperCase().equals("AVG"))
                                result = (double) GetAggregationFunction("AVG", numbers);
                            else if (HavingExprSQL.exprSQL_left.functionExpr.functionName.toUpperCase().equals("SUM"))
                                result = (double) GetAggregationFunction("SUM", numbers);
                            else if (HavingExprSQL.exprSQL_left.functionExpr.functionName.toUpperCase().equals("MAX"))
                                result = (double) GetAggregationFunction("MAX", numbers);
                            else if (HavingExprSQL.exprSQL_left.functionExpr.functionName.toUpperCase().equals("MIN"))
                                result = (double) GetAggregationFunction("MIN", numbers);
                            else if (HavingExprSQL.exprSQL_left.functionExpr.functionName.toUpperCase().equals("COUNT"))
                                result = (double) GetAggregationFunction("COUNT", numbers);
                            else if (HavingExprSQL.exprSQL_left.functionExpr.functionName.toUpperCase().equals("STDDEV"))
                                result = (double) GetAggregationFunction("STDDEV", numbers);

                            if (HavingExprSQL.Operator.equals("=") || HavingExprSQL.Operator.equals(">=") || HavingExprSQL.Operator.equals("<=")
                                    || HavingExprSQL.Operator.equals(">") || HavingExprSQL.Operator.equals("<")) {
                                double value = HavingExprSQL.exprSQL_right.valueNumber;

                                if (result == value && HavingExprSQL.Operator.equals("="))
                                    _newData.add(row);
                                else if (result >= value && HavingExprSQL.Operator.equals(">="))
                                    _newData.add(row);
                                else if (result <= value && HavingExprSQL.Operator.equals("<="))
                                    _newData.add(row);
                                else if (result > value && HavingExprSQL.Operator.equals(">"))
                                    _newData.add(row);
                                else if (result < value && HavingExprSQL.Operator.equals("<"))
                                    _newData.add(row);
                            }
                        }
                        for (Object _obj1 : _checked)
                            for (Object _obj2 : checked) {
                                if (_obj2.equals(_obj1)) {
                                    checked.remove(_obj2);
                                    NewCities.remove(_obj2);
                                    break;
                                }
                        }
                    }
                }
                return new Pair<>(_newData, "_newData");
            }
            /////////// second side

            for (int j = 0; j < NewCities.size(); j++) {
                Object obj1 = NewCities.get(j);
                checked = new ArrayList<>();
                checked.add(obj1);
                Class<?> clazz = obj1.getClass();
                Field field = clazz.getField(groupBy);
                Object fieldValue1 = field.get(obj1);
                for (int k = 1; k < NewCities.size(); k++) {
                    Object obj2 = NewCities.get(k);
                    clazz = obj2.getClass();
                    field = clazz.getField(groupBy);
                    Object fieldValue2 = field.get(obj2);
                    if (fieldValue1.equals(fieldValue2)) {
                        checked.add(obj2);
                    }
                }
                row = new ArrayList<>();

                Object _obj = checked.get(0);
                clazz = _obj.getClass();
                field = clazz.getField(groupBy);
                Object _fieldValue = field.get(_obj);
                row.add(_fieldValue);
                for (int i = 0; i < Columns.size(); i++) {
                    ArrayList<Double> numbers = new ArrayList<>();
                    if (Columns.get(i).functionExpr != null) {
                        column = Columns.get(i).functionExpr.exprSQLList.get(0).variable;
                        if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("COUNT")) {
                            for (int l = 1; l <= checked.size(); l++) {
                                numbers.add(Double.parseDouble("1"));
                            }
                        } else {
                            for (Object obj : checked) {
                                clazz = obj.getClass();
                                field = clazz.getField(column);
                                Object fieldValue = field.get(obj);
                                numbers.add(Double.parseDouble(fieldValue.toString()));
                            }
                        }
                        if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("AVG"))
                            row.add(GetAggregationFunction("AVG", numbers));
                        else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("SUM"))
                            row.add(GetAggregationFunction("SUM", numbers));
                        else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("MAX"))
                            row.add(GetAggregationFunction("MAX", numbers));
                        else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("MIN"))
                            row.add(GetAggregationFunction("MIN", numbers));
                        else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("COUNT"))
                            row.add(GetAggregationFunction("COUNT", numbers));
                        else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("STDDEV"))
                            row.add(GetAggregationFunction("STDDEV", numbers));
                    }
                }
                if (HavingExprSQL == null)
                    _newData.add(row);
                else {
                    ArrayList<Double> numbers = new ArrayList<>();
                    double result = 0;
                    column = HavingExprSQL.exprSQL_left.functionExpr.exprSQLList.get(0).variable;
                    if (HavingExprSQL.exprSQL_left.functionExpr.functionName.toUpperCase().equals("COUNT")) {
                        for (int l = 1; l <= checked.size(); l++) {
                            numbers.add(Double.parseDouble("1"));
                        }
                    } else {
                        for (Object obj : checked) {
                            clazz = obj.getClass();
                            field = clazz.getField(column);
                            Object fieldValue = field.get(obj);
                            numbers.add(Double.parseDouble(fieldValue.toString()));
                        }
                    }


                    if (HavingExprSQL.exprSQL_left.functionExpr.functionName.toUpperCase().equals("AVG"))
                        result = (double) GetAggregationFunction("AVG", numbers);
                    else if (HavingExprSQL.exprSQL_left.functionExpr.functionName.toUpperCase().equals("SUM"))
                        result = (double) GetAggregationFunction("SUM", numbers);
                    else if (HavingExprSQL.exprSQL_left.functionExpr.functionName.toUpperCase().equals("MAX"))
                        result = (double) GetAggregationFunction("MAX", numbers);
                    else if (HavingExprSQL.exprSQL_left.functionExpr.functionName.toUpperCase().equals("MIN"))
                        result = (double) GetAggregationFunction("MIN", numbers);
                    else if (HavingExprSQL.exprSQL_left.functionExpr.functionName.toUpperCase().equals("COUNT"))
                        result = (double) GetAggregationFunction("COUNT", numbers);
                    else if (HavingExprSQL.exprSQL_left.functionExpr.functionName.toUpperCase().equals("STDDEV"))
                        result = (double) GetAggregationFunction("STDDEV", numbers);

                    if (HavingExprSQL.Operator.equals("=") || HavingExprSQL.Operator.equals(">=") || HavingExprSQL.Operator.equals("<=")
                            || HavingExprSQL.Operator.equals(">") || HavingExprSQL.Operator.equals("<")) {
                        double value = HavingExprSQL.exprSQL_right.valueNumber;

                        if (result == value && HavingExprSQL.Operator.equals("="))
                            _newData.add(row);
                        else if (result >= value && HavingExprSQL.Operator.equals(">="))
                            _newData.add(row);
                        else if (result <= value && HavingExprSQL.Operator.equals("<="))
                            _newData.add(row);
                        else if (result > value && HavingExprSQL.Operator.equals(">"))
                            _newData.add(row);
                        else if (result < value && HavingExprSQL.Operator.equals("<"))
                            _newData.add(row);
                    }
                }
                for (Object _obj1 : checked)
                    for (Object _obj2 : NewCities) {
                        if (_obj2.equals(_obj1)) {
                            NewCities.remove(_obj2);
                            break;
                        }
                    }
            }
            return new Pair<>(_newData, "_newData");
        }


        if (NewCities.size() > 0) {
            ArrayList<ArrayList<Object>> table = new ArrayList<>();
            ArrayList<Object> row = new ArrayList<>();
            Object value = null;

            ArrayList<Pair<Object, Object>> newData = new ArrayList<>();
            boolean IsFunctionExpr = false;
            for (int i = 0; i < Columns.size(); i++) {
                ArrayList<Double> numbers = new ArrayList<>();
                String ColumnNameView = "", column = "";
                if (Columns.get(i).functionExpr != null) {
                    ColumnNameView = Columns.get(i).columnName.length() > 0 ?
                            Columns.get(i).columnName : Columns.get(i).functionExpr.functionName;
                    column = Columns.get(i).functionExpr.exprSQLList.get(0).variable;
                }
                if (Columns.get(i).functionExpr != null && GroupByExprSQL == null) {
                    IsFunctionExpr = true;
                    if (column.equals("*")) {
                        for (int j = 1; j <= NewCities.size(); j++) {
                            numbers.add((double) ((Integer) 1));
                        }
                    } else {
                        for (Object obj : NewCities) {
                            Class<?> clazz = obj.getClass();
                            Field field = clazz.getField(column);
                            Object fieldValue = field.get(obj);
                            numbers.add((double) (fieldValue));
                        }
                    }
                    if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("AVG"))
                        newData.add(new Pair<>(ColumnNameView, GetAggregationFunction("AVG", numbers)));
                    else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("SUM"))
                        newData.add(new Pair<>(ColumnNameView, GetAggregationFunction("SUM", numbers)));
                    else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("MAX"))
                        newData.add(new Pair<>(ColumnNameView, GetAggregationFunction("MAX", numbers)));
                    else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("MIN"))
                        newData.add(new Pair<>(ColumnNameView, GetAggregationFunction("MIN", numbers)));
                    else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("COUNT"))
                        newData.add(new Pair<>(ColumnNameView, GetAggregationFunction("COUNT", numbers)));
                    else if (Columns.get(i).functionExpr.functionName.toUpperCase().equals("STDDEV"))
                        newData.add(new Pair<>(ColumnNameView, GetAggregationFunction("STDDEV", numbers)));
                }

            }
            if (!IsFunctionExpr) {
                for(int i=0;i<Columns.size();i++){
                    Object obj = Columns.get(i).columnName;
                    row.add(obj);
                }
                table.add(row);
                for (int i = 0; i < NewCities.size(); i++) {
                    row = new ArrayList<>();
                    Object objKey = NewCities.get(i);
                    Class<?> clazz = objKey.getClass();
                    Field[] fields = clazz.getDeclaredFields();
                    for (int j = 0; j < fields.length; j++) {
                        Field field = fields[j];
                        Object name = field.getName();
                        value = field.get(objKey);
                        for (int k = 0; k < Columns.size(); k++)
                            if (Columns.get(k).columnName.contains(".")) {
                                String tableName = Columns.get(k).columnName.substring(0, Columns.get(k).columnName.indexOf("."));
                                String columnName = Columns.get(k).columnName.substring(Columns.get(k).columnName.indexOf(".") + 1);
                                if (name.equals(tableName)) {
                                    clazz = objKey.getClass();
                                    Field fieldTable = clazz.getField(tableName);
                                    value = fieldTable.get(objKey);
                                    clazz = value.getClass();
                                    fieldTable = clazz.getField(columnName);
                                    value = fieldTable.get(value);
                                    row.add(value);
                                }
                            } else {
                                if (Columns.get(k).columnName.equals(name))
                                    row.add(value);
                                else if (Columns.get(k).functionExpr != null)
                                    if (Columns.get(k).functionExpr.exprSQLList.get(0).variable.equals(name)
                                            || (Columns.get(k).functionExpr.exprSQLList.get(0).variable.equals("*") && name.equals("id")))
                                        row.add(value);
                            }
                    }
                    table.add(row);
                }
                return new Pair<>(table, "table");
            } else {
                return new Pair<>(newData, "newData");
            }
        }
        return new Pair<>(NewCities, "NewCities");
    }

    public static boolean ExprIsTrue(Object obj1, Object obj2, String Operator) throws NoSuchFieldException, IllegalAccessException {


        if (Operator.equals("=") || Operator.equals(">=") || Operator.equals("<=")
                || Operator.equals(">") || Operator.equals("<")) {
            if (Operator.equals("="))
                if (String.valueOf(obj1).equals(obj2.toString()))
                    return true;
                else
                    return false;
            else if (Double.parseDouble(String.valueOf(obj1)) >= Double.parseDouble(obj2.toString()) && Operator.equals(">="))
                return true;
            else if (Double.parseDouble(String.valueOf(obj1)) <= Double.parseDouble(obj2.toString()) && Operator.equals("<="))
                return true;
            else if (Double.parseDouble(String.valueOf(obj1)) > Double.parseDouble(obj2.toString()) && Operator.equals(">"))
                return true;
            else if (Double.parseDouble(String.valueOf(obj1)) < Double.parseDouble(obj2.toString()) && Operator.equals("<"))
                return true;
        } else if (Operator.equals("like")) {
            Object value = obj2;
            value = value.toString().startsWith("%") ? value.toString().substring(1) : value;
            value = value.toString().endsWith("%") ? value.toString().substring(0, value.toString().length() - 1) : value;
            if ((String.valueOf(obj1)).toUpperCase().contains(value.toString().toUpperCase()))
                return true;
        }

        return false;
    }

    public static boolean ExprIsTrue(ExprSQL exprSQL, Object obj) throws NoSuchFieldException, IllegalAccessException {

        String database = "", table="",column = exprSQL.exprSQL_left.variable;;
        if(column.contains(".")){
            table = column.substring(0,column.indexOf("."));
            column = column.substring(column.indexOf(".")+1);
            if(column.contains(".")){
                database = table;
                table = column.substring(0,column.indexOf("."));
                column = column.substring(column.indexOf(".")+1);
            }
        }
        Class<?> clazz = obj.getClass();
        Field field = clazz.getField(column);
        Object fieldValue = field.get(obj);
        if (exprSQL.Operator.equals("=") || exprSQL.Operator.equals(">=") || exprSQL.Operator.equals("<=")
                || exprSQL.Operator.equals(">") || exprSQL.Operator.equals("<")|| exprSQL.Operator.equals("!=")) {
            Object value;
            if (exprSQL.exprSQL_right.valueString != null)
                value = exprSQL.exprSQL_right.valueString;
            else
                value = exprSQL.exprSQL_right.valueNumber;
            if (String.valueOf(fieldValue).equals(value.toString()) && exprSQL.Operator.equals("="))
                return true;
            else if (Double.parseDouble(String.valueOf(fieldValue)) >= Double.parseDouble(value.toString()) && exprSQL.Operator.equals(">="))
                return true;
            else if (Double.parseDouble(String.valueOf(fieldValue)) <= Double.parseDouble(value.toString()) && exprSQL.Operator.equals("<="))
                return true;
            else if (Double.parseDouble(String.valueOf(fieldValue)) > Double.parseDouble(value.toString()) && exprSQL.Operator.equals(">"))
                return true;
            else if (Double.parseDouble(String.valueOf(fieldValue)) < Double.parseDouble(value.toString()) && exprSQL.Operator.equals("<"))
                return true;
            else if (Double.parseDouble(String.valueOf(fieldValue)) != Double.parseDouble(value.toString()) && exprSQL.Operator.equals("!="))
                return true;
        } else if (exprSQL.Operator.equals("like")) {
            Object value;
            if (exprSQL.exprSQL_right.valueString != null)
                value = exprSQL.exprSQL_right.valueString;
            else
                value = exprSQL.exprSQL_right.valueNumber;
            value = value.toString().startsWith("%") ? value.toString().substring(1) : value;
            value = value.toString().endsWith("%") ? value.toString().substring(0, value.toString().length() - 1) : value;
            if ((String.valueOf(fieldValue)).toUpperCase().contains(value.toString().toUpperCase()))
                return true;
        }

        return false;
    }

    public static Object GetAggregationFunction(String funName, ArrayList<Double> numbers) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, MalformedURLException {


        for (int i = 0; i < symbolTable.declaredAggregationFunction.size(); i++) {
            AggregationFunction aggFun = symbolTable.declaredAggregationFunction.get(i);
            if (aggFun.functionName.toUpperCase().equals(funName)) {
                String JarPath = aggFun.jarPath;
                String ClassName = aggFun.className;
                String MethodName = aggFun.methodName;

                URLClassLoader myClassLoader = new URLClassLoader(
                        new URL[]{new File(JarPath).toURI().toURL()},
                        Main.class.getClassLoader()
                );

                Class<?> myClass = Class.forName(ClassName, true, myClassLoader);
                Method mySingeltonGetterMethod = myClass.getMethod("get" + ClassName,
                        null);
                Object myObject = mySingeltonGetterMethod.invoke(null);
                var myValue = myObject.getClass().getMethod(MethodName, List.class)
                        .invoke(myObject, numbers);
                return myValue;
            }
        }
        return null;
    }

}