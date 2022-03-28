package Shapes.SolidShapes;

import Renderer.SolidShapeRenderer;
import Shapes.EquilateralMovingShape;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public abstract class SolidShape extends EquilateralMovingShape {
    /**
     * Constructor for the SolidShape abstract class
     */
    protected SolidShape() {
        super();
        renderer = new SolidShapeRenderer();
    }

}
