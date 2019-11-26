package com.company;

public class Solution152_MaximumProductSubarray {
    public static void main(String[] args) {
        int[] x = new int[]{2,-3,4,5,-1};
        maxProduct(x);
    }
    public static int maxProduct(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int max = A[0], min = A[0], res = A[0];
        for (int i = 1; i < A.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max*A[i],min*A[i]),A[i]);
            min = Math.min(Math.min(temp*A[i],min*A[i]),A[i]);
            res = Math.max(res,max);
        }
        return res;
    }
}
