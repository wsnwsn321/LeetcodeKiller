package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution438_FindAllAnagramsinaString {
    public static void main(String[] args) {

    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int sl = s.length();
        int pl = p.length();
        int[] pcount = new int[26];
        int[] sw = new int[26];
        for(char c:p.toCharArray()){
            pcount[c-'a']++;
        }
        char[] sc = s.toCharArray();
        for(int i=0;i<sc.length;++i){
            if(i>=pl) sw[sc[i-pl]-'a']--;
            sw[sc[i]-'a']++;
            if(Arrays.equals(pcount,sw))
                res.add(i-pl+1);
        }
        return res;
    }
}
