package com.company;

import java.util.HashSet;
import java.util.Set;

public class Solution128_LongestConsecutiveSequence {
    public static void main(String[] args) {

    }
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x:nums){
           set.add(x);
        }
        int res=0;
        for (int x:nums){
            if (set.contains(x-1)) continue;
            int count =1;
            while (set.contains(x+1)){
                count++;
                x=x+1;
            }
            res = Math.max(res,count);
        }
        return res;
    }
}
