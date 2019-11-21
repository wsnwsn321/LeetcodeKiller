package com.company;

public class Solution410_SplitArrayLargestSum {
    public static void main(String[] args) {

    }
    public int splitArray(int[] nums, int m) {
        int[][] dp = new int[nums.length+1][m+1];
        int[] cur_sum = new int[nums.length+1];
        for (int i = 0; i <= nums.length; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i=0;i<nums.length;++i){
            cur_sum[i+1]=cur_sum[i]+nums[i];
        }
        dp[0][0]=0;
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 1; j <= m; j++) {
                for (int k=0;k<i;++k){
                    dp[i][j] = Math.min(dp[i][j],Math.max(dp[k][j-1],cur_sum[i]-cur_sum[k]));
                }
            }
        }
        return dp[nums.length][m];
    }
}
