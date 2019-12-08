package com.company;

import java.util.*;

public class Solution460_LFUCache {

    class LFUCache {
        HashMap<Integer, Integer> vals;
        HashMap<Integer, Integer> counts;
        //lists store list of keys(as value) with particular counts(as key)
        HashMap<Integer, Queue<Integer>> lists;
        int cap;
        int min;

        public LFUCache(int capacity) {
            vals = new HashMap<>();
            counts = new HashMap<>();
            lists = new HashMap<>();
            cap = capacity;
            min = 0;
        }

        public int get(int key) {
            if(!vals.containsKey(key))
                return -1;
            update(key);
            return vals.get(key);
        }

        //update frequency
        private void update (int key) {
            int freq = counts.get(key);
            counts.put(key,counts.get(key)+1);
            lists.get(freq).remove(key);
            //update min frequency if no element has current lowest frequency
            if (min==freq&& lists.get(freq).size()==0)
                min++;
            //update frequency of key in lists
            if (!lists.containsKey(freq+1))
                lists.put(freq+1,new LinkedList<>());
            lists.get(freq+1).add(key);
        }


        //remove the key with lowest frequency
        private void evict () {
            int removed = lists.get(min).poll();
            vals.remove(removed);
            counts.remove(removed);
        }

        public void put(int key, int value) {
            if (cap <= 0)
                return;

            if (vals.containsKey(key)) {
                vals.put(key, value);
                update(key);
                return;
            }

            if (vals.size() >= cap)
                evict();

            vals.put(key, value);
            counts.put(key, 1);

            if(!lists.containsKey(1))
                lists.put(1, new LinkedList<>());
            lists.get(1).offer(key);
            min = 1;
        }
    }
}
