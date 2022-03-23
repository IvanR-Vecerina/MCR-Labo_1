package Shapes.SolidShapes;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class SolidCircle extends SolidShape {
    @Override
    public Color getColor() {
        return Color.BLUE;
    }

    @Override
    public Shape getShape() {
        return new Ellipse2D.Double(position.x, position.y, size.width, size.height);
    }
}
