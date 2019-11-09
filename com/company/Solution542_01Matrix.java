package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution542_01Matrix {
    public static void main(String[] args) {

    }
    public int[][] updateMatrix(int[][] matrix) {
        int[][] dist = new int[matrix.length][matrix[0].length];
        Queue<int[]> q = new LinkedList<>();
        for (int[] d:dist) Arrays.fill(d,Integer.MAX_VALUE);
        for (int i=0;i<matrix.length;++i){
            for (int j=0;j<matrix[0].length;++j){
                if (matrix[i][j]==0){
                    dist[i][j]=0;
                    q.offer(new int[]{i,j});
                }
            }
        }
        int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        while (q.size()>0){
            int[] cur = q.poll();
            for (int[] d:dir){
                int x = cur[0]+d[0];
                int y = cur[1]+d[1];
                if (x<0||y<0||x>matrix.length-1||y>matrix[0].length-1||dist[x][y]==0) continue;
                if (dist[cur[0]][cur[1]]+1<dist[x][y]){
                    dist[x][y] = dist[cur[0]][cur[1]]+1;
                    q.offer(new int[]{x,y});
                }
            }
        }
        return dist;
    }
}
