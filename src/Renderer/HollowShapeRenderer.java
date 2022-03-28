package Renderer;

import Shapes.Bouncable;

import java.awt.*;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public class HollowShapeRenderer extends ShapeRenderer{
    /**
     * Method to display a hollow shape
     * @param g The graphic in which to display
     * @param b The bouncable object to display
     */
    @Override
    public void display(Graphics2D g, Bouncable b) {
        super.display(g,b);
        g.setStroke(new BasicStroke(2));
        g.draw(b.getShape());
    }
}
