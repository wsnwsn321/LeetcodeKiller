package com.company;

import java.util.*;

public class Solution895_MaximumFrequencyStack {
    public static void main(String[] args) {

    }
    class FreqStack {
        Map<Integer,Integer> count;
        List<Stack<Integer>> buckets;
        int freq =0;
        public FreqStack() {
            count = new HashMap<>();
            buckets = new ArrayList<>();
        }

        public void push(int x) {
            count.put(x,count.getOrDefault(x,0)+1);
            int freq = count.get(x);
            if (freq>buckets.size()){
                buckets.add(new Stack<>());
            }
            buckets.get(freq-1).add(x);
        }

        public int pop() {
            int x = buckets.get(buckets.size()-1).pop();
            if (buckets.get(buckets.size()-1).size()==0){
                buckets.remove(buckets.size()-1);
            }
            count.put(x,count.get(x)-1);
            if (count.get(x)==0)
                count.remove(x);
            return x;
        }
    }
}
