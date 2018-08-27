package com.company;

public class Solution766 {
    public static void main(String[] args) {
        int[][] a = new int[2][4];
        a[0][0]=11;
        a[0][1]=74;
        a[0][2]=0;
        a[0][3]=93;
        a[1][0]=40;
        a[1][1]=11;
        a[1][2]=74;
        a[1][3]=7;
        isToeplitzMatrix(a);
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
//        int column=0,row=0;
//        for(int i=0;i<matrix.length;i++){
//            row = i;
//            for(int j=0;j<matrix[0].length;j++){
//                column =j;
//                while(row+1<matrix.length&&column+1<matrix[0].length){
//                        if(matrix[row][column]==matrix[row+1][column+1]){
//                            column++;
//                            row++;
//                        }
//                        else return false;
//
//                }
//                row=0;
//            }
//
//        }
//        return true;

        int n = matrix.length;
        if(n==0) return true;
        int m = matrix[0].length;
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]!=matrix[i-1][j-1]) return false;
            }
        }
        return true;
    }
}
