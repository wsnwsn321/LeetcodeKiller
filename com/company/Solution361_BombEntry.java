package com.company;

public class Solution361_BombEntry {
    public static void main(String[] args) {
        char[] a = new char[]{'0','E','0','0'};
        char[] b = new char[]{'E','0','0','E'};
        char[] c = new char[]{'0','E','0','0'};
        maxKilledEnemies(new char[][]{a,b,c});
    }

    public static int maxKilledEnemies(char[][] grid) {
        if(grid == null || grid.length == 0 ||  grid[0].length == 0) return 0;
        int max = 0;
        int row = 0;
        int[] col = new int[grid[0].length];
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length;j++){
                if(grid[i][j] == 'W') continue;
                if(j == 0 || grid[i][j-1] == 'W'){
                    row = killedEnemiesRow(grid, i, j);
                }
                if(i == 0 || grid[i-1][j] == 'W'){
                    col[j] = killedEnemiesCol(grid,i,j);
                }
                if(grid[i][j] == '0'){
                    max = (row + col[j] > max) ? row + col[j] : max;
                }
            }

        }

        return max;
    }

    //calculate killed enemies for row i from column j
    private static int killedEnemiesRow(char[][] grid, int i, int j){
        int num = 0;
        while(j <= grid[0].length-1 && grid[i][j] != 'W'){
            if(grid[i][j] == 'E') num++;
            j++;
        }
        return num;
    }
    //calculate killed enemies for  column j from row i
    private static int killedEnemiesCol(char[][] grid, int i, int j){
        int num = 0;
        while(i <= grid.length -1 && grid[i][j] != 'W'){
            if(grid[i][j] == 'E') num++;
            i++;
        }
        return num;
    }


}
