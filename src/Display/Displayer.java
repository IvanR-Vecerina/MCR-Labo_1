package Display;

import java.awt.*;
import java.awt.event.KeyAdapter;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public interface Displayer {
    int getWidth();
    int getHeight();
    Graphics2D getGraphics();
    void repaint();
    void setTitle(String title);
    void addKeyListener(KeyAdapter ka);
}
