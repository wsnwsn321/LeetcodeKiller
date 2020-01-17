package com.company;

public class Solution37_SudokuSolver {
    public static void main(String[] args) {

    }

    public void solveSudoku(char[][] board) {
        if (board.length==0) return;
        backtracking(board);
    }
    public boolean backtracking(char[][] board){
        for (int i=0;i<board.length;++i){
            for (int j=0;j<board[0].length;++j){
                if (board[i][j]=='.') {
                    for (char c = '1'; c <= '9'; ++c) {
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c;
                            if (backtracking(board))
                                return true;
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int row, int col, char c){
        //(blkrow , blkcol) - index of first element in that block
        int blkrow = (row / 3) * 3, blkcol = (col / 3) * 3; // Block no. is i/3, first element is i/3*3
        for (int i = 0; i < 9; i++)
            if (board[i][col] == c || board[row][i] == c ||
                    board[blkrow + i / 3][blkcol + i % 3] == c)
                return false;
        return true;
    }
}
