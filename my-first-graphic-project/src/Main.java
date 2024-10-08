import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 10, 1000, 1000);
        rectangle.draw();
        rectangle.setColor(Color.MAGENTA);
        rectangle.fill();

        Ellipse ellipse = new Ellipse(400, 400, 250, 250);
        ellipse.draw();
        ellipse.setColor(Color.GREEN);
        ellipse.fill();

        Text text = new Text(470,500, "WOW A SUPERSTAR!");
        text.draw();
        text.setColor(Color.BLACK);

 Star star= new Star();
 Star star2 = new Star();
    }
}