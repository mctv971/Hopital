package main;

import entity.*;
import tiles.TileManager;

import javax.swing.*;
import java.awt.*;


public class GamePanel extends JPanel implements Runnable{ //Ecran de jeu

    // Parametre d'affichage
    public final int tileSize = 10;

    public final int screenWidth = 1000;
    public final int screenHeight = 1000;
    // WORLD SETTINGS
    public final int maxWorldCol = 100;
    public final int maxWorldRow = 100;


    public int nbMedecin = 20; // MAX 100

    public int nbPatient = 20; // MAX 100
    public int nbVisiteur = 20; // MAX 100


    //FPS
    int FPS = 10;
    TileManager tileM = new TileManager(this);
    public CovidChecker cChecker = new CovidChecker(this);
    Thread gameThread; //Il gère le temps dans le jeu, et donc fait tourner le programme
    public Deplacement depla = new Deplacement(this);
    Monde monde = new Monde(this);

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.WHITE);
        this.setDoubleBuffered(true);
        this.setFocusable(true);

    }
    public void startGameThread() {

        gameThread = new Thread(this);
        gameThread.start();

    }
    public void setupGame(){
        monde.setMedecin();
        monde.setPatient();
        monde.setVisiteur();

    }


    @Override
    public void run() {

        double drawInterval = 1000000000/FPS; //0.01666 sec
        double nextDrawTime = System.nanoTime() + drawInterval;


        while(gameThread !=null){ //Boucle qui tourne sans cesse

            // 1 Update : Mets à jour les informations
            // 2 Repaint : Dessine l'écran avec les mises à jours


            update();

            repaint();

            try {
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime/1000000;
                if (remainingTime<0){
                    remainingTime = 0;
                }
                Thread.sleep((long) remainingTime);
                nextDrawTime += drawInterval;


            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }





    }

    public void update(){
        int nbCovid=0;
        for (int i = 0;i<Entity.toto.size(); i++){
            Thread thread = new Thread(Entity.toto.get(i));
            thread.start();
            if ( Entity.toto.get(i).getCovid() == 1){
                nbCovid ++;
            }

        }



        System.out.println("Nombre covid : "+ nbCovid + "  Nombre Non Covid :  "+ (Entity.toto.size()- nbCovid));
        cChecker.checkCovid();

    }
    public void paintComponent(Graphics g){ //C'est un peu comme ton stylo ou ton feutre

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        tileM.draw(g2);
        for (int i = 0;i<Entity.toto.size(); i++){
            if(Entity.toto.get(i) != null){
                Entity.toto.get(i).draw(g2);
            }
        }

        g2.dispose();

    }
}
