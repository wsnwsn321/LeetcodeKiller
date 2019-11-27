package com.company.CompanyList.Amazon;

import java.util.Stack;

public class ValidParenethesisChanged {
    public static void main(String[] args) {
        String s = "''[]()(())'{}''";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch:s.toCharArray()){
            if (ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }
            else if(ch == ')' && !stack.empty() && stack.peek() == '(')
                stack.pop();
            else if(ch == ']' && !stack.empty() && stack.peek() == '[')
                stack.pop();
            else if(ch == '}' && !stack.empty() && stack.peek() == '{')
                stack.pop();
            else if (ch=='\''){
                if (stack.isEmpty()||stack.peek()!=ch){
                    stack.push(ch);
                }
                else stack.pop();
            }
            else
                return false;
        }
        return stack.size()==0;
    }
}
