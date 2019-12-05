package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution986_IntervalListIntersections {
    public static void main(String[] args) {

    }
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> resList = new ArrayList<>();
        int i=0,j=0;
        while (i<A.length&&j<B.length){
            int[] a = A[i];
            int[] b = B[j];
            int start = Math.max(a[0],b[0]);
            int end = Math.min(a[1],b[1]);
            if (start<=end){
                resList.add(new int[]{start,end});
            }
            if (a[1]<b[1])
                i++;
            else
                j++;
        }
        return resList.toArray(new int[0][]);
    }
}
