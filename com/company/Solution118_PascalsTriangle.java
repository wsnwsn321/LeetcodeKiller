package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution118_PascalsTriangle {
    public static void main(String[] args) {

    }
    public List<List<Integer>> generate(int numRows) {
        int[][] dp =new int[numRows][numRows];
        for(int i=0;i<dp.length;++i){
            for (int j=0;j<numRows;++j){
                if(j==0||i==j) dp[i][j] =1;
                else if(j<i){
                    dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
                }
            }
        }
        List<List<Integer>> ret = new ArrayList<>();
        for(int i=0;i<numRows;++i){
            ret.add(new ArrayList<>());
            for(int j=0;j<=i;++j){
                ret.get(i).add(dp[i][j]);
            }
        }
        return ret;


    }
}
