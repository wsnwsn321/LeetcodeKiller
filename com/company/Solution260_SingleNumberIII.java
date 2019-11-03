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
        Map<Integer,Integer> m = new HashMap<>();
        int[] res = new int[2];
        for (int x:nums){
            m.put(x,m.getOrDefault(x,0)+1);
        }
        int index=0;
        for (int k:m.keySet()){
            if (m.get(k)==1){
                res[index]=k;
                index++;
            }
        }
        return res;
    }
}
