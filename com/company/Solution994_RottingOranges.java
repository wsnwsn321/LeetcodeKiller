package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Solution994_RottingOranges {
    public static void main(String[] args) {

    }
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int freshNum = 0;
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }
                if (grid[i][j] == 1) {
                    freshNum++;
                }
            }
        }
        int ans = 0;
        if (freshNum==0) return ans;
        int[][] dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (q.size() > 0) {
            int size = q.size();
            while (size > 0) {
                int[] cur = q.poll();
                for (int i = 0; i < 4; ++i) {
                    int x = cur[0] + dir[i][0];
                    int y = cur[1] + dir[i][1];
                    if (x < 0 || y < 0 || x > grid.length - 1 || y > grid[0].length - 1 || grid[x][y] != 1) continue;
                    grid[x][y] = 2;
                    freshNum--;
                    q.offer(new int[]{x, y});
                }
                size--;
            }
            if (q.size()>0) ans++;
            if (freshNum==0) return ans;
        }
        return -1;
    }
}
