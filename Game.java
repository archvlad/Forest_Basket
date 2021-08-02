import javax.swing.*;
import java.awt.*;

public class Game {

        public static void main(String[] args) throws InterruptedException{
                JFrame frame = new JFrame();
                GamePanel gamePanel = new GamePanel();
                gamePanel.setPreferredSize(new Dimension(640, 480));
                Keyboard keyboard = new Keyboard();
                gamePanel.addKeyListener(keyboard);
                gamePanel.setFocusable(true);
                frame.add(gamePanel);
                frame.setVisible(true);
                frame.pack();
                frame.setTitle("Game");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(false);
                frame.setLocationRelativeTo(null);
                long last = System.nanoTime();
                long now = 0;
                long delta = 0;
                int ticks = 0;
                int frames = 0;
                long stopwatch = System.currentTimeMillis();
                while (true) {
                        now = System.nanoTime();
                        delta += now - last;
                        last = now;
                        while (delta >= 1000000000 / 60) {
                                gamePanel.tick();
                                gamePanel.repaint();
                                ticks++;
                                frames++;
                                delta -= 1000000000 / 60;
                        }
                        if (System.currentTimeMillis() - stopwatch >= 1000) {
                                stopwatch+=1000;
                                System.out.printf("ticks: %2d frames: %2d%n", ticks, frames);
                                ticks = 0;
                                frames = 0;
                        }
                        Thread.sleep(10);
                }
        }

}
