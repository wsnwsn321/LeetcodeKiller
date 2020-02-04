package com.company;

import java.util.LinkedList;
import java.util.Queue;

class Solution348_TicTacToe {

    int[] colScore;
    int[] rowScore;
    int[] diagScore;
    int n;
    /** Initialize your data structure here. */
    public Solution348_TicTacToe(int n) {
        colScore = new int[n];
        rowScore = new int[n];
        diagScore = new int[2];
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

        else if (row + col == n - 1){
            diagScore[1] += score;
            if (diagScore[1]==n||diagScore[1]==-n)
                return diagScore[1]==n?1:2;
        }
        return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */