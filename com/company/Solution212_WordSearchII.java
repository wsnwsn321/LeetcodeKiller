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
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == '#') return;
        char ch = board[i][j];
        TrieNode node = root.children[ch - 'a'];
        if (node == null)
            return;
        if (node.word != null)
            res.add(node.word);
        board[i][j] = '#';
        DFS(board, i + 1, j, node);
        DFS(board, i - 1, j, node);
        DFS(board, i, j + 1, node);
        DFS(board, i, j - 1, node);
        board[i][j] = ch;
    }

    public TrieNode buildTrie(String[] words){
        TrieNode root = new TrieNode();
        for (String cur:words){
            TrieNode node = root;
            for (char ch:cur.toCharArray()){
                if (node.children[ch-'a']==null)
                    node.children[ch-'a'] = new TrieNode(ch);
                node = node.children[ch-'a'];
            }
            node.word = cur;
        }
        return root;
    }
}
