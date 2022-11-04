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
    public int[] choixLieuPatient(int i) {


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

            case 6:
                lieu[0] = 32;
                lieu[1] = 11;
                break;
            // coordonnées : x = 20 et y = -10
            // OU x = 14 y = 24, 19, 13
            // OU x = 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85  y = 10
            // OU x = 89 y = 15, 21, 26, 32, 37, 42, 48, 53, 56, 61, 67, 72


            case 7:
                lieu[0] = 29;
                lieu[1] = 11;
                break;
            // coordonnées : x = 29 et y = -10


            case 8:
                lieu[0] = 60;
                lieu[1] = 61;
                break;
            // coordonnées : x = 60 et y = -61

            case 9:
                lieu[0] = 10;
                lieu[1] = 11;
                break;
            // coordonnées : x = 10 et y = -8


            case 10:
                lieu[0] = 32;
                lieu[1] = 11;
                break;
            // coordonnées : x = 32 et y = -11

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
            case 6:
                lieu[0] = 29;
                lieu[1] = 11;
                break;
            // coordonnées : x = 29 et y = -10


            case 7:
                lieu[0] = 26;
                lieu[1] = 40;
                break;
            // coordonnées : x = [22 ; 28] et y = -41



            case 8:
                lieu[0] = 23;
                lieu[1] = 50;
                break;
            // coordonnées : x = [22 ; 28] et y = -50


            case 9:
                lieu[0] = 29;
                lieu[1] = 52;
                break;
            case 10:
                lieu[0] = 32;
                lieu[1] = 20;
                break;
            // coordonnées : x = 29 et y = -52


        }

        return lieu;
    }



}
