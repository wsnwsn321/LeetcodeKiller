package com.company;

import java.util.Stack;

public class Solution503_NextGreaterElementII {
    public static void main(String[] args) {

    }
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int[] res = new int[nums.length];
        for (int i = nums.length * 2 - 1; i >= 0; --i) {
            int cur = nums[i % nums.length];
            while (s.size() > 0 && cur >= s.peek()) {
                s.pop();
            }
            res[i % nums.length] = s.size() > 0 ? s.peek() : -1;
            s.push(cur);
        }
        return res;
    }

}
