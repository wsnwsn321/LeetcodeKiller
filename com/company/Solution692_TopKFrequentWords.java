package com.company;

import java.util.*;

public class Solution692_TopKFrequentWords {
    public static void main(String[] args) {

    }
    public List<String> topKFrequent(String[] words, int k) {
        List<String> result = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<words.length; i++)
        {
            if(map.containsKey(words[i]))
                map.put(words[i], map.get(words[i])+1);
            else
                map.put(words[i], 1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (map.get(o1)==map.get(o2)) return o2.compareTo(o1);
                else return map.get(o1)-map.get(o2);
            }
        });
        for (String x: map.keySet()){
            pq.offer(x);
            if(pq.size()>k)
                pq.poll();
        }
        while (!pq.isEmpty()){
            result.add(0,pq.poll()) ;
        }
        return result;
    }
}
