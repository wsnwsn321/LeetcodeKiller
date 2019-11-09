package com.company;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution547_FriendCircles {
    public static void main(String[] args) {

    }
    public int findCircleNum(int[][] M) {
        int group = 0;
        Set<Integer> connected = new HashSet<>();
        Queue<Integer> q= new LinkedList<>();
        for (int i=0;i<M.length;++i){
            if (!connected.contains(i)){
                q.offer(i);
                while (q.size()>0){
                    int cur = q.poll();
                    connected.add(cur);
                    for (int j=0;j<M.length;++j){
                        if (!connected.contains(j)&&M[cur][j]==1)
                            q.offer(j);
                    }
                }
                group++;
            }
        }
        return group;
    }
}
