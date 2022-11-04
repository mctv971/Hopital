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
        int[] choix = new int[2];
        choix [0] = lieu.choixLieuPatient(i)[0];
        choix [1] = lieu.choixLieuPatient(i)[1];
        return choix;
    }

}

