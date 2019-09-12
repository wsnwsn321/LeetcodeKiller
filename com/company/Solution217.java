package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution217 {
    public static void main(String[] args) {

    }
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> r = new HashSet<>();
        for(int x:nums){
            if(!r.add(x)) return true;
        }
        return false;

    }
}
