package com.company;

import java.util.Stack;

public class Solution503_NextGreaterElementII {
    public static void main(String[] args) {

    }
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i=2*nums.length-1;i>=0;--i){
            int num = nums[i%nums.length];
            while (!stack.isEmpty()&&nums[stack.peek()]<num){
                stack.pop();
            }
            res[i%nums.length] = stack.isEmpty()?-1:stack.peek() ;
        }
        return res;
    }

}
