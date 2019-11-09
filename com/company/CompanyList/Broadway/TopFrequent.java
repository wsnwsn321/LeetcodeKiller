package com.company.CompanyList.Broadway;

import java.util.*;


public class TopFrequent {
    public static void main(String[] args) {
        TopFrequent t = new TopFrequent(2);
        t.add("B",1);
        t.add("B",1);
        t.add("B",1);
        t.add("B",1);
        t.add("A",1);
        t.add("A",1);
        t.add("D",1);
        t.add("D",1);
        t.add("D",1);
        t.add("D",1);

    }
    int k;
    private Map<String, Integer> m;
    private PriorityQueue<String> p;
    private Map<String, Double> mPrice;
    private TreeSet<String> ts;
    public TopFrequent(int k){
        m = new HashMap<>();
        mPrice = new HashMap<>();
        ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return m.get(o2)-m.get(o1);
            }
        });
        this.k =k;
    }
    public  void add(String name,int price){
        m.put(name,m.getOrDefault(name,0)+1);

        if (ts.size()<k){
            ts.add(name);
        }
        else {
            if (m.get(name)>m.get(ts.last())){
                ts.pollLast();
                ts.add(name);
            }
        }
        topK();
    }
    public void topK(){
        for (String x:ts){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public double avgPrice(String name){
        return mPrice.get(name);
    }
}
