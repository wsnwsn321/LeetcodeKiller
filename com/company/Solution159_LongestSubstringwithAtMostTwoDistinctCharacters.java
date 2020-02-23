package com.company;

public class Solution159_LongestSubstringwithAtMostTwoDistinctCharacters {
    public static void main(String[] args) {

    }
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int l = 0, res = 0;
        int[] count = new int[128];
        int unique = 0;
        for (int r = 0; r < s.length(); ++r) {
            if (count[s.charAt(r)]++ == 0)
                unique++;
            if (unique > 2) {
                while (count[s.charAt(l++)]-- > 1);
                unique--;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
