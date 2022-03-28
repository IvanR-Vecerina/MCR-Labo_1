package Shapes.HollowShapes;

import java.awt.*;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public class HollowSquare extends HollowShape {
    /**
     * Method to get the HollowSquare's color
     * @return The color of the square
     */
    @Override
    public Color getColor() {
        return Color.RED;
    }

    /**
     * Method to get shape
     * @return The HollowSquare's shape
     */
    @Override
    public Shape getShape() {
        return new Rectangle(position, size);
    }
}
