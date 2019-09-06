package com.company;

public class Solution289_GameofLife {
    public static void main(String[] args) {

    }
    public void gameOfLife(int[][] board) {
        for(int i=0;i<board.length;++i){
            for (int j=0;j<board[0].length;++j){
                int liveN = getLiveNeighbour(i,j,board);
                if (board[i][j]==1&&liveN<2)
                    board[i][j]=-1;
                if (board[i][j]==1&&liveN>=2&&liveN<=3)
                    board[i][j]=1;
                if (board[i][j]==1&&liveN>3)
                    board[i][j]=-1;
                if (board[i][j]==0&&liveN==3)
                    board[i][j]=2;
            }
        }
        for(int i=0;i<board.length;++i){
            for (int j=0;j<board[0].length;++j) {
                if (board[i][j]==-1) board[i][j]=0;
                if (board[i][j]==2) board[i][j]=1;
            }
        }
    }
    public int getLiveNeighbour(int i,int j,int[][] board){
        int liveN=0;
        int[] r =new int[]{-1,0,1};
        int[] c =new int[]{-1,0,1};
        for (int x:r){
            for (int y:c){
                if (i+x>=0&&i+x<board.length&&j+y>=0&&j+y<board[0].length&&(x!=0||y!=0)){
                    int n = board[i+x][j+y];
                    if (n==1||n==-1) liveN+=1;
                }
            }
        }
        return liveN;
    }
}
