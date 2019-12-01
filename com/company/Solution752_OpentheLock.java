package com.company;

import java.util.*;

public class Solution752_OpentheLock {
    public static void main(String[] args) {

    }
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>();
        for (String x:deadends){
            dead.add(x);
        }
        if (dead.contains("0000")) return -1;
        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        int res=0;
        q.offer("0000");
        visited.add("0000");
        while (q.size()>0){
            int size = q.size();
            for (int i=0;i<size;++i){
                String cur = q.poll();
                if (cur.equals(target))
                    return res;
                StringBuilder sb = new StringBuilder(cur);
                for (int j=0;j<4;++j){
                    char c = sb.charAt(j);
                    String s1 = sb.substring(0, j) + (c == '9' ? 0 : c - '0' + 1) + sb.substring(j + 1);
                    String s2 = sb.substring(0, j) + (c == '0' ? 9 : c - '0' - 1) + sb.substring(j + 1);
                    if (!visited.contains(s1)&&!dead.contains(s1)){
                        q.offer(s1);
                        visited.add(s1);
                    }
                    if (!visited.contains(s2)&&!dead.contains(s2)){
                        q.offer(s2);
                        visited.add(s2);
                    }
                }
                res++;
            }
        }
        return res;
    }


}
