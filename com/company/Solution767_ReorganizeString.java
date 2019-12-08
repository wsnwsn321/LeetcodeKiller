package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution767_ReorganizeString {
    public static void main(String[] args) {

    }
    public String reorganizeString(String S) {
        Map<Character,Integer> count = new HashMap<>();
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->count.get(b)-count.get(a));
        for (char ch:S.toCharArray()){
            count.put(ch,count.getOrDefault(ch,0)+1);
        }
        for (char ch:count.keySet())
            pq.offer(ch);
        int max = count.get(pq.peek());
        if (S.length()-max<max-1) return "";
        StringBuilder sb = new StringBuilder();
        while (pq.size()>0){
            char cur = pq.poll();
            if (sb.length()==0||sb.charAt(sb.length()-1)!=cur){
                sb.append(cur);
                count.put(cur,count.get(cur)-1);
            }
            else {
                char second = pq.poll();
                sb.append(second);
                count.put(cur,count.get(second)-1);
                if (count.get(second)>0)
                    pq.offer(second);
            }
            if (count.get(cur)>0)
                pq.offer(cur);
        }
        return sb.toString();

    }
}
