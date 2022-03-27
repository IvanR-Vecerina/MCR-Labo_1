package Renderer;

import Shapes.Bouncable;

import java.awt.*;

public class HollowShapeRenderer extends ShapeRenderer{
    @Override
    public void display(Graphics2D g, Bouncable b) {
        super.display(g,b);
        g.setStroke(new BasicStroke(2));
        g.draw(b.getShape());
    }
}
