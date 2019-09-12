package com.company;

public class Solution48_RotateImage {
    public static void main(String[] args) {

    }
    public void rotate(int[][] matrix) {
        int n =matrix.length;
        //swap upside down
        for (int t=0;t<n/2;++t){
            for (int i=0;i<n;++i){
                int temp =matrix[t][i];
                matrix[t][i]=matrix[n-1-t][i];
                matrix[n-1-t][i]=temp;
            }
        }
        //swap symmetry
        for (int i=0;i<n;++i){
            for (int j=i;j<n;++j){
                int temp =matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

    }
}
