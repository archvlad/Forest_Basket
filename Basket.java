import java.awt.*;
import java.awt.event.*;

public class Basket {

        public Image image;
        public int x;
        public int y;

        public Basket() {
                image = Toolkit.getDefaultToolkit().getImage("basket.png");
        }

        public void tick() {
                if (Keyboard.keys[KeyEvent.VK_A]) {
                        x-=5;
                }
                if (Keyboard.keys[KeyEvent.VK_D]) {
                        x+=5;
                }
                if (x < 0) {
                        x = 0;
                }
                if (x > 640-64) {
                        x = 640-64;
                }
        }

        public void paint(Graphics2D g) {
                g.drawImage(image, x, 480 - 48, null);
        }

}
