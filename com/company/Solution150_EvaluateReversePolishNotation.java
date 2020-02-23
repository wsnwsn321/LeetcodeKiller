package com.company;

import java.util.Stack;

public class Solution150_EvaluateReversePolishNotation {
    public static void main(String[] args) {

    }
    public int evalRPN(String[] tokens) throws Exception {
        Stack<Integer> s = new Stack<>();
        String sign = "+-*/";
        String numbers = "0123456789";
        for (String cur : tokens) {
            if (!sign.contains(cur) && !numbers.contains(cur))
                throw new Exception("invalid input");
            if (sign.contains(cur) && cur.length() > 1)
                throw new Exception("invalid input");
            if (!sign.contains(cur)) {
                s.push(Integer.valueOf(cur));
                continue;
            }
            if (s.size() < 2)
                throw new Exception("not enough operators");
            int second = s.pop();
            int first = s.pop();
            if (cur.equals("+"))
                s.push(first + second);
            else if (cur.equals("-"))
                s.push(first - second);
            else if (cur.equals("*"))
                s.push(first * second);
            else
                s.push(first / second);
        }
        return s.pop();
    }
}
