package com.company;

import java.util.*;

public class Solution494_TargetSum {
    public static void main(String[] args) {

    }
    int count=0;
    public int findTargetSumWays(int[] nums, int S) {
        Map<String, Integer> map = new HashMap<>();
        return backtracking(nums,0,0,S,map);
    }
    public int backtracking(int[] nums, int i, int sum, int S, Map<String,Integer> map){
        String key = i+","+sum;
        if (map.containsKey(key))
            return map.get(key);
        if (i==nums.length-1){
            if (sum==S){
                return 1;
            }
            else return 0;
        }
        int add = backtracking(nums,i+1,sum+nums[i],S,map);
        int sub = backtracking(nums,i+1,sum-nums[i],S,map);
        map.put(key,add+sub);
        return add+sub;
    }
}
