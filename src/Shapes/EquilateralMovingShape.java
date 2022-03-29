package Shapes;

import Display.BouncerDisplayer;
import Renderer.Renderer;

import java.awt.*;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public abstract class EquilateralMovingShape implements Bouncable {
    protected Dimension size;
    protected Point position;
    protected Point movementVector;
    protected Renderer renderer;

    /**
     * Constructor for the EquilateralMovingShape abstract class
     */
    protected EquilateralMovingShape(Renderer renderer) {
        int tmp = (int) (Math.random() * 40) + 10;
        size = new Dimension(tmp, tmp);
        position = new Point(
                (int) (Math.random() * (BouncerDisplayer.getInstance().getWidth() - size.width)),
                (int) (Math.random() * (BouncerDisplayer.getInstance().getHeight() - size.height))
        );
        movementVector = new Point(
                ((int) (Math.random() * 20) - 10),
                ((int) (Math.random() * 20) - 10)
        );
        this.renderer = renderer;
    }

    /**
     * Method to move the shapes
     */
    public void move() {
        position.translate(movementVector.x, movementVector.y);

        /*
            Change the shape's direction if it touches the border of the window
        */

        if (position.x < 0) {
            movementVector.x = -movementVector.x;
            position.x = 0;
        }

        if (position.x + size.width > BouncerDisplayer.getInstance().getWidth()) {
            movementVector.x = -movementVector.x;
            position.x = BouncerDisplayer.getInstance().getWidth() - size.width;
        }

        if (position.y < 0) {
            movementVector.y = -movementVector.y;
            position.y = 0;
        }


        if (position.y + size.height > BouncerDisplayer.getInstance().getHeight()) {
            movementVector.y = -movementVector.y;
            position.y = BouncerDisplayer.getInstance().getHeight() - size.height;
        }
    }

    /**
     * Method to draw the shapes
     */
    public void draw() {
        renderer.display(BouncerDisplayer.getInstance().getGraphics(), this);
    }

    /**
     * Method to get the color of the object
     * @return The color of the shape
     */
    public abstract Color getColor();

    /**
     * Method to get the object's shape
     * @return The shape of the object
     */
    public abstract Shape getShape();
}
