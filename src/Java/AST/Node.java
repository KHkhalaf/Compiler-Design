package Java.AST;

import javafx.util.Pair;


public class Node {

    private int line;
    private int col;
    public Pair<Integer, Integer> PointerToSymbolTable = null;
    public void setLine(int line) {
        this.line = line;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getLine() {
        return line;
    }

    public int getCol() {
        return col;
    }

    public void accept(ASTVisitor astVisitor){




    }
}
