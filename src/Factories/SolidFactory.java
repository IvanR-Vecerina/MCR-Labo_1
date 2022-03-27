package Factories;

import Shapes.Bouncable;
import Shapes.SolidShapes.SolidCircle;
import Shapes.SolidShapes.SolidSquare;

public class SolidFactory extends ShapeFactory{
    @Override
    public Bouncable createSquare() {
        return new SolidSquare();
    }

    @Override
    public Bouncable createCircle() {
        return new SolidCircle();
    }
}
