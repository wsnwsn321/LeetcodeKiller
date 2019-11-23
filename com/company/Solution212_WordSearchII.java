package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution212_WordSearchII {
    public static void main(String[] args) {

    }
    Set<String> res = new HashSet<>();
    public List<String> findWords(char[][] board, String[] words) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i=0;i<board.length;++i){
            for (int j=0;j<board[0].length;++j){
                for (String word:words)
                    DFS(board,word,i,j,0,visited);
            }
        }
        return new ArrayList<>(res);
    }

    public boolean DFS(char[][] board, String word, int i, int j,int position,boolean[][] visited){
        if (position==word.length()) {
            res.add(word);
            return true;
        }
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
