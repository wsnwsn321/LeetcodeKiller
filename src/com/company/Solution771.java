package com.company;

import java.nio.charset.CharacterCodingException;

public class Solution771 {
    public static void main(String[] args) {
    String J = "z";
    String S = "ZZ";
    System.out.println(numJewelsInStones(J,S));
    }
    public static int numJewelsInStones(String J, String S) {
        int num =0;
        for(int i=0;i<J.length();i++){
            while(S.contains(J.substring(i,i+1))){
                num++;
                S= S.substring(0,S.indexOf(J.substring(i,i+1)))+S.substring(S.indexOf(J.substring(i,i+1))+1,S.length());
            }
        }
        return num;
    }
}
