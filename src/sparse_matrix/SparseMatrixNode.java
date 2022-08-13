/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sparse_matrix;

/**
 *
 * @author duyta
 */
public class SparseMatrixNode<T> {

    int row = 0, col = 0; //position
    T info = null;
    SparseMatrixNode nextInRow = null;
    SparseMatrixNode nextInCol = null;

    public SparseMatrixNode() {
    }

    public SparseMatrixNode(int row, int col, T info) {
        this.row = row;
        this.col = col;
        this.info = info;
        nextInRow = nextInCol = null;
    }

    //Getter Setter
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public SparseMatrixNode getNextInRow() {
        return nextInRow;
    }

    public void setNextInRow(SparseMatrixNode nextInRow) {
        this.nextInRow = nextInRow;
    }

    public SparseMatrixNode getNextInCol() {
        return nextInCol;
    }

    public void setNextInCol(SparseMatrixNode nextInCol) {
        this.nextInCol = nextInCol;
    }

    @Override
    public String toString() {
        return "[" + row + ", " + col + ", " + info + "]";
    }

}
