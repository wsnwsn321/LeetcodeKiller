package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution532_KdiffPairsinanArray {
    public static void main(String[] args) {

    }
    public int findPairs(int[] nums, int k) {
        int res = 0;
        if (k<0) return res;
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            if (map.containsKey(x)) {
                if (k == 0 && map.get(x) == 1)
                    res++;
            } else {
                if (map.containsKey(x - k))
                    res++;
                if (map.containsKey(x + k))
                    res++;
            }
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        return res;
    }
}
