package com.company;

import java.util.*;

public class Solution494_TargetSum {
    public static void main(String[] args) {

    }
    public int findTargetSumWays(int[] nums, int S) {
        return backtracking(nums,0,0,S,new HashMap<String,Integer>());
    }
    public int backtracking(int[] nums, int pos, int sum, int S, Map<String,Integer> map){
        if (map.containsKey(pos+","+sum))
            return map.get(pos+","+sum);
        if (pos==nums.length){
            if (sum==S){
                return 1;
            }
            else return 0;
        }
        int add = backtracking(nums,pos+1,sum+nums[pos],S,map);
        int sub = backtracking(nums,pos+1,sum-nums[pos],S,map);
        map.put(pos+","+sum,add+sub);
        return add+sub;
    }
}
