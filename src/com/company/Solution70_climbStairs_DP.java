package com.company;

public class Solution70_climbStairs_DP {
    public static void main(String[] args) {

    }
    public static int climbStairs(int n) {
        int[] dp = new int[n+1];
        if(n==0||n==1) return n;
        dp[0] =0;
        dp[1] =1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            //one step from i-1 level and 2 steps from i-2 level
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];

    }
}
