package com.company;

import java.util.*;

public class Solution155_MinStack {
    class MinStack {

        /** initialize your data structure here. */
        List<Integer> l;
        PriorityQueue<Integer> p;
        public MinStack() {
            l = new ArrayList<>();
            p = new PriorityQueue<>();
        }

        public void push(int x) {
            l.add(x);
            p.add(x);
        }

        public void pop() {
            int top = l.remove(l.size()-1);
            p.remove(top);
        }

        public int top() {
            return l.get(l.size()-1);
        }

        public int getMin() {
            return p.peek();
        }
    }

}
