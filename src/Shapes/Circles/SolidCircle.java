package Shapes.Circles;

import Renderer.Renderer;

import java.awt.*;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public class SolidCircle extends Circle {
    /**
     * Constructor for the SolidCircle class
     *
     * @param renderer
     */
    public SolidCircle(Renderer renderer) {
        super(renderer);
    }

    /**
     * Method to get the SolidCircle's color
     * @return The color of the circle
     */
    @Override
    public Color getColor() {
        return Color.BLUE;
    }
}
