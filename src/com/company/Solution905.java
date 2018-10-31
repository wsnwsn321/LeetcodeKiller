package com.company;

public class Solution905 {
    public int[] sortArrayByParity(int[] A) {
        int start = 0, end = A.length - 1;
        while (start < end){
            while (start < end && A[start] % 2 != 0){
                int tmp = A[start];
                A[start] = A[end];
                A[end--] = tmp;
            }
            start++;
        }
        return A;
    }
}
