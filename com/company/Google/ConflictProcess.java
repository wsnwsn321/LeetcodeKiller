package com.company.Google;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ConflictProcess {
    public static void main(String[] args) {
        int[][] p = new int[][]{{1,2,5},{2,6,11},{3,5,6},{4,3,8}};
        addProcess(p);

    }

    public static boolean[] addProcess(int[][] schedule ){
       boolean[] res = new boolean[schedule.length+1];
        Arrays.sort(schedule,(a,b)->a[1]-b[1]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(schedule[0][2]);
        res[schedule[0][0]] = true;
        for (int i=1;i<schedule.length;++i){
            if (schedule[i][1]>=pq.peek()){
                res[schedule[i][0]] =true;
                pq.poll();
                pq.offer(schedule[i][2]);
            }
            else {
                res[schedule[i][0]]= false;
            }
        }
        return  res;
    }

}
