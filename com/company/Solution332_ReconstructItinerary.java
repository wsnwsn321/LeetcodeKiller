package com.company;

import java.util.*;

public class Solution332_ReconstructItinerary {
    public static void main(String[] args) {

    }
    List<String> res = new ArrayList<>();
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> flights = new HashMap<>();
        for (List<String> t:tickets){
            if (!flights.containsKey(t.get(0)))
                flights.put(t.get(0),new PriorityQueue<>());
            flights.get(t.get(0)).offer(t.get(1));
        }
        dfs(flights,"JFK");
        return res;
    }

    public void dfs(Map<String,PriorityQueue<String>> flights,String cur){
        PriorityQueue<String> cities = flights.get(cur);
        while (cities!=null&&cities.size()>0){
            dfs(flights,cities.poll());
        }
        res.add(0,cur);
    }
}
