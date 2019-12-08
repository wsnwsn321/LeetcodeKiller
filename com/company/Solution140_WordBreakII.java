package com.company;

import java.util.*;

public class Solution140_WordBreakII {
    public static void main(String[] args) {
        String s = "catsanddog";
        List<String> q = new ArrayList<>();
        q.add("cat");
        q.add("cats");
        q.add("and");
        q.add("sand");
        q.add("dog");
        wordBreak(s,q);
    }
    static Map<String,List<String>> map = new HashMap<>();
    public static List<String> wordBreak(String s, List<String> wordDict) {
        return backtracking(s,new HashSet<>(wordDict));
    }
    public static List<String> backtracking(String s, Set<String> wordDict) {
        if (map.containsKey(s))
            return map.get(s);
        List<String> res = new ArrayList<>();
        for (String w:wordDict){
            if (s.indexOf(w)==0){
                if (s.substring(w.length()).length()==0)
                    res.add(w);
                else {
                    List<String> temp = backtracking(s.substring(w.length()),wordDict);
                    for (String t:temp){
                        res.add(w+" "+t);
                    }
                }
            }
        }
        map.put(s,res);
        return res;
    }

}
