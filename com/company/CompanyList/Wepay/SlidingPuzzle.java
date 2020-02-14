package com.company.CompanyList.Wepay;

import java.util.*;

public class SlidingPuzzle {
    public static void main(String[] args) {
        slidingPuzzle(new int[][]{{1,2,3},{4,0,5}},2,3);
    }
    public static int slidingPuzzle(int[][] board, int m,int n) {
        String target = "";
        for (int i = 0; i < m * n; ++i) {
            target += (char) ('a' + i);
        }
        String start = "";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                start += (char) ('a' + board[i][j]);
            }
        }
        Set<String> visited = new HashSet<>();
        // all the positions 0 can be swapped to
        int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        visited.add(start);
        int res = 0;
        while (!queue.isEmpty()) {
            // level count, has to use size control here, otherwise not needed
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String cur = queue.poll();
                if (cur.equals(target)) {
                    return res;
                }
                int zero = cur.indexOf('0');
                // swap if possible
                for (int[] dir : dirs) {
                    int x = zero / n + dir[0];
                    int y = zero % n + dir[1];
                    if (x < 0 || y < 0 || x >= m || y >= n) continue;
                    int newPos = x * n + y;
                    String next = swap(cur, zero, newPos);
                    if (visited.contains(next)) {
                        continue;
                    }
                    visited.add(next);
                    queue.offer(next);

                }
            }
            res++;
        }
        return -1;
    }

    private static String swap(String str, int i, int j) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }

}
