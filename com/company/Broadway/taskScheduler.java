package com.company.Broadway;

import java.util.*;

public class taskScheduler {
    List<List<Integer>> prerequests;
    int numberOfTasks;
    int[] inDegree = new int[numberOfTasks];
    public taskScheduler(List<List<Integer>> prerequests, int numberOfTasks) {
        this.prerequests = prerequests;
        this.numberOfTasks = numberOfTasks;
        for (List<Integer> x:prerequests){
            inDegree[x.get(0)]++;
        }
    }

    public void addDependency(int task, int preRequest){
        List<Integer> dep = new ArrayList<>(Arrays.asList(task,preRequest));
        if (!prerequests.contains(dep)) {
            prerequests.add(dep);
            inDegree[task]++;
        }
    }

    public boolean startTask(int taskId){
        return inDegree[taskId]==0;
    }
    public void addCompletedTask(int taskId){
        if (inDegree[taskId]!=0) {
            return;
        }
        for (int i=0;i<prerequests.size();++i){
            if (prerequests.get(i).get(1)==taskId) inDegree[prerequests.get(i).get(0)]--;
        }
    }
    public List<Integer> getRunnableTasks(List<List<Integer>> prerequests){
        List<Integer> res = new ArrayList<>();
        for (int i=0;i<inDegree.length;++i){
            if (inDegree[i]==0) res.add(i);
        }
        return res;
    }
}
