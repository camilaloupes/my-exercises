package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardController implements KeyboardHandler {
private Player player;
private Field field;

public KeyboardController(Player player, Field field){
    this.player=player;
    this.field = field;
}

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                player.moveRight();
                break;

            case KeyboardEvent.KEY_LEFT:
                player.moveLeft();
                break;

            case KeyboardEvent.KEY_DOWN:
                player.moveDown();
                break;

            case KeyboardEvent.KEY_UP:
                player.moveUp();
                break;

            case KeyboardEvent.KEY_SPACE:
                player.print();
                break;

            case KeyboardEvent.KEY_C:
                field.clearField();
                break;
                }
        }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}

