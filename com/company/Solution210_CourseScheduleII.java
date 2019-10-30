package com.company;

import java.util.*;

public class Solution210_CourseScheduleII {
    public static void main(String[] args) {

    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer> res = new ArrayList<>();
        if (prerequisites.length==0) return new int[]{};
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
            res.add(cur);
            for (int[] x:prerequisites){
                if (x[1]==cur){
                    indegree[x[0]]--;
                    if (indegree[x[0]]==0)
                        q.offer(x[0]);
                }
            }
        }
        if(finishedCourse!=numCourses) return new int[]{};
        int[] res2 = new int[numCourses];
        for (int i=0;i<numCourses;++i){
            res2[i] = res.get(i);
        }
        return res2;
    }
}
