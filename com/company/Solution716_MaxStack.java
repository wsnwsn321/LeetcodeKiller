package com.company;

import java.util.Stack;

public class Solution716_MaxStack {
    class MaxStack {
        Stack<Integer> s;
        int max;
        /** initialize your data structure here. */
        public MaxStack() {
            s = new Stack<>();
            max = Integer.MIN_VALUE;
        }

        public void push(int x) {
            if (max<=x){
                s.push(max);
                max = x;
            }
            s.push(x);
        }

        public int pop() {
            int top = s.pop();
            if (top==max){
                max = s.pop();
            }
            return top;
        }

        public int top() {
            return s.peek();
        }

        public int peekMax() {
            return max;
        }

        public int popMax() {
            int max = peekMax();
            Stack<Integer> temp = new Stack<>();
            while (top()!=max){
                temp.push(pop());
            }
            pop();
            while (temp.size()>0)
                push(temp.pop());
            return max;
        }
    }
}
