package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution295_FindMedianFromData {
    public static void main(String[] args) {

    }
    class MedianFinder {

        PriorityQueue<Integer> min;
        PriorityQueue<Integer> max;
        int size;
        /** initialize your data structure here. */
        public MedianFinder() {
            min = new PriorityQueue<>();
            max = new PriorityQueue<>(new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2){
                    return o2.compareTo(o1);
                }
            });

        }

        public void addNum(int num) {
            min.add(num);
            max.add(min.poll());
            if(min.size()<max.size()){
                min.add(max.poll());
            }

        }

        public double findMedian() {
            return min.size()>max.size()?(double) min.peek():(min.peek()+max.peek())/2.0;
        }
    }
}
