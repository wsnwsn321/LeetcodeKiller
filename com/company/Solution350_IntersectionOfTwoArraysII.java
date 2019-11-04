package com.company;

import java.util.*;

public class Solution350_IntersectionOfTwoArraysII {
    public static void main(String[] args) {

    }
    //time:     O(m+n)
    //space:    O(min(m,n))
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> resList = new ArrayList<>();
        for (int x : nums1) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (int x : nums2) {
            if (map.get(x)>0){
                resList.add(x);
                map.put(x,map.get(x)-1);
            }
        }
        int[] res = new int[resList.size()];
        int index=0;
        for (int x:resList)
            res[index++]= x;
        return res;
    }
}
