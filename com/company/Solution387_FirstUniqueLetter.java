package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution387_FirstUniqueLetter {
    public static void main(String[] args) {

    }
    public int firstUniqChar(String s) {
        int[] letters  = new int[26];
        char[] cs = s.toCharArray();
        for(char x: cs){
            int pos = (int) x-97;
            letters[pos]+=1;
        }
        for(int i=0;i<letters.length;++i){
            if(letters[i]==1) return s.indexOf((char)97+i);
        }
        return-1;

}
}
