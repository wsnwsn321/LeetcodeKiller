package com.company;

public class Solution209_MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] a = new int[]{2,3,1,2,4,3};
        minSubArrayLen(7,a);
    }
    public static int minSubArrayLen(int s, int[] nums) {
        int l=0,r=0;
        int res=nums.length;
        int windowSum=0;
        while (r<nums.length){
            windowSum+=nums[r];
            while (windowSum>=s){
                res = Math.min(res,r-l+1);
                windowSum-=nums[l++];
            }
            r++;
        }
        return res;
    }
}
