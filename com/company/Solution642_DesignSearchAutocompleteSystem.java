package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution642_DesignSearchAutocompleteSystem {
    class AutocompleteSystem {
        class TrieNode{
            TrieNode[] children = new TrieNode[26];
            int times;
            String word;
            TrieNode(){}
        }
        TrieNode root;
        String cur_word;
        public AutocompleteSystem(String[] sentences, int[] times) {
            root = buildTrie(sentences,times);
        }

        public List<String> input(char c) {
            if (c=='#'){
                insert(cur_word);
                cur_word = "";
            }
            else {
                cur_word+=c;

            }
            return new ArrayList<>();
        }

        public TrieNode buildTrie(String[] sentences, int[] times){
            TrieNode root = new TrieNode();
            for (int i=0;i<sentences.length;++i){
                String cur = sentences[i];
                for (char ch:cur.toCharArray()){
                    if (root.children[ch-'a']==null)
                        root.children[ch-'a'] = new TrieNode();
                    root = root.children[ch-'a'];
                }
                root.times = times[i];
                root.word = cur;
            }
            return root;
        }

        public void insert(String word){
            TrieNode node = root;
            for (char ch:word.toCharArray()){
                if (node.children[ch-'a']==null)
                    node.children[ch-'a'] = new TrieNode();
                node = node.children[ch-'a'];
            }
            node.times+=1;
            node.word = word;
        }
        public List<String> findWords(TrieNode root,String cur_word){
            TrieNode node = root;
            for (char ch:cur_word.toCharArray()){
                if (node.children[ch-'a']==null)
                    return new ArrayList<>();
                node = node.children[ch-'a'];
            }
            Map<String,Integer> map = new HashMap<>();
            travel(node,map);
            return new ArrayList<>();
        }
        public void travel(TrieNode node,Map<String,Integer> res){
            if (node.word!=null)
                res.put(node.word,node.times);
            for (char i = 'a'; i <= 'z'; i++) {
                if (node.children[i - 'a'] != null)
                    travel( node.children[i - 'a'], res);
            }
        }
    }
}
