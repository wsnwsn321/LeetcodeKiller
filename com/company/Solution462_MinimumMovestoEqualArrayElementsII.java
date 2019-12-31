package com.company;

import java.util.Arrays;

public class Solution462_MinimumMovestoEqualArrayElementsII {

    public static void main(String[] args) {

    }
    //use quick select to find median in O(n) time
    public int partition(int[] nums, int left, int right){
        int pivotValue = nums[right];
        int i =left;
        for (int j=left;j<=right;++j){
            if (nums[j]<pivotValue){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i++] = temp;
            }
        }
        int temp = nums[right];
        nums[right] = nums[i];
        nums[i] = temp;
        return i;
    }
    public int selection(int[] nums,int left, int right, int target){
        if (left==right)
            return nums[left];
        int partition_index = partition(nums,left,right);
        if (partition_index==target)
            return nums[target];

        if (partition_index<target){
            return selection(nums,partition_index+1,right,target);
        }
        else return selection(nums,left,partition_index-1,target);

    }
    public int minMoves2(int[] nums) {
        int median = selection(nums,0,nums.length-1,nums.length/2);
        int res =0;
        for (int x:nums){
            res+=Math.abs(x-median);
        }
        return res;
    }
}
