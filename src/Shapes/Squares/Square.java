package Shapes.Squares;

import Renderer.Renderer;
import Shapes.EquilateralMovingShape;

import java.awt.*;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public abstract class Square extends EquilateralMovingShape {
    /**
     * Constructor for the EquilateralMovingShape abstract class
     *
     * @param renderer
     */
    protected Square(Renderer renderer) {
        super(renderer);
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
