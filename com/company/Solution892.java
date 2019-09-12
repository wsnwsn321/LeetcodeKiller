package com.company;

public class Solution892 {
    public static void main(String[] args) {

    }
    public static int surfaceArea(int[][] grid) {
        int neighbour_dup = 0;
        int total_without_neighbour_dup=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0) total_without_neighbour_dup+=10+4*(grid[i][j]-2);
                if(j+1<grid[0].length){
                    neighbour_dup+=Math.min(grid[i][j],grid[i][j+1]);
                }
                if(i+1<grid.length){
                    neighbour_dup+=Math.min(grid[i+1][j],grid[i][j]);
                }
            }
        }
        return total_without_neighbour_dup-neighbour_dup*2;
    }
}
