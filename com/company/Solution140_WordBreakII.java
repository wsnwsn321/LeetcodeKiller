package com.company;

import java.util.*;

public class Solution140_WordBreakII {
    public static void main(String[] args) {

    }
    Map<String,List<String>> map = new HashMap<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        return backtracking(s,new HashSet<>(wordDict));
    }
    public List<String> backtracking(String s, Set<String> wordDict) {
        if (map.containsKey(s))
            return map.get(s);
        List<String> res = new ArrayList<>();
        for (String cur:wordDict){
            if (s.indexOf(cur)==0){
                if (s.substring(cur.length()).length()==0)
                    res.add(cur);
                else{
                    List<String> temp = backtracking(s.substring(cur.length()),wordDict);
                    for (String sub:temp){
                            res.add(cur+" "+sub);
                    }
                }
            }
        }
        map.put(s,res);
        return res;
    }

}
