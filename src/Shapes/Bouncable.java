package Shapes;

import java.awt.*;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public interface Bouncable {
    void draw();
    void move();
    Color getColor();
    Shape getShape();
}