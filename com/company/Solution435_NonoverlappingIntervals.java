package com.company;

import java.util.Arrays;

public class Solution435_NonoverlappingIntervals {
    public static void main(String[] args) {

    }
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0)  return 0;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        int count=1;
        for (int i=1;i<intervals.length;++i){
            if (intervals[i][0]>=end){
                count++;
                end = intervals[i][1];
            }
        }
        return intervals.length-count;
    }
}
