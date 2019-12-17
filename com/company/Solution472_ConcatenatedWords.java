package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution472_ConcatenatedWords {
    public static void main(String[] args) {
        String[] s = {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"};
    }
    class TrieNode {
        public char val;
        public boolean isEnd;
        public TrieNode[] children = new TrieNode[26];
        public TrieNode() {}
        TrieNode(char c){
            TrieNode node = new TrieNode();
            node.val = c;
        }
    }
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> res = new ArrayList<String>();
        if (words == null || words.length == 0) {
            return res;
        }
        TrieNode root = buildTrie(words);
        for (String word : words) { // test word is a concatenated word or not
            if (word.length() == 0) {
                continue;
            }
            if (testWord(word.toCharArray(), 0, root, 0)) {
                res.add(word);
            }
        }
        return res;

    }

    public boolean testWord(char[] chars, int index, TrieNode root, int count) { // count means how many words during the search path
        TrieNode node = root;
        for (int i=0;i<chars.length;++i){
            char ch = chars[i];
            if (node.children[ch-'a']==null)
                return false;
            if (node.children[ch-'a'].isEnd){
                //reach end of word, check if there're multiple words composing this word
                if (i==chars.length){
                    return count>=1;
                }
                if (testWord(chars,i+1,root,count+1))
                    return true;
            }
            node = node.children[ch-'a'];
        }
        return false;
    }

    public TrieNode buildTrie(String[] words){
        TrieNode root = new TrieNode();
        for (String s:words){
            TrieNode node = root;
            for (char ch:s.toCharArray()){
                if (node.children[ch-'a']==null)
                    node.children[ch-'a'] = new TrieNode();
                node = node.children[ch-'a'];
            }
            node.isEnd = true;
        }
        return root;
    }
}

