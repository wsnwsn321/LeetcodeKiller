package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution3_LongestSubstringWithoutRepeatingChar_R {
    public static void main(String[] args) {

        String a = "abcabcbb";
        lengthOfLongestSubstring(a);
    }
    //runtime: O(n) n=length of s
    //space: O(n) n= length of s
    public static int lengthOfLongestSubstring(String s) {
        if (s.length()<=1) return s.length();
        int l=0,r = 1;
        int res =0;
        char[] count = new char[26];
        count[s.charAt(l)]++;
        char[] cs = s.toCharArray();
        while (r<s.length()){
           if (count[cs[r]-'a']==0) count[cs[r++]-'a']++;
           else {
               res = Math.max(res,r-l+1);
               count[cs[l++]-'a']--;
           }
        }
        return res;
    }

}
