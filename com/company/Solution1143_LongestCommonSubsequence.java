package com.company;

public class Solution1143_LongestCommonSubsequence {
    public static void main(String[] args) {

    }
    public int longestCommonSubsequence(String text1, String text2) {
        //dp represents the longest common subsequence of first i chars in text1 and first j chars in text2
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for (int i=1;i<dp.length;++i){
            for (int j=1;i<dp[0].length;++j){
                if (text1.charAt(i-1)==text2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1]+1;
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
