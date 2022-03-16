package Shapes;

import java.awt.*;

public abstract class MovingShape {
    protected int size;
    protected Point position;
    protected Point movementVector;

    protected MovingShape(int width, int height) {
        size = ((int) (Math.random() * 40) + 10);
        position = new Point(
                (int) (Math.random() * (width - size)),
                (int) (Math.random() * (height - size))
        );
        movementVector = new Point(
                ((int) (Math.random() * 20) - 10),
                ((int) (Math.random() * 20) - 10)
        );
    }

    public void move(int width, int height) {
        position.translate(movementVector.x, movementVector.y);

        if (position.x < 0) {
            movementVector.x = -movementVector.x;
            position.x = 0;
        }

        if (position.x + size > width) {
            movementVector.x = -movementVector.x;
            position.x = width - size;
        }

        if (position.y < 0) {
            movementVector.y = -movementVector.y;
            position.y = 0;
        }

        if (position.y + size > height) {
            movementVector.y = -movementVector.y;
            position.y = height - size;
        }
    }

    public abstract void paintShape(Graphics g);
}
