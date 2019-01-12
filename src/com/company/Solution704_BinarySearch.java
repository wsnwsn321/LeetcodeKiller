package com.company;

public class Solution704_BinarySearch {
    public static void main(String[] args) {
        int[] a =new int[]{-1,0,3,5,9,12};
        search(a,9);
    }
    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        int result = binarySearch(start,end,nums,target);
        return result;

    }
    public static int binarySearch(int start, int end, int[] nums, int target){
        if(start<=end){
            int mid = start+ (end-start)/2;
            if(target==nums[mid]) return mid;
            else{
                if(target>nums[mid]) return binarySearch(mid+1,end,nums,target);
                else return binarySearch(start,mid-1,nums,target);
            }
        }
        return -1;
    }


}
