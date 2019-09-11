package com.company;

public class Solution35_SearchInsertPosition {
    public static void main(String[] args) {
    }
    //time: O(logn)
    //space: O(1)
    public int searchInsert(int[] nums, int target) {
        int start =0, end = nums.length-1;
        while (start<end){
            int mid = (start+end)/2;
            if (nums[mid]==target) return mid;
            if (nums[mid]>target){
                end = mid-1;
            }
            else start=mid+1;
        }
        if (target>nums[start]) return start+1;
        else return start;
    }

}
