package Factories;

import Renderer.SolidShapeRenderer;
import Shapes.Bouncable;
import Shapes.Circles.SolidCircle;
import Shapes.Squares.SolidSquare;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public class SolidFactory extends ShapeFactory{
    private static final SolidShapeRenderer SOLID_SHAPE_RENDERER = new SolidShapeRenderer();

    /**
     * Method to create a filled square
     * @return A filled square
     */
    @Override
    public Bouncable createSquare() {
        return new SolidSquare(SOLID_SHAPE_RENDERER);
    }

    /**
     * Method to create a filled circle
     * @return A filled circle
     */
    @Override
    public Bouncable createCircle() {
        return new SolidCircle(SOLID_SHAPE_RENDERER);
    }
}
