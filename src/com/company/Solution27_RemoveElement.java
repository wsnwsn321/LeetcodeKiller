package com.company;

public class Solution27_RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        removeElement(nums,3);

    }
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                //put all none-val value into the front of the array
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
