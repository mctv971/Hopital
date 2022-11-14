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
    int[] choix = new int[8];
    //0 statut, 1 en cours de traitement,2 en cours de guerison 3. rea, 4, mort, 5 guéris
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

        // statut 1 : Pris en charge --> direction la chambre
        // statut 2 : Dans la chambre --> Soit guéri, soit réa
        // statut 3: Si Réa, direction la chambre
        // statut 5 :Part dans l'hopital
        // statut 7 : Reviens comme un nouveau patient





        if (statut == 3){
            choix [0] = lieu.chambreRea(i)[0];  // REA
            choix [1] = lieu.chambreRea(i)[1];
  // REA
            return choix;

        }
        if (statut == 1) {
            boolean trouve = false;

            int j = 0;
            while (!trouve && j<gp.nbChambrePatient.length){
                if (gp.nbChambrePatient[j][0] == 0){

                    trouve = true;
                    gp.nbChambrePatient[j][0] = 1;
                    i = j;
                    statut =2;
                    choix [0] = lieu.chambrePatient(i)[0];
                    choix [1] = lieu.chambrePatient(i)[1];
                    return choix;
                }
                j++;

            }


        }
        if (statut == 5){
            choix [0] = lieu.sorti()[0];  // SORTI
            choix [1] = lieu.sorti()[1];  // SORTI
            statut =8;
            return choix;
        }

        if (statut == 7){
            gp.nbChambreRea[i] = 0;
            choix [0] = lieu.sorti()[0];  // SORTI
            choix [1] = lieu.sorti()[1];
            statut =8;
            return choix;
        }
        if (statut == 8){
            statut =1;
            setPositionX(5);
            setPositionY(79);
            choix[0] = lieu.accueil()[0];
            choix[1] = lieu.accueil()[1];
            return choix;
        }



        return choix;
    }

}

