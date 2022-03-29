package Shapes.Squares;

import Renderer.Renderer;

import java.awt.*;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public class HollowSquare extends Square {
    /**
     * Constructor for the EquilateralMovingShape abstract class
     *
     * @param renderer
     */
    public HollowSquare(Renderer renderer) {
        super(renderer);
    }

    /**
     * Method to get the HollowSquare's color
     * @return The color of the square
     */
    @Override
    public Color getColor() {
        return Color.RED;
    }
}
