package Renderer;

import Shapes.Bouncable;

import java.awt.*;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public class ShapeRenderer implements Renderer{
    /**
     * Method to display any type of shapes
     * @param g The graphic in which to display
     * @param b The bouncable object to display
     */
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
    }
}
