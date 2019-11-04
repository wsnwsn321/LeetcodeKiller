package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution329_LongestIncreasingPathinaMatrix {
    public static void main(String[] args) {

    }

    public int longestIncreasingPath(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int[] x:dp)
            Arrays.fill(x,1);
        int max =0;
        for (int i=0;i<matrix.length;++i){
            for (int j=0;j<matrix[0].length;++j){
                max = Math.max(max,dfs(matrix,i,j,dp));
            }
        }
        return max;
    }
    public int dfs(int[][] matrix, int i, int j,int[][] dp){
        if (dp[i][j]!=1) return dp[i][j];
        if (i-1>=0&&matrix[i-1][j]<matrix[i][j]){
            int next = dfs(matrix,i-1,j,dp);
            dp[i][j] = Math.max(dp[i][j],next+1);
        }
        if (i+1<matrix.length&&matrix[i+1][j]<matrix[i][j]){
            int next = dfs(matrix,i+1,j,dp);
            dp[i][j] = Math.max(dp[i][j],next+1);
        }
        if (j-1>=0&&matrix[i][j-1]<matrix[i][j]){
            int next = dfs(matrix,i,j-1,dp);
            dp[i][j] = Math.max(dp[i][j],next+1);
        }
        if (j+1<matrix[0].length&&matrix[i][j+1]<matrix[i][j]){
            int next = dfs(matrix,i,j+1,dp);
            dp[i][j] = Math.max(dp[i][j],next+1);
        }
        return dp[i][j];
    }
}
