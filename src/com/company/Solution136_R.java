package com.company;

import java.util.*;

public class Solution136_R {
    public static void main(String[] args) {
    int[] n = new int[]{2,1,2};
    int k = 5^3;
    singleNumber(n);
    }

    public static int singleNumber(int[] nums) {
//        Set<Integer> m = new HashSet<>();
//        for(int x:nums){
//            if(m.contains(x)){
//                m.remove(x);
//            }
//            else{
//                m.add(x);
//            }
//        }
//       return m.iterator().next();
            int rlt = 0;

            for (int i: nums)
                rlt ^= i; //the idea behind is that a^a=0,and b^0=b.

            return rlt;

    }
}
