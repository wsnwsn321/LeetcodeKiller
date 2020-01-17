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
        int[] count = new int[26];
        List<Integer> res = new ArrayList<>();
        if (s.length()<p.length()) return res;
        for (char ch:p.toCharArray()){
            count[ch-'a']++;
        }
        int l=0;
        int length = p.length();
        for (int i=0;i<s.length();++i){
            char ch = s.charAt(i);
            //still some chars in p not matched
            if (count[ch-'a']-->0){
                length--;
            }
            //window size> p.length and move left pointer will make
            //char at l become unmatched again
            if (i-l+1>p.length()&&count[s.charAt(l++)-'a']++>=0){
                length++;
            }
            if (length==0){
                res.add(l);
            }
        }
        return res;
    }
}
