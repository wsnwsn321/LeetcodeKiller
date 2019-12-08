package com.company;

public class Solution209_MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] a = new int[]{2,3,1,2,4,3};
        minSubArrayLen(7,a);
    }
    public static int minSubArrayLen(int s, int[] nums) {
        int sum =0, l=0,res=nums.length+1;
        for (int i=0;i<nums.length;++i){
            sum+=nums[i];
            while (sum>=s){
                res = Math.min(res,i-l+1);
                sum-=nums[l++];
            }
        }
        return res==nums.length+1?0:res;
    }
}
