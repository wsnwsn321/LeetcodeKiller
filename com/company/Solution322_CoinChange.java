package com.company;

public class Solution322_CoinChange {
    public static void main(String[] args) {
        int[] c = new int[]{1,2,5};
        int amount=11;
        coinChange(c,amount);
    }
    public static int coinChange(int[] coins, int amount) {
        if (coins.length==0) return -1;
        int[] dp = new int[amount+1];
        dp[0]=0;
        for (int i=1;i<dp.length;++i){
            dp[i] =Integer.MAX_VALUE;
            for (int j=0;j<coins.length;++j){
                if (i>=coins[j])
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
            }
        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
}
