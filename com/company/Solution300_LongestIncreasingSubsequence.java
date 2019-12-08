package com.company;

public class Solution300_LongestIncreasingSubsequence {
    public static void main(String[] args) {

    }
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0) return 0;
        int[] dp = new int[nums.length];
        int max = 1;
        dp[0] =1;
        for (int i=1;i<nums.length;++i){
            dp[i] =1;
            for (int j=0;j<i;++j){
                if (nums[j]<nums[i]){
                    dp[i] = Math.max(dp[j]+1,dp[i]);
                    max = Math.max(dp[i],max);
                }

            }
        }
        return max;
    }

}
