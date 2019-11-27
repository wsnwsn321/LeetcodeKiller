package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Solution934_ShortestBridge {
    public static void main(String[] args) {

    }
    public int shortestBridge(int[][] A) {
        Queue<int[]> q =new LinkedList<>();
        int index_i=0,index_j=0;
        boolean foundIsland =false;
        for(int i=0;i<A.length;++i){
            for(int j=0;j<A[0].length;++j){
                if(A[i][j]==1) {
                    index_i =i;index_j=j;
                    foundIsland =true;
                    break;
                }
            }
            if(foundIsland) break;
        }
        DFS(index_i,index_j,A,q);
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        int ans=0;
        while (q.size()>0){
            ans++;
            int size = q.size();
            for (int i=0;i<size;++i){
                int[] cur =q.poll();
                for (int p=0;p<dir.length;++p){
                    int x = cur[0]+dir[p][0];
                    int y = cur[1]+dir[p][1];
                    if (x<0||x>=A.length||y<0||y>=A[0].length||A[x][y]==2) continue;
                    if (A[x][y]==1)
                        return ans;
                    q.offer(new int[]{x,y});
                }
            }
        }
        return 1;
    }
    public void DFS(int i,int j, int[][]A,Queue<int[]> q ){
        if(i<0||i>=A.length||j<0||j>=A[0].length||A[i][j]==0||A[i][j]==2) return;
        A[i][j] =2;
        q.add(new int[]{i,j});
        DFS(i+1,j,A,q);
        DFS(i-1,j,A,q);
        DFS(i,j+1,A,q);
        DFS(i,j-1,A,q);
    }

}
