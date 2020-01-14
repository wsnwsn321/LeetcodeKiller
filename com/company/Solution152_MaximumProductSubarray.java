package com.company;

public class Solution152_MaximumProductSubarray {
    public static void main(String[] args) {
        int[] x = new int[]{2,-3,4,5,-1};
        maxProduct(x);
    }
    public static int maxProduct(int[] A) {
        int res = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0;i<A.length;++i) {
            int temp = max;
            max = Math.max(Math.max(max * A[i], min * A[i]), A[i]);
            min = Math.min(Math.min(min * A[i], temp * A[i]), A[i]);
            res = Math.max(res, max);
        }
        return res;
    }
}
