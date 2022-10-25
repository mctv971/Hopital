package main;

import java.util.ArrayDeque;
import java.util.Queue;

import static tiles.TileManager.mapTileNum;

public class Deplacement {
    GamePanel gp;
    private static final int[] row = { -1, 0, 0, 1 };
    private static final int[] col = { 0, -1, 1, 0 };

    public Deplacement(GamePanel gp) {
        this.gp = gp;
    }
    class Node
    {    int x, y, dist;

        Node(int x, int y, int dist)
        {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
    private static boolean isValid(boolean[][] visited, int i, int j)
    {
        return (mapTileNum[i][j] != 9) && (mapTileNum[i][j] != 4) && (mapTileNum[i][j] != 0) && !visited[i][j];
    }

    public int[][][] Chemin(int startX, int startY,int finishX, int finishY){

        boolean[][] deja_visite = new boolean[100][100];
        Queue<Node> q = new ArrayDeque<>();
        deja_visite[startX][startY] = true;
        q.add(new Node(startX, startY, 0));
        int [][][] pred = new int[100][100][2];

        while (!q.isEmpty()) {

            Node node = q.poll();
            startX = node.x;
            startY = node.y;
            int dist = node.dist;
            if (startX == finishX && startY == finishY) {
                pred[startX][startY][0] = dist;
                pred[startX][startY][1] = 1;


                break;
            }
            for (int k = 0; k < 4; k++) {
                if (isValid(deja_visite, startX + row[k], startY + col[k])) {
                    deja_visite[startX + row[k]][startY + col[k]] = true;
                    pred[startX][startY][0] = dist;
                    pred[startX][startY][1] = 1;
                    q.add(new Node(startX + row[k], startY + col[k], dist + 1));

                }
            }


        }



        return pred;


    }

}

