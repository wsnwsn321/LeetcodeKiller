package com.company;

public class Solution361_BombEntry {
    public static void main(String[] args) {
        char[] a = new char[]{'0','E','0','0'};
        char[] b = new char[]{'E','0','0','E'};
        char[] c = new char[]{'0','E','0','0'};
        maxKilledEnemies(new char[][]{a,b,c});
    }

    public static int maxKilledEnemies(char[][] grid) {
        int max =0;
        for(int i=0;i<grid.length;++i){
            for (int j=0;j<grid[0].length;++j){
                if(grid[i][j]=='0'){
                    int r = getSurroundingEnemies(grid,i,j);
                    max = Math.max(r,max);
                }
            }
        }
        return max;
    }
    public static int getSurroundingEnemies(char[][] grid,int i, int j) {
        int res = 0;
        int temp_i=i,temp_j=j;
        System.out.println(i+" "+j);
        while (i - 1 >= 0 && grid[i-1][j] != 'W') {
            if( grid[i-1][j] == 'E') {
                res += 1;
                System.out.println(1);
            }
            i--;
        }
        i=temp_i;j=temp_j;
        while (i + 1 < grid.length && grid[i+1][j] != 'W') {
            if( grid[i+1][j] == 'E') {
                res += 1;
                System.out.println(2);
            }
            i++;
        }
        i=temp_i;j=temp_j;
        while (j - 1 >= 0 && grid[i][j - 1] != 'W') {
            if( grid[i][j - 1] == 'E'){
                res += 1;
                System.out.println(3);
            }
            j--;
        }
        i=temp_i;j=temp_j;
        while (j + 1 < grid[0].length && grid[i][j + 1] != 'W') {
            if( grid[i][j + 1] == 'E') {
                res += 1;
                System.out.println(4);
            }
            j++;
        }
        return res;
    }
}
