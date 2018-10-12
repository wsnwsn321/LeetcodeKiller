package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution1 {
    public static void main(String[] args) {

    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> s =new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;++i){
            int c = nums[i];
            if(s.get(target-c)!=null){
                result[0] = i;
                result[1] = s.get(target-c);
                return result;
            }
            s.put(c,i);
        }
        return result;

    }
}
