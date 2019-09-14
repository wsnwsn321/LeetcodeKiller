package com.company;

import java.util.*;

public class Solution54_SpiralMatrix {
    static int N;
    static int M;
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        int[] b = new int[]{6,7,8};
        int[] c = new int[]{4,5,6};
        int[] d = new int[]{13,14,15};
        int[] e = new int[]{13,14,15,16};
        //int[][] r = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
//        int[] a = new int[]{1,2,3,4};
//        int[] b = new int[]{5,6,7,8};
        int[][] r = new int[][]{a,b,c,d};
        //spiralOrder(r);

    }
    //time:     O(n)
    //space:    O(n)
    public  List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        if (matrix.length == 0) {
            return res;
        }

        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse Right
            for (int j = colBegin; j <= colEnd; j ++) {
                res.add(matrix[rowBegin][j]);
            }
            rowBegin++;

            // Traverse Down
            for (int j = rowBegin; j <= rowEnd; j ++) {
                res.add(matrix[j][colEnd]);
            }
            colEnd--;

            if (rowBegin <= rowEnd) {
                // Traverse Left
                for (int j = colEnd; j >= colBegin; j --) {
                    res.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;

            if (colBegin <= colEnd) {
                // Traver Up
                for (int j = rowEnd; j >= rowBegin; j --) {
                    res.add(matrix[j][colBegin]);
                }
            }
            colBegin ++;
        }

        return res;
    }



}
