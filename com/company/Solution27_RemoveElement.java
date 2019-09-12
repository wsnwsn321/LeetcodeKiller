package com.company;

public class Solution27_RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        removeElement(nums,3);

    }
    //time:     O(n)
    //space:    O(1)
    public static int removeElement(int[] nums, int val) {
        int l=0;
        for (int r=0;r<nums.length;++r){
            if (nums[r]==val) {
                l=r;
            }
            else{
                int temp =nums[l];
                nums[l] = nums[r];
                nums[r]=temp;
                l++;
            }
        }
        return l+1;
    }
}
