package com.company;

public class Solution695_MaxAreaofIsland {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        a[0][0]=0;
        a[0][1]=1;
        a[1][0]=1;
        a[1][1]=1;


    }

    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int res =0;
        for (int i=0;i<grid.length;++i){
            for (int j=0;j<grid[0].length;++j){
                if (grid[i][j]==1){
                    res = Math.max(res,checkSurrounding(grid,i,j,visited,0));
                }
            }
        }
        return res;
    }


    public int checkSurrounding(int[][]grid,int i,int j,boolean[][] visited, int area){
        if (i<0||j<0||i>grid.length-1||j>grid[0].length-1||visited[i][j]||grid[i][j]==0)
            return 0;
        visited[i][j] = true;
        return  1+checkSurrounding(grid,i+1,j,visited,area+1)+
                checkSurrounding(grid,i-1,j,visited,area+1)+
                checkSurrounding(grid,i,j+1,visited,area+1)+
                checkSurrounding(grid,i,j-1,visited,area+1);

    }
}
