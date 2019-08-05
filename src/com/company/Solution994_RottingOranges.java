package src.com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Solution994_RottingOranges {
    public static void main(String[] args) {

    }
    public int orangesRotting(int[][] grid) {
        int step=0;
        Queue<int[]> q = new LinkedList<>();
        for (int i=0;i<grid.length;++i){
            for (int j=0;j<grid[0].length;++j){
                if (grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
            }
        }
        int[] dr = new int[]{-1, 0, 1, 0};
        int[] dc = new int[]{0, -1, 0, 1};
        while (!q.isEmpty()){
            int size = q.size();
            while(size>0){
                int[] index = q.poll();
                int i=index[0];
                int j = index[1];
                for (int k = 0; k < 4; ++k) {
                    int nr = i + dr[k];
                    int nc = j + dc[k];
                    if (0 <= nr && nr < grid.length && 0 <= nc && nc < grid[0].length && grid[nr][nc] == 1) {
                        grid[nr][nc]=2;
                        q.offer(new int[]{nr,nc});
                    }
                }
                size--;
            }
            step++;
        }
        for (int[] row: grid)
            for (int v: row)
                if (v == 1)
                    return -1;
        return step;
    }
}
