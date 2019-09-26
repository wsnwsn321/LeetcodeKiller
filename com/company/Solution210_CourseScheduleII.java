package com.company;

import java.util.*;

public class Solution210_CourseScheduleII {
    public static void main(String[] args) {

    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if(prerequisites.length==0) return new int[]{};
        int[] indegree = new int[numCourses];
        Queue<Integer> q= new LinkedList<>();
        List<Integer> resList = new ArrayList<>();
        for (int i=0;i<prerequisites.length;++i){
            indegree[prerequisites[i][0]]++;
        }
        for (int i=0;i<indegree.length;++i){
            if (indegree[i]==0) {
                q.add(i);
            }
        }
        int canFinish=q.size();
        while (!q.isEmpty()){
            int cur = q.poll();
            resList.add(cur);
            for (int i=0;i<prerequisites.length;++i){
                if (prerequisites[i][1]==cur){
                    indegree[prerequisites[i][0]]--;
                    if (indegree[prerequisites[i][0]]==0) {
                        q.add(prerequisites[i][0]);
                        canFinish++;
                    }
                }
            }
        }
        if (canFinish!=numCourses) return new int[]{};
        int[] res = new int[numCourses];
        for (int i=0;i<resList.size();++i){
            res[i] = resList.get(i);
        }
        return res;
    }
}
