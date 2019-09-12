package com.company;

import java.util.HashSet;
import java.util.Set;

public class Solution287_FindtheDuplicateNumber {
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int x:nums){
            if (!s.add(x)) return x;
        }
        return -1;
    }
}
