package com.company;

public class Solution26_RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {

        int[] a = new int[]{1,1,1};
        removeDuplicates(a);
    }
    //time:     O(n)
    //space:    O(1)
    public static int removeDuplicates(int[] nums) {
       int l=0;
       for (int r=1;r<nums.length;++r){
           if (nums[l]==nums[r]) continue;
           int temp = nums[r];
           nums[r]=nums[++l];
           nums[l] = temp;
       }
       return l;
    }
}
