package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution295_FindMedianFromData {
    public static void main(String[] args) {

    }
    class MedianFinder {

        /** initialize your data structure here. */
        PriorityQueue<Integer> maxHeap;
        PriorityQueue<Integer> minHeap;
        public MedianFinder() {
            maxHeap = new PriorityQueue<>((a,b)->b-a);
            minHeap = new PriorityQueue<>();
        }

        public void addNum(int num) {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
            if (minHeap.size() > maxHeap.size())
                maxHeap.offer(minHeap.poll());
        }

        public double findMedian() {
            if ((maxHeap.size()+minHeap.size())%2==0){
                return ((double)(maxHeap.peek()+minHeap.peek()))/2.0;
            }
            else
                return maxHeap.peek();
        }
    }
}
