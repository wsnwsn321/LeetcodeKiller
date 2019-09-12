package com.company;

public class Solution733_FloodFill {
    public static void main(String[] args) {

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int startColor = image[sr][sc];
        if(newColor==startColor) return image;
        flood(image,sr,sc,newColor,startColor);
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
