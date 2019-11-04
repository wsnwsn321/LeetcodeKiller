package com.company;

public class Solution300_LongestIncreasingSubsequence {
    public static void main(String[] args) {

    }
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int res=0;
        dp[0] =1;
        for (int i=1;i<nums.length;++i){
            for (int j=0;j<i;++i){
                if (dp[j]<dp[i]){
                    dp[i] = Math.max(dp[j]+1,dp[i]);
                    res = Math.max(res,dp[i]);
                }
            }
        }
        return res;
    }

}
