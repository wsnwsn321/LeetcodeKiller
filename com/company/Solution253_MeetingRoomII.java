package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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
    //time:     O(nlogn)
    //space:    O(n)
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        PriorityQueue<Integer> rooms = new PriorityQueue<>();
        rooms.add(intervals[0][1]);
        for (int i=1;i<intervals.length;++i){
            int end = intervals[i-1][1];
            if (intervals[i][0]>rooms.peek()){
                //poll takes logn times
                rooms.poll();
            }
            rooms.add(intervals[i][1]);
        }
        return rooms.size();
    }
}
