package io.codeforall.fanstatics;

public class Field {
    private Cell[][] cells;
    private int rows;
    private int cols;
    public static final int PADDING = 10;

    public Field (int rows, int cols){
        this.rows = rows;
        this.cols = cols;

        showField();
    }
    public void showField(){
        cells = new Cell[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public Cell getCells(int rows, int cols) {
       Cell c = new Cell(rows, cols);
       return c;
    }
    public void clearField(){
        for (int i = 0; i < cols ; i++) {
            for (int j = 0; j < rows; j++) {
                cells[i][j].erase();

            }

        }
    }
}
