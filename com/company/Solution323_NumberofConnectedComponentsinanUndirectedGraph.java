package com.company;

import java.util.*;

public class Solution323_NumberofConnectedComponentsinanUndirectedGraph {
    public static void main(String[] args) {

    }
    public int countComponents(int n, int[][] edges) {
        int res=0;
        Map<Integer,HashSet<Integer>> neighbours = new HashMap<>();
        for (int i = 0; i < n; i++) neighbours.put(i, new HashSet<>());
        for (int[] x:edges){
            neighbours.get(x[0]).add(x[1]);
            neighbours.get(x[1]).add(x[0]);
        }
        Set<Integer> visited = new HashSet<>();
        Set<Integer> vertices = new HashSet<>();
        for (int i=0;i<n;++i)
            vertices.add(i);
        for (int i=0;i<n;++i){
            if (!visited.contains(i)){
                dfsVisit(i,neighbours,visited);
                res++;
            }
        }
        return res;
    }
    private void dfsVisit(int i, Map<Integer, HashSet<Integer>> map, Set<Integer> visited) {
        visited.add(i);
        for (int j : map.get(i)) {
            if (!visited.contains(j))
                dfsVisit(j, map, visited);
        }
    }
}
