package com.company;

public class Solution861_ScoreAfterFlippingMatrix {
    public static void main(String[] args) {
    }
    public int matrixScore(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        int res = 1>>(n-1)*m;
        for (int j=1;j<n;++j){
            int cur=0;
            for (int i=0;i<m;++i){
                if (A[i][j]==A[i][0])
                    cur++;
            }
            res+=Math.max(cur,m-cur)*1>>(n-1-j);
        }
        return res;
    }
}
