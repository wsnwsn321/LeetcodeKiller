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
        Set<Character> set = new HashSet<>();
        int longest = 1;
        int l =0,r=0;
        while (r<s.length()){
            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r++));
                longest = Math.max(longest,set.size());
            }
            else{
                set.remove(s.charAt(l++));
            }
        }
        return longest;
    }

}
