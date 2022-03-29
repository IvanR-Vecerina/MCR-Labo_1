package Renderer;

import Shapes.Bouncable;

import java.awt.*;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public class SolidShapeRenderer extends ShapeRenderer {
    /**
     * Method to display a filled shape
     * @param g The graphic in which to display
     * @param b The bouncable object to display
     */
    @Override
    public void display(Graphics2D g, Bouncable b) {
        super.display(g,b);
        g.fill(b.getShape());
    }
}
