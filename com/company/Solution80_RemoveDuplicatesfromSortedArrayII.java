package com.company;

public class Solution80_RemoveDuplicatesfromSortedArrayII {
    public static void main(String[] args) {
        int[] a = new int[]{1,1,1,2,2,3};
    }
    public int removeDuplicates(int[] nums) {

        int j = 1, count = 1;

        for (int i = 1; i < nums.length; i++) {

            //
            // If the current element is a duplicate, increment the count.
            //
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                // Reset the count since we encountered a different element
                // than the previous one.
                count = 1;
            }
            // For a count <= 2, we copy the element over thus
            // overwriting the element at index "j" in the array
            if (count <= 2) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
