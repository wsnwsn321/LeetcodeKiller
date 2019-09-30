package com.company;

import java.util.*;

public class Solution146_LRUCache {
    class LRUCache {

        Map<Integer,Integer> m;
        Deque<Integer> deque;
        int capacity;
        public LRUCache(int capacity) {
            deque = new LinkedList<Integer>();
            m = new HashMap<>();
            this.capacity = capacity;
        }

        public int get(int key) {
            deque.remove(key);
            deque.addLast(key);
            return m.containsKey(key)?m.get(key):-1;
        }

        public void put(int key, int value) {

            m.put(key,value);
            deque.addLast(key);
            if (deque.size()>capacity){
                int removedKey = deque.pollFirst();
                m.put(removedKey,-1);
            }
        }
    }
}
