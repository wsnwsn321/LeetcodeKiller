package com.company;

import java.util.*;

public class Solution56_MergeIntervals {

    public static void main(String[] args) {

    }
    //time:     O(nlogn)
    //space:    O(n)
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        //runtime of sort:  O(nlogn)
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int i = 0;
        while (i < intervals.length) {
            int end = intervals[i][1];
            int start = intervals[i][0];
            while (end >= intervals[i + 1][0]) {
                end = Math.max(intervals[i + 1][1],end);
                i++;
            }
            res.add(new int[]{start, end});
            i++;
        }
        int[][] res2 = new int[res.size()][2];
        for (int j=0;j<res.size();++j){
            res2[j]=res.get(j);
        }
        return res2;

    }
}
