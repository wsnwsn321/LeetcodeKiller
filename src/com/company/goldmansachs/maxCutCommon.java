package com.company.goldmansachs;

import java.util.HashMap;
import java.util.Map;

public class maxCutCommon {
    public static void main(String[] args) {

    }
    public int maxCommon(String s){
        int max = 0,cur = 0;
        if(s.length()==1) return 0;
        Map<Character, Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        boolean[] common = new boolean[26];
        for(int i = 0; i < s.length()-1; i++){
            char c = s.charAt(i);
            int t = map.get(c);
            if(t == 1 && common[c-'a']) cur--;
            else if(t > 1 && !common[c-'a']){
                common[c-'a'] = true;
                cur++;
            }
            map.put(c,t-1);
            max = Math.max(max, cur);
        }
        return max;

    }
}
