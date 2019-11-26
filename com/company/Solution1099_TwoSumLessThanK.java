package com.company;

import java.util.Arrays;
import java.util.Map;

public class Solution1099_TwoSumLessThanK {
    public static void main(String[] args) {

    }
    public int twoSumLessThanK(int[] A, int K) {
        Arrays.sort(A);
        int res=Integer.MIN_VALUE;
        int l=0,r = A.length-1;
        while (l<r){
            int sum = A[l]+A[r];
            if (sum>=K){
                r--;
            }
            else {
                res = Math.max(res,A[l++]+A[r]);
            }
        }
        return res==Integer.MIN_VALUE?-1:res;
    }
}
