import Display.BouncerDisplayer;

import Shapes.Bouncable;
import Shapes.HollowShapes.HollowCircle;
import Shapes.HollowShapes.HollowSquare;
import Shapes.SolidShapes.SolidCircle;
import Shapes.SolidShapes.SolidSquare;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Random;

public class Bouncers {

    private LinkedList<Bouncable> bouncers;
    private final Random rand = new Random();

    public Bouncers(){}

    public void run(){
        final int NB_SHAPES = rand.nextInt(100);
        BouncerDisplayer bouncerDisplayer = BouncerDisplayer.getInstance();
        bouncers = new LinkedList<>();

        bouncerDisplayer.setTitle("Labo 1c");

        for (int i = 0; i < NB_SHAPES; i++) {
            if ((Math.random() * 2 > 1)) {
                bouncers.add(new SolidCircle());
            } else {
                bouncers.add(new SolidSquare());
            }
        }

        try {
            while (true) {

                for (Bouncable bouncer : bouncers) {
                    bouncer.move();
                    bouncer.draw();
                }

                bouncerDisplayer.repaint();
                bouncerDisplayer.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        switch (e.getKeyChar()){
                            case 'e':
                                for(int i = 0; i < bouncers.size(); ++i)
                                    bouncers.remove();
                                break;
                            case 'b':
                                for(int i = 0; i < 10; ++i){
                                    bouncers.add(new HollowCircle());
                                    bouncers.add(new HollowSquare());
                                }
                                break;
                            case 'f':
                                for(int i = 0; i < 10; ++i){
                                    bouncers.add(new SolidSquare());
                                    bouncers.add(new SolidCircle());
                                }
                                break;
                            case 'q':
                                bouncerDisplayer.frame.dispose();
                        }
                    }
                });

                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Bouncers().run();
    }

}
