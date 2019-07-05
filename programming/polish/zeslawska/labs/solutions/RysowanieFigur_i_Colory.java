package com.company;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.Color.*;

public class RysowanieFigur_i_Colory
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {

                JFrame frame = new DrawFrame();
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
class DrawFrame extends JFrame
{
    public DrawFrame()
    {
        add(new DrawComponent());
        pack();
    }
}

/**
 * Komponent wyświetlający prostokąty i elipsy.
 */
class DrawComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
          /** g2.setPaint(Color.RED);    ustawia kolor, który jest stosowany we wszystkich kolejnych
          rysunkach graficznych. */
        // g2.drawString("Uwaga!", 100, 100); Wypisuje komunikat Uwaga w potrzebnych koordynatach

        // Rysowanie prostokąta.

        double leftX = 100;
        double topY = 100;
        double width = 200;
        double height = 150;

        Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
        /** g2.setPaint(Color.CYAN);
        g2.fill(rect); // Wypełnienie prostokąta rect kolorem czerwonym. */
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

