package Factories;

import ShapeType.ShapeType;
import Shapes.Bouncable;

/**
 * @author André Marques Nora & Ivan Vecerina
 * @implNote https://sourcemaking.com/design_patterns/abstract_factory/java/1
 */
public abstract class ShapeFactory {
    private static final HollowFactory HOLLOW_FACTORY = new HollowFactory();
    private static final SolidFactory SOLID_FACTORY = new SolidFactory();


    public static ShapeFactory getFactory(ShapeType type) {
        ShapeFactory factory = null;
        switch (type) {
            case HOLLOW:
                factory = HOLLOW_FACTORY;
                break;
            case SOLID:
                factory = SOLID_FACTORY;
                break;
        }
        return factory;
    }

    public abstract Bouncable createSquare();
    public abstract Bouncable createCircle();
}
