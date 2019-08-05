package com.company;

import java.util.*;

public class Solution895_MaximumFrequencyStack {
    public static void main(String[] args) {

    }
    class FreqStack {
        List<Stack<Integer>> l = new ArrayList<>();
        Map<Integer,Integer> m = new HashMap<>();

        public FreqStack() {


        }

        public void push(int x) {
            m.put( x, m.getOrDefault(x, 0) + 1);
            int freq = m.get(x);
            if(l.size()<freq) l.add(new Stack<>());
            l.get(freq-1).push(x);
        }

        public int pop() {
            int r = l.get(l.size()-1).pop();
            if(l.get(l.size()-1).size()==0){
                l.remove(l.size()-1);
            }
            int newF = m.get(r);
            m.put(r,newF--);
            return r;
        }
    }
}
