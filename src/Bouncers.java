import Display.BouncerDisplayer;
import Shapes.MovingCircle;
import Shapes.MovingShape;
import Shapes.MovingSquare;

import java.awt.*;
import java.util.LinkedList;

public class Bouncers {

    private LinkedList<Bouncable> bouncers;

    public Bouncers(){}

    public void run(){

    }
    public static void main(String[] args) {
        final int NB_SHAPES = 100;
        BouncerDisplayer bouncerDisplayer = BouncerDisplayer.getInstance();
        MovingShape movingShapes[] = new MovingShape[NB_SHAPES];
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

                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
