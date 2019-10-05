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
           TrieNode cur = root;
           for (int i=0;i<word.length();++i){
               if (cur.children[word.charAt(i)-'a']==null){
                   TrieNode temp = new TrieNode(word.charAt(i));
                   cur.children[word.charAt(i)-'a'] = temp;
               }
               cur = cur.children[word.charAt(i)-'a'];
           }
           cur.isWord = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode cur = root;
            for (int i=0;i<word.length();++i){
                if (cur.children[word.charAt(i)-'a']==null){
                    return false;
                }
                cur = cur.children[word.charAt(i)-'a'];
            }
            return cur.isWord;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode cur = root;
            for (int i=0;i<prefix.length();++i){
                if (cur.children[prefix.charAt(i)-'a']==null){
                    return false;
                }
                cur = cur.children[prefix.charAt(i)-'a'];
            }
            return true;
        }
    }
}
