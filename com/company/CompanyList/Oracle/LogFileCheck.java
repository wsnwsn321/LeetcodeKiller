package com.company.CompanyList.Oracle;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LogFileCheck {
    public static void main(String[] args) {

    }
    public boolean checkFile(String file, int start, int end, String user){
        Map<String, TreeMap<Integer[],String>> log = new HashMap<>();
        if (!log.containsKey(file)){
            TreeMap<Integer[],String> temp = new TreeMap<>(new Comparator<Integer[]>() {
                @Override
                public int compare(Integer[] o1, Integer[] o2) {
                    return o1[0] - o2[0];
                }
            });
            temp.put(new Integer[]{start,end},user);
            log.put(file,temp);
            return false;
        }
        else {
            TreeMap<Integer[],String> temp = log.get(file);
            Integer[] previous = temp.floorKey(new Integer[]{start,end});
            Integer[] next = temp.ceilingKey(new Integer[]{start,end});
            //overlap with previous space
            if (previous[1]>start&&!temp.get(previous).equals(user))
                return false;
            if (next[0]<end&&!temp.get(next).equals(user))
                return false;
            temp.put(new Integer[]{start,end},user);
            log.put(file,temp);
            return true;

        }
    }
}
