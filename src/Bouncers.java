import Display.BouncerDisplayer;
import Factories.*;
import Shapes.Bouncable;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

public class Bouncers {

    private final LinkedList<Bouncable> bouncers;

    public Bouncers() {
        bouncers = new LinkedList<>();

        BouncerDisplayer.getInstance().setTitle("Labo 1c");
        BouncerDisplayer.getInstance().addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {

                switch (e.getKeyChar()){
                    case 'e':
                        bouncers.clear();
                        break;
                    case 'b':
                        spawnShapes(new HollowFactory());
                        break;
                    case 'f':
                        spawnShapes(new SolidFactory());
                        break;
                    case 'q':
                        System.exit(0);
                }
            }
        });
    }

    private void spawnShapes(ShapeFactory shapeFactory) {
        for(int i = 0; i < 10; ++i){
            bouncers.add(shapeFactory.createCircle());
            bouncers.add(shapeFactory.createSquare());
        }
    }

    public void run(){
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                for (Bouncable bouncer : bouncers) {
                    bouncer.move();
                    bouncer.draw();
                }
                BouncerDisplayer.getInstance().repaint();
            }
        },0,32);
    }

    public static void main(String[] args) {
        new Bouncers().run();
    }
}
