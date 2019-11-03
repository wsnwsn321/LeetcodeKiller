package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution295_FindMedianFromData {
    public static void main(String[] args) {

    }
    class MedianFinder {

        /** initialize your data structure here. */
        PriorityQueue<Integer> max;
        PriorityQueue<Integer> min;
        int size;
        public MedianFinder() {
            max = new PriorityQueue<>((a,b)->b-a);
            min = new PriorityQueue<>();
        }

        public void addNum(int num) {
            max.offer(num);
            min.offer(max.poll());
            if (min.size()>max.size())
                max.offer(min.poll());
            size++;
        }

        public double findMedian() {
            if (size%2==1){
                return min.peek();
            }
            else
                return (double) (min.peek()+max.peek())/2.0;
        }
    }
}
