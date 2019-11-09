package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution525_ContiguousArray {
    public static void main(String[] args) {

    }
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int count=0;
        int res=0;
        map.put(0, -1);
        for (int i=0;i<nums.length;++i){
            count+=nums[i]==1?1:-1;
            if (map.containsKey(count)){
                res = Math.max(res,i-map.get(count));
            }
            else
                map.put(count,i);
        }
        return res;
    }
}
