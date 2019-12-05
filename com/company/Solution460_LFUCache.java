package com.company;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Solution460_LFUCache {

    class LFUCache {
        HashMap<Integer, Integer> vals;
        HashMap<Integer, Integer> counts;
        HashMap<Integer, LinkedHashSet<Integer>> lists;
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
            int cnt = counts.get(key);
            counts.put(key, cnt + 1);
            lists.get(cnt).remove(key);

            if(cnt == min && lists.get(cnt).size() == 0)
                min++;

            if(!lists.containsKey(cnt))
                lists.put(cnt, new LinkedHashSet<>());

            lists.get(cnt).add(key);
        }


        //remove the key with lowest frequency
        private void evict () {
            int key = lists.get(min).iterator().next();
            lists.get(min).remove(key);
            vals.remove(key);
            counts.remove(key);
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
            //put key into the head of lists whose count is all 1
            if(!lists.containsKey(1))
                lists.put(1, new LinkedHashSet<>());
            lists.get(1).add(key);
            min = 1;
        }
    }

}
