package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution937_ReorderDatainLogFiles {
    public static void main(String[] args) {

    }
    public String[] reorderLogFiles(String[] logs) {
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] l1 = o1.split("\\s+",2);
                String[] l2 = o2.split("\\s+",2);
                return l1[1].compareTo(l2[1]);
            }
        });
        List<String> digs = new ArrayList<>();
        for (String x:logs){
            String[] arr = x.split("\\s+",2);
            if (Character.isDigit(arr[1].charAt(0)))
                digs.add(x);
            else
                pq.offer(x);
        }
        String[] res= new String[logs.length];
        int index=0;
        while (pq.size()>0){
            res[index++] = pq.poll();
        }
        for (String x:digs){
            res[index++] = x;
        }
        return res;
    }
}
