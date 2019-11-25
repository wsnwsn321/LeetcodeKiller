package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution212_WordSearchII {
    public static void main(String[] args) {

    }
    class TrieNode {
        public char val;
        public String word;
        public TrieNode[] children = new TrieNode[26];
        public TrieNode() {}
        TrieNode(char c){
            TrieNode node = new TrieNode();
            node.val = c;
        }
    }
    Set<String> res = new HashSet<>();
    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = buildTrie(words);
        for (int i=0;i<board.length;++i){
            for (int j=0;j<board[0].length;++j){
                    DFS(board,i,j,root);
            }
        }
        return new ArrayList<>(res);
    }

    public void DFS(char[][] board, int i, int j,TrieNode root) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return;
        char cur = board[i][j];
        if (cur == '#' || root.children[cur - 'a'] == null) return;
        root = root.children[cur - 'a'];
        //not part of our trie or cur's visited
        if (root.word != null) {
            res.add(root.word);
            root.word = null;
        }
        board[i][j] = '#';
        DFS(board, i + 1, j, root);
        DFS(board,  i - 1, j, root);
        DFS(board,  i, j + 1, root);
        DFS(board,  i, j - 1, root);
        board[i][j] = cur;
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
            node.word = w;
        }
        return root;
    }
}
