package com.company.CompanyList.Oracle;

import java.util.TreeMap;

public class WarehouseManager {

    TreeMap<Integer,Integer> boxes;
    public WarehouseManager(){
        boxes = new TreeMap<>();
    }

    public void addBox(int capacity, int number){
        boxes.put(capacity,boxes.getOrDefault(capacity,0)+number);
    }

    public boolean getBox(int weight){
        Integer nextGreater = boxes.ceilingKey(weight);
        if (nextGreater==null||boxes.get(nextGreater)==0)
            return false;
        boxes.put(nextGreater, boxes.get(nextGreater)-1);
        return true;
    }
}
