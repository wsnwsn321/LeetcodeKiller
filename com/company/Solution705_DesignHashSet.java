package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution705_DesignHashSet {
    public static void main(String[] args) {

    }
    class MyHashSet {

        /** Initialize your data structure here. */
        List<Integer> ls = new ArrayList<>();
        public MyHashSet() {

        }

        public void add(int key) {
            if(!ls.contains(key)) ls.add(key);
        }

        public void remove(int key) {
            if(ls.contains(key)) ls.remove(Integer.valueOf(2));


        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            return ls.contains(key);
        }
    }
}
