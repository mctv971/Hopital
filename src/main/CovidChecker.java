package main;

import entity.Entity;

public class CovidChecker {
    GamePanel gp;
    public CovidChecker(GamePanel gp){
        this.gp =gp;

    }
    public void checkCovid(Entity[] entity, Entity[] target) {
        int k = (int) (Math.random()*10/2);
        for (int i = 0; i< target.length; i++){
            for (int j = 0; j< target.length; j++){
                if (j==i){
                    continue;
                }

                if (target[i]!=null) {

                    if (entity[j].worldX / 10 == target[i].worldX / 10 && entity[j].worldY / 10 == target[i].worldY / 10) {
                        if (target[i].covid == 1 && k==1) {
                            entity[j].covid = 1;
                        }

                    }
                    if (entity[j].worldX / 10 == target[i].worldX / 10 && entity[j].worldY / 10 + 10 == target[i].worldY / 10) {
                        if (target[i].covid == 1 && k==1) {
                            entity[j].covid = 1;

                        }

                    }
                    if (entity[j].worldX / 10 == target[i].worldX / 10 && entity[j].worldY / 10 - 10 == target[i].worldY / 10) {
                        if (target[i].covid == 1 && k==1) {
                            entity[j].covid = 1;

                        }

                    }
                    if (entity[j].worldX / 10 == target[i].worldX / 10 + 10 && entity[j].worldY / 10 == target[i].worldY / 10) {
                        if (target[i].covid == 1 && k==1) {
                            entity[j].covid = 1;
                        }

                    }
                    if (entity[j].worldX / 10 == target[i].worldX / 10 - 10 && entity[j].worldY / 10 == target[i].worldY / 10) {
                        if (target[i].covid == 1 && k==1) {
                            entity[j].covid = 1;
                        }

                    }
                }



            }
        }


    }
}
