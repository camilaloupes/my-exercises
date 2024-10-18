package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;

import java.security.Key;

public class Game {

    private Field field;
    private Player player;
    private KeyboardController keyboardController;

    public Game(){
        field = new Field(20, 20);
        player = new Player(field);
        keyboardController = new KeyboardController(player, field);
        keyboardPress();
    }
    public void keyboardPress(){
        Keyboard keyboard = new Keyboard(keyboardController);

        KeyboardEvent eventRight = new KeyboardEvent();
        eventRight.setKey(KeyboardEvent.KEY_RIGHT);
        eventRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventRight);

        KeyboardEvent eventLeft = new KeyboardEvent();
        eventLeft.setKey(KeyboardEvent.KEY_LEFT);
        eventLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventLeft);

        KeyboardEvent eventDown = new KeyboardEvent();
        eventDown.setKey(KeyboardEvent.KEY_DOWN);
        eventDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventDown);

        KeyboardEvent eventUp = new KeyboardEvent();
        eventUp.setKey(KeyboardEvent.KEY_UP);
        eventUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventUp);

        KeyboardEvent eventPaint = new KeyboardEvent();
        eventPaint.setKey(KeyboardEvent.KEY_SPACE);
        eventPaint.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventPaint);

        KeyboardEvent eventClear = new KeyboardEvent();
        eventClear.setKey(KeyboardEvent.KEY_C);
        eventClear.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(eventClear);

    }

}
