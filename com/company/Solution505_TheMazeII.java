package com.company;

public class Solution505_TheMazeII {
    int minDist = Integer.MAX_VALUE;
    public static void main(String[] args) {

    }
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        DFS(maze,start[0],start[1],destination,minDist);
        return minDist==Integer.MAX_VALUE?-1:minDist;
    }
    public void DFS(int[][] maze, int i, int j, int[]des,int distance){
    }
}
