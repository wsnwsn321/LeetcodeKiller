package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution59_SpiralMatrixII {
    public static void main(String[] args) {

    }
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        if (n== 0) {
            return null;
        }
        if (n==1){
            return new int[][]{{1}};
        }

        int rowBegin = 0;
        int rowEnd = res.length-1;
        int colBegin = 0;
        int colEnd = res[0].length - 1;
        int cur=0;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse Right
            for (int j = colBegin; j <= colEnd; j ++) {
                res[rowBegin][j] = cur++;
            }
            rowBegin++;

            // Traverse Down
            for (int j = rowBegin; j <= rowEnd; j ++) {
                res[j][colEnd] = cur++;
            }
            colEnd--;

            if (rowBegin <= rowEnd) {
                // Traverse Left
                for (int j = colEnd; j >= colBegin; j --) {
                    res[rowEnd][j] = cur++;
                }
            }
            rowEnd--;

            if (colBegin <= colEnd) {
                // Traver Up
                for (int j = rowEnd; j >= rowBegin; j --) {
                    res[j][colBegin] = cur++;
                }
            }
            colBegin ++;
        }

        return res;
    }
}
