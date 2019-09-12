package com.company;

public class Solution867 {

    public static void main(String[] args) {
        int[][] A = new int[3][3];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = count;

            }
        }
        transpose(A);
        System.out.println();
    }

        public static int[][] transpose ( int[][] A) {
        int[][] result = new int[A[0].length][A.length];
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[0].length; j++) {
                    result[j][i]=A[i][j];
                }
            }
            return result;
        }
}
