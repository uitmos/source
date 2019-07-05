package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuJava extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu menuPlik,menuNarzedzia,menuPomoc,menuOpcje;
    JMenuItem mOtworz, mZapisz, mWyjscie, mNarzedzia1, mNarzedzia2, mHelp, mOpcja1, mOpcja2;
    JCheckBoxMenuItem chOpcja;


    public MenuJava(){
        int DEFAULT_WIDTH = 600;
        int DEFAULT_HEIGHT = 600;
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setTitle("przyklad");
        setLayout(null);

        menuBar= new JMenuBar();
        //=========================================
        menuPlik = new JMenu("Plik");

        mOtworz = new JMenuItem("Otworz",'O');// dodanie menu Item wraz z memonic
        mZapisz = new JMenuItem("Zapisz");
        mWyjscie = new JMenuItem("Wyjscie");
        //dodanie od menu
        menuPlik.add(mOtworz);
        menuPlik.add(mZapisz);
        //wstawienie separatora
        menuPlik.addSeparator();
        menuPlik.add(mWyjscie);
        mWyjscie.addActionListener(this);

        //dodane skrótu klawiszowego.
        mWyjscie.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));

        //===========================
        menuNarzedzia =new JMenu("Narzedzia");
        mNarzedzia1 = new JMenuItem("Narzedzia 1");
        //ustawienie nieaktywnej opcji w menu
        mNarzedzia1.setEnabled(false);
        mNarzedzia2 = new JMenuItem("Narzedzia 2");
        //dodanie od menu
        menuNarzedzia.add(mNarzedzia1);
        menuNarzedzia.add(mNarzedzia2);

        //dodanie po menu
        menuOpcje = new JMenu("opcje");
        mOpcja1 = new JMenuItem("Opcja 1");
        mOpcja2 = new JMenuItem("Opcja 2");
        //opcja jako checkbox
        chOpcja=new JCheckBoxMenuItem("Opcja 3");
        chOpcja.addActionListener(this);
        menuOpcje.add(mOpcja1);
        menuOpcje.add(mOpcja2);
        menuOpcje.add(chOpcja);
        //dodanie opcji do całego menu
        menuNarzedzia.add(menuOpcje);

        //menuBar.add(Box.createHorizontalGlue());

        menuPomoc = new JMenu("Pomoc");
        mHelp = new JMenuItem("o programie");
        mHelp.addActionListener(this);
        menuPomoc.add(mHelp);

        //metoda dodająca menuBar do okna
        setJMenuBar(menuBar);
        //dodanie poszczegolne elementy do mnu
        menuBar.add(menuPlik);
        menuBar.add(menuNarzedzia);
        menuBar.add(menuPomoc);



    }


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuJava frame = new MenuJava();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();

        if (zrodlo == mWyjscie){
            dispose();
        }if (zrodlo==chOpcja){
            if (chOpcja.isSelected()){
                mNarzedzia1.setEnabled(true);
            }else if(!chOpcja.isSelected()){
                mNarzedzia1.setEnabled(false);
            }
        }if (zrodlo==mHelp){
            //klasa okien dialogowych JOptionPane
            JOptionPane.showMessageDialog(this,"Program demo");
        }

    }
}
