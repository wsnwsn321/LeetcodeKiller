package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Solution349_IntersectionofTwoArrays {
    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        List<Integer> resList = new ArrayList<>();
        for (int x:nums1) s.add(x);
        for (int x:nums2) {
            if (s.contains(x)) resList.add(x);
        }
        int[] res = new int[resList.size()];
        for (int i=0;i<resList.size();++i)
            res[i] = resList.get(i);
        return  res;

    }
}
