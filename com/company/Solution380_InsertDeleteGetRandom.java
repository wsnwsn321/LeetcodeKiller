package com.company;

import java.util.*;

public class Solution380_InsertDeleteGetRandom {
    public static void main(String[] args) {

    }
    class RandomizedSet {
        List<Integer> list;
        Map<Integer,Integer> map;

        /** Initialize your data structure here. */
        public RandomizedSet() {
            list = new ArrayList<>();
            map = new HashMap<>();
        }

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            if (map.containsKey(val)) return false;
            list.add(val);
            map.put(val,list.size()-1);
            return true;
        }

        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            if (!map.containsKey(val)) return false;
            int index = map.get(val);
            list.set(index,list.get(list.size()-1));
            list.remove(list.size()-1);
            map.remove(val);
            return true;
        }

        /** Get a random element from the set. */
        public int getRandom() {
            Random rand = new Random();
            int r = rand.nextInt(list.size());
            return list.get(r);
        }
    }
}
