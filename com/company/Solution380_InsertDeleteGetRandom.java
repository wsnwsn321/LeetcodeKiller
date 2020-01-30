package com.company;

import java.util.*;

public class Solution380_InsertDeleteGetRandom {
    public static void main(String[] args) {

    }
    class RandomizedSet {
        Map<Integer, Integer> map;
        List<Integer> list;
        Random rand = new Random();

        /**
         * Initialize your data structure here.
         */
        public RandomizedSet() {
            map = new HashMap<>();
            list = new ArrayList<>();
        }

        /**
         * Inserts a value to the set. Returns true if the set did not already contain the specified element.
         */
        public boolean insert(int val) {
            if (map.containsKey(val)) return false;
            map.put(val, list.size());
            list.add(val);
            return true;
        }

        /**
         * Removes a value from the set. Returns true if the set contained the specified element.
         */
        public boolean remove(int val) {
            if (!map.containsKey(val)) return false;
            int last = list.get(list.size() - 1);
            int index = map.get(val);
            list.set(index, last);
            list.remove(list.size() - 1);
            map.put(last, index);
            map.remove(val);
            return true;
        }

        /**
         * Get a random element from the set.
         */
        public int getRandom() {
            int r = rand.nextInt(list.size());
            return list.get(r);
        }
    }
}
