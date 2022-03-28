package Renderer;

import Shapes.Bouncable;

import java.awt.*;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public interface Renderer {
    void display(Graphics2D g, Bouncable b);
}
