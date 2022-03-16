package Shapes;

import java.awt.*;

public class MovingCircle extends MovingShape{
    static final Color color = Color.BLUE;

    public MovingCircle(int width, int height) {
        super(width, height);
    }

    @Override
    public void paintShape(Graphics g) {
        g.setColor(color);
        g.fillOval(position.x, position.y, size, size);
    }
}
