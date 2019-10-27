package com.company.pocketGem;

import java.util.HashMap;


public class Inventory {
    public class Item{
        String name;
        public boolean isQ(){return true;}
        public boolean isN(){return true;}
    }
    public Item lastItem;
    public HashMap<Item,Integer> questItems;
    public HashMap<Item,Integer> normalItems;

    public void getItem(Item i, int quatity){
        if (i.isQ()){
            questItems.put(i,questItems.getOrDefault(i,0)+quatity);
        }
        else{
            normalItems.put(i,normalItems.getOrDefault(i,0)+quatity);
        }
        lastItem = i;
    }

    public void loseItem(Item i, int quatity){
        if (i.isQ()){
            questItems.put(i,questItems.getOrDefault(i,0)-quatity);
        }
        else{
            normalItems.put(i,normalItems.getOrDefault(i,0)-quatity);
        }
        lastItem = i;
    }

}
