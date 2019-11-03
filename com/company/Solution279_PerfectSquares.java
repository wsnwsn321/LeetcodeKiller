package com.company;

public class Solution279_PerfectSquares {
    public static void main(String[] args) {
        int n =12;
        numSquares(n);
    }
    public static int numSquares(int n) {
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1] =1;
        for (int i=1;i<dp.length;++i){
            dp[i] = dp[i-1]+1;
            for (int j=1;j*j<=i;++j){
                dp[i] = Math.min(dp[i-j*j]+1,dp[i]);
            }
        }
        return dp[n];
    }

}
