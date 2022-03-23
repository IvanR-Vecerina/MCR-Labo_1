import Display.BouncerDisplayer;
import Shapes.Circles.MovingCircle;
import Shapes.MovingShape;
import Shapes.Squares.MovingSquare;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import java.util.Random;

public class Bouncers {

    private LinkedList<Bouncable> bouncers;
    private Random rand;

    public Bouncers(){}

    public void run(){
        final int NB_SHAPES = rand.nextInt(100);
        BouncerDisplayer bouncerDisplayer = BouncerDisplayer.getInstance();
        bouncers = new LinkedList<Bouncable>(NB_SHAPES);
        Graphics graphics;

        bouncerDisplayer.setTitle("Labo 1c");

        for (int i = 0; i < bouncers.size(); i++) {
            if ((Math.random() * 2 > 1)) {
                bouncers.add(new MovingCircle(bouncerDisplayer.getWidth(), bouncerDisplayer.getHeight()));
            } else {
                bouncers.add(new MovingSquare(bouncerDisplayer.getWidth(), bouncerDisplayer.getHeight()));
            }
        }

        try {
            while (true) {
                graphics = bouncerDisplayer.getGraphics();

                for (Bouncable bouncer : bouncers) {
                    bouncer.move(bouncerDisplayer.getWidth(), bouncerDisplayer.getHeight());

                    bouncer.paintShape(graphics);
                }

                bouncerDisplayer.repaint();
                bouncerDisplayer.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        switch (e.getKeyChar()){
                            case 'e':
                                break;
                            case 'b':
                                for(int i = 0; i < 10; ++i){
                                    //bouncers.add();
                                    //bouncers.add();
                                }
                                break;
                            case 'f':
                                for(int i = 0; i < 10; ++i){
                                    //bouncers.add();
                                    //bouncers.add();
                                }
                            case 'q':
                                bouncerDisplayer.frame.dispose();
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
