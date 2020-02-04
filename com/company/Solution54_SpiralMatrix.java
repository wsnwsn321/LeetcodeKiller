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
        int[][] r = new int[][]{a,b,c,d};
        //spiralOrder(r);

    }
    //time:     O(n)
    //space:    O(n)
    public  List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0) return res;
        int startRow = 0, endRow = matrix.length - 1;
        int startCol = 0, endCol = matrix[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            //left->right
            for (int i = startCol; i <= endCol; ++i)
                res.add(matrix[startRow][i]);
            startRow++;
            if (startCol > endCol || startRow > endRow) break;

            //up->down
            for (int i = startRow; i <= endRow; ++i)
                res.add(matrix[i][endCol]);
            endCol--;
            if (startCol > endCol || startRow > endRow) break;

            //right->left
            for (int i = endCol; i >= startCol; --i)
                res.add(matrix[endRow][i]);
            endRow--;
            if (startCol > endCol || startRow > endRow) break;

            //down->up
            for (int i = endRow; i >= startRow; --i)
                res.add(matrix[i][startCol]);
            startCol++;
            if (startCol > endCol || startRow > endRow) break;
        }
        return res;
    }



}
