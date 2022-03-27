package Factories;

import Shapes.Bouncable;

public abstract class ShapeFactory {
    public abstract Bouncable createSquare();
    public abstract Bouncable createCircle();
}
