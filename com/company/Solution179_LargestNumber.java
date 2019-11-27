package com.company;

import java.util.*;

public class Solution179_LargestNumber {
    public static void main(String[] args) {

    }
    public String largestNumber(int[] nums) {
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String a = o1+o2;
                String b = o2+o1;
                return b.compareTo(a);
            }
        });
        for (int x:nums){
            pq.offer(String.valueOf(x));
        }
        StringBuilder sb = new StringBuilder();
        while (pq.size()>0){
            sb.append(pq.poll());
        }
        if (sb.charAt(0)=='0') return "0";
        return sb.toString();
    }
}
