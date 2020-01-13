package com.company;

public class Solution33_SearchInRotatedSortedArray {
    public static void main(String[] args) {

    }
    //time:     O(log(N))
    //Space:    O(1)
    public int search(int[] nums, int target) {
        int l=0,r = nums.length-1;
        while (l<=r){
            int mid = l+(r-l)/2;
            if (target==nums[mid]) return mid;
            //left part is sorted
            if (nums[l]<nums[mid]){
                if (target>=nums[l]&&target<nums[mid])
                    r = mid-1;
                else
                    l=mid+1;
            }
            //right part is sorted
            else {
                if (target>nums[mid]&&target<=nums[r])
                    l = mid+1;
                else
                    r=mid-1;
            }
        }
        return -1;
    }


}
