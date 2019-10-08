package com.company.Broadway;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Set;

public class lowestPointsInGrid {
    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        grid[0] = new int[]{9,9,4};
        grid[1] = new int[]{6,6,8};
        grid[2] = new int[]{2,1,1};
        getDistance(grid,1,1,0,2);
    }
    //part 1
    public static int[][] lowestPoint(int[][] grid){
        int[][] res = new int[grid.length][grid[0].length];
        int[][] dis = new int[grid.length][grid[0].length];
        for (int i =0;i<grid.length;++i){
            for (int j=0;j<grid[0].length;++j){
                res[i][j]=grid[i][j];
            }
        }
        for (int i =0;i<grid.length;++i){
            for (int j=0;j<grid[0].length;++j){
                dfs(grid,i,j,res);
            }
        }
        return res;
    }
    public static int dfs(int[][] grid,int i, int j,int[][] res){
        int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        for (int index=0;index<dir.length;++index){
            int x = i+dir[index][0];
            int y = j+dir[index][1];
            if (x<0||y<0||x>grid.length-1||y>grid[0].length-1) continue;
            if (grid[x][y]<res[i][j]) {
                res[i][j] = Math.min(grid[x][y],dfs(grid,x,y,res));
            }
        }
        return res[i][j];

    }

    //follow up
    public static int getDistance(int[][] grid,int start_i, int start_j, int dest_i, int dest_j){
        int[][] dis = new int[grid.length][grid[0].length];
        int[][] visited = new int[grid.length][grid[0].length];
        for (int i =0;i<grid.length;++i){
            for (int j=0;j<grid[0].length;++j){
                dis[i][j]=Integer.MAX_VALUE;
            }
        }
        dis[start_i][start_j]=0;
        return shortestPath(grid,start_i,start_j,dest_i,dest_j,dis,visited);
    }

    public static int shortestPath(int[][] grid,int i, int j, int dest_i, int dest_j,int[][] dis, int[][] visited){
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return dis[o1[0]][o1[1]]-dis[o2[0]][o2[1]];
            }
        });
        pq.add(new int[]{i,j});
        //(m*n)log(m*n)
        while (visited[dest_i][dest_j]!=1){
            int[] cur = pq.poll();
            int cur_i =cur[0];
            int cur_j =cur[1];
            visited[cur_i][cur_j] = 1;
            int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
            for (int index=0;index<dir.length;++index){
                int x = cur_i+dir[index][0];
                int y = cur_j+dir[index][1];
                if (x<0||y<0||x>grid.length-1||y>grid[0].length-1||visited[x][y]==1) continue;
                int newDist = 0;
                if (grid[x][y]>grid[cur_i][cur_j]){
                    newDist = dis[cur_i][cur_j]+grid[x][y]-grid[cur_i][cur_j];
                }
                else newDist = dis[cur_i][cur_j];
                dis[x][y] = Math.min(dis[x][y],newDist);
                pq.add(new int[]{x,y});
            }
        }
        return dis[dest_i][dest_j];
    }

}
