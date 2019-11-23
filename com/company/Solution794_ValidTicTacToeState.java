package com.company;

public class Solution794_ValidTicTacToeState {
    public static void main(String[] args) {
        String[] s = new String[]{"XO ","XO ","XO "};
        validTicTacToe(s);
    }
    public static boolean validTicTacToe(String[] board) {
        int countX=0,countO=0;
        boolean p1win = false, p2win = false;
        int[] rowScore =new int[3];
        int[] colScore = new int[3];
        int[] diagScore = new int[2];
        for (int i=0;i<3;++i){
            for (int j=0;j<3;++j){
                char cur = board[i].charAt(j);
                if (cur=='X'){
                    countX++;
                    rowScore[i]++;
                    colScore[j]++;
                    if (i==j) diagScore[0]++;
                    if (i+j==2) diagScore[1]++;
                    if (rowScore[i]==3||colScore[j]==3||diagScore[0]==3||diagScore[1]==3){
                        p1win =true;
                    }
                }
                else if(cur=='O') {
                    countO++;
                    rowScore[i]--;
                    colScore[j]--;
                    if (i==j) diagScore[0]--;
                    if (i+j==2) diagScore[1]--;
                    if (rowScore[i]==-3||colScore[j]==-3||diagScore[0]==-3||diagScore[1]==-3){
                        p2win = true;
                    }
                }
            }
        }
        if (p1win){
            return countX-1==countO;
        }
        if (p2win){
            return countX==countO;
        }
        if (countX==countO||countX-countO==1) return true;
        return false;
    }
}
