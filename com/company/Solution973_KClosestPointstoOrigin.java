package com.company;

import java.util.PriorityQueue;

public class Solution973_KClosestPointstoOrigin {
    public static void main(String[] args) {

    }
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1]));
        for (int[] point:points){
            pq.offer(point);
            if (pq.size()>K)
                pq.poll();
        }
        int[][] res = new int[pq.size()][2];
        int index=0;
        while (pq.size()>0){
            res[index++] = pq.poll();
        }
        return res;
    }
}
