package com.company.Broadway;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Set;

public class lowestPointsInGrid {
    public static void main(String[] args) {
        int[][] grid = new int[4][4];
        grid[0] = new int[]{10,7,9,3};
        grid[1] = new int[]{12,9,2,4};
        grid[2] = new int[]{4,7,6,5};
        grid[3] = new int[]{3,8,1,6};
        lowestPoints(grid);
    }
    //time: O(m*n)
    public static int[][][] lowestPoints(int[][] grid){
        int[][][] res = new int[grid.length][grid[0].length][3];
        int[][] res2 = new int[grid.length][grid[0].length];
        for (int i=0;i<grid.length;++i){
            for (int j=0;j<grid[0].length;++j){
                res[i][j][0] = grid[i][j];
                res[i][j][1] = i;
                res[i][j][2] = j;
                res2[i][j] = grid[i][j];
            }
        }
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i=0;i<grid.length;++i){
            for (int j=0;j<grid[0].length;++j){
                dfsMinValue(grid,i,j,res,visited);
            }
        }
        for (int i=0;i<res.length;++i){
            for (int j=0;j<res[0].length;++j){
                System.out.print("("+res[i][j][1]+","+res[i][j][2]+")");
            }
            System.out.println();
        }
        for (int i=0;i<res.length;++i){
            for (int j=0;j<res[0].length;++j){
                System.out.print(res[i][j][0]+",");
            }
            System.out.println();
        }
        return res;
    }

    //每个格子找最小的邻居
    public static int[] dfsMinValue(int[][] grid, int i, int j, int[][][] res, boolean[][]visited) {
        int[][] dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int minValue = Integer.MAX_VALUE;
        if (visited[i][j]) return res[i][j];
        int next_x=i,next_y=j;
        //find min neighbour
        for (int row = 0; row < dir.length; ++row) {
            int x = i + dir[row][0];
            int y = j + dir[row][1];
            if (x < 0 || y < 0 || x > grid.length - 1 || y > grid[0].length - 1 || grid[x][y] > grid[i][j]) continue;
            if (minValue>grid[x][y]){
                minValue = grid[x][y];
                next_x = x;
                next_y=y;
            }
        }
        //self is the lowest point
        if (next_x==i&&next_y==j) return res[i][j];
        visited[i][j] = true;
        int[] nextV = dfsMinValue(grid,next_x,next_y,res,visited);
        if (res[i][j][0]>nextV[0]){
            res[i][j][0] = nextV[0];
            res[i][j][1] = nextV[1];
            res[i][j][2] = nextV[2];
        }
        return res[i][j];
    }

    //正常的dfs
    public static int dfs(int[][] grid, int i, int j, int[][] res, boolean[][]visited){
        int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        for (int row=0;row<dir.length;++row){
            int x = i+dir[row][0];
            int y = j+dir[row][1];
            if (x<0||y<0||x>grid.length-1||y>grid[0].length-1||grid[x][y]>grid[i][j]) continue;
            if (visited[i][j]) return res[i][j];
            res[i][j] = Math.min(res[i][j],dfs(grid,x,y,res,visited));
        }
        visited[i][j]=true;
        return res[i][j];
    }
    //follow up
    //time: O(m*n)
    public static int getDistance(int[][] grid,int start_i, int start_j, int dest_i, int dest_j){
        int[][] dis = new int[grid.length][grid[0].length];
        int[][] visited = new int[grid.length][grid[0].length];
        for (int i =0;i<grid.length;++i){
            for (int j=0;j<grid[0].length;++j){
                dis[i][j]=Integer.MAX_VALUE;
            }
        }
        dis[start_i][start_j]=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->dis[a[0]][a[1]]-dis[b[0]][b[1]]);
        pq.offer(new int[]{start_i,start_j});
        int[][] dir = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        while (dis[dest_i][dest_j]==Integer.MAX_VALUE){
            int[] cur = pq.poll();
            int cur_i = cur[0];
            int cur_j = cur[1];
            visited[cur_i][cur_j]=1;
            for (int[] pos:dir){
                int x = cur_i+pos[0];
                int y = cur_j+pos[1];
                if (x<0||y<0||x>grid.length-1||y>grid[0].length-1||visited[x][y]==1) continue;
                int newDistance;
                if (grid[x][y]>grid[cur_i][cur_j]){
                    newDistance = dis[cur_i][cur_j]+grid[x][y]-grid[cur_i][cur_j];
                }
                else
                    newDistance=dis[cur_i][cur_j];
                dis[x][y] = Math.min(dis[x][y],newDistance);
                pq.offer(new int[]{x,y});
            }
        }
        return dis[dest_i][dest_j];
    }


}
