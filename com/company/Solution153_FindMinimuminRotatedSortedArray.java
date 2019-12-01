package com.company;

public class Solution153_FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {

    }
    //[4,5,6,7,0,1,2]
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        if (nums[l] < nums[r]) return nums[l];
        if (nums.length == 1) {
            return nums[0];
        }
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > nums[mid + 1])
                return nums[mid + 1];
            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            } else if (nums[l] < nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

}
