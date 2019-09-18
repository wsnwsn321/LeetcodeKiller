package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution1130_MinimumCostTreeFromLeafValues {
    public static void main(String[] args) {

    }
    public int mctFromLeafValues(int[] arr) {
        int res = 0, n = arr.length;
        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.MAX_VALUE);
        for (int a : arr) {
            while (stack.peek() <= a) {
                int mid = stack.pop();
                res += mid * Math.min(stack.peek(), a);
            }
            stack.push(a);
        }
        while (stack.size() > 2) {
            res += stack.pop() * stack.peek();
        }
        return res;
    }
}
