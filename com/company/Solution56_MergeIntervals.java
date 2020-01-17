package com.company;

import java.util.*;

public class Solution56_MergeIntervals {

    public static void main(String[] args) {

    }
    //time:     O(nlogn)
    //space:    O(n)
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return intervals;
        List<int[]> resList = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int start = intervals[0][0], end = intervals[0][1];
        for (int i = 1; i < intervals.length; ++i) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][0]);
            } else {
                resList.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        resList.add(new int[]{start,end});
        return resList.toArray(new int[0][]);
    }
}
