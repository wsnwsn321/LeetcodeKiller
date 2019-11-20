package com.company;

public class Solution26_RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {

        int[] a = new int[]{1,1,1};
        removeDuplicates(a);
    }
    //time:     O(n)
    //space:    O(1)
    public static int removeDuplicates(int[] nums) {
        int l=0,r = nums.length-1;
        for (int i=1; i<nums.length;++i){
            if (nums[i]==nums[l]) continue;
            nums[++l] = nums[i];
        }
        return l;
    }
}
