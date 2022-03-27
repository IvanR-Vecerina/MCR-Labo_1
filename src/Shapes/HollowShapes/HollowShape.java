package Shapes.HollowShapes;

import Renderer.HollowShapeRenderer;
import Shapes.EquilateralMovingShape;

public abstract class HollowShape extends EquilateralMovingShape {
    protected HollowShape() {
        super();
        renderer = new HollowShapeRenderer();
    }
}
