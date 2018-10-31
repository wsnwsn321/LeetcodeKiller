package com.company;

public class Solution922_R {
    public static void main(String[] args) {

    }
    public int[] sortArrayByParityII(int[] A) {
        int evenIndex = 0;
        int oddIndex = 1;

        int[] B = new int[A.length];

        for (int i : A) {
            if (i%2 == 0) {
                B[evenIndex] = i;
                evenIndex +=2;
            } else {
                B[oddIndex] = i;
                oddIndex +=2;
            }
        }
        return B;
    }
}
