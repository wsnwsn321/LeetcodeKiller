package com.company;

public class Solution713_SubarrayProductLessThanK {
    public static void main(String[] args) {

    }
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        if (nums.length==0) return 0;
        int product=1;
        int start=0;
        for (int end=0;end<nums.length;++end){
            product*=nums[end];
            while (product>=k){
                product/=nums[start];
                start++;
            }
            count+=end-start+1;
        }
        return count;
    }
}
