package io.codeforall.bootcamp;

public enum Hand {
    ROCK,
    PAPER,
    SCISSOR;

    public static Hand getRandomHand() {
        return Hand.values()[(int)(Math.random()*3)];



        }
    }