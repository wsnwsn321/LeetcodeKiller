package com.company;

public class Solution486_PredicttheWinner {
    public static void main(String[] args) {

    }
    public boolean PredictTheWinner(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        for (int s=nums.length-1;s>=0;s--){
            dp[s][s] = nums[s];
            for (int e = s+1;e<nums.length;++e){
                int a = nums[s]-dp[s+1][e];
                int b = nums[e] - dp[s][e-1];
                dp[s][e] = Math.max(a,b);
            }
        }
        return dp[0][nums.length-1]>=0;
    }
}
