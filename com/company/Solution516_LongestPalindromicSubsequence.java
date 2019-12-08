package com.company;

public class Solution516_LongestPalindromicSubsequence {
    public static void main(String[] args) {

    }
    public int longestPalindromeSubseq(String s) {
        //dp[i][j] means length of longest palindrome subsequence from char i to j
        int[][] dp = new int[s.length()][s.length()];
        for (int i=0;i<dp.length;++i){
            dp[i][i]=1;
            for (int j=i-1;j>=0;--j){
                //if char i = j, dp[i][j] = dp[i+1][j-1]+2
                if (s.charAt(j)==s.charAt(i)){
                    if (j==i-1)
                        dp[j][i]=2;
                    else dp[j][i] = dp[j+1][i-1]+2;
                }
                //if not, choose the maximum from i+1->j substring and i>j-1 substring
                else dp[j][i] = Math.max(dp[j+1][i],dp[j][i-1]);
            }
        }
        return dp[0][s.length()-1];
    }
}

