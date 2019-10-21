package com.company;

import java.util.HashSet;
import java.util.Set;

public class Solution128_LongestConsecutiveSequence {
    public static void main(String[] args) {

    }
    public int longestConsecutive(int[] nums) {
        int conseq =1;
        int startNum=0;
        int res=0;
        Set<Integer> set = new HashSet<>();
        for (int x:nums){
            set.add(x);
        }
        for (int num:nums){
            if (set.contains(num-1)) continue;
            while (set.contains(num+1)){
                conseq++;
                num = num+1;
            }
            res= Math.max(res,conseq);
            conseq=1;

        }
        return res;
    }
}
