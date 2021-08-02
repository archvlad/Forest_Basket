import java.awt.*;

public class Berry {

        public int x = (int)(Math.random() * 640) - 32;
        public int y;
        Image image = Toolkit.getDefaultToolkit().getImage("blackberry.png");

        public void tick() {
                y+=1;
        }

        public void paint(Graphics2D g) {
                g.drawImage(image, x, y, null);
        }

}
