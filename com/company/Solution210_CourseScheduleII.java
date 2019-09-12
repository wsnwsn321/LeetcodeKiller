package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution210_CourseScheduleII {
    public static void main(String[] args) {

    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList[] edges = new ArrayList[numCourses];
        List<Integer> ret = new ArrayList<>();
        for(int i=0;i<numCourses;++i){
            edges[i] = new ArrayList();
        }
        for(int[] x:prerequisites){
            edges[x[1]].add(x[0]);
        }
        int[] visited = new int[numCourses];
        for(int i=0;i<numCourses;++i){
            if(dfsForCircle(edges,i,visited,ret)) return new int[]{};
        }
        int[] res = new int[numCourses];
        for(int i=0;i<ret.size();++i){
            res[i] = ret.get(i);
        }
        return res;
    }
    public boolean dfsForCircle(ArrayList[] edges, int course,int[] visited,List<Integer> ret){
        if(visited[course]==1) return true;
        if(visited[course]==2) return false;
        visited[course] =1;
        for(int i=0;i<edges[course].size();++i){
            if(dfsForCircle(edges,(int)edges[course].get(i),visited,ret)) return true;
        }
        visited[course] = 2;
        ret.add(0,course);
        return false;
    }
}
