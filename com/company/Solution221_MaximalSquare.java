package com.company;

public class Solution221_MaximalSquare {
    public static void main(String[] args) {

    }
    public int maximalSquare(char[][] matrix) {
        int[][] dp = new int[matrix.length+1][matrix[0].length+1];
        int res=0;
        for (int i=1;i<dp.length;++i){
            for (int j=1;j<dp[0].length;++j){
                if (matrix[i-1][j-1]=='1'){
                    dp[i][j] = Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                    res = Math.max(res,dp[i][j]);
                }
            }
        }
        return res*res;
    }
}
