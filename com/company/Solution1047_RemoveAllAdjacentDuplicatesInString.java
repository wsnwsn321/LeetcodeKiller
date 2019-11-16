package com.company;

import java.util.Stack;

public class Solution1047_RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {

    }
    public String removeDuplicates(String S) {
        Stack<Character> s = new Stack<>();
        for (int i=0;i<S.length();++i){
            if (s.isEmpty()||s.peek()!=S.charAt(i))
                s.push(S.charAt(i));
            else {
                s.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (s.size()>0)
            sb.append(s.pop());
        return sb.reverse().toString();
    }
}
