package com.company;

import java.util.*;

public class Solution57_InsertInterval {
    class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
    public static void main(String[] args) {

    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int newStart = newInterval[0], newEnd = newInterval[1];
        int idx = 0, n = intervals.length;
        List<int[]> output = new ArrayList<>();

        //keep adding intervals when interval.start<newStart
        while (idx < n && newStart > intervals[idx][0])
            output.add(intervals[idx++]);
        //newStart greater than all intervals
        if (output.isEmpty() || output.get(output.size()-1)[1] < newStart)
            output.add(newInterval);
        //overlapped, get larger end
        else {
            output.get(output.size()-1)[1] = Math.max(output.get(output.size()-1)[1],newEnd);
        }
        //deal with interval.start>newEnd.start cases
        while (idx < n) {
            int[] interval = intervals[idx++];
            int start = interval[0], end = interval[1];
            //if last.end <newInterval.start, no overlap, add directly
            if (output.get(output.size()-1)[1] < start) output.add(interval);
            //overlapped, get the larger end
            else {
                output.get(output.size()-1)[1] = Math.max(output.get(output.size()-1)[1],end);

            }
        }
        return output.toArray(new int[output.size()][2]);

    }
}
