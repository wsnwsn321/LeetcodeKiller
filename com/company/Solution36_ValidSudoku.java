package com.company;

public class Solution36_ValidSudoku {
    public static void main(String[] args) {

    }
    public boolean isValidSudoku(char[][] board) {
        int[][] rowCount = new int[board.length][10];
        int[][] colCount = new int[board[0].length][10];
        int[][] boxCount = new int[9][10];
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] != '.') {
                    int n = board[i][j] - '0';
                    rowCount[i][n]++;
                    if (rowCount[i][n] > 1)
                        return false;
                    colCount[j][n]++;
                    if (colCount[j][n] > 1)
                        return false;
                    int boxNum = (i / 3) * 3 + (j / 3);
                    boxCount[boxNum][n]++;
                    if (boxCount[boxNum][n] > 1)
                        return false;
                }
            }
        }
        return true;
    }

}
