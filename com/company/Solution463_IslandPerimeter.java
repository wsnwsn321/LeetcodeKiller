package com.company;

public class Solution463_IslandPerimeter {
    public static void main(String[] args) {

    }
    public int islandPerimeter(int[][] grid) {
        int res=0;
        for (int i=0;i<grid.length;++i){
            for (int j=0;j<grid[0].length;++j){
                if (grid[i][j]==1){
                    int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
                    for (int[] d:dir){
                        int x = i+d[0];
                        int y = j+d[1];
                        if (x<0||y<0||x>grid.length-1||y>grid[0].length-1||grid[x][y]==0)
                            res++;
                    }
                }
            }
        }
        return res;
    }
}
