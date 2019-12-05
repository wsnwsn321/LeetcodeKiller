package com.company;

public class Solution256_PaintHouse {
    public static void main(String[] args) {

    }
    public int minCost(int[][] costs) {
        int[][] dp = new int[costs.length][3];
        for(int c = 0; c < 3; c++) dp[0][c] = costs[0][c];
        for (int i=1;i<costs.length;++i){
            dp[i][0] = Math.min(dp[i-1][1],dp[i-1][2])+costs[i][0];
            dp[i][1] = Math.min(dp[i-1][0],dp[i-1][2])+costs[i][1];
            dp[i][2] = Math.min(dp[i-1][0],dp[i-1][1])+costs[i][2];
        }
        return Math.min(dp[dp.length-1][0],Math.min(dp[dp.length-1][1],dp[dp.length-1][2]));
    }
}
