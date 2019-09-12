package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution20_ValidParentheses {
    public static void main(String[] args) {

    }
    //time:     O(n)
    //space:    O(n)
    public  boolean isValid(String s) {
       List<Character> container = new ArrayList<>();
       if (s.length()==0) return true;
       char[] cs = s.toCharArray();
       for (char x: cs){
           if (x=='['||x=='{'||x=='(') container.add(x);
           else if (container.size()==0) return false;
           else if((x==']'&&container.get(container.size()-1)=='[')||(x=='}'&&container.get(container.size()-1)=='{')||(x==')'&&container.get(container.size()-1)=='(')){
               container.remove(container.size()-1);
           }
           else return false;
       }
       return container.size()==0;
    }

}
