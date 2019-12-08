package com.company;

import java.util.Arrays;

public class Solution410_SplitArrayLargestSum {
    public static void main(String[] args) {

    }
    //time:     O(mn^2)
    public int splitArray(int[] nums, int m) {
        //question: make the largest possible subarray sum minimum!
        //dp[i][j] is the minimum largest subarray for splitting first i elements into j parts
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
                    //1st step: find maximum in j subarrays:
                    //let k be the last element in the first j-1 parts, so there will be i-k elements in the last jth part
                    //for the jth subarray, the max sum among the previous j-1 parts is in dp[k][j-1]
                    // and the subarray sum for the kth part is cur_sum[i]-cur_sum[k]
                    //loop through k=0 to i, find the minimum subarray max
                    dp[i][j] = Math.min(dp[i][j],Math.max(dp[k][j-1],cur_sum[i]-cur_sum[k]));
                }
            }
        }
        return dp[nums.length][m];
    }
}
