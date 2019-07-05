package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextArea extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu menuPlik;
    JMenuItem mOtworz, mZapisz, mWyjscie;
    JTextArea notatnik;


    public TextArea() {
        int DEFAULT_WIDTH = 400;
        int DEFAULT_HEIGHT = 400;
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setTitle("przyklad");
        setLayout(null);

        menuBar = new JMenuBar();
        //=========================================
        menuPlik = new JMenu("Plik");

        mOtworz = new JMenuItem("Otworz", 'O');// dodanie menu Item wraz z memonic
        mOtworz.addActionListener(this);

        mZapisz = new JMenuItem("Zapisz");
        mZapisz.addActionListener(this);

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


        //metoda dodająca menuBar do okna
        setJMenuBar(menuBar);
        //dodanie poszczegolne elementy do mnu
        menuBar.add(menuPlik);

        //definicja notatnika
        notatnik = new JTextArea();
        //notatnik.setBounds(50,50,200,200);
        //add(notatnik);//dodatnie tego w ten sposób tekst znika

        //notatnik dodaje sie zazwyczaj w obiekcie JscrollPane
        JScrollPane scrollPane = new JScrollPane(notatnik);
        scrollPane.setBounds(50,50,200,200);
        add(scrollPane);

    }


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                TextArea frame = new TextArea();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();

        if (zrodlo == mWyjscie) {
            dispose();
        } else if (zrodlo == mOtworz) {
            JFileChooser fc = new JFileChooser();//klas wykorzystywana do otwierania plikow
            if (fc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
                File plik = fc.getSelectedFile();
                //wczytanie pliku
                try {
                    Scanner sc = new Scanner(plik);
                    while (sc.hasNext()){
                        notatnik.append(sc.nextLine()+ "\n");
                    }
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }

        } else if (zrodlo == mZapisz) {
            JFileChooser fc = new JFileChooser();
            if(fc.showSaveDialog(null)==JFileChooser.APPROVE_OPTION){
                File plik = fc.getSelectedFile();
                //zapis tekstu w pliku
                try{
                    PrintWriter pw = new PrintWriter(plik);
                    Scanner sc =new Scanner(notatnik.getText());
                    while (sc.hasNext()){
                        pw.println(sc.nextLine()+ "\n");
                        //plik po zapisanu nalezy zamknac
                    }
                    pw.close();

                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }


            }
        }
    }
}
