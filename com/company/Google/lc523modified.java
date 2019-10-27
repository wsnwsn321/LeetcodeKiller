package com.company.Google;

import java.util.HashMap;
import java.util.Map;

public class lc523modified {
    public static void main(String[] args) {

    }
    public int checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int minLength=Integer.MAX_VALUE;
        int sum=0;
        map.put(0,-1);
        for (int i=0;i<nums.length;++i){
            sum+=nums[i];
            if(k!=0)
                sum%=k;
            if (map.containsKey(sum)) {
                if (i - map.get(sum) > 1)
                    minLength = Math.min(minLength,i-map.get(sum));
            } else
                map.put(sum, i);
        }
        return 1;
    }
}
