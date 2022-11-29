package main;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class Interface {

    public static void start(){
        JFrame window = new JFrame();
        JFrame windowSlider = new JFrame();
        JFrame windowSliderFPS = new JFrame();
        JPanel pSetup = new JPanel();
        JPanel pGame = new JPanel();
        JPanel pSetFPS = new JPanel();


        JButton btn=new JButton("Lancer la simulation");
        JButton btnpause=new JButton("pause");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Facon de fermer la fenetre
        windowSlider.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowSliderFPS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setResizable(false); //On bloque la redimension
        window.setTitle("My Project");

        GamePanel gamePanel = new GamePanel();


        pSetup.add(gamePanel.slider);
        pSetup.add(gamePanel.label4);
        gamePanel.slider.setPaintTrack(true);
        gamePanel.slider.setPaintTicks(true);
        gamePanel.slider.setPaintLabels(true);
        gamePanel.slider.setMajorTickSpacing(25);
        gamePanel.slider.setMinorTickSpacing(10);

        pSetup.add(gamePanel.slider2);
        pSetup.add(gamePanel.label5);
        gamePanel.slider2.setPaintTrack(true);
        gamePanel.slider2.setPaintTicks(true);
        gamePanel.slider2.setPaintLabels(true);
        gamePanel.slider2.setMajorTickSpacing(25);
        gamePanel.slider2.setMinorTickSpacing(10);

        pSetup.add(gamePanel.slider3);
        pSetup.add(gamePanel.label6);

        gamePanel.slider3.setPaintTrack(true);
        gamePanel.slider3.setPaintTicks(true);
        gamePanel.slider3.setPaintLabels(true);
        gamePanel.slider3.setMajorTickSpacing(25);
        gamePanel.slider3.setMinorTickSpacing(10);

        pSetup.add(btn);

        pSetFPS.add(gamePanel.sliderSetFPS);
        pSetFPS.add(gamePanel.labelSetFPS);
        gamePanel.sliderSetFPS.setPaintTrack(true);
        gamePanel.sliderSetFPS.setPaintTicks(true);
        gamePanel.sliderSetFPS.setPaintLabels(true);
        gamePanel.sliderSetFPS.setMajorTickSpacing(50);
        gamePanel.sliderSetFPS.setMinorTickSpacing(25);

        windowSlider.add(pSetup);
        windowSliderFPS.add(pSetFPS);

        pGame.add(gamePanel.label);
        pGame.add(gamePanel.label3);
        gamePanel.label.setForeground(Color.RED);
        gamePanel.label3.setForeground(Color.RED);
        pGame.add(btnpause);
        pGame.add(gamePanel);
        window.add(pGame);
        window.pack();
        gamePanel.label4.setText("nombre de medecin (bleu) : " + gamePanel.slider.getValue());
        gamePanel.label5.setText("nombre patient (noir) : " + gamePanel.slider2.getValue());
        gamePanel.label6.setText("nombre visiteur (gris) :  " + gamePanel.slider3.getValue());

        gamePanel.labelSetFPS.setText("nombre de FPS (vitesse) :  " + gamePanel.sliderSetFPS.getValue());

        //gamePanel.labelCovidMedecin.setText("medecin ayant de base :  " + gamePanel.sliderCovidMedecin.getValue());

        windowSliderFPS.setSize(210,150);
        windowSlider.setSize(250, 300);
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
                windowSliderFPS.setVisible(true);
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

        gamePanel.sliderSetFPS.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                gamePanel.labelSetFPS.setText("nombre de FPS (vitesse) :  " + gamePanel.sliderSetFPS.getValue());

            }
        });
    }
}
