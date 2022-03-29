import Display.BouncerDisplayer;
import Factories.ShapeFactory;
import ShapeType.ShapeType;
import Shapes.Bouncable;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public class Bouncers {

    private final LinkedList<Bouncable> bouncers;

    /**
     * Constructor for the Bouncers class
     */
    public Bouncers() {
        bouncers = new LinkedList<>();

        BouncerDisplayer.getInstance().setTitle("Labo 1c");
        // Use method keyTyped() to only activate when you press and release a key
        BouncerDisplayer.getInstance().addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {

                switch (e.getKeyChar()){
                    case 'e':
                        bouncers.clear();
                        break;
                    case 'b':
                        spawnShapes(ShapeType.HOLLOW);
                        break;
                    case 'f':
                        spawnShapes(ShapeType.SOLID);
                        break;
                    case 'q':
                        System.exit(0);
                }
            }
        });
    }

    /**
     * Method to add bouncable object in the application
     * @param type For the wanted type of shape
     */
    private void spawnShapes(ShapeType type) {
        ShapeFactory shapeFactory = ShapeFactory.getFactory(type);

        for(int i = 0; i < 10; ++i){
            bouncers.add(shapeFactory.createCircle());
            bouncers.add(shapeFactory.createSquare());
        }
    }

    /**
     * Method to start the application
     */
    public void run(){
        new Timer(50, e -> {
            BouncerDisplayer.getInstance().repaint();

                for (Bouncable bouncer : bouncers) {
                    bouncer.move();
                    bouncer.draw();
                }
        }).start();
    }

    public static void main(String[] args) {
        new Bouncers().run();
    }
}
