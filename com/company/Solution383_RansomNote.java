package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution383_RansomNote {
    public static void main(String[] args) {
        String r = "aadgdfg";
        String m ="aab";
        canConstruct(r,m);

    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] mc = magazine.toCharArray();
        char[] rc = ransomNote.toCharArray();
        boolean contain =false;
        for(int i=0; i < rc.length; ++i){
            for(int j=0;j<mc.length;++j){
                if(rc[i]==(mc[j])){
                    mc[j] =' ';
                    contain =true;
                    break;
                }
            }
            if(!contain) return false;
            contain =false;
        }
        return true;
    }
}
