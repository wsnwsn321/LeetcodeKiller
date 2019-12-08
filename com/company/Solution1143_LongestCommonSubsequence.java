package com.company;

public class Solution1143_LongestCommonSubsequence {
    public static void main(String[] args) {

    }
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1.length() == 0 || text2.length() == 0) return 0;
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 1; i < text1.length() + 1; i++) {
            for (int j = 1; j < text2.length() + 1; j++) {
                //use i-1 == j-1 to make that this is the ith char and jth char(because index starts from 0)
                if (text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
