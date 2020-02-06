package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution51_N_Queens {
    private void solve(char[][] curr, int idx, int n, List<List<String>> ret, boolean[] col, boolean[] diag1, boolean[] diag2) {
        if (idx == n) {
            List<String> toAdd = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                toAdd.add(String.valueOf(curr[i]));
            }
            ret.add(toAdd);
            return;
        }

        for (int j = 0; j < n; j++) {
            if (col[j] || diag1[idx + n - j - 1] || diag2[idx + j]) {
                continue;
            }
            col[j] = true;
            diag1[idx + n - j - 1] = true;
            diag2[idx + j] = true;
            curr[idx][j] = 'Q';
            solve(curr, idx + 1, n, ret, col, diag1, diag2);
            curr[idx][j] = '.';
            col[j] = false;
            diag1[idx + n - j - 1] = false;
            diag2[idx + j] = false;
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ret = new ArrayList<>();
        char[][] curr = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                curr[i][j] = '.';
            }
        }
        boolean[] col = new boolean[n];
        boolean[] diag1 = new boolean[2 * n - 1];
        boolean[] diag2 = new boolean[2 * n - 1];
        solve(curr, 0, n, ret, col, diag1, diag2);
        return ret;
    }
}
