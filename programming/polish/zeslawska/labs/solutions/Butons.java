package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Butons extends JFrame implements ActionListener {

    JButton bButton1, bButton2, bButton3;
    JCheckBoxMenuItem chOpcja;


    public Butons(){
        int DEFAULT_WIDTH = 300;
        int DEFAULT_HEIGHT = 300;
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setTitle("JOptionPane Example");
        setLayout(null);

        bButton1 = new JButton("JOptionPane 1");
        bButton1.setBounds(50, 50, 150, 20);
        add(bButton1);
        bButton1.addActionListener(this);

        bButton2 = new JButton("JOptionPane 2");
        bButton2.setBounds(50, 80, 150, 20);
        add(bButton2);
        bButton2.addActionListener(this);

        bButton3 = new JButton("Exit");
        bButton3.setBounds(50, 110, 150, 20);
        add(bButton3);
        bButton3.addActionListener(this);



    }


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Butons frame = new Butons();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();

        if (zrodlo==bButton1){
            //klasa okien dialogowych JOptionPane
            JOptionPane.showMessageDialog(this,"Informacje dla uzytkownika :)");
        }else if(zrodlo==bButton2){
            String name = JOptionPane.showInputDialog("Podaj swoje imie");
            if(name ==null) name ="";
            JOptionPane.showMessageDialog(null,"Witaj "+ name +"!");
        }else if (zrodlo==bButton3){
            int odp=JOptionPane.showConfirmDialog(null,"Czy napewno wyjsc?","Pytanie",JOptionPane.YES_NO_OPTION);
            if(odp==JOptionPane.YES_OPTION){
                dispose();}
            else if(odp==JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Zostajesz z nami :)");
            }else if(odp==JOptionPane.CLOSED_OPTION){
                JOptionPane.showMessageDialog(null, "Tak nie mozna", "Tytul",JOptionPane.WARNING_MESSAGE);
            }
        }

    }
}

