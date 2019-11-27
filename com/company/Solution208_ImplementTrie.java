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

        TrieNode root;
        /** Initialize your data structure here. */
        public Trie() {
            root = new TrieNode();
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            TrieNode node = root;
            for (char ch:word.toCharArray()){
                if (node.children[ch-'a']==null)
                    node.children[ch-'a'] = new TrieNode();
                node = node.children[ch-'a'];
            }
            node.isWord = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode node = root;
            for (char ch:word.toCharArray()){
                if (node.children[ch-'a']==null)
                    return false;
                node = node.children[ch-'a'];
            }
            return node.isWord;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode node = root;
            for (char ch:prefix.toCharArray()){
                if (node.children[ch-'a']==null)
                    return false;
                node = node.children[ch-'a'];
            }
            return true;
        }
    }
}
