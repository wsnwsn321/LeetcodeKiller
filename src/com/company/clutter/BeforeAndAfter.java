package com.company.clutter;

import java.util.*;

public class BeforeAndAfter {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("mission statement");
        l.add("a bit eat");
        l.add("a chip off block");
        l.add("chocolate bar");
        l.add("mission impossible");
        l.add("a man on a mission");
        l.add("block party");
        l.add("eat my words");
        l.add("bar of soap");
        beforeNAfter(l);

    }
    public static List<String> beforeNAfter(List<String> phrases){
        Map<String,List<Integer>> count= new HashMap<>();
        List<String> res = new ArrayList<>();
        for (int i=0;i<phrases.size();++i){
            String cur = phrases.get(i);
            String head = cur.substring(0,cur.indexOf(' '));
            count.putIfAbsent(head, new ArrayList<>());
            count.get(head).add(i);
        }
        for (int i=0;i< phrases.size();++i){
            String cur = phrases.get(i);
            String tail = cur.substring(cur.lastIndexOf(' ')+1,cur.length());
            if (count.containsKey(tail)){
                List<Integer> nums = count.get(tail);
                for(Integer index : nums) {
                    if(i != index) {
                        String temp = phrases.get(index);
                        res.add(cur + temp.substring(temp.indexOf(' ')));
                    }
                }
            }
        }
        return res;
    }
}
