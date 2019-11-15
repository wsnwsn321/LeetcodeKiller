package com.company;

public class Solution905_SortArrayByParity {
    public static void main(String[] args) {

    }
    public int[] sortArrayByParity(int[] A) {
        int evenPointer = 0;
        for (int i=0;i<A.length;++i){
            if (A[i]%2==0){
                int temp = A[evenPointer];
                A[evenPointer++] = A[i];
                A[i] = temp;
            }
        }
        return A;
    }
}
