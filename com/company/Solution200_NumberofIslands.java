package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Solution200_NumberofIslands {
    public static void main(String[] args) {

    }
    //time:     O(nm)
    //space:    O(nm)
    public  int numIslands(char[][] grid) {
//        int count =0;
//        for (int i=0;i<grid.length;++i){
//            for (int j=0;j<grid[0].length;++j){
//                if (grid[i][j]=='1'){
//                    DFS(grid,i,j);
//                    count++;
//                }
//            }
//        }
//        return count;
        if (grid.length==0) return 0;
        int count=0;
        Queue<int[]> q = new LinkedList<>();
        int[][] dir = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        for (int i=0;i<grid.length;++i){
            for (int j=0;j<grid[0].length;++j){
                if (grid[i][j]=='1'){
                    count++;
                    q.offer(new int[]{i,j});
                    while (q.size()>0){
                        int[] cur = q.poll();
                        grid[cur[0]][cur[1]] =0;
                        for (int[] d:dir){
                            int x = cur[0]+d[0];
                            int y = cur[1]+d[1];
                            if (x>=0&&y>=0&&x<grid.length&&y<grid[0].length&&grid[x][y]=='1'){
                                q.offer(new int[]{x,y});
                                grid[x][y] =0;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
    public void DFS(char[][] grid, int i, int j){
        if (i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]=='0') return;
        grid[i][j]='0';
        DFS(grid,i+1,j);
        DFS(grid,i-1,j);
        DFS(grid,i,j+1);
        DFS(grid,i,j-1);
    }


}
