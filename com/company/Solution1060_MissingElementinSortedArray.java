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
        int n = nums.length;
        if (k > missing(n - 1, nums))
            return nums[n - 1] + k - missing(n - 1, nums);

        int left = 0, right = n - 1, ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (missing(mid, nums) >= k)
                right = mid - 1;
            else {
                ans = mid;
                left = mid + 1;
            }

        }
        return nums[ans] + k - missing(ans, nums);
    }


}
