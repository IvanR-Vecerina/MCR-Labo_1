package Factories;

import Shapes.Bouncable;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public abstract class ShapeFactory {
    public abstract Bouncable createSquare();
    public abstract Bouncable createCircle();
}
