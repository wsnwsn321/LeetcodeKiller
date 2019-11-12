package com.company;

import java.nio.charset.CharacterCodingException;
import java.util.HashSet;
import java.util.Set;

public class Solution771_JewelsandStones {
    public static void main(String[] args) {
    String J = "z";
    String S = "ZZ";
    System.out.println(numJewelsInStones(J,S));
    }
    public static int numJewelsInStones(String J, String S) {
        Set<Character> js = new HashSet<>();
        for (char x: J.toCharArray())
            js.add(x);
        int res =0;
        for (char x:S.toCharArray()){
            if (js.contains(x))
                res++;
        }
        return res;
    }
}
