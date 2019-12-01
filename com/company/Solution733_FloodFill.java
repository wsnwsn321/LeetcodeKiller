package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Solution733_FloodFill {
    public static void main(String[] args) {

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int startColor = image[sr][sc];
        if(newColor==startColor) return image;
        //flood(image,sr,sc,newColor,startColor);
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sr,sc});
        image[sr][sc] = newColor;
        int[][] dir = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
        while (q.size()>0){
            int[] cur = q.poll();
            for (int i=0;i<dir.length;++i){
                int x = cur[0]+dir[i][0];
                int y = cur[1]+dir[i][1];
                if (x<0||y<0||x>=image.length||y>=image[0].length||image[x][y]!=startColor) continue;
                image[x][y] = newColor;
                q.offer(new int[]{x,y});
            }
        }
        return image;
    }

    public void flood(int[][] image, int sr, int sc, int newColor, int startColor){
        image[sr][sc]=newColor;
        if(sr-1>=0&&image[sr-1][sc]==startColor){
            image[sr-1][sc]=newColor;
            flood(image,sr-1,sc,newColor,startColor);
        }
        if(sr+1<=image.length-1&&image[sr+1][sc]==startColor){
            image[sr+1][sc]=newColor;
            flood(image,sr+1,sc,newColor,startColor);
        }
        if(sc-1>=0&&image[sr][sc-1]==startColor){
            image[sr][sc-1]=newColor;
            flood(image,sr,sc-1,newColor,startColor);
        }
        if(sc+1<=image[0].length-1&&image[sr][sc+1]==startColor){
            image[sr][sc+1]=newColor;
            flood(image,sr,sc+1,newColor,startColor);
        }
    }

}
