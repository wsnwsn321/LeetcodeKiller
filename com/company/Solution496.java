package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution496 {
    public static void main(String[] args) {
        int[] n1 = new int[]{4,1,2};
        int[] n2 = new int[]{1,3,4,2};
        int[] result = nextGreaterElement(n1,n2);
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> nextG = new HashMap<>();
        Stack<Integer> s= new Stack<>();
        s.push(nums2[0]);
        for (int i=1;i<nums2.length;++i){
            if (nums2[i]>s.peek()){
                nextG.put(s.pop(),nums2[i]);
            }
            s.push(nums2[i]);
        }
        while (!s.isEmpty()){
            nextG.put(s.pop(),-1);
        }
        int[] res = new int[nums1.length];
        for (int i=0;i<nums1.length;++i){
            res[i] = nextG.get(nums1[i]);
        }
        return  res;
    }

}
