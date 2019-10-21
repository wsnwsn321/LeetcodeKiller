package com.company;

import java.util.*;

public class Solution155_MinStack {
    class MinStack {
        Stack<Integer> s;
        int min;
        /** initialize your data structure here. */
        public MinStack() {
            s = new Stack<>();
            min = Integer.MAX_VALUE;
        }

        public void push(int x) {
            if (x<=min){
                s.push(min);
                min =x;
            }
            s.push(x);
        }

        public void pop() {
            int top = s.pop();
            if (min==top)
                min = s.pop();
        }

        public int top() {
            return s.peek();
        }

        public int getMin() {
            return min;
        }
    }

}
