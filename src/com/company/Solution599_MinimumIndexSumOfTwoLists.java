package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution599_MinimumIndexSumOfTwoLists {
    public static void main(String[] args) {

    }
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> s = new HashMap<>();
        List<String> r = new ArrayList<>();
        int minSum =list1.length+list2.length;
        for(int i=0;i<list1.length;++i){
            for(int j=0;j<list2.length;++j){
                if(list2[j].equals(list1[i])){
                    if(i+j<=minSum){
                        s.put(list1[i],i+j);
                        minSum=i+j;
                    }
                }
            }
        }

        for(Map.Entry<String,Integer> e:s.entrySet()){
            if(e.getValue()==minSum) r.add(e.getKey());

        }
        String[] result = new String[r.size()];
        int count=0;
        for(String x:r){
            result[count++] = x;
        }
        return result;

    }
}
