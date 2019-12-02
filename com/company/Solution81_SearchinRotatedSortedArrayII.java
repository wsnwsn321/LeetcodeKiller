package com.company;

public class Solution81_SearchinRotatedSortedArrayII {
    public static void main(String[] args) {

    }
    public boolean search(int[] nums, int target) {
        int l=0,r = nums.length-1;
        while (l<=r){
            int mid = (l+r)/2;
            if (nums[mid]==target)
                return true;
            //left part sorted
            if (nums[mid]>=nums[l]) {
                if (target >= nums[l] && target < nums[mid]){
                    r = mid - 1;
                }
                else{
                    l = mid + 1;
                }

            }
            //right part sorted
            else if (nums[mid]<nums[l]){
                if (target > nums[mid] && target <= nums[r]) {
                    l = mid + 1;
                }
                else{
                    r = mid - 1;
                }
            }
            else {
                l++;
            }

        }
        return false;
    }
}
