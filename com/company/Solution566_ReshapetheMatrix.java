package com.company;

public class Solution566_ReshapetheMatrix {
    public static void main(String[] args) {

    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length;
        int n = nums[0].length ;
        if (m*n!=r*c) return nums;
        int[][] res = new int[r][c];
        int row=0,col=0;
        for (int i=0;i<m;++i){
            for (int j=0;j<n;++j){
                res[row][col] = nums[i][j];
                col++;
                if (col==c){
                    row++;
                    col=0;
                }
            }
        }
        return res;
     }
}
