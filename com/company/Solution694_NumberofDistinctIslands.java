package com.company;

import java.util.HashSet;
import java.util.Set;

public class Solution694_NumberofDistinctIslands {
    public static void main(String[] args) {

    }
    public int numDistinctIslands(int[][] grid) {
        Set<String> dup = new HashSet<>();
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] == 1) {
                    StringBuilder sb = new StringBuilder();
                    dfs(grid, i, j, sb, "");
                    if (!dup.contains(sb.toString()))
                        dup.add(sb.toString());
                }
            }
        }
        return dup.size();
    }
    public void dfs(int[][] grid, int i, int j,StringBuilder sb,String dir) {
        if (i < 0 || j < 0 || i > grid.length - 1 || j > grid[0].length - 1 || grid[i][j] == 0) return;
        sb.append(dir);
        grid[i][j] = 0;
        dfs(grid, i + 1, j, sb, "d");
        dfs(grid, i - 1, j, sb, "u");
        dfs(grid, i, j - 1, sb, "l");
        dfs(grid, i, j + 1, sb, "r");
        //indicate back to previous level
        sb.append("b");
    }
}
