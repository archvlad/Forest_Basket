import java.awt.event.*;

public class Keyboard extends KeyAdapter {

        public static boolean[] keys = new boolean[256];

        @Override
        public void keyPressed(KeyEvent e) {
                keys[e.getKeyCode()] = true;
        }

        @Override
        public void keyReleased(KeyEvent e) {
                keys[e.getKeyCode()] = false;
        }

}
