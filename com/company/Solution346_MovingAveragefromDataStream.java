package com.company;

import java.util.*;

public class Solution346_MovingAveragefromDataStream {
    public static void main(String[] args) {

    }
    class MovingAverage {

        /** Initialize your data structure here. */
        Queue<Integer> q;
        int size;
        double sum=0;
        public MovingAverage(int size) {
            this.size = size;
            q= new LinkedList<>();
        }

        public double next(int val) {
            q.offer(val);
            sum+=val;
            if (q.size()>size){
                sum-=q.poll();
            }
            return sum/q.size();
        }
    }
}
