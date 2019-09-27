package com.company;

public class Solution70_climbStairs_DP {
    public static void main(String[] args) {

    }
    //time:     O(n)
    //space:    O(n)
    public static int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0] =1;
        dp[1] = 1;
        for (int i=2;i<n;++i){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
