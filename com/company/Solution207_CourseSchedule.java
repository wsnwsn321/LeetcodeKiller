package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution207_CourseSchedule {
    public static void main(String[] args) {

    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
       if (prerequisites.length==0) return true;
       int finishedCourse=0;
       int[] indegree = new int[numCourses];
       for (int[] x:prerequisites){
           indegree[x[0]]++;
       }
       Queue<Integer> q = new LinkedList<>();
       for (int i=0;i<indegree.length;++i){
           if (indegree[i]==0)
               q.offer(i);
       }
       while (q.size()>0){
           int cur = q.poll();
           finishedCourse++;
           for (int[] x:prerequisites){
               if (x[1]==cur){
                   indegree[x[0]]--;
                   if (indegree[x[0]]==0)
                       q.offer(x[0]);
               }
           }
       }
       return finishedCourse==numCourses?true:false;
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
