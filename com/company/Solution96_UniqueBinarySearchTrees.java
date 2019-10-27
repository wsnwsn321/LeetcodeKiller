package com.company;

public class Solution96_UniqueBinarySearchTrees {
    public static void main(String[] args) {

    }
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] =1;
        dp[1] =1;
        for (int i=2;i<=n;++i){
            for (int j=i;j<=n;++j){
                dp[j] += dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }
}
