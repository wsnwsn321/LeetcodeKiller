package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution54 {
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
        spiralOrder(r);

    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix.length==0) return result;
        N = matrix[0].length;
        M = matrix.length;
        if(M==1){
            for(int x:matrix[0]){
                result.add(x);
            }
            return result;
        }
        if(N==1){
            for(int i=0;i<M;++i){
                result.add(matrix[i][0]);
            }
            return result;
        }
        int count=0;
        int i=0;
        while(count<M*N){
            cycle(i,i,matrix,result);
            count= result.size();
            i++;
        }
        return result;
    }

    public static void cycle(int row,int hstart,int[][] matrix, List<Integer> r){
        for(int i=hstart;i<N-hstart;++i){
            r.add(matrix[row][i]);
        }
        int column = N-hstart-1;
        for(int j = row+1;j<M-row;++j){
            r.add(matrix[j][column]);
        }
        for(int i=N-hstart-2;i>hstart;--i){
            r.add(matrix[M-row-1][i]);
        }
        for(int j = M-row-1;j>row;--j){
            if(hstart!=column) r.add(matrix[j][hstart]);
        }
    }
}
