package com.company;

import java.util.Map;
import java.util.TreeMap;

public class Solution729_MyCalendarI {
    public static void main(String[] args) {

    }
    //time:     O(NlogN)
    //space:    O(N)
    class MyCalendar {
        TreeMap<Integer,Integer> map;
        public MyCalendar() {
            map  =new TreeMap<>();
        }

        public boolean book(int start, int end) {
            Integer getKey = map.lowerKey(end);
            if (getKey!=null&&map.get(getKey)>start){
                return false;
            }
            else {
                map.put(start,end);
                return true;
            }
        }
    }
}
