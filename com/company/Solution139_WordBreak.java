package com.company;

import java.util.*;

public class Solution139_WordBreak {
    public static void main(String[] args) {
        String s= "leetcode";
        List<String> l = new ArrayList<>();
        l.add("leet");
        l.add("code");
        wordBreak(s,l);

    }
    //time:     O(n^2)
    //space:    O(n)
    public static boolean wordBreak(String s, List<String> wordDict) {
        Queue<String> q = new LinkedList<>();
        Set<String> set = new HashSet<>(wordDict);
        Set<String> visited = new HashSet<>();
        q.offer(s);
        while (!q.isEmpty()){
            String cur = q.poll();
            if (cur.length()==0) return true;
            if (!visited.contains(cur)){
                for (int i=0;i<=cur.length();++i){
                    if (set.contains(cur.substring(0,i))){
                        q.offer(cur.substring(i));
                    }
                }
            }
            visited.add(cur);
        }
        return false;
    }

}
