package com.company;

import java.util.Arrays;
import java.util.Map;

public class Solution205_IsomorphicStrings {
    public static void main(String[] args) {
        String a = "egg";
        String b = "add";
        isIsomorphic(a,b);
    }
    public static boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length())
            return false;
        int[] map1 = new int[128];
        int[] map2 = new int[128];
        Arrays.fill(map1,-1);
        Arrays.fill(map2,-1);
        for (int i=0;i<s.length();++i){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map1[c1]!=map2[c2])
                return false;
            map1[c1] =map2[c2] = i;
        }
        return true;
    }
}
