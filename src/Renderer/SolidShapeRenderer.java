package Renderer;

import Shapes.Bouncable;

import java.awt.*;

public class SolidShapeRenderer extends ShapeRenderer{
    @Override
    public void display(Graphics2D g, Bouncable b) {
        super.display(g,b);
        g.fill(b.getShape());
    }
}
