package com.company;

import java.util.*;

public class Solution127_WordLadder {
    public static void main(String[] args) {

    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> q = new LinkedList<>();
        Set<String> wl = new HashSet<>(wordList);
        if (!wordList.contains(endWord)) return 0;
        int res=1;
        //Set<String> visited = new HashSet<>();
        q.offer(beginWord);
        while (!q.isEmpty()){
            int size = q.size();
            while (size>0){
                String cur = q.poll();
                if (cur.equals(endWord)) return res;
                //visited.add(cur);
                for (String x:neighbors(cur,wl)){
                    q.offer(x);
                }
                size--;
            }
            res++;
        }
        return res;
    }
    public List<String> neighbors(String s, Set<String> wordList){
        List<String> res = new LinkedList<>();
        for(int i=0;i<s.length();i++){
            char [] chars = s.toCharArray();
            for(char ch = 'a'; ch <= 'z'; ch++){
                chars[i] = ch;
                String word = new String(chars);
                if(wordList.remove(word)){
                    res.add(word);
                }
            }
        }
        return res;
    }
}

