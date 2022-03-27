package Shapes.SolidShapes;

import java.awt.*;

public class SolidSquare extends SolidShape {
    @Override
    public Color getColor() {
        return Color.ORANGE;
    }

    @Override
    public Shape getShape() {
        return new Rectangle(position, size);
    }
}
