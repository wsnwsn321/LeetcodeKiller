package com.company;

import java.util.Stack;

public class Solution224_BasicCalculator {
    public static void main(String[] args) {
        String s = "3-(5+7)";
        calculate(s);
    }
    public static int calculate(String s) {

        Stack<Integer> stack = new Stack<Integer>();
        int candNum = 0;
        int result = 0; // For the on-going result
        int sign = 1;  // 1 means positive, -1 means negative

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)){
                candNum = 10*candNum+ch-'0';
            }
            else if (ch=='+'){
                result+=sign*candNum;
                candNum =0;
                sign=1;
            }
            else if (ch=='-'){
                result+= sign*candNum;
                candNum=0;
                sign=-1;
            }
            else if (ch=='('){
                stack.push(result);
                stack.push(sign);
                sign=1;
                result=0;
            }
            else if (ch==')'){
                result+=sign*candNum;
                result*=stack.pop();
                result+=stack.pop();
                candNum=0;
            }

        }
        return result + (sign * candNum);
    }
}
