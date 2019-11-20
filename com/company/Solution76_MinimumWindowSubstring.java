package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution76_MinimumWindowSubstring {
    public static void main(String[] args) {
        String s="a";
        String t = "b";
        System.out.println(minWindow(s,t));
    }
    //time:     O(s+t)
    //space:    O(s+t)
    public static String minWindow(String s, String t) {
        Map<Character,Integer> countT = new HashMap<>();
        for (char c:t.toCharArray()){
            countT.put(c,countT.getOrDefault(c,0)+1);
        }
        int length = t.length();
        int l=0,fl=0,fr =s.length();
        for (int i=0;i<s.length();++i){
            char cur = s.charAt(i);
            if (countT.containsKey(cur)) {
                if (countT.get(cur) > 0) {
                    length--;
                }
                countT.put(cur, countT.get(cur) - 1);
            }
            while (length==0){
                if (i-l<fr-fl) {
                    fr = i;
                    fl = l;
                }
                if (countT.containsKey(s.charAt(l))){
                    if (countT.get(s.charAt(l))>=0)
                        length++;
                    countT.put(s.charAt(l),countT.get(s.charAt(l++))+1);
                }
                else l++;
            }
        }
        return fr-fl==s.length()?"":s.substring(fl,fr+1);
    }

}
