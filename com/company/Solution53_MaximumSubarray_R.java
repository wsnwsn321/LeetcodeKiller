package com.company;

public class Solution53_MaximumSubarray_R {
    public static void main(String[] args) {
        int[] a = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(a);

    }
    //time:     O(n);
    //space:    O(n);
    //follow up: return the array
    public static int[] maxSubArray(int[] nums) {
        int endIndex=0;
        if(nums.length==0) return new int[]{};
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max =dp[0];
        for (int i=1;i<nums.length;++i){
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            if (max<dp[i]){
                endIndex = i;
                max = dp[i];
            }

       }
       int count =0,startIndex=0;
       for (int i=endIndex;i>=0;--i){
           count+=nums[i];
           if (count==max){
               startIndex = i;
               break;
           }

       }
        return new int[]{startIndex,endIndex};
    }


}
