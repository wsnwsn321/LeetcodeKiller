package com.company;

import java.util.ArrayList;

public class Solution5_LongestPalindromSubString_R {
    public static int lo,maxLen;
    public static void main(String[] args) {
        String s = "abacd";
        longestPalindrome(s);

    }
    //time: O(n^2);
    //space: O(n^2);
    public static String longestPalindrome(String s) {
        if (s.length() == 0) return "";
        int l = 0, r = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); ++i) {
            dp[i][i] = true;
            for (int j = 0; j < i; ++j) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j == i - 1)
                        dp[j][i] = true;
                    else dp[j][i] = dp[j + 1][i - 1];
                    if (dp[j][i] && i - j > r - l) {
                        r = i;
                        l = j;
                    }
                }
            }
        }
        return s.substring(l, r + 1);
    }
}
