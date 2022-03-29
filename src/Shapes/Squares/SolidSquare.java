package Shapes.Squares;

import Renderer.Renderer;

import java.awt.*;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public class SolidSquare extends Square {
    /**
     * Constructor for the EquilateralMovingShape abstract class
     *
     * @param renderer
     */
    public SolidSquare(Renderer renderer) {
        super(renderer);
    }

    /**
     * Method to get the SolidSquare's color
     * @return The color of the square
     */
    @Override
    public Color getColor() {
        return Color.ORANGE;
    }


}
