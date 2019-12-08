package com.company;

public class Solution322_CoinChange {
    public static void main(String[] args) {
        int[] c = new int[]{1,2,5};
        int amount=11;
        coinChange(c,amount);
    }
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        dp[0] = 0;
        for (int i=1;i<dp.length;++i){
            dp[i] = amount+1;
            for (int c:coins){
                if (i>=c){
                    dp[i] = Math.min(dp[i],dp[i-c]+1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}
