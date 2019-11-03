package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution253_MeetingRoomII {

    public static void main(String[] args) {

    }
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(intervals[0][1]);
        for (int i=1;i<intervals.length;++i){
            if (pq.peek()<=intervals[i][0])
                pq.poll();
            pq.offer(intervals[i][1]);
        }
        return pq.size();
    }

}
