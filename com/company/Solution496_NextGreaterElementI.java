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
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; ++i) {
            int cur = nums2[i];
            while (s.size() > 0 && cur > s.peek()) {
                map.put(s.pop(), cur);
            }
            s.push(cur);
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; ++i) {
            if (map.containsKey(nums1[i]))
                res[i] = map.get(nums1[i]);
            else
                res[i] = -1;
        }
        return res;
    }

}
