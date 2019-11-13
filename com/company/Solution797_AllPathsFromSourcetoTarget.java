package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Solution797_AllPathsFromSourcetoTarget {
    public static void main(String[] args) {

    }
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> temp = new ArrayList<>();
        temp.add(0);
        backtracking(graph,0,temp);
        return res;
    }
    public void backtracking(int[][] graph, int node, List<Integer> path){
        if (node==graph.length-1){
            res.add(new ArrayList<>(path));
            return;
        }
        if (path.contains(node)) return;
        for (int i=0;i<graph[node].length;++i){
            path.add(graph[node][i]);
            backtracking(graph,graph[node][i],path);
            path.remove(path.size()-1);
        }
    }
}
