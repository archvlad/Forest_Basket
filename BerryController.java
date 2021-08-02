import java.awt.*;
import java.util.*;

public class BerryController {

        ArrayList<Berry> berries = new ArrayList<Berry>();
        Random r = new Random();
        private int timerForSpawn = 0;

        public void tick() {
                timerForSpawn+=(int)(1000.0/60);
                System.out.println(timerForSpawn);
                if (timerForSpawn >= 5000) {
                        int numberOfBerries = 5 + r.nextInt(6);
                        for (int i = 0; i <= numberOfBerries; i++) {
                                berries.add(new Berry());
                        }
                        timerForSpawn-=5000;
                }
                for (Berry b : berries) {
                        b.tick();
                }
        }

        public void paint(Graphics2D g) {
                for (Berry b : berries) {
                        b.paint(g);
                }
        }

}
