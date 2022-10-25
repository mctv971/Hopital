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
    public int nbMedecin = 50; // MAX 100
    public int nbAgent = 10; // MAX 10
    public int nbAideSoignante = 10; // MAX 10

    public int nbAssist = 10; // MAX 10
    public int nbDiete = 10; // MAX 10
    public int nbDirecteur= 10; // MAX 10
    public int nbInfirmier = 5; // MAX 10
    public int nbKine = 5; // MAX 10
    public int nbMani = 5; // MAX 10
    public int nbNewPatient = 100; // MAX 100
    public int nbPatientCham = 100; // MAX 100
    public int nbPrepa = 10; // MAX 10
    public int nbPsy = 10; // MAX 10
    public int nbSageF = 10; // MAX 10
    public int nbSecret = 10; // MAX 10
    public int nbTechn = 10; // MAX 10
    public int nbVisiteur = 100; // MAX 100


    //FPS
    int FPS = 10;
    TileManager tileM = new TileManager(this);
    public CovidChecker cChecker = new CovidChecker(this);
    Thread gameThread; //Il gère le temps dans le jeu, et donc fait tourner le programme
    public Deplacement depla = new Deplacement(this);
    Monde monde = new Monde(this);

    public Medecin[] medecin = new Medecin[nbMedecin];
    public AgentSecu[] agentSecus = new AgentSecu[nbAgent];
    public AssistanceServiceSocial[] assistanceServiceSocials = new AssistanceServiceSocial[nbAssist];
    public Dieteticien[] dieteticiens = new Dieteticien[nbDiete];
    public Directeur[] directeurs = new Directeur[nbDirecteur];
    public Infirmier[] infirmiers = new Infirmier[nbInfirmier];
    public Kinesitherapeute[] kinesitherapeutes = new Kinesitherapeute[nbKine];
    public ManipulateurRadio[] manipulateurRadios = new ManipulateurRadio[nbMani];
    public NouveauPatient[] nouveauPatients = new NouveauPatient[nbNewPatient];
    public PatientChambre[] patientChambres = new PatientChambre[nbPatientCham];
    public Psychologue[] psychologues = new Psychologue[nbPsy];
    public SageFemme[] sageFemmes = new SageFemme[nbSageF];
    public SecretaireMedicale[] secretaireMedicales = new SecretaireMedicale[nbSecret];
    public TechnicienLabo[] technicienLabos = new TechnicienLabo[nbTechn];
    public Visiteur[] visiteurs = new Visiteur[nbVisiteur];
    public AideSoignante[] aideSoignantes = new AideSoignante[nbAideSoignante];
    public PreparateurPharmacie[] preparateurPharmacies = new PreparateurPharmacie[nbPrepa];


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
        monde.setAgentSecu();
        monde.setAideSoigante();
        monde.setAssistance();
        monde.setDieteticien();
        monde.setDirecteur();
        monde.setInfirmier();
        monde.setKine();
        monde.setManipulateurRadio();
        monde.setNouveauPatient();
        monde.setPatientChambre();
        monde.setVisiteur();
        monde.setSageFemme();
        monde.setSecretaire();
        monde.setTechnicien();
        monde.setPsychologue();
        monde.setPrepaPharma();

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
        for (int i = 0;i<medecin.length; i++){
            if(medecin[i] != null){
                medecin[i].update();
                if (medecin[i].covid == 1){
                    nbCovid ++;
                }
            }
        }
        for (int i = 0;i<agentSecus.length; i++){
            if(agentSecus[i] != null){
                agentSecus[i].update();
                if (agentSecus[i].covid == 1){
                    nbCovid ++;
                }
            }
        }
        for (int i = 0;i<assistanceServiceSocials.length; i++){
            if(assistanceServiceSocials[i] != null){
                assistanceServiceSocials[i].update();
                if (assistanceServiceSocials[i].covid == 1){
                    nbCovid ++;
                }
            }
        }
        for (int i = 0;i<dieteticiens.length; i++){
            if(dieteticiens[i] != null){
                dieteticiens[i].update();
                if (dieteticiens[i].covid == 1){
                    nbCovid ++;
                }
            }
        }
        for (int i = 0;i<directeurs.length; i++){
            if(directeurs[i] != null){
                directeurs[i].update();
                if (directeurs[i].covid == 1){
                    nbCovid ++;
                }
            }
        }
        for (int i = 0;i<visiteurs.length; i++){
            if(visiteurs[i] != null){
                visiteurs[i].update();
                if (visiteurs[i].covid == 1){
                    nbCovid ++;
                }
            }
        }
        for (int i = 0;i<nouveauPatients.length; i++){
            if(nouveauPatients[i] != null){
                nouveauPatients[i].update();
                if (nouveauPatients[i].covid == 1){
                    nbCovid ++;
                }
            }
        }
        for (int i = 0;i<patientChambres.length; i++){
            if(patientChambres[i] != null){
                patientChambres[i].update();
                if (patientChambres[i].covid == 1){
                    nbCovid ++;
                }
            }
        }
        for (int i = 0;i<infirmiers.length; i++){
            if(infirmiers[i] != null){
                infirmiers[i].update();
                if (infirmiers[i].covid == 1){
                    nbCovid ++;
                }
            }
        }
        for (int i = 0;i<preparateurPharmacies.length; i++){
            if(preparateurPharmacies[i] != null){
                preparateurPharmacies[i].update();
                if (preparateurPharmacies[i].covid == 1){
                    nbCovid ++;
                }
            }
        }
        for (int i = 0;i<aideSoignantes.length; i++){
            if(aideSoignantes[i] != null){
                aideSoignantes[i].update();
                if (aideSoignantes[i].covid == 1){
                    nbCovid ++;
                }
            }
        }
        for (int i = 0;i<technicienLabos.length; i++){
            if(technicienLabos[i] != null){
                technicienLabos[i].update();
                if (technicienLabos[i].covid == 1){
                    nbCovid ++;
                }
            }
        }
        for (int i = 0;i<secretaireMedicales.length; i++){
            if(secretaireMedicales[i] != null){
                secretaireMedicales[i].update();
                if (secretaireMedicales[i].covid == 1){
                    nbCovid ++;
                }
            }
        }
        for (int i = 0;i<sageFemmes.length; i++){
            if(sageFemmes[i] != null){
                sageFemmes[i].update();
                if (sageFemmes[i].covid == 1){
                    nbCovid ++;
                }
            }
        }
        for (int i = 0;i<psychologues.length; i++){
            if(psychologues[i] != null){
                psychologues[i].update();
                if (psychologues[i].covid == 1){
                    nbCovid ++;
                }
            }
        }
        for (int i = 0;i<manipulateurRadios.length; i++){
            if(manipulateurRadios[i] != null){
                manipulateurRadios[i].update();
                if (manipulateurRadios[i].covid == 1){
                    nbCovid ++;
                }
            }
        }
        for (int i = 0;i<kinesitherapeutes.length; i++){
            if(kinesitherapeutes[i] != null){
                kinesitherapeutes[i].update();
                if (kinesitherapeutes[i].covid == 1){
                    nbCovid ++;
                }
            }
        }








        System.out.println("Nombre covid : "+ nbCovid + "  Nombre Non Covid :  "+ (nbMedecin
                +nbPrepa+nbTechn+nbPsy+nbAideSoignante+nbVisiteur+nbSecret+nbSageF
                +nbPatientCham+nbNewPatient+nbMani+nbKine+nbInfirmier+
                nbDirecteur+nbDiete+nbAssist+nbAgent- nbCovid));
        cChecker.checkCovid(medecin,medecin);



    }
    public void paintComponent(Graphics g){ //C'est un peu comme ton stylo ou ton feutre

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        tileM.draw(g2);
        for (int i = 0;i<medecin.length; i++){
            if(medecin[i] != null){
                medecin[i].draw(g2);
            }
        }
        for (int i = 0;i<agentSecus.length; i++){
            if(agentSecus[i] != null){
                agentSecus[i].draw(g2);
            }
        }
        for (int i = 0;i<assistanceServiceSocials.length; i++){
            if(assistanceServiceSocials[i] != null){
                assistanceServiceSocials[i].draw(g2);
            }
        }
        for (int i = 0;i<dieteticiens.length; i++){
            if(dieteticiens[i] != null){
                dieteticiens[i].draw(g2);
            }
        }
        for (int i = 0;i<directeurs.length; i++){
            if(directeurs[i] != null){
                directeurs[i].draw(g2);
            }
        }
        for (int i = 0;i<visiteurs.length; i++){
            if(visiteurs[i] != null){
                visiteurs[i].draw(g2);
            }
        }
        for (int i = 0;i<nouveauPatients.length; i++){
            if(nouveauPatients[i] != null){
                nouveauPatients[i].draw(g2);
            }
        }
        for (int i = 0;i<patientChambres.length; i++){
            if(patientChambres[i] != null){
                patientChambres[i].draw(g2);
            }
        }
        for (int i = 0;i<infirmiers.length; i++){
            if(infirmiers[i] != null){
                infirmiers[i].draw(g2);
            }
        }
        for (int i = 0;i<preparateurPharmacies.length; i++){
            if(preparateurPharmacies[i] != null){
                preparateurPharmacies[i].draw(g2);
            }
        }
        for (int i = 0;i<aideSoignantes.length; i++){
            if(aideSoignantes[i] != null){
                aideSoignantes[i].draw(g2);
            }
        }
        for (int i = 0;i<technicienLabos.length; i++){
            if(technicienLabos[i] != null){
                technicienLabos[i].draw(g2);
            }
        }
        for (int i = 0;i<secretaireMedicales.length; i++){
            if(secretaireMedicales[i] != null){
                secretaireMedicales[i].draw(g2);
            }
        }
        for (int i = 0;i<sageFemmes.length; i++){
            if(sageFemmes[i] != null){
                sageFemmes[i].draw(g2);
            }
        }
        for (int i = 0;i<psychologues.length; i++){
            if(psychologues[i] != null){
                psychologues[i].draw(g2);

            }
        }
        for (int i = 0;i<manipulateurRadios.length; i++){
            if(manipulateurRadios[i] != null){
                manipulateurRadios[i].draw(g2);

            }
        }
        for (int i = 0;i<kinesitherapeutes.length; i++) {
            if (kinesitherapeutes[i] != null) {
                kinesitherapeutes[i].draw(g2);

            }
        }



        g2.dispose();

    }
}
