package com.company;

import java.util.*;

public class Solution3_LongestSubstringWithoutRepeatingChar_R {
    public static void main(String[] args) {

        String a = "abcabcbb";
        lengthOfLongestSubstring(a);
    }
    //runtime: O(n) n=length of s
    //space: O(n) n= length of s
    public static int lengthOfLongestSubstring(String s) {
        int l=0;
        int res=0;
        int[] map = new int[128];
        Arrays.fill(map,-1);
        for (int i=0;i<s.length();++i){
            if (map[s.charAt(i)]>-1){
                l = Math.max(l,map[s.charAt(i)]+1);
            }
            map[s.charAt(i)] = i;
            res = Math.max(res,i-l+1);
        }
        return res;
    }

}
