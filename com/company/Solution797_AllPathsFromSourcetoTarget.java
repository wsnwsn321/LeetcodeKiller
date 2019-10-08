package com.company;

import java.util.ArrayList;
import java.util.List;

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
    public void backtracking(int[][] graph,int node, List<Integer> temp){
        if (node == graph.length-1) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i=0;i<graph[node].length;++i){
            temp.add(graph[node][i]);
            backtracking(graph,graph[node][i],temp);
            temp.remove(temp.size()-1);
        }

    }
}
