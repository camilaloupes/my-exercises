import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Star implements KeyboardHandler {

    private Keyboard keyboard;
    private Picture picture;

    public Star(){
        picture = new Picture(500,500, "rsc/star.png");
        picture.draw();
        initKeyboard();
    }

    private void initKeyboard(){
        this.keyboard = new Keyboard(this);

        KeyboardEvent moveRight = new KeyboardEvent();
        moveRight.setKey(KeyboardEvent.KEY_RIGHT);
        moveRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent moveLeft = new KeyboardEvent();
        moveLeft.setKey(KeyboardEvent.KEY_LEFT);
        moveLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent moveUp = new KeyboardEvent();
        moveUp.setKey(KeyboardEvent.KEY_UP);
        moveUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent moveDown = new KeyboardEvent();
        moveDown.setKey(KeyboardEvent.KEY_DOWN);
        moveDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(moveRight);
        keyboard.addEventListener(moveLeft);
        keyboard.addEventListener(moveUp);
        keyboard.addEventListener(moveDown);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()){
            case KeyboardEvent.KEY_RIGHT:
                picture.translate(100, 0);
                break;
            case KeyboardEvent.KEY_LEFT:
                picture.translate(-100, 0);
                break;
            case KeyboardEvent.KEY_UP:
                picture.translate(0, -100);
                break;
            case KeyboardEvent.KEY_DOWN:
                picture.translate(0, 100);
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {


    }
}







