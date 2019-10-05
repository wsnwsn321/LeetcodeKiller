//package com.company.intuit;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class Grid01c {
//    public static void main(String[] args) {
//        int[][] grid = new int[4][4];
//        grid[0] = new int[]{0,0,0,0};
//        grid[1] = new int[]{0,1,1,0};
//        grid[2] = new int[]{0,0,-1,0};
//        grid[3] = new int[]{0,-1,0,0};
//        numOfTreaure(grid,0,0,0,3);
//    }
//    //num3
//    //time:     O(4^(m*n))
//    static int minLength=Integer.MAX_VALUE;
//    static int countT=0;
//    static List<int[]> fres = new ArrayList<>();
//    public static List<int[]> numOfTreaure(int[][] grid, int start_i, int start_j, int dest_i, int dest_j){
//        int count = 0;
//        boolean[][] visited = new boolean[grid.length][grid[0].length];
//        for (int i=0;i<grid.length;++i){
//            for (int x: grid[i]){
//                if (x==-1) count++;
//            }
//        }
//        countT =count;
//        boolean[][] route = new boolean[grid.length][grid[0].length];
//        List<int[]> res = new ArrayList<>();
//        dfs(grid,start_i,start_j,dest_i,dest_j,0,visited,1,route,res);
//        return fres;
//    }
//
//    public static void dfs(int[][] grid, int i, int j, int dest_i, int dest_j, int numOfT, boolean[][] visited,int length,boolean[][] route,List<int[]> res){
//        if (i<0||j<0||i>grid.length-1||j>grid[0].length-1||visited[i][j]||grid[i][j]==1||length>minLength) return ;
//        if (grid[i][j]==-1) numOfT++;
//        res.add(new int[]{i,j});
//        if (i==dest_i&&j==dest_j){
//            if (numOfT==countT) {
//                if (length<minLength) {
//                    minLength = Math.min(length,minLength);
//                    fres = new ArrayList<>(res);
//                }
//            }
//        }
//        visited[i][j]=true;
//        dfs(grid,i-1,j,dest_i,dest_j,numOfT,visited,length+1,route,res);
//        dfs(grid,i+1,j,dest_i,dest_j,numOfT,visited,length+1,route,res);
//        dfs(grid,i,j+1,dest_i,dest_j,numOfT,visited,length+1,route,res);
//        dfs(grid,i,j-1,dest_i,dest_j,numOfT,visited,length+1,route,res);
//        visited[i][j] = false;
//        res.remove(res.size()-1);
//    }
//
//
//}
