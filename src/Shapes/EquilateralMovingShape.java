package Shapes;

import Display.BouncerDisplayer;
import Renderer.Renderer;

import java.awt.*;

public abstract class EquilateralMovingShape implements Bouncable {
    protected Dimension size;
    protected Point position;
    protected Point movementVector;
    protected Renderer renderer;

    protected EquilateralMovingShape() {
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
    }

    public void move() {
        position.translate(movementVector.x, movementVector.y);

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

    public void draw(){
        renderer.display(BouncerDisplayer.getInstance().getGraphics(), this);
    }


    public abstract Color getColor();
    public abstract Shape getShape();
}
