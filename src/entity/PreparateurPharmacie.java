package entity;

import main.Deplacement;
import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class PreparateurPharmacie extends Entity{

    GamePanel gp;
    Deplacement depla = new Deplacement(gp);
    int positionX;
    int positionY;
    int i;
    Lieu lieu = new Lieu();

    public PreparateurPharmacie(GamePanel gp, int positionX, int positionY, int covid){
        this.gp = gp;
        this.positionX = positionX;
        this.positionY = positionY;
        this.setCovid(covid);
        solidArea = new Rectangle(-0,-0,10,10);

        setDefaultValues();
        getPlayerImage();
    }


    public int isCovid() {
        return covid;
    }

    public void setCovid(int covid) {
        this.covid = covid;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setDefaultValues(){
        worldX = gp.tileSize * this.getPositionX();
        worldY = gp.tileSize * this.getPositionY();
        speed =1;
        direction = "start";
        position ="down";
        i = (int) ((Math.random()*10)/2);
    }
    public void getPlayerImage() {
        try {
            up1= ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("player/prepapharma/boy_up_1.png")));
            up2= ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("player/covid/boy_up_2.png")));
            down1= ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("player/prepapharma/boy_down_1.png")));
            down2= ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("player/covid/boy_down_2.png")));
            left1= ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("player/prepapharma/boy_left_1.png")));
            left2= ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("player/covid/boy_left_2.png")));
            right1= ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("player/prepapharma/boy_right_1.png")));
            right2= ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("player/covid/boy_right_2.png")));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String getChoixdepla() {
        int x = this.getPositionX();
        int y = this.getPositionY();


        int finishX = lieu.choixLieuPreparateur(i)[0];
        int finishY = lieu.choixLieuPreparateur(i)[1];
        int[][][] liste_depla = new int[100][100][2];
        if (x!=finishX || y!=finishY){
            liste_depla = depla.Chemin(finishX, finishY,x,y);

        }
        else{
            i = (int) ((Math.random()*10)/2);
        }


        int d = liste_depla[x][y][0];

        if (liste_depla[x][y+1][0] == d-1 && liste_depla[x][y+1][1] ==1 ){
            direction ="down";
        }
        else if(liste_depla[x][y-1][0] == d-1 && liste_depla[x][y-1][1] ==1){
            direction ="up";

        }
        else if(liste_depla[x-1][y][0] == d-1 && liste_depla[x-1][y][1] ==1){
            direction ="left";

        }
        else if(liste_depla[x+1][y][0] == d-1 && liste_depla[x+1][y][1] ==1) {
            direction ="right";

        }
        return direction;


    }

    public void update() {
        direction = "start";

        // modification position player
        this.getChoixdepla();


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
        int k=(int) (Math.random()*100*5);
        if (k == 1){
            setCovid(0);
        }



        worldX = gp.tileSize * positionX;
        worldY = gp.tileSize *positionY;


    }
    public void draw (Graphics2D g2) {
        BufferedImage image = null;
        switch (direction) {
            case "start":
                image = down1;
                if (isCovid()==1){
                    image =down2;
                }
            case "up":
                image = up1;
                if (isCovid()==1){
                    image =up2;
                }
                break;
            case "down":
                image = down1;
                if (isCovid()==1){
                    image =down2;
                }
                break;
            case "left":

                image = left1;
                if (isCovid()==1){
                    image =left2;
                }
                break;
            case "right":
                image = right1;
                if (isCovid()==1){
                    image =right2;
                }
                break;
        }
        g2.drawImage(image,worldX,worldY, gp.tileSize, gp.tileSize, null);


    }
}

