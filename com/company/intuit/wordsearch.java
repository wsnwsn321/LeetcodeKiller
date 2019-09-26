package com.company.intuit;

import java.util.ArrayList;
import java.util.List;

public class wordsearch {
    public static void main(String[] args) {

    }
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        List<int[]> res  = new ArrayList<>();
        for (int i=0;i<board.length;++i){
            for (int j=0;j<board[0].length;++j){
                if (DFS(board,word,i,j,0,visited,res)) {
                    for(int[] x: res){
                        System.out.println(x[0]+" "+x[1]);
                    }
                    return true;
                }
            }
        }

        return false;
    }
    public boolean DFS(char[][] board, String word, int i, int j,int position,boolean[][] visited,List<int[]> res){
        if (position==word.length()) return true;
        if (i<0||i>=board.length||j<0||j>=board[0].length||word.charAt(position)!=board[i][j]||visited[i][j]) return false;
        visited[i][j] =true;
        res.add(new int[]{i,j});
        boolean ans =   DFS(board,word,i+1,j,position+1,visited,res)||
                DFS(board,word,i-1,j,position+1,visited,res)||
                DFS(board,word,i,j+1,position+1,visited,res)||
                DFS(board,word,i,j-1,position+1,visited,res);
        visited[i][j]=false;
        return ans;
    }
}
