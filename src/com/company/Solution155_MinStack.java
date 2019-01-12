package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution155_MinStack {
    class MinStack {

        List<Integer> s = new ArrayList<>();
        List<Integer> minS = new ArrayList<>();

        /** initialize your data structure here. */
        public MinStack() {

        }

        public void push(int x) {
            s.add(x);
            if(minS.size()==0) minS.add(x);
            else{
                if(minS.get(0)>=x) minS.add(0,x);
            }
        }

        public void pop() {
            int p =s.remove(s.size()-1);
            if(minS.get(0)==p) minS.remove(0);
        }

        public int top() {
            return s.get(s.size()-1);
        }

        public int getMin() {
            return minS.get(0);
        }
    }

}
