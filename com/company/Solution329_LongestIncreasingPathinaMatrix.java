package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Solution329_LongestIncreasingPathinaMatrix {
    public static void main(String[] args) {

    }

    public int longestIncreasingPath(int[][] matrix) {
        int max=1;
        if (matrix.length==0) return 0;
        int dp[][] = new int[matrix.length][matrix[0].length];
        for (int i=0;i<matrix.length;++i){
            for (int j=0;j<matrix[0].length;++j){
                max = Math.max(max,dfs(matrix,i,j,dp));
            }
        }
        return max;
    }
    public int dfs(int[][] matrix, int i, int j,int[][] dp){
        int max =1;
        int length=1;
        if (dp[i][j]!=0) return -1;
        if(i+1 < matrix.length && matrix[i+1][j] > matrix[i][j]) {
            length = Math.max(length, 1 + dfs(matrix,i+1,j,dp));
        }
        if(i-1 >=0 && matrix[i-1][j] > matrix[i][j]) {
            length = Math.max(length, 1 + dfs(matrix,i-1,j,dp));
        }
        if(j+1 <matrix[0].length && matrix[i][j+1] > matrix[i][j]) {
            length = Math.max(length, 1 + dfs(matrix,i,j+1,dp));
        }
        if(j-1 >=0 && matrix[i][j-1] > matrix[i][j]) {
            length = Math.max(length, 1 + dfs(matrix,i,j-1,dp));
        }
        dp[i][j] =length;
        return length;
    }
}
