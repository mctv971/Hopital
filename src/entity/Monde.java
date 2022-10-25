
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
                gp.medecin[i] = new Medecin(this.gp,Integer.parseInt(med[0]),Integer.parseInt(med[1]),Integer.parseInt(med[2]));

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
    public void setAgentSecu() {


        try
        {
            // Le fichier d'entrée
            FileInputStream file = new FileInputStream("res/player/agentsecu/lieuAgentSecurite.txt");
            Scanner scanner = new Scanner(file);

            int i = 0;
            String text;
            while(scanner.hasNextLine())
            {

                text = scanner.nextLine();
                String [] med = text.split(",");
                gp.agentSecus[i] = new AgentSecu(this.gp,Integer.parseInt(med[0]),Integer.parseInt(med[1]),Integer.parseInt(med[2]));
                i++;
                if (i == gp.nbAgent){
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
    public void setAideSoigante() {


        try
        {
            // Le fichier d'entrée
            FileInputStream file = new FileInputStream("res/player/aidesoignant/lieuAideSoignant.txt");
            Scanner scanner = new Scanner(file);

            int i = 0;
            String text;
            while(scanner.hasNextLine())
            {

                text = scanner.nextLine();
                String [] med = text.split(",");
                gp.aideSoignantes[i] = new AideSoignante(this.gp,Integer.parseInt(med[0]),Integer.parseInt(med[1]),Integer.parseInt(med[2]));

                i++;
                if (i == gp.nbAideSoignante){
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
    public void setAssistance() {


        try
        {
            // Le fichier d'entrée
            FileInputStream file = new FileInputStream("res/player/assistantservicesocial/lieuAssistantServiceSocial.txt");
            Scanner scanner = new Scanner(file);

            int i = 0;
            String text;
            while(scanner.hasNextLine())
            {

                text = scanner.nextLine();
                String [] med = text.split(",");
                gp.assistanceServiceSocials[i] = new AssistanceServiceSocial(this.gp,Integer.parseInt(med[0]),Integer.parseInt(med[1]),Integer.parseInt(med[2]));

                i++;
                if (i == gp.nbAssist){
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
    public void setDieteticien() {


        try
        {
            // Le fichier d'entrée
            FileInputStream file = new FileInputStream("res/player/dieteticien/lieuDieteticien.txt");
            Scanner scanner = new Scanner(file);

            int i = 0;
            String text;
            while(scanner.hasNextLine())
            {

                text = scanner.nextLine();
                String [] med = text.split(",");
                gp.dieteticiens[i] = new Dieteticien(this.gp,Integer.parseInt(med[0]),Integer.parseInt(med[1]),Integer.parseInt(med[2]));

                i++;
                if (i == gp.nbDiete){
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
    public void setDirecteur() {


        try
        {
            // Le fichier d'entrée
            FileInputStream file = new FileInputStream("res/player/directeur/lieuDirecteur.txt");
            Scanner scanner = new Scanner(file);

            int i = 0;
            String text;
            while(scanner.hasNextLine())
            {

                text = scanner.nextLine();
                String [] med = text.split(",");
                gp.directeurs[i] = new Directeur(this.gp,Integer.parseInt(med[0]),Integer.parseInt(med[1]),Integer.parseInt(med[2]));

                i++;
                if (i == gp.nbDirecteur){
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
    public void setInfirmier() {


        try
        {
            // Le fichier d'entrée
            FileInputStream file = new FileInputStream("res/player/infirmier/lieuInfirmier.txt");
            Scanner scanner = new Scanner(file);

            int i = 0;
            String text;
            while(scanner.hasNextLine())
            {

                text = scanner.nextLine();
                String [] med = text.split(",");
                gp.infirmiers[i] = new Infirmier(this.gp,Integer.parseInt(med[0]),Integer.parseInt(med[1]),Integer.parseInt(med[2]));

                i++;
                if (i == gp.nbInfirmier){
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
    public void setKine() {


        try
        {
            // Le fichier d'entrée
            FileInputStream file = new FileInputStream("res/player/kine/lieuKinesitherapeute.txt");
            Scanner scanner = new Scanner(file);

            int i = 0;
            String text;
            while(scanner.hasNextLine())
            {

                text = scanner.nextLine();
                String [] med = text.split(",");
                gp.kinesitherapeutes[i] = new Kinesitherapeute(this.gp,Integer.parseInt(med[0]),Integer.parseInt(med[1]),Integer.parseInt(med[2]));

                i++;
                if (i == gp.nbKine){
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
    public void setManipulateurRadio() {


        try
        {
            // Le fichier d'entrée
            FileInputStream file = new FileInputStream("res/player/manipulateurradio/lieuManipulateurRadio.txt");
            Scanner scanner = new Scanner(file);

            int i = 0;
            String text;
            while(scanner.hasNextLine())
            {

                text = scanner.nextLine();
                String [] med = text.split(",");
                gp.manipulateurRadios[i] = new ManipulateurRadio(this.gp,Integer.parseInt(med[0]),Integer.parseInt(med[1]),Integer.parseInt(med[2]));

                i++;
                if (i == gp.nbMani){
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
    public void setNouveauPatient() {


        try
        {
            // Le fichier d'entrée
            FileInputStream file = new FileInputStream("res/player/nouveaupatient/lieuNouveauPatient.txt");
            Scanner scanner = new Scanner(file);

            int i = 0;
            String text;
            while(scanner.hasNextLine())
            {

                text = scanner.nextLine();
                String [] med = text.split(",");
                gp.nouveauPatients[i] = new NouveauPatient(this.gp,Integer.parseInt(med[0]),Integer.parseInt(med[1]),Integer.parseInt(med[2]));

                i++;
                if (i == gp.nbNewPatient){
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
    public void setPatientChambre() {


        try
        {
            // Le fichier d'entrée
            FileInputStream file = new FileInputStream("res/player/patientchambre/lieuPatientChambre.txt");
            Scanner scanner = new Scanner(file);

            int i = 0;
            String text;
            while(scanner.hasNextLine())
            {

                text = scanner.nextLine();
                String [] med = text.split(",");
                gp.patientChambres[i] = new PatientChambre(this.gp,Integer.parseInt(med[0]),Integer.parseInt(med[1]),Integer.parseInt(med[2]));

                i++;
                if (i == gp.nbPatientCham){
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
    public void setPrepaPharma() {


        try
        {
            // Le fichier d'entrée
            FileInputStream file = new FileInputStream("res/player/prepapharma/lieuPreparateurPharmacie.txt");
            Scanner scanner = new Scanner(file);

            int i = 0;
            String text;
            while(scanner.hasNextLine())
            {

                text = scanner.nextLine();
                String [] med = text.split(",");
                gp.preparateurPharmacies[i] = new PreparateurPharmacie(this.gp,Integer.parseInt(med[0]),Integer.parseInt(med[1]),Integer.parseInt(med[2]));

                i++;
                if (i == gp.nbPrepa){
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
    public void setPsychologue() {


        try
        {
            // Le fichier d'entrée
            FileInputStream file = new FileInputStream("res/player/psychologue/lieuPsychologue.txt");
            Scanner scanner = new Scanner(file);

            int i = 0;
            String text;
            while(scanner.hasNextLine())
            {

                text = scanner.nextLine();
                String [] med = text.split(",");
                gp.psychologues[i] = new Psychologue(this.gp,Integer.parseInt(med[0]),Integer.parseInt(med[1]),Integer.parseInt(med[2]));

                i++;
                if (i == gp.nbPsy){
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
    public void setSageFemme() {


        try
        {
            // Le fichier d'entrée
            FileInputStream file = new FileInputStream("res/player/sagefemme/lieuSageFemme.txt");
            Scanner scanner = new Scanner(file);

            int i = 0;
            String text;
            while(scanner.hasNextLine())
            {

                text = scanner.nextLine();
                String [] med = text.split(",");
                gp.sageFemmes[i] = new SageFemme(this.gp,Integer.parseInt(med[0]),Integer.parseInt(med[1]),Integer.parseInt(med[2]));

                i++;
                if (i == gp.nbSageF){
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
    public void setSecretaire() {


        try
        {
            // Le fichier d'entrée
            FileInputStream file = new FileInputStream("res/player/secretairemedicale/lieuSecretaireMedicale.txt");
            Scanner scanner = new Scanner(file);

            int i = 0;
            String text;
            while(scanner.hasNextLine())
            {

                text = scanner.nextLine();
                String [] med = text.split(",");
                gp.secretaireMedicales[i] = new SecretaireMedicale(this.gp,Integer.parseInt(med[0]),Integer.parseInt(med[1]),Integer.parseInt(med[2]));

                i++;
                if (i == gp.nbSecret){
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
    public void setTechnicien() {


        try
        {
            // Le fichier d'entrée
            FileInputStream file = new FileInputStream("res/player/technicien/lieuTechnicienDeLabo.txt");
            Scanner scanner = new Scanner(file);

            int i = 0;
            String text;
            while(scanner.hasNextLine())
            {

                text = scanner.nextLine();
                String [] med = text.split(",");
                gp.technicienLabos[i] = new TechnicienLabo(this.gp,Integer.parseInt(med[0]),Integer.parseInt(med[1]),Integer.parseInt(med[2]));

                i++;
                if (i == gp.nbTechn){
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
                gp.visiteurs[i] = new Visiteur(this.gp,Integer.parseInt(med[0]),Integer.parseInt(med[1]),Integer.parseInt(med[2]));

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

