package com.company;

import java.util.*;

public class Solution1197_MinimumKnightMoves {
    public static void main(String[] args) {

    }
    private final int[][] dir = new int[][] {{2, 1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}, {1, -2}, {2, -1}};
    public int minKnightMoves(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        Set<String> seen = new HashSet<>();
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0});
        int step=0;
        while (q.size()>0) {
            int size = q.size();
            for (int k = 0; k< size; ++k) {
                int[] cur = q.poll();
                if (cur[0] == x && cur[1] == y)
                    return step;
                for (int[] d : dir) {
                    int i = cur[0] + d[0];
                    int j = cur[1] + d[1];
                    String index = i + "," + j;
                    if (i >= -2 && j >= -2 && !seen.contains(index)) {
                        q.offer(new int[]{i, j});
                        seen.add(index);
                    }
                }
            }
            step++;
        }
        return -1;
    }

}
