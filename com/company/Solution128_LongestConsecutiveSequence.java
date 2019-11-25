package com.company;

import java.util.HashSet;
import java.util.Set;

public class Solution128_LongestConsecutiveSequence {
    public static void main(String[] args) {

    }
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int x:nums)
            s.add(x);
        int max_length =0;
        for (int x:nums){
            if (s.contains(x-1))continue;
            int cur_length=1;
            while (s.contains(x+1)){
                cur_length++;
                x++;
            }
            max_length = Math.max(max_length,cur_length);
        }
        return max_length;
    }
}
