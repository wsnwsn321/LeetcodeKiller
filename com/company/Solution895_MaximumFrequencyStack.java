package com.company;

import java.util.*;

public class Solution895_MaximumFrequencyStack {
    public static void main(String[] args) {

    }
    class FreqStack {
        Map<Integer,Integer> count;
        List<Stack<Integer>> bucket;
        public FreqStack() {
            count = new HashMap<>();
            bucket = new LinkedList<>();
        }

        public void push(int x) {
            count.put(x,count.getOrDefault(x,0)+1);
            if (bucket.size()<count.get(x))
                bucket.add(new Stack<>());
            bucket.get(count.get(x)-1).add(x);
        }

        public int pop() {
            int poped = bucket.get(bucket.size()-1).pop();
            if (bucket.get(bucket.size()-1).size()==0)
                bucket.remove(bucket.size()-1);
            count.put(poped,count.get(poped)-1);
            if (count.get(poped)==0)
                count.remove(poped);
            return poped;
        }
    }
}
