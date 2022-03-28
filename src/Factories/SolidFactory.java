package Factories;

import Shapes.Bouncable;
import Shapes.SolidShapes.SolidCircle;
import Shapes.SolidShapes.SolidSquare;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public class SolidFactory extends ShapeFactory{
    /**
     * Method to create a filled square
     * @return A filled square
     */
    @Override
    public Bouncable createSquare() {
        return new SolidSquare();
    }

    /**
     * Method to create a filled circle
     * @return A filled circle
     */
    @Override
    public Bouncable createCircle() {
        return new SolidCircle();
    }
}
