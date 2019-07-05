package com.company;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Kolory
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame frame = new DrawFrame1();
                int DEFAULT_WIDTH = 600;
                int DEFAULT_HEIGHT = 600;
                frame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
                frame.setTitle("DrawTest");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

/**
 * Ramka zawierająca panel z rysunkami.
 */
class DrawFrame1 extends JFrame
{
    public DrawFrame1()
    {
        add(new DrawComponent1());
        pack();
    }
}

/**
 * Komponent wyświetlający prostokąty i elipsy.
 */
class DrawComponent1 extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        // Rysowanie prostokąta.

        double leftX = 100;
        double topY = 100;
        double width = 200;
        double height = 150;

        Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
        g2.setPaint(Color.RED);
        g2.fill(rect);
        g2.draw(rect);

        // Rysowanie elipsy.

        Ellipse2D ellipse = new Ellipse2D.Double();
        ellipse.setFrame(rect);
        g2.draw(ellipse);

        // Rysowanie przekątnej.

        g2.draw(new Line2D.Double(leftX, topY, leftX + width, topY + height));

        // Rysowanie koła z takim samym środkiem

        double centerX = rect.getCenterX();
        double centerY = rect.getCenterY();
        double radius = 150;

        Ellipse2D circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(centerX, centerY, centerX + radius, centerY + radius);
        g2.draw(circle);
    }
    //public Dimension getPreferredSize() { return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT); }
}
