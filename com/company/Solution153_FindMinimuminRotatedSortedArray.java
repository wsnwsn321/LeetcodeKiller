package com.company;

public class Solution153_FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {

    }
    //[4,5,6,7,0,1,2]
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            //mid is the largest element
            if (nums[mid] > nums[mid + 1])
                return nums[mid + 1];
            //mid is the smallest element
            if (nums[mid] < nums[mid - 1])
                return nums[mid];
            //left part is rotated, min is in this part
            if (nums[mid] < nums[l]) {
                r = mid - 1;
            }
            //otherwise
            else {
                l = mid + 1;
            }
        }
        return -1;
    }

}
