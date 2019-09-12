package com.company;

import java.util.*;

public class Solution346_MovingAveragefromDataStream {
    public static void main(String[] args) {

    }
    class MovingAverage {
        public double previousSum = 0.0;
        Queue<Integer> q = new LinkedList<>();
        int size=0;
        /** Initialize your data structure here. */
        public MovingAverage(int size) {
            this.size=size;
        }

        public double next(int val) {
            int total  = 0;
            q.add(val);
            if (q.size()>size) {
                previousSum-=q.poll();

            }

            previousSum+=val;
            return previousSum/q.size();
        }
    }
}
