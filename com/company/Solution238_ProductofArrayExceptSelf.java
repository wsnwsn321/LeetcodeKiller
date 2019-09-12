package com.company;

public class Solution238_ProductofArrayExceptSelf {
    public static void main(String[] args) {

    }
    public int[] productExceptSelf(int[] nums) {
        int[] ret = new int[nums.length];
        if(nums.length ==0) return ret;
        int prefix = 1;
        for(int i=0;i<nums.length;++i){
            ret[i]=prefix;
            prefix*=nums[i];
        }
        int suffix = 1;
        for(int i=nums.length-1;i>=0;--i){
            ret[i] *= suffix;
            suffix *= nums[i];
        }
        return ret;
    }
}
