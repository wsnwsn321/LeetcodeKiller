package com.company;

import java.util.*;

public class Solution819_MostCommonWord {
    public static void main(String[] args) {
        String p = "Bob hit a ball, the hit BALL flew far after it was hit.";
          String[] b = new String[]{"hit"};
          mostCommonWord(p,b);
    }
    public static String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.replaceAll("\\p{Punct}", " ");
        paragraph =paragraph.toLowerCase();
        String[] words = paragraph.split("\\s+");
        Map<String,Integer> count = new HashMap<>();
        for (String word:words){
            count.put(word,count.getOrDefault(word,0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->count.get(b)-count.get(a));
        Set<String> bned = new HashSet<>();
        for (String x:banned) bned.add(x);
        for (String key:count.keySet()){
            if (!bned.contains(key))
                pq.add(key);
        }
        return pq.size()>0?pq.peek():null;

    }
}
