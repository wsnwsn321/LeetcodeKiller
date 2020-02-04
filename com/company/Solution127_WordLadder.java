package com.company;

import java.util.*;

public class Solution127_WordLadder {
    public static void main(String[] args) {

    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> q = new LinkedList<>();
        Set<String> list = new HashSet<>(wordList);
        if (!list.contains(endWord)) return 0;
        int length=0;
        q.offer(beginWord);
        while (q.size()>0){
            int size = q.size();
            for (int i=0;i<size;++i){
                String cur = q.poll();
                if (cur.equals(endWord))
                    return length;
                for (String x:neighbors(cur,list)){
                    q.offer(x);
                }
            }
            length++;
        }
        return 0;
    }

    public List<String> neighbors(String s, Set<String> wordList) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < s.length(); ++i) {
            char[] sc = s.toCharArray();
            for (char j = 'a'; j <= 'z'; j++) {
                sc[i] = j;
                if (wordList.remove(String.valueOf(sc)))
                    res.add(String.valueOf(sc));
            }
        }
        return res;
    }
}

