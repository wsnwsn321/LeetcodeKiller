package com.company;

public class Solution48_RotateImage {
    public static void main(String[] args) {

    }
    //time:     O(n^2)
    //space:    O(1)
    public void rotate(int[][] matrix) {
       //transpose
        for (int i=0;i<matrix.length;++i){
            for (int j=i;j<matrix[0].length;++j){
                int temp =matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //reverse
        for (int i=0;i<matrix.length;++i){
            for (int j=0;j<matrix[0].length;++j){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length-1-j];
                matrix[i][matrix[0].length-1-j] = temp;
            }
        }
        //reverse + transpose = rotate anti-clockwise
    }
}
