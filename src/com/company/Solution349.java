package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Solution349 {
    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> num = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for(int x:nums1){
            num.add(x);
        }
        for(int y:nums2){
            if(num.contains(y)){
                result.add(y);
            }
        }
        int[] r = new int[result.size()];
        int count=0;
        for(int x:result){
            r[count] = x;
            ++count;
        }

        return r;
    }
}
