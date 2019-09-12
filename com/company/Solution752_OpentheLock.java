package com.company;

import java.util.*;

public class Solution752_OpentheLock {
    public static void main(String[] args) {

    }
    public int openLock(String[] deadends, String target) {
        List<String> d = new ArrayList<>(deadends.length);
        Set<String> visited =new HashSet<>();
        for (String x:deadends) d.add(x);
        int step=0;
        Queue<String> q = new LinkedList<>();
        q.add("0000");
        while (!q.isEmpty()){
            int size = q.size();
            while (size>0){
                String current = q.poll();
                visited.add(current);
                if (current.equals(target)) return step;
                StringBuilder sb = new StringBuilder(current);
                for(int i = 0; i < 4; i ++) {
                    char c = sb.charAt(i);
                    String s1 = sb.substring(0, i) + (c == '9' ? 0 : c - '0' + 1) + sb.substring(i + 1);
                    String s2 = sb.substring(0, i) + (c == '0' ? 9 : c - '0' - 1) + sb.substring(i + 1);
                    if (!visited.contains(s1)&&!d.contains(s1)){
                        q.add(s1);
                        visited.add(s1);
                    }
                    if (!visited.contains(s2)&&!d.contains(s2)){
                        q.add(s2);
                        visited.add(s2);
                    }
                }
                size--;
            }
            step++;

        }
        return -1;
    }


}
