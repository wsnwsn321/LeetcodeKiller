package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution705_DesignHashSet {
    public static void main(String[] args) {

    }
    class MyHashSet {
        boolean[] nodes = new boolean[10000];
        /** Initialize your data structure here. */
        public MyHashSet() {

        }

        public void add(int key) {
            int hashCode = key%nodes.length;
            nodes[hashCode] =true;
        }

        public void remove(int key) {
            int hashCode = key%nodes.length;
            nodes[hashCode] = false;
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            int hashCode = key%nodes.length;
            return nodes[hashCode];
        }
    }
}
