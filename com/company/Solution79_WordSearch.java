package com.company;

public class Solution79_WordSearch {
    public static void main(String[] args) {
        char[][] b = new char[][]{{'a','b','c'},{'d','g','z'},{'e','y','u'}};

    }
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i=0;i<board.length;++i){
            for (int j=0;j<board[0].length;++j){
                if (DFS(board,word,i,j,0,visited)) return true;
            }
        }
        return false;
    }
    public boolean DFS(char[][] board, String word, int i, int j,int position,boolean[][] visited){
        if (position==word.length()) return true;
        if (i<0||i>=board.length||j<0||j>=board[0].length||word.charAt(position)!=board[i][j]||visited[i][j]) return false;
        visited[i][j] =true;
        boolean ans =   DFS(board,word,i+1,j,position+1,visited)||
                DFS(board,word,i-1,j,position+1,visited)||
                DFS(board,word,i,j+1,position+1,visited)||
                DFS(board,word,i,j-1,position+1,visited);
        visited[i][j]=false;
        return ans;
    }
}
