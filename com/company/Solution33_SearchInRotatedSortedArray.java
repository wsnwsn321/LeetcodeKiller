package com.company;

public class Solution33_SearchInRotatedSortedArray {
    public static void main(String[] args) {

    }
    //time:     O(log(N))
    //Space:    O(1)
    public int search(int[] nums, int target) {
        int l=0,r = nums.length-1;
        while (l<r){
            int mid = (l+r)/2;
            if (nums[mid]==target)
                return mid;
            if (nums[mid]>=nums[l]) {
                if (target >= nums[l] && target < nums[mid])
                    r = mid - 1;
                else
                    l = mid + 1;
            }
            else {
                if (target > nums[mid] && target <= nums[r])
                    l = mid + 1;
                else r = mid - 1;
            }

        }
        return -1;
    }


}
