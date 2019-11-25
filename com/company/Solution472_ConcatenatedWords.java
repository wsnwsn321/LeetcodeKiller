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
        TrieNode cur = root;
        int n = chars.length;
        for (int i = index; i < n; i++) {
            if (cur.children[chars[i] - 'a'] == null) {
                return false;
            }
            if (cur.children[chars[i] - 'a'].isEnd) {
                if (i == n - 1) { // no next word, so test count to get result.
                    return count >= 1;
                }
                if (testWord(chars, i + 1, root, count + 1)) {
                    return true;
                }
            }
            cur = cur.children[chars[i] - 'a'];
        }
        return false;
    }

    public TrieNode buildTrie(String[] words){
        TrieNode root = new TrieNode();
        for (String w:words){
            TrieNode node = root;
            for (char c:w.toCharArray()){
                if (node.children[c-'a']==null){
                    node.children[c-'a'] = new TrieNode(c);
                }
                node = node.children[c-'a'];
            }
            node.isEnd = true;
        }
        return root;
    }
}

