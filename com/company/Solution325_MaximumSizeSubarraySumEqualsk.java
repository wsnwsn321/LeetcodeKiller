package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution325_MaximumSizeSubarraySumEqualsk {
    public static void main(String[] args) {
        int[] n = new int[]{-2,-1,2,1};
        maxSubArrayLen(n,1);

    }
    public static int maxSubArrayLen(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int res=0;
        map.put(0,-1);
        for (int i=0;i<nums.length;++i){
            sum+=nums[i];
            if (map.containsKey(sum-k))
                res = Math.max(res,i-map.get(sum-k));
            if (!map.containsKey(sum))
                map.put(sum,i);
        }
        return res;
    }
}
