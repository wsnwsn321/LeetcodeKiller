package com.company;

public class Solution26 {
    public static void main(String[] args) {

        int[] a = new int[]{1,1,1};
        removeDuplicates(a);
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length<=1) return nums.length;
        int left=0,right =0;
        while(right<nums.length){
            if(right==nums.length) return left+1;
            while(right<nums.length&&nums[right]==nums[left]) {
                right++;
            }
            if(right==nums.length) return left+2;
            nums[++left] = nums[right];
            right++;
        }
        return left+1;
    }
}
