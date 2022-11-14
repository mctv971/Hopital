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
    public int nbMedecin = 30; // MAX 100
    public int nbPatient = 30; // MAX 100
    public int nbVisiteur = 40; // MAX 100


    public int[][] nbChambrePatient = new int[33][2];
    public int[] nbChambreRea = new int[15];
    public int[] nbLitMedecin = new int[59];
    public int[] nbSiegeVisiteur = new int[67];

    //FPS
    int FPS = 70;
    TileManager tileM = new TileManager(this);
    public StatutChecker cChecker = new StatutChecker(this);
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
        int nbVariant=0;
        for (int i = 0;i<Entity.toto.size(); i++){
            Entity.toto.get(i).run();
            if ( Entity.toto.get(i).getCovid() == 1 || Entity.toto.get(i).getCovid()==2){
                nbCovid ++;
            }
            if (Entity.toto.get(i).getCovid()==2) {
                nbVariant++;
            }
        }
        //System.out.println("Nombre covid total : "+ nbCovid +" Nombre de covid variant "+nbVariant+ "  Nombre Non Covid :  "+ (Entity.toto.size()- nbCovid));
        cChecker.checkStatut();

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
