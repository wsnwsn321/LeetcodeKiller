import java.util.LinkedList;
import java.util.Queue;

class TicTacToe {
    int[] r;
    int[] c;
    int n;
    int diag;
    int atdiag;
    /** Initialize your data structure here. */
    public TicTacToe(int n) {
        r = new int[n];
        c = new int[n];
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

        Queue<Integer> q =new LinkedList<>();
        int score = player==1?1:-1;
        r[row] += score;
        c[col] += score;
        if(row == col){
            diag+=score;
        }
        if(n-1-row == col){
            atdiag+=score;
        }

        if (Math.abs(r[row]) == n ||
                Math.abs(c[col]) == n ||
                Math.abs(diag) == n  ||
                Math.abs(atdiag) == n)
        {
            return player;
        }
        return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */