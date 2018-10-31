package com.company;

public class Solution200 {
    public static void main(String[] args) {

    }
    public static int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;++i){
            for(int j=0;j<grid[0].length;++j){
                if(grid[i][j]==1){
                    checkNeighbor(i,j,grid);
                    count++;
                }
            }
        }
        return count;

    }

    public static void checkNeighbor(int i,int j,char[][] grid){

        //top
        if(i-1>=0){
            if(grid[i-1][j]=='1'){
                grid[i-1][j]='2';
                checkNeighbor(i-1,j,grid);
            }
        }
        //left
        if(j-1>=0){
            if(grid[i][j-1]=='1'){
                grid[i][j-1]='2';
                checkNeighbor(i,j-1,grid);
            }
        }
        //right
        if(j+1<grid[0].length){
            if(grid[i][j+1]=='1'){
                grid[i][j+1]='2';
                checkNeighbor(i,j+1,grid);
            }
        }
        //bottom
        if(i+1<grid.length){
            if(grid[i+1][j]=='1'){
                grid[i+1][j]='2';
                checkNeighbor(i+1,j,grid);
            }
        }
    }
}
