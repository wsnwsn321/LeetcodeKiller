package com.company;

import java.util.*;

public class Solution451_SortCharactersByFrequency {
    public static void main(String[] args) {

    }
    public String frequencySort(String s) {
        Map<Character,Integer> m = new HashMap<>();
        PriorityQueue<Character> p = new PriorityQueue<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return m.get(o2)-m.get(o1);
            }
        });
        char[] cs = s.toCharArray();
        for (char x: cs){
            m.put(x,m.getOrDefault(x,0)+1);
        }
        for (char x:m.keySet()){
            p.add(x);
        }
        StringBuilder sb = new StringBuilder();
        while(!p.isEmpty()){
            char x = p.poll();
            for (int i=0;i<m.get(x);++i)
                sb.append(x);;
        }
        return sb.toString();
    }

}

