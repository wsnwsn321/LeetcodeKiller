package com.company;

import java.util.HashSet;
import java.util.Set;

public class Solution208_ImplementTrie {
    public static void main(String[] args) {

    }
    class TrieNode {
        private TrieNode[] child;

        private final int R = 26;

        private boolean isEnd;

        public TrieNode() {
            child = new TrieNode[R];
        }

        public boolean containsKey(char ch) {
            return child[ch -'a'] != null;
        }
        public TrieNode getNext(char ch) {
            return child[ch -'a'];
        }
        public void put(char ch, TrieNode node) {
            child[ch -'a'] = node;
        }
        public void setEnd() {
            isEnd = true;
        }
        public boolean isEnd() {
            return isEnd;
        }
    }
    class Trie {
        TrieNode root;
        /** Initialize your data structure here. */
        public Trie() {
            root = new TrieNode();
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            TrieNode node = root;
            char[] cs = word.toCharArray();
            for (int i=0;i<word.length();++i){
                if (!node.containsKey(cs[i])) {
                    node.put(cs[i],new TrieNode());
                }
                node = node.getNext(cs[i]);
            }
            node.setEnd();
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode node = root;
            char[] cs = word.toCharArray();
            for (char x:cs){
                if (node.containsKey(x)) {
                    node = node.getNext(x);
                }
                else return false;
            }
            return node.isEnd();
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode node = root;
            char[] cs = prefix.toCharArray();
            for (char x:cs){
                if (node.containsKey(x)) {
                    node = node.getNext(x);
                }
                else return false;
            }
            return true;
        }
    }
}
