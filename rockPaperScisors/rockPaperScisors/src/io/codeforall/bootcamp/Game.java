package io.codeforall.bootcamp;

import java.util.concurrent.locks.ReentrantLock;

public class Game {

    private int maxRounds;
    Player player1 = new Player("Cami");
    Player player2 = new Player("Mila");

    public void GamePlay(int maxRounds, Player player1, Player player2) {
            this.maxRounds= maxRounds;

        switch (player1.playerHand()) {
            case ROCK:
                Hand player2hand = player2.playerHand();
                if (player2hand == Hand.ROCK) {
                    System.out.println("Players got the same hand, rock.");
                }
                if (player2hand == Hand.PAPER) {
                    System.out.println(player1.name + " got rock and " + player2.name + "got paper. " + player2.name + " WON!");
                }
                if (player2hand == Hand.SCISSOR) {
                    System.out.println(player1.name + " got rock and " + player2.name + " got scissor. " + player1.name + " WON!");
                }
                break;

            case PAPER:
                Hand player3hand = player2.playerHand();
                if (player3hand == Hand.ROCK) {
                    System.out.println(player1.name + " got paper and " + player2.name + "got rock. " + player1.name + " WON!");
                }
                if (player3hand == Hand.PAPER) {
                    System.out.println("Players got the same hand, paper.");
                }
                if (player3hand == Hand.SCISSOR) {
                    System.out.println(player1.name + " got paper and " + player2.name + " got scissor. " + player2.name + " WON!");
                }
                break;

            case SCISSOR:
                Hand player4hand = player2.playerHand();
                if (player4hand == Hand.ROCK) {
                    System.out.println(player1.name + " got scissor and " + player2.name + " got rock. " + player2.name + " WON!");
                }
                if (player4hand == Hand.PAPER) {
                    System.out.println(player1.name + " got scissor and " + player2.name + " got paper. " + player1.name + " WON!");
                }
                if (player4hand == Hand.SCISSOR) {
                    System.out.println("Players got the same hand, scissor.");
                }
                break;


        }

    }


}
