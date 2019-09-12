package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution253_MeetingRoomII {
    public class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
    }
    public static void main(String[] args) {

    }
    public int minMeetingRooms(Interval[] intervals) {
        Arrays.sort(intervals,new Comparator<Interval>(){
            @Override
            public int compare(Interval i1, Interval i2){
                return i1.start - i2.start;
            }
        });
        PriorityQueue<Integer> p = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        p.add(intervals[0].end);
        for(Interval i:intervals){
            int start = i.start;
            if(start<p.peek())
                p.poll();
            p.add(i.end);
        }
        return p.size();

    }
}
