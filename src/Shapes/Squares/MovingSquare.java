package Shapes.Squares;

import Display.BouncerDisplayer;
import Shapes.MovingShape;

import java.awt.*;

public class MovingSquare extends MovingShape {
    static final Color color = Color.YELLOW;

    public MovingSquare(int width, int height) {
        super();
    }

    @Override
    public void draw() {
        BouncerDisplayer.getInstance().getGraphics().setColor(color);
        BouncerDisplayer.getInstance().getGraphics().fillRect(position.x, position.y, size, size);
    }
}
