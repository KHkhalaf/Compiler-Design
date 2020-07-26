package Java.AST.QueryStmt;

import Java.SymbolTable.Type;

import java.util.ArrayList;
import java.util.List;

public class ResultColumn extends Statement {
    public String columnName="";
    public FunctionExpr functionExpr=null;
}
