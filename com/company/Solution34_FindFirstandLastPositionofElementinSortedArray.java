package com.company;

public class Solution34_FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
        return new int[]{findFirst(nums,target),findLast(nums, target)} ;
    }

    public int findFirst(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int index = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (target <= nums[mid]) {
                if (target == nums[mid])
                    index = mid;
                r = mid - 1;
            } else
                l = mid + 1;
        }
        return index;
    }

    public int findLast(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int index = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (target >= nums[mid]) {
                if (target == nums[mid])
                    index = mid;
                l = mid + 1;
            } else
                r = mid - 1;
        }
        return index;
    }
}
