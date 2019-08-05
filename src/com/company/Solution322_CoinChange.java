package com.company;

public class Solution322_CoinChange {
    public static void main(String[] args) {
        int[] c = new int[]{1,2,5};
        int amount=11;
        coinChange(c,amount);
    }
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        if (coins.length==0) return -1;
        dp[0] = 0;
        for (int i=1;i<amount+1;++i){
            int count = Integer.MAX_VALUE;
            for (int j=0;j<coins.length;++j){
                if (i-coins[j]>=0&&dp[i-coins[j]]!=-1){
                    count = Math.min(dp[i-coins[j]]+1,count);
                }
            }
            dp[i] = count==Integer.MAX_VALUE?-1:count;

        }
        return dp[amount];
    }
}
