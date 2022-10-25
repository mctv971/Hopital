package entity;

public class Lieu {
    int[] lieu = new int[2];
    public int[] choixLieuMedecin(int i) {
        switch (i) {
            case 0:
                lieu[0] = 32;
                lieu[1] = 11;
                break;

            // coordonnées : x = 20 et y = -10
            // OU x = 14 y = 24, 19, 13
            // OU x = 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85  y = 10
            // OU x = 89 y = 15, 21, 26, 32, 37, 42, 48, 53, 56, 61, 67, 72


            case 1:
                lieu[0] = 24;
                lieu[1] = 39;
                break;

            // coordonnées : x = 24 et y = -39


            case 2:
                lieu[0] = 58;
                lieu[1] = 58;
                break;

            // coordonnées : x = 58 et y = -58


            case 3:
                lieu[0] = 50;
                lieu[1] = 50;
                break;

            // coordonnées : x = 50 et y = -50


            case 4:
                lieu[0] = 59;
                lieu[1] = 77;
                break;

            // coordonnées : x = 20 et y = 51
            // OU x = 17 y = 60, 52
            // OU x = 14 y = 68, 73, 75
            // OU x = 22, 28, 33, 38, 46, 50, 53, 63, 68, 72, 79, 82 y = 78


            case 5:
                lieu[0] = 70;
                lieu[1] = 25;
                break;

            // coordonnées : x = [60 ; 74]  et y = [-21 ; -38]


            case 6:
                lieu[0] = 11;
                lieu[1] = 26;
                break;

            // coordonnées : x = [10 ; 15]  et y = [-26 ; -36] ou [-51 ; -61]


            case 7:
                lieu[0] = 32;
                lieu[1] = 20;
                break;
            case 8:
                lieu[0] = 32;
                lieu[1] = 20;
                break;
            case 9:
                lieu[0] = 32;
                lieu[1] = 20;
                break;
            case 10:
                lieu[0] = 32;
                lieu[1] = 20;
                break;

            // coordonnées : x = 32 et y = -20


        }
        return lieu;
    }
    public int[] choixLieuAgentSecu(int i) {
        switch (i) {
            case 0:
                lieu[0] = 26;
                lieu[1] = 56;
                break;
            // coordonnées : x = 26 et y = -56


            case 1:
                lieu[0] = 19;
                lieu[1] = 40;
                break;
            // coordonnées : x = 19 ou 20 et y = -40 ou -46

            case 2:
                lieu[0] = 23;
                lieu[1] = 52;
                break;
            // coordonnées : x = 20 et y = 51
            // OU x = 17 y = 60, 52
            // OU x = 14 y = 68, 73, 75
            // OU x = 22, 28, 33, 38, 46, 50, 53, 63, 68, 72, 79, 82 y = 78


            case 3:
                lieu[0] = 13;
                lieu[1] = 34;
                break;
            // coordonnées : x = [60 ; 74]  et y = [-21 ; -38]

            case 4:
                lieu[0] = 13;
                lieu[1] = 59;
                break;
            // coordonnées : x = [10 ; 15]  et y = [-26 ; -36] ou [-51 ; -61]

            case 5:
                lieu[0] = 32;
                lieu[1] = 20;
                break;

            // coordonnées : x = 32 et y = -20

        }
        return lieu;
    }
    public int[] choixLieuAideSoignante(int i) {
        switch(i){

            case 0:
                lieu[0] = 16;
                lieu[1] = 25;
                break;
            // coordonnées : x = 20 et y = -10
            // OU x = 14 y = 24, 19, 13
            // OU x = 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85  y = 10
            // OU x = 89 y = 15, 21, 26, 32, 37, 42, 48, 53, 56, 61, 67, 72


            case 1:
                lieu[0] = 33;
                lieu[1] = 30;
                break;
            // coordonnées : x = 33 et y = -30


            case 2:
                lieu[0] = 77;
                lieu[1] = 49;
                break;
            // coordonnées : x = 77 et y = -49


            case 3:
                lieu[0] = 18;
                lieu[1] = 58;
                break;
            // coordonnées : x = 20 et y = 51
            // OU x = 17 y = 60, 52
            // OU x = 14 y = 68, 73, 75
            // OU x = 22, 28, 33, 38, 46, 50, 53, 63, 68, 72, 79, 82 y = 78


            case 4:
                lieu[0] = 12;
                lieu[1] = 52;
                break;
            // coordonnées : x = [60 ; 74]  et y = [-21 ; -38]


            case 5:
                lieu[0] = 10;
                lieu[1] = 26;
                break;
            // coordonnées : x = [10 ; 15]  et y = [-26 ; -36] ou [-51 ; -61]

            // coordonnées : x = 32 et y = -20

        }



        return lieu;
    }
    public int[] choixLieuAssistance(int i) {

        switch(i){

            case 0:
                lieu[0] = 30;
                lieu[1] = 26;
                break;
            // coordonnées : x = 30 et y = -27


            case 1:
                lieu[0] = 24;
                lieu[1] = 39;
                break;
            // coordonnées : x = 24 et y = -39


            case 2:
                lieu[0] = 17;
                lieu[1] = 63;
                break;
            // coordonnées : x = 20 et y = 51
            // OU x = 17 y = 60, 52
            // OU x = 14 y = 68, 73, 75
            // OU x = 22, 28, 33, 38, 46, 50, 53, 63, 68, 72, 79, 82 y = 78


            case 3:
                lieu[0] = 65;
                lieu[1] = 29;
                break;
            // coordonnées : x = [60 ; 74]  et y = [-21 ; -38]


            case 4:
                lieu[0] = 11;
                lieu[1] = 57;
                break;
            // coordonnées : x = [10 ; 15]  et y = [-26 ; -36] ou [-51 ; -61]


            case 5:
                lieu[0] = 32;
                lieu[1] = 20;
                break;
            // coordonnées : x = 32 et y = -20

        }
        return lieu;
    }
    public int[] choixLieuDieteticien(int i) {


        switch(i){

            case 0:
                lieu[0] = 16;
                lieu[1] = 25;
                break;
            // coordonnées : x = 20 et y = -10
            // OU x = 14 y = 24, 19, 13
            // OU x = 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85  y = 10
            // OU x = 89 y = 15, 21, 26, 32, 37, 42, 48, 53, 56, 61, 67, 72


            case 1:
                lieu[0] = 33;
                lieu[1] = 30;
                break;
            // coordonnées : x = 33 et y = -30


            case 2:
                lieu[0] = 49;
                lieu[1] = 67;
                break;
            // coordonnées : x = 49 et y = -67


            case 3:
                lieu[0] = 16;
                lieu[1] = 75;
                break;
            // coordonnées : x = 20 et y = 51
            // OU x = 17 y = 60, 52
            // OU x = 14 y = 68, 73, 75
            // OU x = 22, 28, 33, 38, 46, 50, 53, 63, 68, 72, 79, 82 y = 78


            case 4:
                lieu[0] = 73;
                lieu[1] = 23;
                break;
            // coordonnées : x = [60 ; 74]  et y = [-21 ; -38]


            case 5:
                lieu[0] = 13;
                lieu[1] = 26;
                break;
            // coordonnées : x = [10 ; 15]  et y = [-26 ; -36] ou [-51 ; -61]


            case 6:
                lieu[0] = 32;
                lieu[1] = 20;
                break;
            // coordonnées : x = 32 et y = -20


        }

        return lieu;
    }
    public int[] choixLieuDirecteur(int i) {

        switch(i){

            case 0:
                lieu[0] = 62;
                lieu[1] = 34;
                break;
            // coordonnées : x = [60 ; 74]  et y = [-21 ; -38]


            case 1:
                lieu[0] = 15;
                lieu[1] = 60;
                break;
            // coordonnées : x = [10 ; 15]  et y = [-26 ; -36] ou [-51 ; -61]


            case 2:
                lieu[0] = 32;
                lieu[1] = 20;
                break;
            // coordonnées : x = 32 et y = -20


            case 3:
                lieu[0] = 17;
                lieu[1] = 72;
                break;
            // coordonnées : x = 20 et y = 51
            // OU x = 17 y = 60, 52
            // OU x = 14 y = 68, 73, 75
            // OU x = 22, 28, 33, 38, 46, 50, 53, 63, 68, 72, 79, 82 y = 78


            case 4:
                lieu[0] = 49;
                lieu[1] = 50;
                break;
            // coordonnées : x = 49 et y = -50


            case 5:
                lieu[0] = 33;
                lieu[1] = 50;
                break;
            // coordonnées : x = 33 et y = -50

        }
        return lieu;
    }
    public int[] choixLieuInfirmier(int i) {

        switch(i) {


            case 0:
                lieu[0] = 16;
                lieu[1] = 20;
                break;
            // coordonnées : x = 20 et y = -10
            // OU x = 14 y = 24, 19, 13
            // OU x = 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85  y = 10
            // OU x = 89 y = 15, 21, 26, 32, 37, 42, 48, 53, 56, 61, 67, 72


            case 1:
                lieu[0] = 16;
                lieu[1] = 26;
                break;
            // coordonnées : x = 17 et y = -27


            case 2:
                lieu[0] = 69;
                lieu[1] = 49;
                break;
            // coordonnées : x = 69 et y = -49


            case 3:
                lieu[0] = 73;
                lieu[1] = 61;
                break;
            // coordonnées : x = 73 et y = -61


            case 4:
                lieu[0] = 20;
                lieu[1] = 77;
                break;
            // coordonnées : x = 20 et y = 51
            // OU x = 17 y = 60, 52
            // OU x = 14 y = 68, 73, 75
            // OU x = 22, 28, 33, 38, 46, 50, 53, 63, 68, 72, 79, 82 y = 78


            case 5:
                lieu[0] = 60;
                lieu[1] = 23;
                break;
            // coordonnées : x = [60 ; 74]  et y = [-21 ; -38]


            case 6:
                lieu[0] = 15;
                lieu[1] = 61;
                break;
            // coordonnées : x = [10 ; 15]  et y = [-26 ; -36] ou [-51 ; -61]


            case 7:
                lieu[0] = 32;
                lieu[1] = 20;
                break;
            // coordonnées : x = 32 et y = -20
        }




            return lieu;
    }
    public int[] choixLieuKinesitherapeute(int i) {


        switch(i){

            case 0:
                lieu[0] = 16;
                lieu[1] = 20;
                break;
            // coordonnées : x = 20 et y = -10
            // OU x = 14 y = 24, 19, 13
            // OU x = 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85  y = 10
            // OU x = 89 y = 15, 21, 26, 32, 37, 42, 48, 53, 56, 61, 67, 72


            case 1:
                lieu[0] = 33;
                lieu[1] = 30;
                break;
            // coordonnées : x = 33 et y = -30


            case 2:
                lieu[0] = 48;
                lieu[1] = 39;
                break;
            // coordonnées : x = 48 et y = -39


            case 3:
                lieu[0] = 17;
                lieu[1] = 59;
                break;
            // coordonnées : x = 20 et y = 51
            // OU x = 17 y = 60, 52
            // OU x = 14 y = 68, 73, 75
            // OU x = 22, 28, 33, 38, 46, 50, 53, 63, 68, 72, 79, 82 y = 78


            case 4:
                lieu[0] = 72;
                lieu[1] = 37;
                break;
            // coordonnées : x = [60 ; 74]  et y = [-21 ; -38]


            case 5:
                lieu[0] = 10;
                lieu[1] = 57;
                break;
            // coordonnées : x = [10 ; 15]  et y = [-26 ; -36] ou [-51 ; -61]



            // coordonnées : x = 32 et y = -20

        }



        return lieu;
    }
    public int[] choixLieuManipulateur(int i) {
        switch(i){

            case 0:
                lieu[0] = 28;
                lieu[1] = 63;
                break;
            // coordonnées : x = 28 et y = -63


            case 1:
                lieu[0] = 33;
                lieu[1] = 50;
                break;
            // coordonnées : x = 33 et y = -50


            case 2:
                lieu[0] = 57;
                lieu[1] = 76;
                break;
            // coordonnées : x = 20 et y = 51
            // OU x = 17 y = 60, 52
            // OU x = 14 y = 68, 73, 75
            // OU x = 22, 28, 33, 38, 46, 50, 53, 63, 68, 72, 79, 82 y = 78


            case 3:
                lieu[0] = 73;
                lieu[1] = 23;
                break;
            // coordonnées : x = [60 ; 74]  et y = [-21 ; -38]


            case 4:
                lieu[0] = 12;
                lieu[1] = 28;
                break;
            // coordonnées : x = [10 ; 15]  et y = [-26 ; -36] ou [-51 ; -61]


            case 5:
                lieu[0] = 32;
                lieu[1] = 20;
                break;
            // coordonnées : x = 32 et y = -20


        }

        return lieu;
    }
    public int[] choixLieuNouveauPatient(int i) {


        switch(i){

            case 0:
                lieu[0] = 11;
                lieu[1] = 57;
                break;
            // coordonnées : x = 20 et y = -10
            // OU x = 14 y = 24, 19, 13
            // OU x = 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85  y = 10
            // OU x = 89 y = 15, 21, 26, 32, 37, 42, 48, 53, 56, 61, 67, 72


            case 1:
                lieu[0] = 23;
                lieu[1] = 40;
                break;
            // coordonnées : x = [22 ; 28] et y = -41

            case 2:
                lieu[0] = 23;
                lieu[1] = 50;
                break;
            // coordonnées : x = [22 ; 28] et y = -50

            case 3:
                lieu[0] = 29;
                lieu[1] = 52;
                break;
            // coordonnées : x = 29 et y = -52

            case 4:
                lieu[0] = 59;
                lieu[1] = 59;
                break;
            // coordonnées : x = 59 et y = -59


            case 5:
                lieu[0] = 10;
                lieu[1] = 11;
                break;
            // coordonnées : x = 10 et y = -8


        }
        return lieu;
    }
    public int[] choixLieuPatientChambre(int i) {


        switch(i){

            case 0:
                lieu[0] = 32;
                lieu[1] = 11;
                break;
            // coordonnées : x = 20 et y = -10
            // OU x = 14 y = 24, 19, 13
            // OU x = 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85  y = 10
            // OU x = 89 y = 15, 21, 26, 32, 37, 42, 48, 53, 56, 61, 67, 72


            case 1:
                lieu[0] = 29;
                lieu[1] = 11;
                break;
            // coordonnées : x = 29 et y = -10


            case 2:
                lieu[0] = 60;
                lieu[1] = 61;
                break;
            // coordonnées : x = 60 et y = -61

            case 3:
                lieu[0] = 10;
                lieu[1] = 11;
                break;
            // coordonnées : x = 10 et y = -8


            case 4:
                lieu[0] = 32;
                lieu[1] = 11;
                break;
            // coordonnées : x = 32 et y = -11


            case 5:
                lieu[0] = 32;
                lieu[1] = 11;
                break;
            // coordonnées : x = 32 et y = -11

            // coordonnées : x = 32 et y = -20

        }
        return lieu;
    }
    public int[] choixLieuPreparateur(int i) {
        switch(i){

            case 0:
                lieu[0] = 83;
                lieu[1] = 70;
                break;
            // coordonnées : x = 83 et y = -70


            case 1:
                lieu[0] = 68;
                lieu[1] = 60;
                break;
            // coordonnées : x = 68 et y = 60


            case 2:
                lieu[0] = 73;
                lieu[1] = 77;
                break;
            // coordonnées : x = 20 et y = 51
            // OU x = 17 y = 60, 52
            // OU x = 14 y = 68, 73, 75
            // OU x = 22, 28, 33, 38, 46, 50, 53, 63, 68, 72, 79, 82 y = 78


            case 3:
                lieu[0] = 68;
                lieu[1] = 23;
                break;
            // coordonnées : x = [60 ; 74]  et y = [-21 ; -38]


            case 4:
                lieu[0] = 15;
                lieu[1] = 33;
                break;
            // coordonnées : x = [10 ; 15]  et y = [-26 ; -36] ou [-51 ; -61]


            case 5:
                lieu[0] = 32;
                lieu[1] = 20;
                break;
            // coordonnées : x = 32 et y = -20


        }
        return lieu;
    }
    public int[] choixLieuPsy(int i) {

        switch(i){

            case 0:
                lieu[0] = 24;
                lieu[1] = 39;
                break;
            // coordonnées : x = 24 et y = -39


            case 1:
                lieu[0] = 34;
                lieu[1] = 20;
                break;
            // coordonnées : x = 34 et y = -20


            case 2:
                lieu[0] = 73;
                lieu[1] = 77;
                break;
            // coordonnées : x = 20 et y = 51
            // OU x = 17 y = 60, 52
            // OU x = 14 y = 68, 73, 75
            // OU x = 22, 28, 33, 38, 46, 50, 53, 63, 68, 72, 79, 82 y = 78



            case 3:
                lieu[0] = 62;
                lieu[1] = 35;
                break;
            // coordonnées : x = [60 ; 74]  et y = [-21 ; -38]



            case 4:
                lieu[0] = 14;
                lieu[1] = 55;
                break;
            // coordonnées : x = [10 ; 15]  et y = [-26 ; -36] ou [-51 ; -61]
            case 5:
                lieu[0] = 32;
                lieu[1] = 20;
                break;


        }

        return lieu;
    }
    public int[] choixLieuSageFemme(int i) {
        switch(i){

            case 0:
                lieu[0] = 11;
                lieu[1] = 57;
                break;
            // coordonnées : x = 20 et y = -10
            // OU x = 14 y = 24, 19, 13
            // OU x = 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85  y = 10
            // OU x = 89 y = 15, 21, 26, 32, 37, 42, 48, 53, 56, 61, 67, 72


            // coordonnées : x = et y =


            case 2:
                lieu[0] = 62;
                lieu[1] = 52;
                break;
            // coordonnées : x = 62 et y = -52

            case 3:
                lieu[0] = 44;
                lieu[1] = 56;
                break;
            // coordonnées : x = 44 et y = -56


            case 4:
                lieu[0] = 55;
                lieu[1] = 77;
                break;
            // coordonnées : x = 20 et y = 51
            // OU x = 17 y = 60, 52
            // OU x = 14 y = 68, 73, 75
            // OU x = 22, 28, 33, 38, 46, 50, 53, 63, 68, 72, 79, 82 y = 78


            case 5:
                lieu[0] = 60;
                lieu[1] = 38;
                break;
            // coordonnées : x = [60 ; 74]  et y = [-21 ; -38]


            case 1:
                lieu[0] = 12;
                lieu[1] = 23;
                break;
            // coordonnées : x = [10 ; 15]  et y = [-26 ; -36] ou [-51 ; -61]

            // coordonnées : x = 32 et y = -20


        }
        return lieu;
    }
    public int[] choixLieuSecretaireMedicale(int i) {
        switch(i){

            case 0:
                lieu[0] = 34;
                lieu[1] = 50;
                break;
            // coordonnées : x = 34 et y =-50


            case 1:
                lieu[0] = 34;
                lieu[1] = 56;
                break;
            // coordonnées : x = 34 et y = -56


            case 2:
                lieu[0] = 64;
                lieu[1] = 77;
                break;
            // coordonnées : x = 20 et y = 51
            // OU x = 17 y = 60, 52
            // OU x = 14 y = 68, 73, 75
            // OU x = 22, 28, 33, 38, 46, 50, 53, 63, 68, 72, 79, 82 y = 78


            case 3:
                lieu[0] = 60;
                lieu[1] = 23;
                break;
            // coordonnées : x = [60 ; 74]  et y = [-21 ; -38]



            case 4:
                lieu[0] = 13;
                lieu[1] = 59;
                break;
            // coordonnées : x = [10 ; 15]  et y = [-26 ; -36] ou [-51 ; -61]


            case 5:
                lieu[0] = 32;
                lieu[1] = 20;
                break;
            // coordonnées : x = 32 et y = -20



        }


        return lieu;
    }
    public int[] choixLieuTechnicien(int i) {
        switch(i){

            case 0:
                lieu[0] = 34;
                lieu[1] = 29;
                break;
            // coordonnées : x = 34 et y = -29


            case 1:
                lieu[0] = 56;
                lieu[1] = 20;
                break;
            // coordonnées : x = 56 et y = -19


            case 2:
                lieu[0] = 33;
                lieu[1] = 77;
                break;
            // coordonnées : x = 20 et y = 51
            // OU x = 17 y = 60, 52
            // OU x = 14 y = 68, 73, 75
            // OU x = 22, 28, 33, 38, 46, 50, 53, 63, 68, 72, 79, 82 y = 78

            case 3:
                lieu[0] = 71;
                lieu[1] = 38;
                break;
            // coordonnées : x = [60 ; 74]  et y = [-21 ; -38]


            case 4:
                lieu[0] = 15;
                lieu[1] = 25;
                break;
            // coordonnées : x = [10 ; 15]  et y = [-26 ; -36] ou [-51 ; -61]


            case 5:
                lieu[0] = 32;
                lieu[1] = 20;
                break;
            // coordonnées : x = 32 et y = -20


        }
        return lieu;
    }
    public int[] choixLieuVisiteur(int i) {
        switch(i){

            case 0:
                lieu[0] = 20;
                lieu[1] = 11;
                break;
            // coordonnées : x = 20 et y = -10
            // OU x = 14 y = 24, 19, 13
            // OU x = 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85  y = 10
            // OU x = 89 y = 15, 21, 26, 32, 37, 42, 48, 53, 56, 61, 67, 72


            case 1:
                lieu[0] = 29;
                lieu[1] = 11;
                break;
            // coordonnées : x = 29 et y = -10


            case 2:
                lieu[0] = 26;
                lieu[1] = 40;
                break;
            // coordonnées : x = [22 ; 28] et y = -41



            case 3:
                lieu[0] = 23;
                lieu[1] = 50;
                break;
            // coordonnées : x = [22 ; 28] et y = -50


            case 4:
                lieu[0] = 29;
                lieu[1] = 52;
                break;
            case 5:
                lieu[0] = 32;
                lieu[1] = 20;
                break;
            // coordonnées : x = 29 et y = -52


        }

        return lieu;
    }



}
