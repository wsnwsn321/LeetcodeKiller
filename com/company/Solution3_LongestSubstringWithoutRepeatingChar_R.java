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
        int l=0,r=0;
        int max=0;
        Set<Character> count = new HashSet<>();
        while (r<s.length()){
            if (!count.contains(s.charAt(r))){
                count.add(s.charAt(r));
                max = Math.max(r-l+1,max);
                r++;
            }
            else{
                count.remove(s.charAt(l++));
            }

        }
        return max;
    }

}
