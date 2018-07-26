package com.company;

public class Solution807 {
    public static void main(String[] args) {

    }
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int totalIncrease =0;
        int[][] column = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                column[i][j] = grid[j][i];
            }
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){

                totalIncrease+= minFromTwoArrays(grid[i],column[j]) - grid[i][j];
            }
        }
        return totalIncrease;
    }


    public static int returnMax(int[] nums){
        int max = nums[0];
        for(int n:nums){
            if(n>max) max =n;
        }
        return max;
    }
    public static int minFromTwoArrays(int[] a, int[] b){
        int max1 = returnMax(a);
        int max2 = returnMax(b);
        return Math.min(max1,max2);
    }

}
