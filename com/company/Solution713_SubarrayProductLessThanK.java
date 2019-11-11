package com.company;

public class Solution713_SubarrayProductLessThanK {
    public static void main(String[] args) {

    }
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0;
        int res =0;
        int curPro =1;
        for (int r=0;r<nums.length;++r){
            curPro*=nums[r];
            while (curPro>=k){
                curPro/=nums[l++];
            }
            res+=r-l+1;
        }
        return res;
    }
}
