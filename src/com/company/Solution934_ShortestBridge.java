package src.com.company;

public class Solution934_ShortestBridge {
    public static void main(String[] args) {

    }
    public int shortestBridge(int[][] A) {
        int index_i=0,index_j=0;
        for(int i=0;i<A.length;++i){
            for(int j=0;j<A[0].length;++j){
                if(A[i][j]==1) {
                    index_i =i;index_j=j;
                    DFS(i,j,A);
                    break;
                }
            }
        }
        return BFS(index_i,index_j,A,0);
    }
    public void DFS(int i,int j, int[][]A){
        A[i][j] =2;
        if(i<0||i>=A.length||j<0||j>=A[0].length) return;
        DFS(i+1,j,A);
        DFS(i-1,j,A);
        DFS(i,j+1,A);
        DFS(i,j-1,A);
    }
    public  int BFS(int i,int j,int[][]A,int distance){
        if(i<0||i>=A.length||j<0||j>=A[0].length||A[i][j]==2) return 0;
        if(A[i][j]==1) return distance-1;
        A[i][j]=2;
        BFS(i+1,j,A,distance+1);
        BFS(i-1,j,A,distance+1);
        BFS(i,j+1,A,distance+1);
        BFS(i,j-1,A,distance+1);
        return distance;
    }

}
