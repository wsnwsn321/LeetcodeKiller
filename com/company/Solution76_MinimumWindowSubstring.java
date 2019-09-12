package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution76_MinimumWindowSubstring {
    public static void main(String[] args) {
        String s="ab";
        String t = "a";
        minWindow(s,t);
    }
    public static String minWindow(String s, String t) {
        if (s.length()==0) return "";
        Map<Character,Integer> count = new HashMap<>();
        Map<Character,Integer> current = new HashMap<>();
        for (char x:t.toCharArray()){
            count.put(x,count.getOrDefault(x,0)+1);
        }
        int min = Integer.MAX_VALUE;
        int fl=0,fr=0;
        int l=0;
        for (int r=0;r<s.length();++r){
            current.put(s.charAt(r),current.getOrDefault(s.charAt(r),0)+1);
            while (l<=r&&StringContains(current,count)){
                if (r-l+1<min){
                    min = r-l+1;
                    fl=l;fr=r;
                }
                current.put(s.charAt(l),current.get(s.charAt(l))-1);
                l++;
            }
        }
        if (min==Integer.MAX_VALUE) return "";
        return s.substring(fl,fr+1);

    }

    public static boolean StringContains(Map<Character,Integer> current, Map<Character,Integer> count){
        if (current.size()<count.size()) return false;
        for (char c: count.keySet()){
            if (!current.containsKey(c)) return false;
            if (count.get(c)>current.get(c)) return false;
        }
        return true;
    }
}
