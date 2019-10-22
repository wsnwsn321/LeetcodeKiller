package com.company.Google;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceInGrid {
    public static void main(String[] args) {
        int[][] grid = new int[4][4];
        grid[0] = new int[]{0,0,0,0};
        grid[1] = new int[]{0,0,1,0};
        grid[2] = new int[]{0,1,0,0};
        grid[3] = new int[]{0,0,0,0};
        solution(grid);
    }
    public static int solution(int[][] grid){
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int[][] dist = new int[grid.length][grid[0].length];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0});
        int length=0;
        int[][] dir = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        while (q.size()>0){
            int size = q.size();
            for (int i=0;i<size;++i){
                int[] cur = q.poll();
                int cur_i = cur[0];
                int cur_j = cur[1];
                dist[cur_i][cur_j] =length;
                visited[cur_i][cur_j]=true;
                for (int[] pos:dir){
                    int x = cur_i+pos[0];
                    int y = cur_j+pos[1];
                    if (x<0||y<0||x>grid.length-1||y>grid[0].length-1||visited[x][y]||grid[x][y]==1) continue;
                    q.offer(new int[]{x,y});
                }
            }
            length++;
        }
        return dist[grid.length-1][grid[0].length-1];
    }
}
