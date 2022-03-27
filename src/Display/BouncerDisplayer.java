package Display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;

public class BouncerDisplayer implements Displayer {
    private static BouncerDisplayer instance;
    private final JFrame frame;
    private final JPanel panel;

    private BouncerDisplayer() {
        super();
        frame = new JFrame();
        panel = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1280, 720);

        panel.setSize(1280, 720);
        panel.setBackground(Color.WHITE);
    }

    public static BouncerDisplayer getInstance() {
        if (instance == null) {
            instance = new BouncerDisplayer();
        }

        return instance;
    }

    @Override
    public int getWidth() {
        return panel.getWidth();
    }

    @Override
    public int getHeight() {
        return panel.getHeight();
    }

    @Override
    public Graphics2D getGraphics() {

        return (Graphics2D) panel.getGraphics();
    }

    @Override
    public void repaint() {
        panel.paint(panel.getGraphics());
    }

    @Override
    public void setTitle(String title) {
        frame.setTitle(title);
    }

    @Override
    public void addKeyListener(KeyAdapter ka) {
        frame.addKeyListener(ka);
    }
}
