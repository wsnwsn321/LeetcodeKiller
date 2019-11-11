package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution718_MaximumLengthofRepeatedSubarray {
    public static void main(String[] args) {

    }
    //time:     O(M*N)
    //space:    O(M*N)
    public int findLength(int[] A, int[] B) {
        int res =0;
        int[][] dp = new int[A.length][B.length];
        for (int i=A.length-1;i>=0;--i){
            for (int j=B.length-1;j>=0;--j){
                if (A[i]==B[j]){
                    dp[i][j] = dp[i+1][j+1]+1;
                    res = Math.max(res, dp[i][j]);
                }
            }
        }
        return res;
    }
}
