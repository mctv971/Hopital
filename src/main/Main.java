package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Facon de fermer la fenetre
        window.setResizable(false); //On bloque la redimension
        window.setTitle("My Project");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack();

        window.setLocationRelativeTo(null); // affiche la fenetre au milieu
        window.setVisible(true); //La rendre visible
        gamePanel.setupGame();
        gamePanel.startGameThread();


    }
}