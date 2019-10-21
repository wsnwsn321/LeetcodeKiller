package com.company;

import java.util.Stack;

public class Solution1047_RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {

    }
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        int i=0;
        while (i<S.length()){
            char cur = S.charAt(i);
            if (stack.isEmpty()||stack.peek()!=cur){
                stack.push(cur);
            }
            else {
                stack.pop();
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        while (stack.size()>0)
            sb.append(stack.pop());
        return sb.reverse().toString();
    }
}
