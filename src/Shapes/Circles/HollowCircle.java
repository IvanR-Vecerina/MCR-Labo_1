package Shapes.Circles;

import Renderer.Renderer;

import java.awt.*;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public class HollowCircle extends Circle {
    /**
     * Constructor for the EquilateralMovingShape abstract class
     *
     * @param renderer
     */
    public HollowCircle(Renderer renderer) {
        super(renderer);
    }

    /**
     * Method to get the HollowCircle's color
     * @return The color of the circle
     */
    @Override
    public Color getColor() {
        return Color.GREEN;
    }
}
