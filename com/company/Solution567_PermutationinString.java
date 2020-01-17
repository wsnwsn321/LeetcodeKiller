package com.company;

import java.util.Arrays;

public class Solution567_PermutationinString {
    public static void main(String[] args) {
        String x = "ab";
        String p = "eidbaooo";
        checkInclusion(x,p);
    }
    public static boolean checkInclusion(String s1, String s2) {
        int[] count = new int[26];
        for (char ch : s1.toCharArray()) {
            count[ch - 'a']++;
        }
        int l = 0, same = s1.length();
        for (int r = 0; r < s2.length(); ++r) {
            if (count[s2.charAt(r) - 'a']-- > 0)
                same--;
            if (r - l + 1 > s1.length()) {
                //means there're remaining characters not matched
                if (count[s2.charAt(l++) - 'a']++ >= 0)
                    same++;
            }
            if (same == 0)
                return true;
        }
        return false;
    }
}