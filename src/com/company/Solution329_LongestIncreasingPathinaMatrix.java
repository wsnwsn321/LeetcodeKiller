package src.com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Solution329_LongestIncreasingPathinaMatrix {
    public static void main(String[] args) {

    }

    public int longestIncreasingPath(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];

        int max = Integer.MIN_VALUE;
        int max_i = 0, max_j = 0;
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    max_i = i;
                    max_j = j;
                }
            }
        }
        int ret = 0;
        int[] dr = new int[]{-1, 0, 1, 0};
        int[] dc = new int[]{0, -1, 0, 1};
        dp[max_i][max_j] = 1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{max_i, max_j});
        while (!q.isEmpty()) {
            int size = q.size();
            while (size > 0) {
                int[] index = q.poll();
                int i = index[0];
                int j = index[1];
                for (int k = 0; k < 4; ++k) {
                    int nr = i + dr[k];
                    int nc = j + dc[k];
                    if (0 <= nr && nr < matrix.length && 0 <= nc && nc < matrix[0].length && dp[nr][nc] == 0) {
                        dp[nr][nc] = 1;
                        if (matrix[nr][nc] < matrix[i][j] && dp[i][j] + 1 > dp[nr][nc]) {
                            dp[nr][nc] = dp[i][j] + 1;
                            ret = Math.max(ret, dp[nr][nc]);
                            q.offer(new int[]{nr, nc});
                        }
                    }
                    size--;
                }
            }
        }
        return ret;
    }
}
