package Java.AST;

import Java.AST.JavaFunction.*;
import Java.AST.QueryStmt.*;

public class BaseASTVisitor implements ASTVisitor {
    @Override
    public void visit(Parse p) {
        System.out.println("ast parse ");
    }

    @Override
    public void visit(FunctionDeclaration funcDec) {
        System.out.println("ast FunctionDeclaration ");

    }

    @Override
    public void visit(ArrayDefinition arrayDefinition) {
        System.out.println("ast  arrayDefinition");

    }

    @Override
    public void visit(Bodyforjson bodyforjson) {
        System.out.println("ast  bodyforjson");

    }

    @Override
    public void visit(Case _case) {
        System.out.println("ast  case");

    }

    @Override
    public void visit(Condition condition) {
        System.out.println("ast  condition");

    }

    @Override
    public void visit(DefVarCore defVarCore) {
        System.out.println("ast  defVarCore");

    }

    @Override
    public void visit(DefVariable defVariable) {
        System.out.println("ast  defVariable");

    }

    @Override
    public void visit(DoWhile doWhile) {
        System.out.println("ast  doWhile");

    }

    @Override
    public void visit(Expression expression) {
        System.out.println("ast expression ");

    }

    @Override
    public void visit(ProtoTypeFunction protoTypeFunction) {

        for(int i=0;i<protoTypeFunction.parameters.size();i++){
            System.out.println("Function parameter = "+protoTypeFunction.parameters.get(i));
            System.out.println();
        }

    }

    @Override
    public void visit(ForEach forEach) {
        System.out.println("ast  forEach");

    }

    @Override
    public void visit(ForRepeat forRepeat) {
        System.out.println("ast  forRepeat");

    }

    @Override
    public void visit(IFCore ifCore) {
        System.out.println("ast  ifCore");

    }

    @Override
    public void visit(IfOnelineCondition ifOnelineCondition) {
        System.out.println("ast  ifOnelineCondition");

    }

    @Override
    public void visit(IFStatement ifStatement) {
        System.out.println("ast  ifStatement");

    }

    @Override
    public void visit(KeyValue keyValue) {
        System.out.println("ast  keyValue");

    }

    @Override
    public void visit(ObjectJson objectJson) {
        System.out.println("ast  objectJson");

    }

    @Override
    public void visit(PrintFunction printFunction) {
        System.out.println("ast  printFunction");

    }

    @Override
    public void visit(ReturnValue returnValue) {
        System.out.println("ast  returnValue");

    }

    @Override
    public void visit(SortFunction sortFunction) {
        System.out.println("ast  sortFunction");

    }

    @Override
    public void visit(Switch _switch) {
        System.out.println("ast  switch");

    }

    @Override
    public void visit(TryCatch tryCatch) {
        System.out.println("ast  tryCatch");

    }

    @Override
    public void visit(WhileRepeat whileRepeat) {
        System.out.println("ast  whileRepeat");

    }

    @Override
    public void visit(WriteObj_json writeObj_json) {
        System.out.println("ast  writeObj_json");

    }

    @Override
    public void visit(Statement stmt) {
        System.out.println("ast Statement ");

    }

    @Override
    public void visit(SelectStmt selectStmt) {
        System.out.println("ast selectStmt ");

    }

    @Override
    public void visit(AddColumn addColumn) {
        System.out.println("ast  addColumn");
    }

    @Override
    public void visit(AlterTable alterTable) {
        System.out.println("ast  alterTable");

    }

    @Override
    public void visit(col_exprForUpdateStst col_exprForUpdateStst) {
        System.out.println("ast  col_exprForUpdateStst");

    }

    @Override
    public void visit(ColumnDefinition columnDefinition) {
        System.out.println("ast  columnDefinition");

    }

    @Override
    public void visit(CreateTable createTable) {
        System.out.println("ast  createTable");

    }

    @Override
    public void visit(DeleteStmt deleteStmt) {
        System.out.println("ast deleteStmt ");

    }

    @Override
    public void visit(DropTable dropTable) {
        System.out.println("ast  dropTable");

    }

    @Override
    public void visit(ExprSQL exprSQL) {
        System.out.println("ast  exprSQL");

    }

    @Override
    public void visit(FromItem fromItem) {
        System.out.println("ast  fromItem");

    }

    @Override
    public void visit(InsertStmt insertStmt) {
        System.out.println("ast  insertStmt");

    }

    @Override
    public void visit(Join join) {
        System.out.println("ast  join");

    }

    @Override
    public void visit(RenameTable renameTable) {
        System.out.println("ast  renameTable");

    }

    @Override
    public void visit(Row row) {
        System.out.println("ast  row");

    }

    @Override
    public void visit(UpdateTable updateTable) {
        System.out.println("ast  updateTable");

    }
}
