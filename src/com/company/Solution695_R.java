package com.company;

public class Solution695_R {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        a[0][0]=0;
        a[0][1]=1;
        a[1][0]=1;
        a[1][1]=1;
        maxAreaOfIsland(a);


    }

    public static int maxAreaOfIsland(int[][] grid) {
        int area=0, currentmax=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    area =checkSurrounding(grid,i,j);
                    if(area>currentmax) currentmax=area;
                }

            }
        }
        return currentmax;

    }


    public static int checkSurrounding(int[][]grid,int i,int j){
       int area=1;
        grid[i][j]=-1;
        if(i-1>-1&&grid[i-1][j]==1){
            grid[i-1][j]=-1;
            area+=checkSurrounding(grid,i-1,j);
        }
        if(i+1<grid.length&&grid[i+1][j]==1){
            grid[i+1][j]=-1;

            area+=checkSurrounding(grid,i+1,j);
        }
        if(j+1<grid[0].length&&grid[i][j+1]==1){
            grid[i][j+1]=-1;

            area+= checkSurrounding(grid,i,j+1);
        }
        if(j-1>-1&&grid[i][j-1]==1) {
            grid[i][j - 1] = -1;
            area+=  checkSurrounding(grid, i, j - 1);
        }

        return area;
    }
}
