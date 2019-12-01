package com.company;

import java.util.*;

public class Solution56_MergeIntervals {

    public static void main(String[] args) {

    }
    //time:     O(nlogn)
    //space:    O(n)
    public int[][] merge(int[][] intervals){
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> resList = new ArrayList<>();
        if(intervals.length == 0 || intervals == null) return resList.toArray(new int[0][]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i=1;i<intervals.length;++i){
            if (intervals[i][0]<=end){
                end = Math.max(end,intervals[i][i]);
            }
            else {
                resList.add(new int[]{start,end});
                start = intervals[i][0];
                end  = intervals[i][1];
            }
        }
        resList.add(new int[]{start,end});
        return resList.toArray(new int[0][]);
    }
}
