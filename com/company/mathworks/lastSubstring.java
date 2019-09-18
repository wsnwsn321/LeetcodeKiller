package com.company.mathworks;

import java.util.*;

public class lastSubstring {
    public static void main(String[] args) {
        String s = "abc";
        lastSub(s);
    }
    public static String lastSub(String s){
        List<String> subs = new ArrayList<>();
        for (int i=0;i<s.length();++i){
            backtracking(subs,"",s,i);
        }
        Collections.sort(subs);
        return subs.get(subs.size()-1);
    }
    public static void backtracking(List<String> subs, String cur,String s,int index){
        for (int i=index;i<s.length();++i){
            cur+=s.charAt(i);
            subs.add(cur);
        }
    }
}
