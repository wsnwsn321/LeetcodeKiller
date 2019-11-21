package com.company;

import java.util.*;

public class Solution737_SentenceSimilarityII {
    public static void main(String[] args) {

    }
    //time:     O(np) n - max length of w1,w2; p - length of pairs
    //space:    O(p)
    public boolean areSentencesSimilarTwo(String[] words1, String[] words2, List<List<String>> pairs) {
        if (words1.length!=words2.length) return false;
        if (words1.equals(words2)) return true;
        Map<String, HashSet<String>> map = new HashMap<>();
        for (List<String> p:pairs){
            if (!map.containsKey(p.get(0)))
                map.put(p.get(0),new HashSet<>());
            map.get(p.get(0)).add(p.get(1));
            if (!map.containsKey(p.get(1)))
                map.put(p.get(1),new HashSet<>());
            map.get(p.get(1)).add(p.get(0));
        }
        for (int i=0;i<words1.length;++i){
            String cur = words1[i];
            String w2 = words2[i];
            if (cur.equals(w2)) continue;
            Stack<String> s = new Stack<>();
            Set<String> visited = new HashSet<>();
            boolean found= false;
            s.push(cur);
            while (s.size()>0){
                String top = s.pop();
                if (top.equals(w2)) {
                    found =true;
                    break;
                }
                visited.add(top);
                if (map.containsKey(top)){
                    for (String n:map.get(top)){
                        if (!visited.contains(n))
                            s.push(n);
                    }
                }
            }
            if (!found) return false;
        }
        return true;
    }
}
