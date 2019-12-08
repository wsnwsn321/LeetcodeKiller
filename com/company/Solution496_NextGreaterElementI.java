package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution496_NextGreaterElementI {
    public static void main(String[] args) {
        int[] n1 = new int[]{4,1,2};
        int[] n2 = new int[]{1,3,4,2};
        int[] result = nextGreaterElement(n1,n2);
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=nums2.length;i>=0;--i){
            int cur = nums2[i];
            map.put(cur,-1);
            while (s.size()>0&&cur>s.peek()){
                //when cur greater than s.peek, a greater number shows up so we store (s.peek, cur) into map declaring
                //that the next greater number for s.peek is cur
                int poped = s.pop();
                map.put(cur,poped);
            }
            s.push(cur);
        }
        while (!s.empty())
            map.put(s.pop(), -1);
        for (int i=0;i<nums1.length;++i){
            //for numbers in num1, just find next greater element in the map
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }

}
