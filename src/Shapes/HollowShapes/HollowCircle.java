package Shapes.HollowShapes;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public class HollowCircle extends HollowShape {
    /**
     * Method to get the HollowCircle's color
     * @return The color of the circle
     */
    @Override
    public Color getColor() {
        return Color.GREEN;
    }

    /**
     * Method to get shape
     * @return The HollowCircle shape
     */
    @Override
    public Shape getShape() {
        return new Ellipse2D.Double(position.x, position.y, size.width, size.height);
    }
}
