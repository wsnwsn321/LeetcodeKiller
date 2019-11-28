package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution560_SubarraySumEqualK {
    static int count;
    public static void main(String[] args) {
        int[] x = new int[]{1,2,3,4,5};
        int re= subarraySum(x, 3);
        int q = re;
    }
    public static  int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int cur_sum = 0;
        int count=0;
        map.put(0,1);
        for (int i=0;i<nums.length;++i){
            cur_sum+=nums[i];
            if (map.containsKey(cur_sum-k))
                count += map.get(cur_sum-k);
            map.put(cur_sum,map.getOrDefault(cur_sum,0)+1);
        }
        return count;
    }

}
