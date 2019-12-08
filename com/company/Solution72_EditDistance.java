package com.company;

public class Solution72_EditDistance {
    public static void main(String[] args) {

    }
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        //for(int i = 0;i<=word1.length();i++) dp[i][0] = i;
        //for(int j = 0;j<=word2.length();j++) dp[0][j] = j;
        for (int i=0;i<=word1.length();++i){
            dp[i][0] = i;
            for (int j=0;j<=word2.length();++j){
                dp[0][j]=j;
                if (word1.charAt(i)==word2.charAt(j))
                    dp[i][j] = dp[i-1][j-1];
                else {
                    dp[i][j] = Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
