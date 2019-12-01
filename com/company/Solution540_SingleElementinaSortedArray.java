package com.company;

public class Solution540_SingleElementinaSortedArray {
    public static void main(String[] args) {

    }
    public int singleNonDuplicate(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            boolean rightHalvesEven = (hi - mid) % 2 == 0;
            if (nums[mid + 1] == nums[mid]) {
                //when remove mid+1 from right, right part becomes odd, which means
                //target is there
                if (rightHalvesEven) {
                    lo = mid + 2;
                } else {
                    hi = mid - 1;
                }
            } else if (nums[mid - 1] == nums[mid]) {
                //if mid's same to its left element, if right half is even, target on the left half
                if (rightHalvesEven) {
                    hi = mid - 2;
                } else {
                    lo = mid + 1;
                }
            } else {
                return nums[mid];
            }
        }
        return nums[lo];
    }
}
