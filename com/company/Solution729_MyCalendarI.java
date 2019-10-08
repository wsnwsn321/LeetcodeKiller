package com.company;

import java.util.TreeMap;

public class Solution729_MyCalendarI {
    public static void main(String[] args) {

    }
    //time:     O(NlogN)
    //space:    O(N)
    class MyCalendar {
        TreeMap<Integer,Integer> t;
        public MyCalendar() {
            t = new TreeMap<>();
        }

        public boolean book(int start, int end) {
            if (t.size()==0) {
                t.put(start,end);
                return true;
            }
            //logN
            Integer lowerKey = t.lowerKey(end);
            if (lowerKey==null||t.get(lowerKey)<=start){
                t.put(start,end);
                return true;
            }
            return false;
        }
        public boolean unbook(int start, int end) {
            if (!t.containsKey(start)||t.get(start)!=end) return false;
            t.remove(start);
            return true;
        }
    }
}
