package com.company;

public class Solution704 {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        int result = binarySearch(start,end,nums,target);
        return result;

    }
    public int binarySearch(int start, int end, int[] nums, int target){
        if (end>=start) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) return binarySearch(start, mid - 1, nums, target);
            else return binarySearch(mid + 1, end, nums, target);
        }
        return -1;
    }


}
