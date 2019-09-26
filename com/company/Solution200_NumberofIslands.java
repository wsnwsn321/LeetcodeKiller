package com.company;

public class Solution200_NumberofIslands {
    public static void main(String[] args) {

    }
    //time:     O(nm)
    //space:    O(nm)
    public  int numIslands(char[][] grid) {
        int count =0;
        for (int i=0;i<grid.length;++i){
            for (int j=0;j<grid[0].length;++j){
                if (grid[i][j]=='1'){
                    DFS(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void DFS(char[][] grid, int i, int j){
        if (i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]=='0') return;
        grid[i][j]='0';
        DFS(grid,i+1,j);
        DFS(grid,i-1,j);
        DFS(grid,i,j+1);
        DFS(grid,i,j-1);
    }


}
