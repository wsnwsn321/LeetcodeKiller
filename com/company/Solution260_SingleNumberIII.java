package com.company;

import java.util.*;

public class Solution260_SingleNumberIII {
    public static void main(String[] args) {
        int[] n = new int[]{1,2,1,3,2,5};
        singleNumber(n);
    }
    //time:     O(n)
    //space:    O(n)
    public static int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] res = new int[2];
        int index =0;
        for (int x:nums){
            if (set.contains(x))
                res[index++] = x;
            else
                set.add(x);
        }
        return res;
    }
}
