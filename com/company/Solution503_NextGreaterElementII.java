package com.company;

import java.util.Stack;

public class Solution503_NextGreaterElementII {
    public static void main(String[] args) {

    }
    public int[] nextGreaterElements(int[] nums) {
        int[] res= new int[nums.length];
        Stack<Integer> s = new Stack<>();
        for (int i=nums.length*2-1;i>=0;--i){
            int index = i%nums.length;
            while (!s.isEmpty()&&s.peek()<=nums[index]){
                s.pop();
            }
            res[index] = s.size()>0?s.peek():-1;
            s.push(nums[index]);
        }
        return res;
    }

}
