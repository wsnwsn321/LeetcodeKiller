package com.company.CompanyList.Broadway;

import java.util.*;

public class TopKDataStream {

    Map<String,Integer> count;
    PriorityQueue<String> p;
    int k;
    public TopKDataStream(int k){
        count = new HashMap<>();
        p = new PriorityQueue<>(new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                return count.get(a)-count.get(b);
            }
        });
        this.k = k;
    }
    public  void add(String name,int price){
        count.put(name,count.getOrDefault(name,0)+1);
        if (p.contains(name)) p.remove(name);
        if (p.size()<k) p.add(name);
        else{
            if (count.get(name)>count.get(p.peek())){
                p.poll();
                p.add(name);
            }
        }
    }

    public void topK(){

    }
}
