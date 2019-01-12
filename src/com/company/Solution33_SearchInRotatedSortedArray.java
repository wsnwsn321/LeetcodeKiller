package com.company;

public class Solution33_SearchInRotatedSortedArray {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        int result = RotatedBinarySearch(start,end,nums,target);
        return result;
    }

    public static int RotatedBinarySearch(int start, int end, int[] nums, int target){
        if(start<=end){
            int mid = start+(end-start)/2;
            if(target==nums[mid]) return mid;
            //start->mid is ordered
            if(nums[start]<=nums[mid]){
                //inside start->mid
                if(target<=nums[mid]&&target>=nums[start]){
                    return RotatedBinarySearch(start,mid-1,nums,target);
                }
                //in the other group
                else{
                    return RotatedBinarySearch(mid+1,end,nums,target);
                }
            }

            //mid->end is ordered
            if(nums[mid]<=nums[end]){
                //inside mid->end
                if(target<=nums[end]&&target>=nums[mid]){
                    return RotatedBinarySearch(mid+1,end,nums,target);
                }
                //in the other group
                else{
                    return RotatedBinarySearch(start,mid-1,nums,target);
                }
            }
        }
        return -1;
    }


}
