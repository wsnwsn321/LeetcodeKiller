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
           TrieNode cur  = root;
           for (char x:word.toCharArray()){
               if (cur.children[x-'a']==null)
                   cur.children[x-'a'] = new TrieNode(x);
               cur = cur.children[x-'a'];
           }
           cur.isWord = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode cur = root;
            for (char x: word.toCharArray()){
                if (cur.children[x-'a']==null) return false;
                cur = cur.children[x-'a'];
            }
            return cur.isWord;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode cur = root;
            for (char x: prefix.toCharArray()){
                if (cur.children[x-'a']==null) return false;
                cur = cur.children[x-'a'];
            }
            return true;
        }
    }
}
