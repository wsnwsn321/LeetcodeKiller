package com.company;

import java.util.*;

public class Solution346_MovingAveragefromDataStream {
    public static void main(String[] args) {

    }
    class MovingAverage {
        int size =0;
        int sum =0;
        Queue<Integer> q;
        /** Initialize your data structure here. */
        public MovingAverage(int size) {
            this.size = size;
            q = new LinkedList<>();
        }

        public double next(int val) {
            q.offer(val);
            sum+=val;
            if (q.size()>size)
                sum-=q.poll();
            return (double)(sum/q.size());
        }
    }

}
