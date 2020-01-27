package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution599_MinimumIndexSumOfTwoLists {
    public static void main(String[] args) {

    }
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) map.put(list1[i], i);
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i]) && i + map.get(list2[i]) <= minSum) {
                if (i + map.get(list2[i]) < minSum)
                    res.clear();
                minSum = i + map.get(list2[i]);
                res.add(list2[i]);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
