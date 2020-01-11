package com.company;

import java.util.*;

public class Solution416_PartitionEqualSubsetSum {
    public static void main(String[] args) {

    }
    public boolean canPartition(int[] A) {
        int sum = 0;
        for (int x:A)
            sum+=x;
        if (sum%2!=0) return false;
        sum /=2;
        boolean[][] dp = new boolean[A.length+1][sum+1];
        for (int i = 0; i < A.length+1; i++) {
            dp[i][0] = true;
        }
        for (int j = 1; j < sum+1; j++) {
            dp[0][j] = false;
        }
        for (int i=0;i<dp.length;++i){
            for (int j=0;j<dp[0].length;++j){
                if (j>A[i-1])
                    dp[i][j] = dp[i-1][j]||dp[i-1][j-A[i-1]];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[A.length][sum];
    }


}
