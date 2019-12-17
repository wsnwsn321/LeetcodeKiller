package com.company;

public class Solution540_SingleElementinaSortedArray {
    public static void main(String[] args) {

    }
    public int singleNonDuplicate(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        //if we have mid+1 or mi-1, we need the <; if not, we can use <=
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1])
                return nums[mid];
            //there're even number of elements on the left of mid-1
            if (nums[mid] == nums[mid - 1]) {
                if ((mid - lo) % 2 == 0)
                    hi = mid - 2;
                else {
                    lo = mid + 1;
                }
            }
            else if (nums[mid]==nums[mid+1]) {
                if ((hi - mid) % 2 == 0)
                    lo = mid + 2;
                else
                    hi = mid - 1;
            }
            else
                return nums[mid];
        }
        //return nums[lo] means there only one element left in the array so this is the answer
        return nums[lo];
    }
}
