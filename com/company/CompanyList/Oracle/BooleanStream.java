package com.company.CompanyList.Oracle;

import java.util.concurrent.Semaphore;

public class BooleanStream {
    class TrieNode{
        TrieNode[] children = new TrieNode[26];
        boolean isWord;
        String word;
        boolean printed;

    }
    Semaphore s;
    StringBuilder sb = new StringBuilder();
    TrieNode root = new TrieNode();
    public BooleanStream(char[] input){
        root = buildTrie(input);
        s = new Semaphore(1);
    }

    public void query(char c) throws InterruptedException{
        s.acquire();
        TrieNode node = root;
        sb.append(c);
        for (int i=sb.length()-1;i>=0;--i){
            char ch = sb.charAt(i);
            node = node.children[ch];
            if (node!=null&&node.isWord&&!node.printed){
                System.out.println(node.word);
                node.printed = true;
                break;
            }
        }
        s.release();
    }

    public TrieNode buildTrie(char[] input){
        TrieNode node = root;
        for (int i= input.length-1;i>=0;--i){
            char ch = input[i];
            if (node.children[ch]==null)
                node.children[ch] = new TrieNode();
            node = node.children[ch];
        }
        node.isWord = true;
        node.word = input.toString();
        return node;
    }
}
