package com.company.CompanyList.OOD;

import java.util.Random;

public class OOD_DesignTicTacToe {
    static class TicTacToe {
        int[][] board;
        int[] colScore;
        int[] rowScore;
        int[] diagScore;
        int n;
        int totalMove=0;
        /** Initialize your data structure here. */
        public TicTacToe(int n) {
            colScore = new int[n];
            rowScore = new int[n];
            diagScore = new int[2];
            board = new int[n][n];
            this.n = n;
        }

        /** Player {player} makes a move at ({row}, {col}).
         @param row The row of the board.
         @param col The column of the board.
         @param player The player, can be either 1 or 2.
         @return The current winning condition, can be either:
         0: No one wins.
         1: Player 1 wins.
         2: Player 2 wins. */
        public int move(int row, int col, int player) {
            int score = player == 1 ? 1 : -1;
            rowScore[row] += score;
            if (rowScore[row]==n||rowScore[row]==-n)
                return rowScore[row]==n?1:2;
            colScore[col] += score;
            if (colScore[col]==n||colScore[col]==-n)
                return colScore[col]==n?1:2;
            if (row == col){
                diagScore[0] += score;
                if (diagScore[0]==n||diagScore[0]==-n)
                    return diagScore[0]==n?1:2;
            }

            if (row + col == n - 1){
                diagScore[1] += score;
                if (diagScore[1]==n||diagScore[1]==-n)
                    return diagScore[1]==n?1:2;
            }
            return 0;
        }


        public void playgame(int turn){
            int[] place = makeMove(turn);
            int result = move(place[0],place[1],turn);
            while (result==0&&totalMove<=n*n){
                turn = 0-turn;
                place = makeMove(turn);
                result = move(place[0],place[1],turn);
                totalMove++;
            }
            if (result==1){
                System.out.println("player 1 win");
            }
            else if (result==2){
                System.out.println("player 2 win");
            }
            else {
                System.out.println("Tie");
            }
            for (int i=0;i<board.length;++i){
                for (int j=0;j<board.length;++j){
                    System.out.print(board[i][j]+ ",");
                }
                System.out.println();
            }

        }
        int[] makeMove(int turn){
            Random r = new Random();
            int i = r.nextInt(n);
            int j = r.nextInt(n);
            while (board[i][j]!=0){
                i = r.nextInt(n);
                j = r.nextInt(n);
            }
            board[i][j] = turn;
            return new int[]{i,j};
        }


    }

    public static void main(String[] args) {
        TicTacToe t = new TicTacToe(3);
        t.playgame(1);
    }
}
