package com.company.Google;

import java.util.HashMap;
import java.util.Map;

public class firstTwiceChar {
    public static void main(String[] args) {

    }
    public char solution(String s){
        int index =s.length();
        Map<Character,Integer> count = new HashMap<>();
        for (char x:s.toCharArray()){
            count.put(x,count.getOrDefault(x,0)+1);
            if (count.get(x)>=2){
                index = Math.min(index,s.indexOf(x));
            }
        }
        return s.charAt(index);
    }
}
