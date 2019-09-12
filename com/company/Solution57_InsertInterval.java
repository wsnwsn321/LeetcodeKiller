package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution57_InsertInterval {
    class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
    public static void main(String[] args) {

    }
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        int[] times= new int[100000];
        for(Interval x: intervals){
            int start = x.start;
            int end = x.end;
            for(int i =start;i<=end;++i){
                times[i]+=1;
            }
        }
        for(int i=newInterval.start;i<=newInterval.end;++i){
            times[i]+=1;
        }
        List<Interval> res = new ArrayList<>();
        for(int i=0;i<times.length;++i){
            if(times[i]>0){
                Interval temp = new Interval();
                temp.start =i;
                while(i<times.length&&times[i]>0){
                    i++;
                }
                temp.end = i;
                res.add(temp);
            }
        }
        return res;

    }
}
