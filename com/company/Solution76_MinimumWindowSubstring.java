package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution76_MinimumWindowSubstring {
    public static void main(String[] args) {
        String s="a";
        String t = "b";
        minWindow(s,t);
    }
    //time:     O(s+t)
    //space:    O(s+t)
    public static String minWindow(String s, String t) {
        Map<Character,Integer> tMap = new HashMap<>();
        int tLength=0;
        for (char ct:t.toCharArray()){
            tMap.put(ct,tMap.getOrDefault(ct,0)+1);
        }
        tLength = tMap.size();
        Map<Character,Integer> windowCount = new HashMap<>();
        int current=0;
        int minL=Integer.MAX_VALUE,fl=0,fr=0;
        int l=0;
        char[] cs = s.toCharArray();
        for (int i=0;i<s.length();++i){
            windowCount.put(cs[i],windowCount.getOrDefault(cs[i],0)+1);
            if (tMap.containsKey(cs[i])&&tMap.get(cs[i])==windowCount.get(cs[i])){
                current++;
            }
            while (l<i&&current==tLength){
                if (i-l<minL){
                    minL = i-l;
                    fl=l;
                    fr =i;
                }
                windowCount.put(cs[l],windowCount.get(cs[l])-1);
                if (tMap.containsKey(cs[l])&&tMap.get(cs[l])>windowCount.get(cs[l])){
                    current--;
                }
                l++;
            }
        }
        return minL==Integer.MAX_VALUE?"":s.substring(fl,fr+1);
    }

}
