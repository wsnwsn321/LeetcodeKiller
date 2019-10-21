package com.company.Google;

import java.util.*;

public class ClimbLadder {
    public static void main(String[] args) {
        int[] nums = new int[]{1,0,7,1,2,3,4,8,2,3,4,2,2,6,2,5,9,8};
        path(nums);

    }
    public static List<Integer> path(int[] nums){
        HashMap<Integer,List<Integer>> adjacentList = new HashMap<>();
        HashMap<Integer,List<Integer>> sameValue = new HashMap<>();
        List<Integer> res= new ArrayList<>();
        for (int i=0;i<nums.length;++i) {
            if (!sameValue.containsKey(nums[i]))
                sameValue.put(nums[i],new ArrayList<>());
            sameValue.get(nums[i]).add(i);
        }
        for (int i=0;i<nums.length;++i){
            if (!adjacentList.containsKey(i))
                adjacentList.put(i,new ArrayList<>());
            if (i>0) adjacentList.get(i).add(i-1);
            if (i<nums.length-1) adjacentList.get(i).add(i+1);
            adjacentList.get(i).addAll(sameValue.get(nums[i]));
        }
        int[] dis = new int[nums.length];
        boolean[] visited = new boolean[nums.length];
        int[] parent = new int[nums.length];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[0] = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        pq.offer(0);
        while (dis[nums.length-1]==Integer.MAX_VALUE&&!pq.isEmpty()){
            int index =pq.poll();
            visited[index] = true;
            for (int adj:adjacentList.get(index)){
                if (adj!=index&&!visited[adj]){
                   dis[adj] = dis[index]+1;
                   parent[adj] = index;
                   pq.offer(adj);

                }
            }
        }
        int target = nums.length-1;
        while (target!=0){
            res.add(0,nums[target]);
            target = parent[target];
        }
        res.add(0,nums[0]);
        return res;
    }

}
