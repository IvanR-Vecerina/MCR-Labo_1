package Shapes.HollowShapes;

import Renderer.HollowShapeRenderer;
import Shapes.EquilateralMovingShape;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public abstract class HollowShape extends EquilateralMovingShape {
    /**
     * Constructor for the HollowShape abstract class
     */
    protected HollowShape() {
        super();
        renderer = new HollowShapeRenderer();
    }
}
