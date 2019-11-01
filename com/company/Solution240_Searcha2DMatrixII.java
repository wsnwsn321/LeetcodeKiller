package com.company;

public class Solution240_Searcha2DMatrixII {
    public static void main(String[] args) {

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0, col = matrix[0].length-1;
        while (row<matrix.length&&col>=0){
            if (target==matrix[row][col])
                return true;
            else if (target<matrix[row][col])
                col--;
            else
                row++;
        }
        return false;
    }
}
