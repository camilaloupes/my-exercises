package io.codeforall.bootcamp;

public class Player {

    public String name;
    public int points;

    public Player(String name) {
        this.name = name;
        this.points= 0;
    }

    public Hand playerHand(){
        return Hand.getRandomHand();
    }
    public int getPoints(){
        return points;}
    }

}









