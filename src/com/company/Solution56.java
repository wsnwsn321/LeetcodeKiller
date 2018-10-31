package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution56 {
    public class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
    }
    public static void main(String[] args) {

    }
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1) return intervals;
        List<Interval> result = new ArrayList<>();
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        int newEnd = 0;
        int newStart =0;
        int max = 0;
        for(int i=0;i<intervals.size();++i){
            newStart = intervals.get(i).start;
            newEnd = intervals.get(i).end;
            while(i+1<intervals.size()&&newEnd>=intervals.get(i+1).start){
                newEnd = Math.max(intervals.get(i+1).end,newEnd);
                ++i;
            }
            Interval temp = new Interval(newStart,newEnd);
            result.add(temp);
        }
        return result;
    }
}
