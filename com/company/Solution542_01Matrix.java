package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution542_01Matrix {
    public static void main(String[] args) {

    }
    public int[][] updateMatrix(int[][] matrix) {
        int[][] ret = new int[matrix.length][matrix[0].length];
        for (int[] x:ret){
            Arrays.fill(x,-1);
        }
        Queue<int[]> q = new LinkedList<>();
        for (int i=0;i<matrix.length;++i){
            for (int j=0;j<matrix[0].length;++j){
                if (matrix[i][j]==0){
                    ret[i][j]=0;
                    q.add(new int[]{i,j});
                }
            }
        }
        int[] dr = new int[]{-1, 0, 1, 0};
        int[] dc = new int[]{0, -1, 0, 1};
        while (!q.isEmpty()){
            int size = q.size();
            while (size>0){
                int[] index = q.poll();
                int i = index[0];
                int j = index[1];
                for (int k = 0; k < 4; ++k) {
                    int nr = i + dr[k];
                    int nc = j + dc[k];
                    if (0 <= nr && nr < matrix.length && 0 <= nc && nc < matrix[0].length && ret[nr][nc] == -1) {
                        ret[nr][nc]=ret[i][j]+1;
                        q.offer(new int[]{nr,nc});
                    }
                }
                size--;
            }
        }
        return ret;

    }
}
