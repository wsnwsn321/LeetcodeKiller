package com.company;

public class Solution566_R {
    public static void main(String[] args) {

    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int column = nums[0].length;
        int[][] result = new int[r][c];
        if(r*c!=row*column) return nums;
        int r_count=0, c_count=0;
            for(int i=0;i<result.length;i++){
                for(int j=0;j<result[0].length;j++){
                    result[i][j] = nums[r_count][c_count];
                    c_count++;
                    if(c_count>=column){
                        r_count++;
                        c_count=0;
                    }
                }
            }
        return result;
    }
}
