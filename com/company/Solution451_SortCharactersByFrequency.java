package com.company;

import java.util.*;

public class Solution451_SortCharactersByFrequency {
    public static void main(String[] args) {

    }
    //time:     O(n)
    //space:    O(n)
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character>[] buckets = new List[s.length()+1];
        for (char ch:map.keySet()){
            int frequency = map.get(ch);
            if (buckets[frequency]==null)
                buckets[frequency] =new ArrayList<>();
            buckets[frequency].add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (int i=buckets.length-1;i>=0;--i){
            if(buckets[i]!=null){
                for (char x: buckets[i]){
                    for (int j = 0; j < map.get(x); j++)
                        sb.append(x);
                }
            }

        }
        return sb.toString();
    }


}

