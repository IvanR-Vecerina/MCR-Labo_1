package Factories;

import Shapes.Bouncable;
import Shapes.HollowShapes.HollowCircle;
import Shapes.HollowShapes.HollowSquare;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public class HollowFactory extends ShapeFactory {
    /**
     * Method to create a hollow square
     * @return A hollow square
     */
    @Override
    public Bouncable createSquare() {
        return new HollowSquare();
    }

    /**
     * Method to create a hollow circle
     * @return A hollow circle
     */
    @Override
    public Bouncable createCircle() {
        return new HollowCircle();
    }
}
