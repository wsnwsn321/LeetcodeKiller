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
        int sum=0;
        int res =0;
        map.put(0,1);
        for (int i=0;i<nums.length;++i){
            sum+=nums[i];
            if (map.containsKey(sum-k))
                res+=map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }

}
