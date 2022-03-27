package Shapes.HollowShapes;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class HollowCircle extends HollowShape {
    @Override
    public Color getColor() {
        return Color.GREEN;
    }

    @Override
    public Shape getShape() {
        return new Ellipse2D.Double(position.x, position.y, size.width, size.height);
    }
}
