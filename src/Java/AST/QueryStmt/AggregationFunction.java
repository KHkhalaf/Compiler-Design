package Java.AST.QueryStmt;

import java.util.ArrayList;

public class AggregationFunction extends Statement {
    public String functionName;
    public String jarPath;
    public String className;
    public String methodName;
    public String returnType;
    public ArrayList<Object> params= new ArrayList<>();
}
