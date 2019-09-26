package com.company.Broadway;

import java.util.HashMap;
import java.util.Map;

public class TopFrequent {
    public static void main(String[] args) {

    }
    //time:     O(n)
    //space:    O(n)
    public static String topFreq(String[] names){
        Map<String, Integer> m = new HashMap<>();
        int min = Integer.MIN_VALUE;
        String res = "";
        for (String x: names){
            m.put(x,m.getOrDefault(x,0)+1);
            if (m.get(x)>min) {
                min = m.get(x);
                res = x;
            }
        }
        return res;
    }
}
