package io.codeforall.fanstatics;


import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    private int cellSize = 10;
    private Rectangle cell;
    private int col;
    private int row;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.cell = new Rectangle(cellSize * col + Field.PADDING, cellSize * row + Field.PADDING, cellSize, cellSize);
        cell.draw();

    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public int getCellSize() {
        return cellSize;
    }

    public Rectangle getCell() {
        return cell;
    }
    public void setCol(int number){
        col += 1;
    }

    public void setRow(int number) {
       row += 1;
    }
    public void paint(){
        cell.fill();
    }

    public void erase(){
        cell.draw();
    }
    public boolean isCellFilled(){
        return getCell().isFilled();
    }
}
