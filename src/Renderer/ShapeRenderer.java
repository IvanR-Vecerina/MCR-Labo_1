package Renderer;

import Shapes.Bouncable;

import java.awt.*;

public class ShapeRenderer implements Renderer{
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
    }
}
