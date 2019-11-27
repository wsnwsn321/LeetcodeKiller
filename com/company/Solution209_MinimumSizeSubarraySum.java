package com.company;

public class Solution209_MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] a = new int[]{2,3,1,2,4,3};
        minSubArrayLen(7,a);
    }
    public static int minSubArrayLen(int s, int[] nums) {
        int l=0,res= nums.length;
        int windowSum=0;
        for (int i=0;i<nums.length;++i){
            windowSum+=nums[i];
            while (windowSum>s){
                res = Math.min(res,i-l+1);
                windowSum-=nums[l++];
            }
        }
        return res;
    }
}
