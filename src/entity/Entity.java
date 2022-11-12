package entity;

import main.Deplacement;
import main.GamePanel;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Entity extends Thread{
    public static ArrayList<Entity> toto = new ArrayList<Entity>();
    public int probleme;
    private int worldX,worldY;
    private double positionX, positionY;
    private double speed = 0.1;
    private int covid;

    public BufferedImage up1,up2,down1,down2,left1,left2,right1,right2;
    private String direction;
    GamePanel gp;
    Deplacement depla = new Deplacement(gp);
    public int i;
    double j = 0;
    int finishX;
    int finishY;
    boolean arrive;
    int[][][] liste_depla;
    public boolean pause = false;
    public int compteur_stop =0;



    public Entity(GamePanel gp, int positionX, int positionY, int covid) {
        this.gp = gp;
        this.setPositionX(positionX);
        this.setPositionY(positionY);
        this.setCovid(covid);
        this.setSpeed(speed);
        direction = "start";
        this.start();
        i =0;
        probleme = 1;
        arrive = true;
        if(this.getClass().getSimpleName().equalsIgnoreCase("Medecin")){
            finishX = 47; finishY = 55;
        }
        else if (this.getClass().getSimpleName().equalsIgnoreCase("Patient")){
            finishX = 32; finishY = 43;
        }
        else {
            finishX = 32; finishY = 47;
        }

    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getWorldX() {
            return (int)(gp.tileSize * getPositionX());
        }

    public int getWorldY() {
        return (int)(gp.tileSize * getPositionY());
    }


    public double getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getCovid() {
        return covid;
    }

    public void setCovid(int covid) {
        this.covid = covid;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
    public int[] choixLieu() {
        int[] choix = new int[2];
        return choix;
    }
    public void getChoixdepla() {
        int x = (int)this.getPositionX();
        int y = (int)this.getPositionY();
        if (arrive){


            liste_depla = new int[100][100][2];

            liste_depla = depla.Chemin(this,finishX, finishY,x,y);
            arrive = false;

        }


        if (x==finishX && y==finishY){


            int[] choix = choixLieu();
            finishX = choix[0];
            finishY = choix[1];
            arrive =true;
            setDirection("start");

        }





        if (!arrive) {

            int d = liste_depla[x][y][0];

            if (liste_depla[x][y+1][0] == d-1 && liste_depla[x][y+1][1] ==1 ){
                setDirection("down");
            }
            else if(liste_depla[x][y-1][0] == d-1 && liste_depla[x][y-1][1] ==1){
                setDirection("up");

            }
            else if(liste_depla[x-1][y][0] == d-1 && liste_depla[x-1][y][1] ==1){
                setDirection("left");

            }
            else if(liste_depla[x+1][y][0] == d-1 && liste_depla[x+1][y][1] ==1) {
                setDirection("right");

            }
        }
    }

    public void run() {
        try {
            // modification position player
            if (j == 0 && !pause) {
                this.getChoixdepla();
            }
            if (pause){
                direction = "start";
            }


            switch (direction){
                case "start":

                    break;
                case "up":
                    positionY -= speed;


                    break;
                case "down":
                    positionY += speed;



                    break;
                case "left":
                    positionX -= speed;


                    break;
                case "right":

                    positionX += speed;

                    break;
            }
            j += speed;

            if ((int) j==1){
                positionX = Math.round(positionX);
                positionY = Math.round(positionY);
                j = 0;
            }

            int k=(int) (Math.random()*30);
            if (k == 1){
                setCovid(0);
            }
            pause = false;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
    public void draw (Graphics2D g2) {
        BufferedImage image = null;

        switch (direction) {
            case "start":
                image = down1;
                if (this.getCovid()==1|| this.getCovid()==2){
                    image =down2;
                }
            case "up":
                image = up1;
                if (this.getCovid()==1 || this.getCovid()== 2){
                    image =up2;
                }
                break;
            case "down":
                image = down1;
                if (this.getCovid()==1|| this.getCovid()== 2){
                    image =down2;
                }
                break;
            case "left":

                image = left1;
                if (this.getCovid()==1|| this.getCovid()==2){
                    image =left2;
                }
                break;
            case "right":
                image = right1;
                if (this.getCovid()==1|| this.getCovid()==2){
                    image =right2;
                }
                break;
        }
        g2.drawImage(image,getWorldX(),getWorldY(), gp.tileSize, gp.tileSize, null);


    }


}
