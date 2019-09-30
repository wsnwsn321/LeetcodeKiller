package com.company.intuit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Grid01 {
    public static void main(String[] args) {

    }
    //num1
    public List<int[]> validPoint(int[][] grid, int i, int j){
        int[] x = new int[]{-1,1};
        int[] y = new int[]{-1,1};
        int count=0;
        List<int[]> res= new ArrayList<>();
        for (int row=0;row<x.length;++row){
            for(int col=0;col<y.length;++col){
               if (i+x[row]<0||i+x[row]>grid.length-1||j+y[col]<0
                       ||j+y[col]>grid[0].length-1
                       ||grid[i+x[row]][j+y[col]]==1)
                   continue;
                res.add(new int[]{i+x[row],j+y[col]});

            }
        }
        return res;
    }
    //num2
    public boolean canAccess(int[][] grid, int dest_i, int dest_j){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{dest_i,dest_j});
        while (!q.isEmpty()){
            int[] cur = q.remove();
            int[] x = new int[]{-1,1};
            int[] y = new int[]{-1,1};
            for (int row=0;row<x.length;++row){
                for(int col=0;col<y.length;++col){
                    if (cur[0]+x[row]<0||cur[0]+x[row]>grid.length-1||cur[1]+y[col]<0
                            ||cur[1]+y[col]>grid[0].length-1
                            ||grid[cur[0]+x[row]][cur[1]+y[col]]==1||grid[cur[0]+x[row]][cur[1]+y[col]]==-1)
                        continue;
                    grid[cur[0]+x[row]][cur[1]+y[col]]=-1;
                    q.add(new int[]{cur[0]+x[row],cur[1]+y[col]});
                }
            }
        }
        for (int row=0;row<grid.length;++row) {
            for (int col = 0; col < grid[0].length; ++col) {
                if (grid[row][col]==0) return false;
            }
        }
        return true;
    }

    //num3
    int minLength=0;
    int countT=0;
    public int numOfTreaure(int[][] grid, int start_i, int start_j, int dest_i, int dest_j){
        int count = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i=0;i<grid.length;++i){
            for (int x: grid[i]){
                if (x==1) count++;
            }
        }
        countT =count;
        dfs(grid,start_i,start_j,dest_i,dest_j,count,visited,0);
        return minLength;
    }

    public void dfs(int[][] grid, int i, int j, int dest_i, int dest_j, int numOfT, boolean[][] visited,int length){
        if (i<0||j<0||i>grid.length||j>grid[0].length||visited[i][j]||grid[i][j]==1) return ;
        visited[i][j]=true;
        if (i==dest_i&&j==dest_j){
            if (numOfT==countT) minLength = Math.min(length,minLength);
            return;
        }
        if (grid[i][j]==-1) numOfT++;
        dfs(grid,i-1,j,dest_i,dest_j,numOfT,visited,length+1);
        dfs(grid,i+1,j,dest_i,dest_j,numOfT,visited,length+1);
        dfs(grid,i,j+1,dest_i,dest_j,numOfT,visited,length+1);
        dfs(grid,i,j-1,dest_i,dest_j,numOfT,visited,length+1);
    }


}
