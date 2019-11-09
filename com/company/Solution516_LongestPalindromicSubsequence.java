package com.company;

public class Solution516_LongestPalindromicSubsequence {
    public static void main(String[] args) {

    }
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for (int i=0;i<s.length();++i){
            dp[i][i]=1;
            for (int j=i-1;j>=0;--j){
                if (s.charAt(j)==s.charAt(i)){
                    if (j==i-1)
                        dp[j][i]=2;
                    else{
                        dp[j][i] = dp[j+1][i-1]+2;
                    }
                }
                else
                    dp[j][i] = Math.max(dp[j+1][i],dp[j][i-1]);
            }
        }
        return dp[0][s.length()-1];
    }
}

