package Shapes;

import Display.BouncerDisplayer;

import java.awt.*;

public abstract class MovingShape implements Bouncable, Shape {
    protected int size;
    protected Shape shape;
    protected Point position;
    protected Point movementVector;

    protected MovingShape() {
        size = ((int) (Math.random() * 40) + 10);
        position = new Point(
                (int) (Math.random() * (BouncerDisplayer.getInstance().getWidth() - size)),
                (int) (Math.random() * (BouncerDisplayer.getInstance().getHeight() - size))
        );
        movementVector = new Point(
                ((int) (Math.random() * 20) - 10),
                ((int) (Math.random() * 20) - 10)
        );
    }

    public void move() {
        position.translate(movementVector.x, movementVector.y);

        if (position.x < 0) {
            movementVector.x = -movementVector.x;
            position.x = 0;
        }

        if (position.x + size > BouncerDisplayer.getInstance().getWidth()) {
            movementVector.x = -movementVector.x;
            position.x = BouncerDisplayer.getInstance().getWidth() - size;
        }

        if (position.y < 0) {
            movementVector.y = -movementVector.y;
            position.y = 0;
        }

        if (position.y + size > BouncerDisplayer.getInstance().getHeight()) {
            movementVector.y = -movementVector.y;
            position.y = BouncerDisplayer.getInstance().getHeight() - size;
        }
    }

    public abstract void draw();
    public abstract Color getColor();
    public abstract Shape getShape();
}
