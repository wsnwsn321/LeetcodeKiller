package com.company;

import java.util.*;

public class Solution179_LargestNumber {
    public static void main(String[] args) {

    }
    public String largestNumber(int[] nums) {
        PriorityQueue<Integer> sorted = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1.equals(o2)) return 0;
                String s1=String.valueOf(o1);
                String s2=String.valueOf(o2);
                String str1 = s1+s2;
                String str2 = s2+s1;
                return str2.compareTo(str1);
            }
        });
        for (int x:nums) sorted.add(x);
        String res="";
        while (sorted.size()>0){
            res+=sorted.poll();
        }
        if (res.charAt(0)=='0') return "0";
        return res;
    }
}
