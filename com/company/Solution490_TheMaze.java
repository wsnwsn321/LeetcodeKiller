package com.company;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution490_TheMaze {
    public static void main(String[] args) {

    }
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        if (maze.length == 0) return false;
        int[][] dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        boolean[][] visited = new boolean[ maze.length][maze[0].length];
        Queue<int[]> q = new LinkedList<>();
        q.offer(start);
        visited[start[0]][start[1]] = true;
        while (q.size() > 0) {
            int[] cur = q.poll();
            if (cur[0]==destination[0]&&cur[1]==destination[1])
                return true;
            for (int[] d : dir) {
                int x = cur[0] + d[0];
                int y = cur[1] + d[1];
                while (x >= 0 && y >= 0 && x < maze.length && y < maze[0].length && maze[x][y] != 1) {
                    x += d[0];
                    y += d[1];
                }
                if (!visited[x-d[0]][y-d[1]]) {
                    q.offer(new int[]{x-d[0], y-d[1]});
                    visited[x-d[0]][y-d[1]]= true;
                }
            }
        }
        return false;
    }

}
