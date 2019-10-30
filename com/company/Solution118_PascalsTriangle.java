package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution118_PascalsTriangle {
    public static void main(String[] args) {

    }
    public List<List<Integer>> generate(int numRows) {
        int[][] dp = new int[5][5];
        for (int i=0;i<dp.length;++i){
                dp[i][0] =1;
                dp[i][i]=1;
        }
        for (int i=2;i<dp.length;++i){
            for (int j=2;j<=i;++j){
                if (j!=0&&j!=i)
                    dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i=0;i<dp.length;++i){
            res.add(new ArrayList<>());
            for (int j=0;j<=i;++j){
                res.get(i).add(dp[i][j]);
            }
        }
        return res;
    }
}
