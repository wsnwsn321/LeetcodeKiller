package com.company;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution547_FriendCircles {
    public static void main(String[] args) {

    }
    public int findCircleNum(int[][] M) {
        int res=0;
        Set<Integer> connected = new HashSet<>();
        for (int i=0;i<M.length;++i){
            if (!connected.contains(i)){
                res++;
                dfs(i,M,connected);
            }
        }
        return res;
    }
    public void dfs(int i,int[][] M, Set<Integer> connected){
        connected.add(i);
        for (int j=0;j<M[0].length;++j){
            if (!connected.contains(j)&&M[i][j]==1)
                dfs(j,M,connected);
        }
    }
}
