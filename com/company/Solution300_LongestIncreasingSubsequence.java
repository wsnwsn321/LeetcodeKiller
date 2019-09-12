package com.company;

public class Solution300_LongestIncreasingSubsequence {
    public static void main(String[] args) {

    }
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int max = 1;
        if(nums.length==0) return 0;
        dp[0]=1;
        for (int i=1;i<dp.length;++i){
            int j=i-1;
            dp[i] =1;
            while (j>=0){
                if (nums[j]<nums[i]) {
                    dp[i] = Math.max(dp[j]+1,dp[i]);
                }
                j--;
            }

            max = Math.max(max,dp[i]);
        }
        return max;
    }

}
