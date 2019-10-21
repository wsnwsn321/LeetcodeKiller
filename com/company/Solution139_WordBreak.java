package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
        Queue<Integer> q= new LinkedList<>();
        int[] visited = new int[s.length()];
        q.offer(0);
        while (q.size()>0){
            int cur = q.poll();
            if (visited[cur]==0){
                for (int i=cur;i<s.length();++i){
                    if (wordDict.contains(s.substring(cur,i))){
                        if (i==s.length()-1) return true;
                        q.offer(i+1);
                    }
                }
            }
            visited[cur]=1;
        }
        return false;
    }

}
