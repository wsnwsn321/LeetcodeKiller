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
        if (s.length()==0){
            res.add("");
            return res;
        }
        for (String cur:wordDict){
            if (s.indexOf(cur)==0){
                List<String> temp = backtracking(s.substring(cur.length()),wordDict);
                for (String sub:temp){
                    if (sub!="")
                        res.add(cur+" "+sub);
                    else
                        res.add(cur);
                }
            }
        }
        map.put(s,res);
        return res;
    }

}
