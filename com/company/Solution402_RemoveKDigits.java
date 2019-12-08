package com.company;

import java.util.Stack;

public class Solution402_RemoveKDigits {
    public static void main(String[] args) {

    }
    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();
        for (char ch:num.toCharArray()){
            //monotonic increasing stack
            //greedily keep a increasing stack to get smallest number
            while (s.size()>0&&ch<s.peek()){
                s.pop();
                k--;
            }
            s.push(ch);
        }
        while (k>0){
            s.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        for (char ch:s){
            if (leadingZero&&ch=='0')continue;
            else {
                leadingZero = false;
                sb.append(ch);
            }
        }
        return sb.toString().length()==0?"0":sb.toString();
    }
}
