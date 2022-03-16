package Shapes;

import java.awt.*;

public class MovingSquare extends MovingShape{
    static final Color color = Color.YELLOW;

    public MovingSquare(int width, int height) {
        super(width, height);
    }

    @Override
    public void paintShape(Graphics g) {
        g.setColor(color);
        g.fillRect(position.x, position.y, size, size);
    }
}
