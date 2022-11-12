package entity;

import main.Deplacement;
import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Patient extends Entity{

    Lieu lieu = new Lieu();
    int[] choix = new int[2];
    //0 probleme, 1 en cours de traitement,2 en cours de guerison 3. rea, 4, mort, 5 guéris
    public Patient(GamePanel gp, int positionX, int positionY, int covid){
        super(gp,positionX,positionY,covid);
        getPlayerImage();

    }

    public void getPlayerImage() {
        try {
            up1= ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("player/patient/boy_up_1.png")));
            up2= ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("player/covid/boy_up_2.png")));
            down1= ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("player/patient/boy_down_1.png")));
            down2= ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("player/covid/boy_down_2.png")));
            left1= ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("player/patient/boy_left_1.png")));
            left2= ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("player/covid/boy_left_2.png")));
            right1= ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("player/patient/boy_right_1.png")));
            right2= ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("player/covid/boy_right_2.png")));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public int[] choixLieu() {
        if (probleme ==2){
            //System.out.println("lieu patient c"+choix[0]+"h"+choix[1]+" probleme :" + probleme);
        }


        boolean trouve = false;

        if (probleme == 3){
            choix [0] = lieu.chambreRea(i)[0];  // REA
            choix [1] = lieu.chambreRea(i)[1];
  // REA
            return choix;

        }
        if (probleme == 1 && !trouve) {

            int j = 0;
            while (!trouve && i<gp.nbChambrePatient.length){
                if (gp.nbChambrePatient[j][0] == 0){

                    trouve = true;
                    gp.nbChambrePatient[j][0] = 1;
                    i = j;
                    probleme =2;
                    choix [0] = lieu.chambrePatient(i)[0];
                    choix [1] = lieu.chambrePatient(i)[1];
                    return choix;
                }
                j++;

            }


        }
        if (probleme == 5){
            choix [0] = lieu.sorti()[0];  // SORTI
            choix [1] = lieu.sorti()[1];  // SORTI
            probleme =8;
            return choix;
        }

        if (probleme == 7){
            gp.nbChambreRea[i] = 0;
            choix [0] = lieu.sorti()[0];  // SORTI
            choix [1] = lieu.sorti()[1];
            probleme =8;
            return choix;
        }
        if (probleme == 8){
            probleme =1;
            setPositionX(5);
            setPositionY(79);
            choix[0] = lieu.accueil()[0];
            choix[1] = lieu.accueil()[1];
            return choix;

        }



        return choix;
    }

}

