package com.company;

public class Solution35_SearchInsertPosition {
    public static void main(String[] args) {
    }
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums,0,nums.length-1,target);
    }
    public int binarySearch(int[] nums, int start, int end, int target) {
        int mid = start + (end - start) / 2;
        if(start<end) {
            //int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) return binarySearch(nums, mid + 1, end, target);
            else {
                return binarySearch(nums, start, mid - 1, target);
            }
        }
        if(target>nums[mid]) return mid+1;
        else return mid;
    }
}
