package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution325_MaximumSizeSubarraySumEqualsk {
    public static void main(String[] args) {
        int[] n = new int[]{-2,-1,2,1};
        maxSubArrayLen(n,1);

    }
    public static int maxSubArrayLen(int[] nums, int k) {
        int sum = 0, max = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum == k) max = i + 1;
            else if (map.containsKey(sum - k)) max = Math.max(max, i - map.get(sum - k));
            if (!map.containsKey(sum)) map.put(sum, i);
        }
        return max;
    }
}
