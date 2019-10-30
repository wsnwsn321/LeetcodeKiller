package com.company;

public class Solution153_FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {

    }
    //[4,5,6,7,0,1,2]
    public int findMin(int[] nums) {
        int l=0, r= nums.length-1;
        while (l<r){
            int mid = (l+r)/2;
            if (nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            else if (nums[mid]<nums[r]){
                r=mid-1;
            }
            else l=mid+1;
        }
        return -1;
    }

}
