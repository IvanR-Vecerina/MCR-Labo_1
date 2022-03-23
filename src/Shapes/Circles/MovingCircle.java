package Shapes.Circles;

import Shapes.MovingShape;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class MovingCircle extends MovingShape {
    static final Color color = Color.BLUE;

    public MovingCircle(int width, int height) {
        super();
    }

    @Override
    public void paintShape(Graphics g) {
        g.setColor(color);
        shape = new Ellipse2D.Double(position.x, position.y, size, size);
        g.fillOval(shape);
    }
}
