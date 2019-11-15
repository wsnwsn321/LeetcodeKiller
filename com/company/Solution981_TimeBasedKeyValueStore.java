package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution981_TimeBasedKeyValueStore {
    class TimeMap {
        Map<String,TreeMap<Integer,String>> map;
        /** Initialize your data structure here. */
        public TimeMap() {
            map = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            if (!map.containsKey(key)){
                map.put(key,new TreeMap<>());
            }
            map.get(key).put(timestamp,value);
        }

        public String get(String key, int timestamp) {
            if (!map.containsKey(key))
                return "";
            TreeMap<Integer,String> val = map.get(key);
            Integer pre_time = val.floorKey(timestamp);
            return pre_time==null?"":val.get(pre_time);
        }
    }


}
