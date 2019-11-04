package com.company;

import java.util.*;

public class Solution310_MinimumHeightTrees {
    public static void main(String[] args) {
        int[][] t =new int[5][2];
        t[0] = new int[]{3,0};
        t[1] = new int[]{1,3};
        t[2] = new int[]{2,3};
        t[3] = new int[]{4,3};
        t[4] = new int[]{4,5};
        findMinHeightTrees(6,t);
    }
    public static List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res = new ArrayList<>();
        if (n == 1) {
            res.add(0);
            return res;
        }
        Map<Integer,HashSet<Integer>> neighbours = new HashMap<>();
        int[] degree = new int[n];
        for (int i = 0; i < n; i++) neighbours.put(i, new HashSet<>());
        for (int[] x:edges){
            neighbours.get(x[0]).add(x[1]);
            neighbours.get(x[1]).add(x[0]);
            degree[x[0]]++;
            degree[x[1]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i=0;i<degree.length;++i){
            if (degree[i]==1)
                q.offer(i);
        }
        while (!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size = q.size();
            for (int i=0;i<size;++i){
                int cur = q.poll();
                temp.add(cur);
                for (int neighbour:neighbours.get(cur)){
                    degree[neighbour]--;
                    if (degree[neighbour]==1)
                        q.offer(neighbour);
                }
            }
            res = temp;
        }
        return res;

    }
}
