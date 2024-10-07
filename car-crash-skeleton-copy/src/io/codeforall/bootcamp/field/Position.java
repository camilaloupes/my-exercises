package io.codeforall.bootcamp.field;

public class Position {

    public int col;
    public int row;

    public Position(){
        this.col= (int) (Math.random()*100);
        this.row= (int) (Math.random()*25)
    }


    public Position getCol() {
        return this.col;
    }

    public Position getRow() {
        return this.row;
    }
}
