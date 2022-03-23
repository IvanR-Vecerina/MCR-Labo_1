package Shapes.SolidShapes;

import Renderer.SolidShapeRenderer;
import Shapes.EquilateralMovingShape;

public abstract class SolidShape extends EquilateralMovingShape {
    protected SolidShape() {
        super();
        renderer = new SolidShapeRenderer();
    }

}
