package com.company;

import java.util.PriorityQueue;

public class Solution973_KClosestPointstoOrigin {
    public static void main(String[] args) {

    }
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]*b[0]+b[1]*b[1]-a[0]*a[0]-a[1]*a[1]);
        for (int[] p:points){
            pq.offer(p);
            if (pq.size()>K){
                pq.poll();
            }
        }
        int[][] res = new int[pq.size()][2];
        for (int i=pq.size()-1;i>=0;--i){
            res[i] = pq.poll();
        }
        return res;
    }
}
