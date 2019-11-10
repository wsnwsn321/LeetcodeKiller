package com.company;

import java.util.*;

public class Solution692_TopKFrequentWords {
    public static void main(String[] args) {

    }
    public List<String> topKFrequent(String[] words, int k) {
        List<String>[] buckets = new List[words.length];
        List<String> res = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for (String x:words){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for (String x: map.keySet()){
            int frequency = map.get(x);
            if (buckets[frequency]==null)
                buckets[frequency] = new ArrayList<>();
            buckets[frequency].add(x);
        }
        for (int i=buckets.length-1;i>=0;--i){
            if (buckets[i]!=null){
                Collections.sort(buckets[i]);
                for (String cur:buckets[i]){
                    res.add(cur);
                    if (res.size()==k){
                        return res;
                    }
                }
            }
        }
        return res;
    }
}
