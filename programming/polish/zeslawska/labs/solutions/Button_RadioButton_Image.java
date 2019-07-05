package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Button_RadioButton_Image extends JFrame implements ActionListener {

    ButtonGroup bgButton;
    JRadioButton ptak1,ptak2,ptak3;
    BufferedImage img1,img2,img3;

    public Button_RadioButton_Image(){

        int defaultHeight=800;
        int defaultWidht=800;
        setSize(defaultHeight,defaultWidht);

        setTitle("ptaki");
        setLayout(null);



        bgButton=new ButtonGroup();
        ptak1 = new JRadioButton("ptak1",true);
        ptak1.setBounds(20,20,200,20);
        add(ptak1);
        ptak1.addActionListener(this);
        bgButton.add(ptak1);

        ptak2 = new JRadioButton("ptak2",false);
        ptak2.setBounds(220,20,200,20);
        add(ptak2);
        ptak2.addActionListener(this);
        bgButton.add(ptak2);


        ptak3 = new JRadioButton("ptak3",false);
        ptak3.setBounds(420,20,200,20);
        add(ptak3);
        ptak3.addActionListener(this);
        bgButton.add(ptak3);

        try{
            img1 = ImageIO.read(new File("C:\\Users\\W59063\\IdeaProjects\\untitled\\src\\Swing_01\\ptak1.jpg"));
            img2 = ImageIO.read(new File("C:\\Users\\W59063\\IdeaProjects\\untitled\\src\\Swing_01\\ptak2.jpg"));
            img3 = ImageIO.read(new File("C:\\Users\\W59063\\IdeaProjects\\untitled\\src\\Swing_01\\ptak3.jpg"));
        }
        catch(IOException e){

        }



    }

    public static void main(String[] args) {
        Button_RadioButton_Image frame=new Button_RadioButton_Image();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == ptak1) {
            Graphics g = getGraphics();
            g.clearRect(0, getSize().height * (20 / 100), getSize().width, (getSize().height) - getSize().height * (20 / 100));
            g.drawImage(img1, 0, getSize().height * (20 / 100), null);

        } else if (obj == ptak2) {
            Graphics g = getGraphics();
            g.clearRect(0, getSize().height * (20 / 100), getSize().width, (getSize().height) - getSize().height * (20 / 100));
            g.drawImage(img2, 0, getSize().height * (20 / 100), null);

        } else if (obj == ptak3) {
            Graphics g = getGraphics();
            g.clearRect(0, getSize().height * (20 / 100), getSize().width, (getSize().height) - getSize().height * (20 / 100));
            g.drawImage(img3, 0, getSize().height * (20 / 100), null);

        }}}
