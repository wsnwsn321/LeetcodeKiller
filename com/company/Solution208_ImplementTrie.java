package com.company;

public class Solution208_ImplementTrie {
    public static void main(String[] args) {

    }
    class TrieNode {
        public char val;
        public boolean isWord;
        public TrieNode[] children = new TrieNode[26];
        public TrieNode() {}
        TrieNode(char c){
            TrieNode node = new TrieNode();
            node.val = c;
        }
    }
    class Trie {
        /** Initialize your data structure here. */
        TrieNode root;
        public Trie() {
            root = new TrieNode();
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            TrieNode node = root;
            for (char x:word.toCharArray()){
                if (node.children[x-'a']==null){
                    node.children[x-'a'] = new TrieNode(x);
                }
                node = node.children[x-'a'];
            }
            node.isWord = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode node = root;
            for (char x:word.toCharArray()){
                if (node.children[x-'a']==null) return false;
                node = node.children[x-'a'];
            }
            return node.isWord;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode node = root;
            for (char x:prefix.toCharArray()){
                if (node.children[x-'a']==null) return false;
                node = node.children[x-'a'];
            }
            return true;
        }
    }
}
