package com.company;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution1102_PathWithMaximumMinimumValue {
    public static void main(String[] args) {

    }
    public int maximumMinimumPath(int[][] A) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[2]-a[2]);
        pq.offer(new int[]{0,0,A[0][0]});
        int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        int res =Integer.MAX_VALUE;
        while (pq.size()>0){
            int[] cur = pq.poll();
            res = Math.min(res,cur[2]);
            if (cur[0]==A.length-1&&cur[1]==A[0].length-1)
                return res;
            for (int i=0;i<dir.length;++i){
                int x = cur[0]+dir[i][0];
                int y = cur[1]+dir[i][1];
                if (x<0||x>=A.length||y<0||y>=A[0].length||A[x][y]==-1)
                    continue;
                pq.offer(new int[]{x,y,A[x][y]});
                A[x][y]=-1;
            }
        }
        return -1;
    }
}
