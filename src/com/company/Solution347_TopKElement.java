package com.company;
import java.util.*;
public class Solution347_TopKElement {
    public static void main(String[] args) {

    }
    public static List<Integer> topKMostFrequent(int[] nums, int k){
        Map<Integer,Integer> m = new HashMap<>();
        for(int x: nums){
            m.put(x, m.getOrDefault(x, 0) + 1);
        }
        PriorityQueue<Integer> heap =
                new PriorityQueue<Integer>((n1, n2) -> m.get(n1) - m.get(n2));
        for (int x: m.keySet()){
            heap.add(x);
            if(heap.size()>k)
                heap.poll();
        }
        List<Integer> res = new ArrayList<>();
        int size = heap.size();
        for (int i=0;i<k;++i){
            res.add(heap.poll());
        }
        return res;

    }
}
