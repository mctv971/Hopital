
package entity;

import main.GamePanel;

import java.io.*;
import java.util.Scanner;

public class Monde {
    GamePanel gp;



    public Monde(GamePanel gp){
        this.gp =gp;
    }


    public void setMedecin() {


        try
        {
            // Le fichier d'entrée
            FileInputStream file = new FileInputStream("res/player/medecin/medecin.txt");
            Scanner scanner = new Scanner(file);

            int i = 0;
            String text;
            while(scanner.hasNextLine())
            {

                text = scanner.nextLine();
                String [] med = text.split(",");
                Entity.toto.add(new Medecin(this.gp,Integer.parseInt(med[0]),Integer.parseInt(med[1]),Integer.parseInt(med[2])));

                i++;
                if (i == gp.nbMedecin){
                    break;
                }
            }
            scanner.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }

    public void setPatient() {


        try
        {
            // Le fichier d'entrée
            FileInputStream file = new FileInputStream("res/player/patient/lieuPatientChambre.txt");
            Scanner scanner = new Scanner(file);

            int i = 0;
            String text;
            while(scanner.hasNextLine())
            {

                text = scanner.nextLine();
                String [] med = text.split(",");
                Entity.toto.add(new Patient(this.gp,Integer.parseInt(med[0]),Integer.parseInt(med[1]),Integer.parseInt(med[2])));

                i++;
                if (i == gp.nbPatient){
                    break;
                }
            }
            scanner.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }

    public void setVisiteur() {


        try
        {
            // Le fichier d'entrée
            FileInputStream file = new FileInputStream("res/player/visiteur/lieuVisiteur.txt");
            Scanner scanner = new Scanner(file);

            int i = 0;
            String text;
            while(scanner.hasNextLine())
            {

                text = scanner.nextLine();
                String [] med = text.split(",");
                Entity.toto.add(new Visiteur(this.gp,Integer.parseInt(med[0]),Integer.parseInt(med[1]),Integer.parseInt(med[2])));

                i++;
                if (i == gp.nbVisiteur){
                    break;
                }
            }
            scanner.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}

