package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution844_BackspaceStringCompare {
    public static void main(String[] args) {

    }
    public boolean backspaceCompare(String S, String T) {
        char[] cs = S.toCharArray();
        char[] ct = T.toCharArray();
        return fulfillList(cs).equals(fulfillList(ct));
    }
    public List<Character> fulfillList(char[] cs){
        List<Character> l = new ArrayList<>();
        for(char c:cs){
            if(c=='#'){
                if(!l.isEmpty()) l.remove(l.size()-1);
            }
            else l.add(c);
        }
        return l;
    }
}
