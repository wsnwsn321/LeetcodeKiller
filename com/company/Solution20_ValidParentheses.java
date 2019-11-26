package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Solution20_ValidParentheses {
    public static void main(String[] args) {

    }
    //time:     O(n)
    //space:    O(n)
    public  boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch:s.toCharArray()){
            if (ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }
            else if (stack.isEmpty())
                return false;
            else if ((ch==')'&&stack.peek()=='(')||(ch==']'&&stack.peek()=='[')||(ch=='}'&&stack.peek()=='{')){
                stack.pop();
            }
            else return false;
        }
        return stack.size()==0;
    }

}
