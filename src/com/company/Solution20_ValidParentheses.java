package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution20_ValidParentheses {
    public static void main(String[] args) {

    }
    public static boolean isValid(String s) {
        List<Character> l = new ArrayList<>();
        char[] cs = s.toCharArray();
        for(char x:cs){
            if(x=='(' ||x=='['||x=='{')
                l.add(x);
            if(x==')'&& l.indexOf(l.size()-1)=='('||x==']'&&l.indexOf(l.size()-1)=='['||x=='}'&&l.indexOf(l.size()-1)=='{'){
                l.remove(l.size()-1);
            }
            else return false;
        }
        return true;

    }

}
