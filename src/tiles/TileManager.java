package tiles;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TileManager {
    GamePanel gp;
    public Tile[] tile;
    public static int[][] mapTileNum;

    public TileManager(GamePanel gp){

        this.gp = gp;
        tile = new Tile[50];
        mapTileNum = new int[gp.maxWorldCol][gp.maxWorldRow];
        getTileImage();
        loadMap("maps/map1.txt");
    }

    private void getTileImage() {
        try{
            tile[0] =new Tile();
            tile[0].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/herbe_pixels.png"));

            tile[1] =new Tile();
            tile[1].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/route.png"));

            tile[2] =new Tile();
            tile[2].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/carre_gris.png"));

            tile[3] =new Tile();
            tile[3].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/tiroirs_haut.png"));

            tile[4] =new Tile();
            tile[4].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/bordure.png"));

            tile[5] =new Tile();
            tile[5].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/carre_sol.png"));

            tile[6] =new Tile();
            tile[6].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/tiroirs_droit.png"));

            tile[7] =new Tile();
            tile[7].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/tiroirs_gauche.png"));

            tile[8] =new Tile();
            tile[8].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/tiroirs_bas.png"));

            tile[9] =new Tile();
            tile[9].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/jaune.png"));

            tile[10] =new Tile();
            tile[10].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/lit_bas.png"));

            tile[11] =new Tile();
            tile[11].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/lit_haut_2.png"));

            tile[12] =new Tile();
            tile[12].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/lit_haut.png"));

            tile[13] =new Tile();
            tile[13].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/lit_haut_1.png"));

            tile[14] =new Tile();
            tile[14].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/lit_haut_(2).png"));

            tile[15] =new Tile();
            tile[15].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/armoire_2.png"));

            tile[16] =new Tile();
            tile[16].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/armoire_3.png"));

            tile[17] =new Tile();
            tile[17].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/armoire_4.png"));

            tile[18] =new Tile();
            tile[18].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/armoire.png"));

            tile[20] =new Tile();
            tile[20].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/chaise_pixels_droit.png"));

            tile[19] =new Tile();
            tile[19].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/chaise_pixels_gauche.png"));

            tile[21] =new Tile();
            tile[21].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/chaise_pixels_gauche.png"));

            tile[22] =new Tile();
            tile[22].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/image_table.png"));

            tile[23] =new Tile();
            tile[23].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/table_bas_gauche.png"));

            tile[24] =new Tile();
            tile[24].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/table_bas_droit.png"));

            tile[25] =new Tile();
            tile[25].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/porte_bas.png"));

            tile[26] =new Tile();
            tile[26].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/porte_droit_(2).png"));

            tile[27] =new Tile();
            tile[27].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/porte_droit.png"));

            tile[28] =new Tile();
            tile[28].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/porte_gauche_(2).png"));

            tile[29] =new Tile();
            tile[29].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/porte_gauche.png"));

            tile[30] =new Tile();
            tile[30].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/porte_haut_(2).png"));

            tile[31] =new Tile();
            tile[31].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/porte_haut.png"));

            tile[32] =new Tile();
            tile[32].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/porte.png"));

            tile[34] =new Tile();
            tile[34].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/porte_bas_Médecin.png"));

            tile[35] =new Tile();
            tile[35].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/porte_droit_Médecin.png"));

            tile[36] =new Tile();
            tile[36].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/porte_gauche_Médecin.png"));

            tile[37] =new Tile();
            tile[37].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/porte_haut_Médecin.png"));

            tile[38] =new Tile();
            tile[38].image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("map/boy_blanc_left_1.png"));

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void loadMap(String filePath){
        try{
            InputStream is = getClass().getClassLoader().getResourceAsStream(filePath);


            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            int col = 0;
            int row =0;
            while (col < gp.maxWorldCol && row < gp.maxWorldRow){
                String line = br.readLine();

                while (col < gp.maxWorldCol) {
                    String numbers[] = line.split(" ");
                    int num = Integer.parseInt(numbers[col]);
                    mapTileNum[col][row] = num;
                    col++;

                }
                if (col == gp.maxWorldCol) {
                    col = 0;
                    row++;
                }
            }
            br.close();
    }catch (Exception e){
        }

    }
    public void draw (Graphics2D g2){


        int worldCol = 0;
        int worldRow =0;
        while(worldCol<gp.maxWorldCol && worldRow<gp.maxWorldRow) {
            int tileNum = mapTileNum[worldCol][worldRow];

            int worldX = worldCol * gp.tileSize;
            int worldY = worldRow * gp.tileSize;
            //int screenX = worldX - gp.player.worldX + gp.player.screenX;
            //int screenY = worldY - gp.player.worldY + gp.player.screenY;

            g2.drawImage(tile[tileNum].image, worldX, worldY, gp.tileSize, gp.tileSize, null);
            worldCol++;

            if (worldCol == gp.maxWorldCol) {
                worldCol = 0;
                worldRow++;

            }


        }
    }

}
