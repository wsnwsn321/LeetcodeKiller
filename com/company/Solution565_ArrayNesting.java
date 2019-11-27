package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution565_ArrayNesting {
    public static void main(String[] args) {

    }
    public int arrayNesting(int[] nums) {
        //boolean[] visited = new boolean[nums.length];
        Set<Integer> visited = new HashSet<>();
        int res=0;
        int cur = 0;
        for (int i=0;i<nums.length;++i){
            if (!visited.contains(i)){
                int count = visit(i,nums,visited,0);
                res = Math.max(res,count);
            }
        }
        return res;
    }
    public int visit(int i,int[] nums, Set<Integer> visited,int count){
        if (visited.contains(i))
            return count;
        visited.add(i);
        return visit(nums[i],nums,visited,count+1);
    }
}
