package Shapes.Circles;

import Renderer.Renderer;
import Shapes.EquilateralMovingShape;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public abstract class Circle extends EquilateralMovingShape {
    /**
     * Constructor for the EquilateralMovingShape abstract class
     *
     * @param renderer
     */
    protected Circle(Renderer renderer) {
        super(renderer);
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
