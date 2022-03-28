package Shapes.SolidShapes;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public class SolidCircle extends SolidShape {
    /**
     * Method to get the SolidCircle's color
     * @return The color of the circle
     */
    @Override
    public Color getColor() {
        return Color.BLUE;
    }

    /**
     * Method to get shape
     * @return The SolidCircle shape
     */
    @Override
    public Shape getShape() {
        return new Ellipse2D.Double(position.x, position.y, size.width, size.height);
    }
}
