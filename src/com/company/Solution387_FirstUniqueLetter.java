package com.company;

import java.util.HashMap;
import java.util.Map;

public class Solution387_FirstUniqueLetter {
    public static void main(String[] args) {

    }
    public int firstUniqChar(String s) {
//        int min =s.length();
//        Map<Character,Integer> m = new HashMap<>();
//        char[] cs = s.toCharArray();
//        for(char x:cs){
//            if(m.containsKey(x)){
//                int v = m.get(x);
//                m.put(x,v+1);
//            }else{
//                m.put(x,1);
//            }
//        }
//        for (Map.Entry<Character,Integer> entry : m.entrySet()){
//            if(entry.getValue()==1) {
//                min =Math.min(s.indexOf(entry.getKey()),min);
//            }
//        }
//        if(min==s.length()) return -1;
//        else return min;
        int min = s.length();
        char[] cs = s.toCharArray();
        for(char x:cs){
            if(s.indexOf(x)==s.lastIndexOf(x)){
                min = Math.min(s.indexOf(x),min);
            }
        }
        if(min==s.length()) return -1;
        else return min;


}
}
