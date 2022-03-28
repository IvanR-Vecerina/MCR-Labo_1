package Shapes.SolidShapes;

import java.awt.*;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public class SolidSquare extends SolidShape {
    /**
     * Method to get the SolidSquare's color
     * @return The color of the square
     */
    @Override
    public Color getColor() {
        return Color.ORANGE;
    }

    /**
     * Method to get shape
     * @return The SolidSquare's shape
     */
    @Override
    public Shape getShape() {
        return new Rectangle(position, size);
    }
}
