package src.com.company;

import java.util.ArrayList;

public class Solution207_CourseSchedule {
    public static void main(String[] args) {

    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList[] edges = new ArrayList[numCourses];
        for(int i=0;i<numCourses;++i){
            edges[i] = new ArrayList();
        }
        for(int[] x:prerequisites){
            edges[x[1]].add(x[0]);
        }
        boolean[] visited = new boolean[numCourses];
        for(int i=0;i<numCourses;++i){
            if(dfsForCircle(edges,i,visited)) return false;
        }
        return true;
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
