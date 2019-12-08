package com.company;

import java.util.Stack;

public class Solution456_132Pattern {
    public static void main(String[] args) {

    }
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3)
            return false;
        Stack < Integer > stack = new Stack < > ();
        int[] min = new int[nums.length];
        min[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            min[i] = Math.min(min[i - 1], nums[i]);
        for (int j = nums.length - 1; j >= 0; j--) {
            //condition 1: last number is greater than first number (2>1 in 132)
            if (nums[j] > min[j]) {
                //stack is a monotonous decreasing, so if we traverse from tail to head, and we find a number
                // is larger than top of stack, condition 2 is satisfied
                while (!stack.isEmpty() && stack.peek() <= min[j])
                    stack.pop();
                //condition 2: last number smaller than second number (2<3 in 132)
                if (!stack.isEmpty() && stack.peek() < nums[j])
                    return true;
                stack.push(nums[j]);
            }
        }
        return false;
    }
}
