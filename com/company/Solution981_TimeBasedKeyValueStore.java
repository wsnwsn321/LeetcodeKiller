package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution981_TimeBasedKeyValueStore {
    class TimeMap {
        Map<String, TreeMap<Integer,String>> map;
        /** Initialize your data structure here. */
        public TimeMap() {
            map = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            if (!map.containsKey(key))
                map.put(key,new TreeMap<>());
            map.get(key).put(timestamp,value);
        }

        public String get(String key, int timestamp) {
            if (!map.containsKey(key))
                return "";
            int max_time= map.get(key).floorKey(timestamp);
            return map.get(key).get(max_time)==null?"":map.get(key).get(max_time);
        }
    }

}
