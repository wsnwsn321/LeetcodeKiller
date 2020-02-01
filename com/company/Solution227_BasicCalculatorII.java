package com.company;

import java.util.Stack;

public class Solution227_BasicCalculatorII {
    public static void main(String[] args) {
        String s = " 3+2*2 ";
        System.out.println(calculate(s));

    }
    public static int calculate(String s) {
        s = s.replace(" ", "");
        s+='+';
        if (s == null || (s.length()) == 0) return 0;
        int res = 0;
        Stack<Integer> stack = new Stack<Integer>();
        int num = 0;
        char prevSign = '+';
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + ch - '0';
                continue;
            }
            if (prevSign == '+')
                stack.push(num);
            else if (prevSign == '-')
                stack.push(-num);
            else if (prevSign == '*')
                stack.push(stack.pop() * num);
            else if (prevSign == '/')
                stack.push(stack.pop() / num);
            prevSign = ch;
            num = 0;
        }
        while (!stack.isEmpty())
            res += stack.pop();
        return res;
    }
}
