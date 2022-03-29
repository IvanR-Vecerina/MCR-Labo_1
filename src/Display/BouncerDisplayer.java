package Display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.image.BufferedImage;

/**
 * @author André Marques Nora & Ivan Vecerina
 */
public class BouncerDisplayer implements Displayer {
    private static BouncerDisplayer instance;
    private final JFrame frame;
    private final JPanel panel;
    private BufferedImage image;
    private Graphics2D graphic;

    /**
     * Constructor for BouncerDisplayer class
     */
    private BouncerDisplayer() {
        super();
        frame = new JFrame();
        panel = new JPanel() {
            @Override
            public void paint(Graphics g){
                super.paint(g);
                g.drawImage(image, 0,0, this);
            }
        };

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1280, 720);
        frame.setMinimumSize(new Dimension(256,144));
    }

    /**
     * Method to get an Instance of the singleton class
     * @return Instance of the singleton
     */
    public static BouncerDisplayer getInstance() {
        if (instance == null) {
            instance = new BouncerDisplayer();
        }

        return instance;
    }

    /**
     * Method to get the width of the panel
     * @return The width of the panel
     */
    @Override
    public int getWidth() {
        return panel.getWidth();
    }

    /**
     * Method to get the width of the panel
     * @return The height of the panel
     */
    @Override
    public int getHeight() {
        return panel.getHeight();
    }

    /**
     * Method to get the graphics
     * @return The graphics
     */
    @Override
    public Graphics2D getGraphics() {

        return graphic;
    }

    /**
     * Method to repaint in the panel the objects
     */
    @Override
    public void repaint() {
        image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
        graphic = image.createGraphics();
        panel.repaint();
    }

    /**
     * Method to set the title of the window
     * @param title The title wanted for the application's window
     */
    @Override
    public void setTitle(String title) {
        frame.setTitle(title);
    }

    /**
     * Method to to add KeyListeners to the frame
     * @param ka A keyboard event
     */
    @Override
    public void addKeyListener(KeyAdapter ka) {
        frame.addKeyListener(ka);
    }
}
