package com.company;

public class Solution252_MeetingRooms {
    public class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }
    public static void main(String[] args) {

    }
    public boolean canAttendMeetings(Interval[] intervals) {
        int[] times = new int[1000000];
        for(Interval x: intervals){
            for(int i = x.start;i<x.end;++i){
                if(times[i]==1) return false;
                else times[i] = 1;
            }
        }
        return true;
    }
}
