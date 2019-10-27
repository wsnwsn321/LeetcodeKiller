package com.company;

import java.util.*;

public class Solution56_MergeIntervals {

    public static void main(String[] args) {

    }
    //time:     O(nlogn)
    //space:    O(n)
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int i=0;
        while (i<intervals.length){
            int start = intervals[i][0];
            int end = intervals[i][1];
            while (i+1<intervals.length&&end>=intervals[i+1][0]){
                end = Math.max(end,intervals[i+1][1]);
                i++;
            }
            res.add(new int[]{start,end});
        }
        int[][] res2 = new int[res.size()][2];
        for (int j=0;j<res.size();++j){
            res2[j]=res.get(j);
        }
        return res2;

    }
}
