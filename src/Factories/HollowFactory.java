package Factories;

import Renderer.HollowShapeRenderer;
import Shapes.Bouncable;
import Shapes.Circles.HollowCircle;
import Shapes.Squares.HollowSquare;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public class HollowFactory extends ShapeFactory {
    private static final HollowShapeRenderer HOLLOW_SHAPE_RENDERER = new HollowShapeRenderer();

    /**
     * Method to create a hollow square
     * @return A hollow square
     */
    @Override
    public Bouncable createSquare() {
        return new HollowSquare(HOLLOW_SHAPE_RENDERER);
    }

    /**
     * Method to create a hollow circle
     * @return A hollow circle
     */
    @Override
    public Bouncable createCircle() {
        return new HollowCircle(HOLLOW_SHAPE_RENDERER);
    }
}
