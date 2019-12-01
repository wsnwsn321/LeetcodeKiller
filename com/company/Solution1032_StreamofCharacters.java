package com.company;

public class Solution1032_StreamofCharacters {
    public static void main(String[] args) {

    }
    class StreamChecker {

        class TrieNode{
            char c;
            TrieNode[] children = new TrieNode[26];
            boolean isWord;
            //TrieNode(){}
        }
        TrieNode root = new TrieNode();
        StringBuilder cur = new StringBuilder();
        public StreamChecker(String[] words) {
            root = buildTrie(words);
        }

        public boolean query(char letter) {
            cur.append(letter);
            TrieNode node = root;
            for (int i = cur.length() - 1; i >= 0 && node != null; i--) {
                char c = cur.charAt(i);
                node = node.children[c - 'a'];
                if (node != null && node.isWord) {
                    return true;
                }
            }
            return false;
        }

        public TrieNode buildTrie(String[] word){
            for (String w:word){
                TrieNode node = root;
                for (int i = w.length() - 1; i >= 0; i--) {
                    char ch = w.charAt(i);
                    if (node.children[ch-'a']==null)
                        node.children[ch-'a'] = new TrieNode();
                    node = node.children[ch-'a'];
                }
                node.isWord = true;
            }
            return root;
        }
    }

}
