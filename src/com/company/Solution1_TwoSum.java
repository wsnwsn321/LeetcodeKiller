package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution1_TwoSum {
    public static void main(String[] args) {

    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;++i){
            if(m.containsKey(target-nums[i])){
                result[0]=m.get(target-nums[i]);
                result[1] =i;
            }
            else{
                m.put(nums[i],i);
            }
        }
        return result;

    }
}
