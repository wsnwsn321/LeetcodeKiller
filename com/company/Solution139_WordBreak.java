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
        q.offer(s);
        Set<String> dic = new HashSet<>(wordDict);
        Set<String> visited = new HashSet<>();
        while (q.size()>0){
            String cur = q.poll();
            if (cur.length()==0)
                return true;
            if (!visited.contains(cur)){
                visited.add(cur);
                for (int i=0;i<=cur.length();++i){
                    if (dic.contains(cur.substring(0,i))){
                        q.offer(cur.substring(i));
                    }
                }
            }
        }
        return false;
    }

}
