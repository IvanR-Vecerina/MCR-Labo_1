package Shapes.HollowShapes;

import java.awt.*;

public class HollowSquare extends HollowShape {
    @Override
    public Color getColor() {
        return Color.RED;
    }

    @Override
    public Shape getShape() {
        return new Rectangle(position, size);
    }
}
