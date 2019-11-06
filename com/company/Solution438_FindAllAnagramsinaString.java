package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution438_FindAllAnagramsinaString {
    public static void main(String[] args) {
        String x = "ecbaebabacd";
        String p = "abc";
        findAnagrams(x,p);
    }
    public static List<Integer> findAnagrams(String s, String p) {
        int[] pCount = new int[26];
        List<Integer> res = new ArrayList<>();
        int count =p.length();
        if (s.length()<p.length()) return res;
        for (char ch:p.toCharArray()){
            pCount[ch-'a']++;
        }
        int l=0,r=0;
        while (r<s.length()){
            if (pCount[s.charAt(r)-'a']-->0)
                count--;
            if (r-l+1>p.length()){
                if (pCount[s.charAt(l++)-'a']++>=0)
                    count++;
            }
            if (count==0)
                res.add(l);
            r++;
        }
        return res;
    }
}
