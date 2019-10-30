package com.company;

import java.util.*;

public class Solution155_MinStack {
    class MinStack {
        int min;
        Stack<Integer> s;
        /** initialize your data structure here. */
        public MinStack() {
            min = Integer.MAX_VALUE;
            s = new Stack<>();
        }

        public void push(int x) {
            if (x<min){
                s.push(min);
                min = x;
            }
            s.push(x);
        }

        public void pop() {
            if (min ==s.pop()){
                min = s.pop();
            }

        }

        public int top() {
            return s.peek();
        }

        public int getMin() {
            return min;
        }
    }

}
