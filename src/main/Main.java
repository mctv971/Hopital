package main;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        JFrame windowSlider = new JFrame();
        JPanel p = new JPanel();
        JPanel p2 = new JPanel();


        JButton btn=new JButton("Lancer la simulation");
        JButton btnpause=new JButton("pause");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Facon de fermer la fenetre
        windowSlider.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setResizable(false); //On bloque la redimension
        window.setTitle("My Project");

        GamePanel gamePanel = new GamePanel();


        p.add(gamePanel.slider);
        p.add(gamePanel.label4);
        gamePanel.slider.setPaintTrack(true);
        gamePanel.slider.setPaintTicks(true);
        gamePanel.slider.setPaintLabels(true);
        gamePanel.slider.setMajorTickSpacing(25);
        gamePanel.slider.setMinorTickSpacing(10);

        p.add(gamePanel.slider2);
        p.add(gamePanel.label5);
        gamePanel.slider2.setPaintTrack(true);
        gamePanel.slider2.setPaintTicks(true);
        gamePanel.slider2.setPaintLabels(true);
        gamePanel.slider2.setMajorTickSpacing(25);
        gamePanel.slider2.setMinorTickSpacing(10);

        p.add(gamePanel.slider3);
        p.add(gamePanel.label6);

        gamePanel.slider3.setPaintTrack(true);
        gamePanel.slider3.setPaintTicks(true);
        gamePanel.slider3.setPaintLabels(true);
        gamePanel.slider3.setMajorTickSpacing(25);
        gamePanel.slider3.setMinorTickSpacing(10);

        //p.add(gamePanel.sliderCovidMedecin);
        //p.add(gamePanel.labelCovidMedecin);

        gamePanel.sliderCovidMedecin.setPaintTrack(true);
        gamePanel.sliderCovidMedecin.setPaintTicks(true);
        gamePanel.sliderCovidMedecin.setPaintLabels(true);
        gamePanel.sliderCovidMedecin.setMajorTickSpacing(25);
        gamePanel.sliderCovidMedecin.setMinorTickSpacing(10);


        p.add(gamePanel.slider4);
        p.add(gamePanel.label7);
        gamePanel.slider4.setPaintTrack(true);
        gamePanel.slider4.setPaintTicks(true);
        gamePanel.slider4.setPaintLabels(true);
        gamePanel.slider4.setMajorTickSpacing(50);
        gamePanel.slider4.setMinorTickSpacing(25);

        p.add(btn);

        windowSlider.add(p);

        p2.add(gamePanel.label);
        p2.add(gamePanel.label2);
        p2.add(gamePanel.label3);
        gamePanel.label.setForeground(Color.RED);
        gamePanel.label2.setForeground(Color.RED);
        gamePanel.label3.setForeground(Color.RED);
        p2.add(btnpause);
        p2.add(gamePanel);
        window.add(p2);
        window.pack();
        gamePanel.label4.setText("nombre de medecin (bleu) : " + gamePanel.slider.getValue());
        gamePanel.label5.setText("nombre patient (noir) : " + gamePanel.slider2.getValue());
        gamePanel.label6.setText("nombre visiteur (gris) :  " + gamePanel.slider3.getValue());
        gamePanel.label7.setText("nombre de FPS (vitesse) :  " + gamePanel.slider4.getValue());
        gamePanel.labelCovidMedecin.setText("medecin ayant de base :  " + gamePanel.sliderCovidMedecin.getValue());


        windowSlider.setSize(250, 400);
        window.setSize(1210,1000);

        window.setLocationRelativeTo(null); // affiche la fenetre au milieu


        windowSlider.setVisible(true);

        btnpause.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gamePanel.pause) {
                    gamePanel.pause = false;
                    btnpause.setText("pause");
                }
                else {
                    gamePanel.pause = true;
                    btnpause.setText("play");
                }
            }
        });
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.setVisible(true); //La rendre visible
                windowSlider.setVisible(false);
                gamePanel.setupGame();
                gamePanel.startGameThread();
            }
        });
        gamePanel.slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                gamePanel.label4.setText("nombre de medecin (bleu) : " + gamePanel.slider.getValue());


            }
        });
        gamePanel.slider2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                gamePanel.label5.setText("nombre patient (noir) : " + gamePanel.slider2.getValue());

            }
        });
        gamePanel.slider3.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                gamePanel.label6.setText("nombre visiteur (gris) : " + gamePanel.slider3.getValue());

            }
        });
        gamePanel.slider4.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                gamePanel.label7.setText("nombre de FPS (vitesse) :  " + gamePanel.slider4.getValue());

            }
        });
        gamePanel.sliderCovidMedecin.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                gamePanel.labelCovidMedecin.setText("medecin ayant le Covid de base : " + gamePanel.sliderCovidMedecin.getValue());
            }
        });
    }
}