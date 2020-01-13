package com.company;

import java.util.*;

public class Solution57_InsertInterval {

    public static void main(String[] args) {

    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int newStart = newInterval[0];
        int newEnd = newInterval[1];
        //add all intervals with smaller start time into res
        int index = 0;
        while (index < intervals.length && newStart > intervals[index][0])
            res.add(intervals[index++]);

        //if newStart > intervals[index][end]
        if (res.isEmpty() || newStart > res.get(res.size() - 1)[1]) {
            res.add(newInterval);
        } else {
            res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], newEnd);
        }
        //deal with interval.start>newEnd.start cases
        while (index < intervals.length) {
            int[] cur = intervals[index++];
            //if last.end <newInterval.start, no overlap, add directly
            if (res.get(res.size() - 1)[1] < cur[0])
                res.add(cur);
                //overlapped, get the larger end
            else {
                res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], cur[1]);
            }
        }
        return res.toArray(new int[res.size()][2]);
    }
}
