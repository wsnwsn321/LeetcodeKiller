package com.company.Broadway;

import java.util.*;

public class TopFrequent {
    int k;
    Map<String, Integer> m;
    PriorityQueue<String> p;
    Map<String, Double> mPrice;
    public TopFrequent(int k){
        m = new HashMap<>();
        mPrice = new HashMap<>();
        p = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return m.get(o1)-m.get(o2);
            }
        });
        this.k =k;
    }
    public  void add(String name,int price){
        m.put(name,m.getOrDefault(m,0)+1);
        if (!mPrice.containsKey(name)) mPrice.put(name,(double)price);
        else {
            double avg = (mPrice.get(name)+price)/2.0;
            mPrice.put(name,avg);
        }
        p.add(name);
        if (p.size()>k){
            p.poll();
        }
    }
    public List<String> topK(int k){
        List<String> res = new ArrayList<>();
        for (String x: p){
            res.add(x);
        }
        Collections.reverse(res);
        return res;
    }
    public double avgPrice(String name){
        return mPrice.get(name);
    }
}
