package com.company;

public class Solution74_Searcha2DMatrix {
    public static void main(String[] args) {

    }
    //time:     O(log(mn))
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length;
        while (i<matrix.length&&j>=0){
            if (matrix[i][j]==target)
                return true;
            if (matrix[i][j]>target)
                j--;
            else i++;
        }
        return false;
    }

}
