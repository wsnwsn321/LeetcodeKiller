package com.company.Broadway;

import java.util.*;

public class taskScheduler {
    HashMap<String, Set<String>> prerequests;
    int numberOfTasks;
    public taskScheduler(List<String> tasks,List<List<String>> input, int numberOfTasks) {
        this.numberOfTasks = numberOfTasks;
        for (String x: tasks){
            prerequests.put(x,new HashSet<>());
        }
        for (List<String> x:input){
            prerequests.get(x.get(0)).add(x.get(1));
        }
    }

    public void addDependency(String task, String preRequest){
        if (!prerequests.containsKey(task))
            prerequests.put(task,new HashSet<>());
        prerequests.get(task).add(preRequest);
    }


    public void addCompletedTask(String taskId){
        if (prerequests.get(taskId).size()!=0) return;
        for (Set<String> pres:prerequests.values()){
            if (pres.contains(taskId)) pres.remove(taskId);
        }
    }
    public List<String> getRunnableTasks(){
        List<String> res = new ArrayList<>();
        for (String task:prerequests.keySet()){
            if (prerequests.get(task).size()==0)
                res.add(task);
        }
        return res;
    }
}
