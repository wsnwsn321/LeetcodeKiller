package com.company;

import java.util.*;

public class Solution323_NumberofConnectedComponentsinanUndirectedGraph {
    public static void main(String[] args) {

    }
    public int countComponents(int n, int[][] edges) {
        Map<Integer,Set<Integer>> neightbours = new HashMap<>();
        for (int[] edge:edges){
            if (!neightbours.containsKey(edge[0]))
                neightbours.put(edge[0],new HashSet<>());
            neightbours.get(edge[0]).add(edge[1]);
            if (!neightbours.containsKey(edge[1]))
                neightbours.put(edge[1],new HashSet<>());
            neightbours.get(edge[1]).add(edge[0]);
        }
        Set<Integer> vertices = new HashSet<>();
        Set<Integer> visited = new HashSet<>();
        for (int i=0;i<n;++i)
            vertices.add(i);
        int res=0;
        for (int i=0;i<vertices.size();++i){
            res++;
            if (!visited.contains(i))
                dfsVisit(i,neightbours,visited);
        }
        return res;

    }
    private void dfsVisit(int i, Map<Integer, Set<Integer>> map, Set<Integer> visited) {
        visited.add(i);
        if (!map.containsKey(i)) return;
        for (int n:map.get(i)){
            if (!visited.contains(n)){
                dfsVisit(n,map,visited);
            }

        }
    }
}
