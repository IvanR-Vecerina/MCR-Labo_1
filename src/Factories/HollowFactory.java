package Factories;

import Shapes.Bouncable;
import Shapes.HollowShapes.HollowCircle;
import Shapes.HollowShapes.HollowSquare;

public class HollowFactory extends ShapeFactory {
    @Override
    public Bouncable createSquare() {
        return new HollowSquare();
    }

    @Override
    public Bouncable createCircle() {
        return new HollowCircle();
    }
}
