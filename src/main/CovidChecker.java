package main;

import entity.Entity;

public class CovidChecker {
    GamePanel gp;
    public CovidChecker(GamePanel gp){
        this.gp =gp;

    }
    public void checkCovid() {
        int k = (int) (Math.random()*10/2);
        for (int i = 0; i< Entity.toto.size(); i++){
            for (int j = 0; j< Entity.toto.size(); j++){
                if (j==i){
                    continue;
                }

                if (Entity.toto.get(i)!=null && Entity.toto.get(j)!=null) {

                    if (Entity.toto.get(j).getWorldX() / 10 == Entity.toto.get(i).getWorldX() / 10 && Entity.toto.get(j).getWorldY() / 10 == Entity.toto.get(i).getWorldY() / 10) {
                        if (Entity.toto.get(i).getCovid() == 1 && k==1) {
                            Entity.toto.get(j).setCovid(1);
                        }
                        else if ( (k==1 || k==2) && Entity.toto.get(i).getCovid() == 2) {
                            Entity.toto.get(j).setCovid(2);
                        }
                    }
                    if (Entity.toto.get(j).getWorldX() / 10 == Entity.toto.get(i).getWorldX() / 10 && Entity.toto.get(j).getWorldY() / 10 + 10 == Entity.toto.get(i).getWorldY() / 10) {
                        if (Entity.toto.get(i).getCovid() == 1 && k==1) {
                            Entity.toto.get(j).setCovid(1);

                        }
                        else if ( (k==1 || k==2) && Entity.toto.get(i).getCovid() == 2) {
                            Entity.toto.get(j).setCovid(2);
                        }
                    }
                    if (Entity.toto.get(j).getWorldX() / 10 == Entity.toto.get(i).getWorldX() / 10 && Entity.toto.get(j).getWorldY() / 10 - 10 == Entity.toto.get(i).getWorldY() / 10) {
                        if (Entity.toto.get(i).getCovid() == 1 && k==1) {
                            Entity.toto.get(j).setCovid(1);

                        }
                        else if ( (k==1 || k==2) && Entity.toto.get(i).getCovid() == 2) {
                            Entity.toto.get(j).setCovid(2);
                        }
                    }
                    if (Entity.toto.get(j).getWorldX() / 10 == Entity.toto.get(i).getWorldX() / 10 + 10 && Entity.toto.get(j).getWorldY() / 10 == Entity.toto.get(i).getWorldY() / 10) {
                        if (Entity.toto.get(i).getCovid() == 1 && k==1) {
                            Entity.toto.get(j).setCovid(1);
                        }
                        else if ( (k==1 || k==2) && Entity.toto.get(i).getCovid() == 2) {
                            Entity.toto.get(j).setCovid(2);
                        }

                    }
                    if (Entity.toto.get(j).getWorldX() / 10 == Entity.toto.get(i).getWorldX() / 10 - 10 && Entity.toto.get(j).getWorldY() / 10 == Entity.toto.get(i).getWorldY() / 10) {
                        if (Entity.toto.get(i).getCovid() == 1 && k==1) {
                            Entity.toto.get(j).setCovid(1);
                        }
                        else if ( (k==1 || k==2) && Entity.toto.get(i).getCovid() == 2) {
                            Entity.toto.get(j).setCovid(2);
                        }
                    }
                }
            }
        }
    }
}
