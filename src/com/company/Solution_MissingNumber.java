package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution_MissingNumber {
    public static void main(String[] args) {

    }
    public int missingNumber(int[] nums) {
        List<Integer> s = new ArrayList<>();
        for(int x:nums){
            s.add(x);
        }
        for(int i=0;i<nums.length+1;++i){
            if(!s.contains(i)) return i;
        }
        return 0;
    }
}
