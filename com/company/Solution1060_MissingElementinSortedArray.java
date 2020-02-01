package com.company;

public class Solution1060_MissingElementinSortedArray {
    public static void main(String[] args) {
        int[] a = new int[]{4,7,9,10};
        missingElement(a,3);
    }
    static int missing(int idx, int[] nums) {
        return nums[idx] - nums[0] - idx;
    }

    public static int missingElement(int[] nums, int k) {
        int[] missingArray = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            missingArray[i] = nums[i] - (nums[0] + i);
        }
        int l = 0, r = nums.length - 1;
        int ans = -1;
        //find largest index that is smaller than or equal to k
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (missingArray[mid] >= k) {
                r = mid - 1;
            } else {
                ans = mid;
                l = mid + 1;
            }
        }
        return nums[0] + k + ans;
    }


}
