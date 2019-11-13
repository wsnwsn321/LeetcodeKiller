package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution844_BackspaceStringCompare {
    public static void main(String[] args) {

    }
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> s1 = new Stack<>();
        for (char ch:S.toCharArray()){
            if (ch!='#')
                s1.push(ch);
            else {
                if (s1.size()>0)
                    s1.pop();
            }
        }
        Stack<Character> s2 = new Stack<>();
        for (char ch:T.toCharArray()){
            if (ch!='#')
                s2.push(ch);
            else {
                if (s2.size()>0)
                    s2.pop();
            }
        }
        return s1.equals(s2);
    }
}
