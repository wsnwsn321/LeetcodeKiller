package com.company;

import java.util.*;

public class Solution155_MinStack {
    class MinStack {
        PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        int top;
        List<Integer> t = new ArrayList<>();
        /** initialize your data structure here. */
        public MinStack() {


        }

        public void push(int x) {
            q.add(x);
            t.add(x);
        }

        public void pop() {
           q.remove(top);
           t.remove(t.size()-1);
        }

        public int top() {
            return t.get(t.size()-1);
        }

        public int getMin() {
            return q.peek();
        }
    }

}
