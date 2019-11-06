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
        List<Integer> [] buckets = new List[nums.length+1];
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int x: nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for (int x: map.keySet()){
            int frequency = map.get(x);
            if (buckets[frequency]==null)
                buckets[frequency] =new ArrayList<>();
            buckets[frequency].add(x);
        }
        for (int i=buckets.length-1;i>=0;--i){
            if (buckets[i]!=null){
                for (int x:buckets[i]){
                    res.add(x);
                    if (res.size()==k)
                        return res;
                }
            }
        }
        return res;
    }
}
