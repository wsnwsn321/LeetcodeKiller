package com.company;

import java.util.*;

public class Solution692_TopKFrequentWords {
    public static void main(String[] args) {

    }
    public List<String> topKFrequent(String[] words, int k) {
        List<String>[] buckets = new List[words.length];
        List<String> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String x:words){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for (String key:map.keySet()){
            int frequency = map.get(key);
            if (buckets[frequency]==null)
                buckets[frequency] = new ArrayList<>();
            buckets[frequency].add(key);
        }
        for (int i = buckets.length-1;i>=0;--i){
            if (buckets[i]!=null){
                Collections.sort(buckets[i]);
                for (String x: buckets[i]){
                    res.add(x);
                    if (res.size()==k)
                        return res;
                }
            }
        }
        return res;
    }
}
