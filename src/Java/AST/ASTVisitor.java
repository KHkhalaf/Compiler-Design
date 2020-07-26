package Java.AST;

import Java.AST.JavaFunction.*;
import Java.AST.QueryStmt.*;

public interface ASTVisitor {
    public void visit(Parse p);

    public void visit(Statement stmt);
    public void visit(SelectStmt selectStmt);
    public void visit(AddColumn addColumn);
    public void visit(AlterTable alterTable);
    public void visit(col_exprForUpdateStst col_exprForUpdateStst);
    public void visit(ColumnDefinition columnDefinition);
    public void visit(CreateTable createTable);
    public void visit(DeleteStmt deleteStmt);
    public void visit(DropTable dropTable);
    public void visit(ExprSQL exprSQL);
    public void visit(FromItem fromItem);
    public void visit(InsertStmt insertStmt);
    public void visit(Join join);
    public void visit(RenameTable renameTable);
    public void visit(Row row);
    public void visit(UpdateTable updateTable);

    public void visit(FunctionDeclaration funcDec);
    public void visit(ArrayDefinition arrayDefinition);
    public void visit(Bodyforjson bodyforjson);
    public void visit(Case _case);
    public void visit(Condition condition);
    public void visit(DefVarCore defVarCore);
    public void visit(DefVariable defVariable);
    public void visit(DoWhile doWhile);
    public void visit(Expression expression);
    public void visit(ForEach forEach);
    public void visit(ForRepeat forRepeat);
    public void visit(IFCore ifCore);
    public void visit(IfOnelineCondition ifOnelineCondition);
    public void visit(IFStatement ifStatement);
    public void visit(KeyValue keyValue);
    public void visit(ObjectJson objectJson);
    public void visit(PrintFunction printFunction);
    public void visit(ReturnValue returnValue);
    public void visit(SortFunction sortFunction);
    public void visit(Switch _switch);
    public void visit(TryCatch tryCatch);
    public void visit(WhileRepeat whileRepeat);
    public void visit(WriteObj_json writeObj_json);
    public void visit(ProtoTypeFunction protoTypeFunction);
}
