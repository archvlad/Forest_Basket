import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel {

        Basket basket = new Basket();
        BerryController berryController = new BerryController();
        Image background = Toolkit.getDefaultToolkit().getImage("background.png");

        public void tick() {
                basket.tick();
                berryController.tick();
        }

        @Override
        public void paint(Graphics g) {
                super.paint(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.drawImage(background, 0, 0, null);
                basket.paint(g2d);
                berryController.paint(g2d);
        }

}
