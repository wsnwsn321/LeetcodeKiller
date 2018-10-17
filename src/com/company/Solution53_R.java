package com.company;

public class Solution53_R {
    public static void main(String[] args) {

    }
    public static int maxSubArray(int[] nums) {
        int max =nums[0];
        int dp[] = new int[nums.length];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;++i){//dp[i] is the max sub array with ending in i
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            max = Math.max(max,dp[i]);
        }
        return max;
    }


}
