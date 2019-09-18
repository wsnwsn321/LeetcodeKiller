package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Solution252_MeetingRooms {

    public static void main(String[] args) {

    }
    //time:     O(n)
    //space:    O(1)
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for (int i=1;i<intervals.length;++i) {
            int end = intervals[i - 1][1];
            if (intervals[i][0] < end) return false;

        }
        return true;
    }

}
