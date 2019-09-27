package com.company;
import java.util.*;
public class Solution347_TopKElement {
    public static void main(String[] args) {
        int[] n = new int[]{1,2};
        topKMostFrequent(n,2);
    }
    //time:     O(nlogn)
    //space:    O(n)
    public static List<Integer> topKMostFrequent(int[] nums, int k){
       Map<Integer,Integer> m = new HashMap<>();
       for (int x:nums){
           m.put(x,m.getOrDefault(x,0)+1);
       }
       PriorityQueue<Integer> p = new PriorityQueue<>(new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return m.get(o2)-m.get(o1);
           }
       });
       int size=k;
       for (int x:m.keySet()){
           //logn
           if (p.size()>k) p.poll();
           p.add(x);

       }
       List<Integer> res = new ArrayList<>();
       for (int x: p){
           res.add(x);
       }
       Collections.reverse(res);
       return res;
    }
}
