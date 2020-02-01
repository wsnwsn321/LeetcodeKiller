package com.company;

import java.util.Stack;

public class Solution224_BasicCalculator {
    public static void main(String[] args) {
        String s = "3-(5+7)";
        calculate(s);
    }
    public static int calculate(String s) {

        Stack<Integer> stack = new Stack<Integer>();
        int operand = 0;
        int result = 0; // For the on-going result
        int sign = 1;  // 1 means positive, -1 means negative

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                operand = operand * 10 + (ch - '0');
            } else if (ch == '+') {
                //sign here is the previous sign before current ch
                result += sign * operand;
                sign = 1;
                operand = 0;
            } else if (ch == '-') {
                result += sign * operand;
                sign = -1;
                operand = 0;
            } else if (ch == '(') {
                stack.push(result);
                stack.push(sign);
                sign = 1;
                result = 0;
            } else if (ch == ')') {
                result += sign * operand;
                result *= stack.pop();
                result += stack.pop();
                operand = 0;
            }
        }
        return result + (sign * operand);
    }
}
