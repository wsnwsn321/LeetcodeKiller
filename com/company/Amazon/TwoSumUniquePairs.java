package com.company.Amazon;

import java.util.*;

public class TwoSumUniquePairs {
    public static void main(String[] args) {
        int[]num = new int[]{1, 1, 2, 45, 46, 46};
        getUniquePairs(num,47);
    }
    public static int getUniquePairs(int[] nums, int target){
        Set<Integer> seen =  new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int num : nums){
            if (map.containsKey(num)){
                int key = map.get(num)* num;
                if (! seen.contains(key)){
                    ans++;
                    seen.add(key);
                }
            } else {
                map.put(target-num, num);
            }
        }
        return ans;

    }
}
