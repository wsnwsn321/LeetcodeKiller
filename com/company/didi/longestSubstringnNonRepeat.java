package com.company.didi;

import java.util.*;

public class longestSubstringnNonRepeat {
    public static void main(String[] args) {
        String[] i = new String[]{"abc", "yyy", "def", "csv"};
        solution(i);
    }
    static String res = "";
    public static int solution(String[] input){
        List<String> removed = new ArrayList<>();
        for(String x:input){
            boolean dup =false;
            for(char c:x.toCharArray()){
                if(x.indexOf(c)!=x.lastIndexOf(c)){
                    dup = true;
                    break;
                }
            }
            if(!dup) {
                removed.add(x);
                dup =false;
            }
        }
        String[] input2 = new String[removed.size()];
        for(int i=0;i<removed.size();++i){
            input2[i] = removed.get(i);
        }
        Set<String> visited = new HashSet<>();
        for (String x:input2){
            backtracking(x,new HashSet<>(),x,input2);
        }
        return res.length();
    }

    public static void backtracking(String cur,Set<String> visited,String curRes,String[] input){
        if (visited.containsAll(getNext(curRes,input))){
           if (curRes.length()>res.length())
               res = curRes;
           return;
        }
        visited.add(cur);
        Set<String> neighbour= getNext(curRes,input);
        for (String x:neighbour){
            if (visited.contains(x)) continue;
            curRes+=x;
            backtracking(x,visited,curRes,input);
            curRes = curRes.substring(0,curRes.length()-x.length());

        }
        visited.remove(cur);

    }

    public static Set<String> getNext(String cur,String[] input){
        Set<String> cand  = new HashSet<>();
        for (String x:input){
            boolean dup =false;
           for (int i=0;i<cur.length();++i){
               if (x.indexOf(cur.charAt(i))>=0){
                   dup =true;
                   break;
               }
           }
           if (!dup){
               cand.add(x);
               dup =false;
           }
        }
        return cand;
    }
}
