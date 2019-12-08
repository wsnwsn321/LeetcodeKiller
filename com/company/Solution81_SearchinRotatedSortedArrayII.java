package com.company;

public class Solution81_SearchinRotatedSortedArrayII {
    public static void main(String[] args) {

    }
    public boolean search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target)
                return true;
                //left part sorted
            else if (nums[mid] > nums[l]) {
                if (nums[l] <= target && target < nums[mid])
                    r = mid - 1;
                else l = mid + 1;
            }
            //right part sorted
            else if (nums[mid] < nums[l]) {
                if (nums[mid] < target && target <= nums[r])
                    l = mid + 1;
                else r = mid - 1;
            }
            //nums[l] = nums[mid], move l to the right
            else {
                l++;
            }
        }
        return false;
    }
}
