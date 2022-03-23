import Display.BouncerDisplayer;
import Shapes.MovingCircle;
import Shapes.MovingShape;
import Shapes.MovingSquare;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import java.util.Random;

public class Bouncers {

    private Random rand;

    public Bouncers(){}

    public void run(){
        final int NB_SHAPES = rand.nextInt(100);
        BouncerDisplayer bouncerDisplayer = BouncerDisplayer.getInstance();
        MovingShape[] movingShapes = new MovingShape[NB_SHAPES];
        Graphics graphics;

        bouncerDisplayer.setTitle("Labo 1c");

        for (int i = 0; i < movingShapes.length; i++) {
            if ((Math.random() * 2 > 1)) {
                movingShapes[i] = new MovingCircle(bouncerDisplayer.getWidth(), bouncerDisplayer.getHeight());
            } else {
                movingShapes[i] = new MovingSquare(bouncerDisplayer.getWidth(), bouncerDisplayer.getHeight());
            }
        }

        try {
            while (true) {
                graphics = bouncerDisplayer.getGraphics();

                for (MovingShape movingShape : movingShapes) {
                    movingShape.move(bouncerDisplayer.getWidth(), bouncerDisplayer.getHeight());

                    movingShape.paintShape(graphics);
                }

                bouncerDisplayer.repaint();
                bouncerDisplayer.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        switch (e.getKeyChar()){
                            case 'e':
                                break;
                            case 'b':

                        }
                    }
                });

                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Bouncers().run();
    }

}
