package com.company;
import java.util.*;
public class Solution347_TopKElement {
    public static void main(String[] args) {
        int[] n = new int[]{1,2,3};
        topKMostFrequent(n,2);
    }
    //time:     O(nlogn)
    //space:    O(n)
    public static List<Integer> topKMostFrequent(int[] nums, int k){
        Map<Integer,Integer> m = new HashMap<>();
        PriorityQueue<Integer> p = new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                return m.get(a)-m.get(b);
            }
        });
        for (int x: nums){
            m.put(x,m.getOrDefault(x,0)+1);
        }
        for (int x:m.keySet()){
            p.offer(x);
            if (p.size()>k){
                p.poll();
            }
        }
        List<Integer> res = new ArrayList<>();
        while (p.size()!=0){
            res.add(p.poll());
        }
        Collections.reverse(res);
        return res;

    }
}
