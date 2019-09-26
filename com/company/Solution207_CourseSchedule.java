package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution207_CourseSchedule {
    public static void main(String[] args) {

    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
//        ArrayList[] edges = new ArrayList[numCourses];
//        for(int i=0;i<numCourses;++i){
//            edges[i] = new ArrayList();
//        }
//        for(int[] x:prerequisites){
//            edges[x[1]].add(x[0]);
//        }
//        boolean[] visited = new boolean[numCourses];
//        for(int i=0;i<numCourses;++i){
//            if(dfsForCircle(edges,i,visited)) return false;
//        }
//        return true;
        if(prerequisites.length==0) return true;
        int[] indegree = new int[numCourses];
        Queue<Integer> q= new LinkedList<>();
        for (int i=0;i<prerequisites.length;++i){
            indegree[prerequisites[i][0]]++;
        }
        for (int i=0;i<indegree.length;++i){
            if (indegree[i]==0) q.add(i);
        }
        int canFinish = q.size();
        while (!q.isEmpty()){
            int cur = q.poll();
            for (int i=0;i<prerequisites.length;++i){
                if (prerequisites[i][1]==cur){
                    indegree[prerequisites[i][0]]--;
                    if (indegree[prerequisites[i][0]]==0) {
                        canFinish++;
                        q.add(prerequisites[i][0]);
                    }
                }
            }
        }
        return canFinish==numCourses;
    }
    public boolean dfsForCircle(ArrayList[] edges, int course,boolean[] visited){
        if(visited[course]) return true;
        else visited[course] =true;
        for(int i=0;i<edges[course].size();++i){
            if(dfsForCircle(edges,(int)edges[course].get(i),visited)) return true;
        }
        visited[course] = false;
        return false;
    }
}
