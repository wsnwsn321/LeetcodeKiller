package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution1163_LastSubstringinLexicographicalOrder {
         public String lastSubstring(String s) {
         List<String> subs = new ArrayList<>();
         for (int i=0;i<s.length();++i){
             backtracking(subs,"",s,i);
         }
         Collections.sort(subs);
         return subs.get(subs.size()-1);
     }

     public  void backtracking(List<String> subs, String cur,String s,int index){
         for (int i=index;i<s.length();++i){
             cur+=s.charAt(i);
             subs.add(cur);
         }
     }
}
