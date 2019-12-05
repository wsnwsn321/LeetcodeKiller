package com.company;

import java.util.Stack;

public class Solution32_LongestValidParentheses {
    public static void main(String[] args) {

    }
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max_length = 0;
        for (int i=0;i<s.length();++i){
            if (s.charAt(i)=='('){
                stack.push(i);
            }
            else {
                stack.pop();
                if (stack.isEmpty())
                    stack.push(i);
                //we have a pair of valid parentheses
                else {
                    max_length = Math.max(max_length,i-stack.peek());
                }

            }
        }
        return max_length;

    }
}
