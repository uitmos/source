package com.company;

import javax.swing.*;
import java.awt.*;

public class Pusta_ramka
{
    public static void main(String[] args)
    {
        // Wątek dystrybucji zdarzeń
        // klikniecie przyciskiem myszy lub wciśnięcie klawisza
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                SimpleFrame frame = new SimpleFrame();
                //instrukcja odpowiedzialna za zaknięcie okna
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //metoda która pozwala na wyświetlenie ramki
                frame.setVisible(true);

            }
        });
    }
}

class SimpleFrame extends JFrame
{
    //ustawienie rozmairu 300z200 pikseli
    private static final int DEFAULT_WIDTH = 500;
    private static final int DEFAULT_HEIGHT = 500;

    public SimpleFrame()
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
