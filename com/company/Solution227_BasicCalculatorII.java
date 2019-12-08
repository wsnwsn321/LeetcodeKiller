package com.company;

import java.util.Stack;

public class Solution227_BasicCalculatorII {
    public static void main(String[] args) {
        String s = " 3/2 ";
        calculate(s);
    }
    public static int calculate(String s) {
        s=s.replace(" ", "");
        int len;
        if (s == null || (len = s.length()) == 0) return 0;
        Stack<Integer> stack = new Stack<Integer>();
        int num = 0;
        char sign = '+';
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if (!Character.isDigit(ch) || i == len - 1) {
                if (sign == '-') {
                    stack.push(-num);
                }
                if (sign == '+') {
                    stack.push(num);
                }
                if (sign == '*') {
                    stack.push(stack.pop() * num);
                }
                if (sign == '/') {
                    stack.push(stack.pop() / num);
                }
                sign = s.charAt(i);
                num = 0;
            }
        }

        int re = 0;
        for (int i : stack) {
            re += i;
        }
        return re;
    }
}
