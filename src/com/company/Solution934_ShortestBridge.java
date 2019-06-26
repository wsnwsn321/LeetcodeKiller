package src.com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Solution934_ShortestBridge {
    public static void main(String[] args) {

    }
    public int shortestBridge(int[][] A) {
        Queue<int[]> q =new LinkedList<>();
        int index_i=0,index_j=0;
        boolean foundIsland =false;
        for(int i=0;i<A.length;++i){
            for(int j=0;j<A[0].length;++j){
                if(A[i][j]==1) {
                    index_i =i;index_j=j;
                    q.add(new int[]{i,j});
                    foundIsland =true;
                    break;
                }
            }
            if(foundIsland) break;
        }
        DFS(index_i,index_j,A,q);
        int distance=0;
        int[] d= {0,1,-1};
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;++i) {
                int[] pos = q.poll();
                for (int k = 0; k < 4; ++k) {
                    int x = 0, y = 0;
                    if (k < 2) {
                        x = pos[0] + d[0];
                        y = pos[1] + d[k + 1];
                    } else {
                        x = pos[0] + d[k - 1];
                        y = pos[1] + d[0];
                    }
                    if (x < 0 || x >= A.length || y < 0 || y >= A[0].length) continue;
                    if (A[x][y] == 1) return distance;
                    else if (A[x][y] == 2) continue;
                    else {
                        A[x][y] = 2;
                        q.add(new int[]{x, y});
                    }
                }
            }
            distance++;
        }
        return distance;
    }
    public void DFS(int i,int j, int[][]A,Queue<int[]> q ){
        if(i<0||i>=A.length||j<0||j>=A[0].length||A[i][j]==0||A[i][j]==2) return;
        A[i][j] =2;
        q.add(new int[]{i,j});
        DFS(i+1,j,A,q);
        DFS(i-1,j,A,q);
        DFS(i,j+1,A,q);
        DFS(i,j-1,A,q);
    }

}
