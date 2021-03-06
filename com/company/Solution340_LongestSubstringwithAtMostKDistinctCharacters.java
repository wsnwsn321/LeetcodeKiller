package com.company;

public class Solution340_LongestSubstringwithAtMostKDistinctCharacters {
    public static void main(String[] args) {
        String s = "eceba";
        lengthOfLongestSubstringKDistinct(s,2);
    }
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        int l = 0, res = 0;
        int[] count = new int[128];
        int unique = 0;
        for (int r = 0; r < s.length(); ++r) {
            if (count[s.charAt(r)]++ == 0)
                unique++;
            if (unique > k) {
                while (count[s.charAt(l++)]-- > 1);
                unique--;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
