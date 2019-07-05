package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Konwertowanie_Farenhait extends JFrame implements ActionListener {
    private JLabel lCelcjusz, lFarenfeit;
    private JTextField tCelcjusz, tFarenheit;
    private JButton bKonwertuj, bClear, bWyjscie;
    private JCheckBox chWielkieLitery;

    private double tempC, tempF;

    public Konwertowanie_Farenhait() {
        int DEFAULT_WIDTH = 400;
        int DEFAULT_HEIGHT = 200;
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setTitle("Konwertowanie stopni Celcjusza na Farenheita");
        setLayout(null);

        //Celscjusz label
        lCelcjusz = new JLabel("Stopnie Celcjusza");
        lCelcjusz.setBounds(20, 20, 150, 20);
        add(lCelcjusz);
        // Celcjusz TextFielt
        tCelcjusz = new JTextField("");
        tCelcjusz.setBounds(170, 20, 150, 20);
        add(tCelcjusz);
        tCelcjusz.addActionListener(this);// dodanie źróła zdarzeń

        //Farenheit label
        lFarenfeit = new JLabel("Stopnie Farenheit");
        lFarenfeit.setBounds(20, 60, 150, 20);
        add(lFarenfeit);

        // Farenheit textFielt
        tFarenheit = new JTextField("");
        tFarenheit.setBounds(170, 60, 150, 20);
        add(tFarenheit);

        //przycisk przeliczania
        bKonwertuj = new JButton("Konwertuj");
        bKonwertuj.setBounds(20, 120, 100, 20);
        add(bKonwertuj);
        bKonwertuj.addActionListener(this);

        //przycisk wyczyść
        bClear = new JButton("Wyczysc");
        bClear.setBounds(130, 120, 100, 20);
        add(bClear);
        bClear.addActionListener(this);

        //exit
        bWyjscie = new JButton("Wyjscie");
        bWyjscie.setBounds(240, 120, 100, 20);
        add(bWyjscie);
        bWyjscie.addActionListener(this);

        //checkbox
        chWielkieLitery = new JCheckBox("Wielkie litery");
        chWielkieLitery.setBounds(170,90,100,20);
        add(chWielkieLitery);
        chWielkieLitery.addActionListener(this);


    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Konwertowanie_Farenhait frame = new Konwertowanie_Farenhait();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object ob1 = e.getSource();
        if (ob1 == bKonwertuj){// || ob1==tCelcjusz) {
            tempC = Double.parseDouble(tCelcjusz.getText());
            tempF = 32.00 + (9.0 / 5.0) * tempC;
            tFarenheit.setText(String.valueOf(tempF));
        } else if (ob1 == bClear) {
            tCelcjusz.setText("");
            tFarenheit.setText("");
        } else if(ob1==bWyjscie){
            dispose();
        }else if(ob1==chWielkieLitery){
            if (chWielkieLitery.isSelected()==true){
                tFarenheit.setFont(new Font("SansSerif", Font.BOLD, 18));
            }else{
                tFarenheit.setFont(new Font("SansSerif", Font.PLAIN, 12));
            }

        }

    }
}
