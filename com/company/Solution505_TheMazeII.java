package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution505_TheMazeII {
    public static void main(String[] args) {

    }
    public int shortestDistance(int[][] maze, int[] start, int[] dest) {
        int[][] distance = new int[maze.length][maze[0].length];
        for (int[] row: distance)
            Arrays.fill(row, Integer.MAX_VALUE);
        distance[start[0]][start[1]] = 0;
        int[][] dirs={{0, 1} ,{0, -1}, {-1, 0}, {1, 0}};
        Queue< int[] > queue = new LinkedList< >();
        queue.add(start);
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int i=cur[0],j=cur[1];
            for (int[] d:dirs){
                int x = i+d[0];
                int y = j+d[1];
                int count=0;
                while (x>=0&&y>=0&&x<maze.length&&y<maze[0].length&&maze[x][y]==0){
                    x+=d[0];
                    y+=d[1];
                    count++;
                }
                //update distance grid if found a shorter distance
                if (distance[i][j]+count<distance[x-d[0]][y-d[1]]){
                    distance[x-d[0]][y-d[1]] = distance[i][j]+count;
                    queue.offer(new int[]{x-d[0],y-d[1]});
                }
            }
        }
        return distance[dest[0]][dest[1]] == Integer.MAX_VALUE ? -1 : distance[dest[0]][dest[1]];
    }
}
