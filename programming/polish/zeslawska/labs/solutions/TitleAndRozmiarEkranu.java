package com.company;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame.*;

public class TitleAndRozmiarEkranu
{
    public static void main(String[] args)
    {
        // Wątek dystrybucji zdarzeń
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame frame = new SizedFrame1();
                frame.setTitle("SizedFrame"); // ustawienie tytułu ramki
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

            }
        });
    }
}

class SizedFrame1 extends JFrame
{
    public SizedFrame1()
    {
        // Sprawdzenie wymiarów ekranu
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        // Ustawienie szerokości i wysokości ramki oraz polecenie systemowi, aby ustalił jej położenie
        setSize(screenWidth / 2, screenHeight / 2);
        setLocationByPlatform(true);

        // Ustawienie ikony i tytułu
        Image img = new ImageIcon("icon.gif").getImage();
        setIconImage(img);
    }
}
