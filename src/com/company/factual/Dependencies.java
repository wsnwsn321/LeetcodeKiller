package com.company.factual;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dependencies {
    public static void main(String[] args) {
    }
    public int getDepemdencies(Map<String, List<String>> m, String target){

        List<String> res = new ArrayList<>();
        helper(m,target,res);
        return res.size();

    }

    public void helper(Map<String, List<String>> m, String target,List<String> res){
        if (!m.containsKey(target)) {
            res.add(target);
            return;
        }
        if (res.contains(target)) return;
        List<String> d = m.get(target);
        for (String x:d){
            if (res.contains(x)) continue;
            else{
                helper(m,x,res);
            }
        }
        res.add(target);
    }
}
