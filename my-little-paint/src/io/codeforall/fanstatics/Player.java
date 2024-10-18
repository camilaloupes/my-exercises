package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Player {

    Rectangle playerRect;
    Cell playerCell;
    Field field;

    public Player (Field field){
        playerCell = new Cell(0,0);
        playerRect = playerCell.getCell();
        playerCell.getCell().fill();
        this.field = field;
    }
    public void moveRight(){
        if(playerCell.getCol() != field.getCols()-1){
            playerCell.setCol(1);
            playerRect.translate(playerCell.getCellSize(), 0);
        }
    }
    public void moveLeft(){
        if(playerCell.getCol() != 0){
            playerCell.setCol(- 1);
            playerRect.translate(- playerCell.getCellSize(), 0);
        }
    }
    public void moveDown(){
        if(playerCell.getRow() != field.getRows() -1){
            playerCell.setRow(1);
            playerRect.translate(0, playerCell.getCellSize());
        }
    }
    public void moveUp(){
        if (playerCell.getRow() != 0) {
            playerCell.setRow(-1);
            playerRect.translate(0, - playerCell.getCellSize());
        }
    }
    public void print(){
        Rectangle path = field.getCells(playerCell.getCol(), playerCell.getRow()).getCell();
        if(!(path.isFilled())){
            path.fill();
        }else{
            path.draw();
        }
    }


}
