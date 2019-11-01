package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution244_ShortestWordDistanceII {
    public static void main(String[] args) {

    }
    class WordDistance {
        HashMap<String, List<Integer>> map;
        public WordDistance(String[] words) {
            map = new HashMap<>();
            for (int i=0;i<words.length;++i){
                String w = words[i];
                if (!map.containsKey(w))
                    map.put(w,new ArrayList<>());
                map.get(w).add(i);
            }
        }

        public int shortest(String word1, String word2) {
           List<Integer> l1 = map.get(word1);
           List<Integer> l2 = map.get(word2);
           int res=Integer.MAX_VALUE;
           int i1=0,i2=0;
           while (i1<l1.size()&&i2<l2.size()){
               int v1 = l1.get(i1);
               int v2 = l2.get(i2);
               res = Math.min(res,Math.abs(v1-v2));
               if (v1>v2){
                   i2++;
               }
               else {
                   i1++;
               }
           }
           return res;

        }
    }
}
