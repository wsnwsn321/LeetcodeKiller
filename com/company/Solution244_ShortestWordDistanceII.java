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
            int res=Integer.MAX_VALUE;
            List<Integer> index1 = map.get(word1);
            List<Integer> index2 = map.get(word2);
            int i=0,j=0;
            while (i<index1.size()&&j< index2.size()){
                int v1 = index1.get(i);
                int v2 = index2.get(j);
                res = Math.min(res,Math.abs(v1-v2));
                if (v1<v2){
                    i++;
                }
                else j++;
            }
            return res;
        }
    }
}
