package com.company;

import java.util.*;

public class Solution706_DesignHashMap {
    public static void main(String[] args) {

    }

    class MyHashMap {

        class Node {
            int key;
            int val;
            Node next;

            Node() {
            }

            ;

            Node(int k, int v) {
                this.key = k;
                this.val = v;
            }
        }

        Node[] nodes;
        int length = 10000;
        int size=0;
        private static final double LOAD_FACTOR = 0.75;
        /**
         * Initialize your data structure here.
         */
        public MyHashMap() {
            nodes = new Node[length];
        }

        /**
         * value will always be non-negative.
         */
        public void put(int key, int value) {
            int hashKey = key % length;
            if (nodes[hashKey] == null)
                nodes[hashKey] = new Node(-1, -1);
            Node prev = findPrev(key);
            if (prev.next == null) {
                prev.next = new Node(key, value);
                size++;
            } else {
                prev.next.val = value;
            }

            if ((double)size/nodes.length>LOAD_FACTOR){
                rehash();
            }

        }

        /**
         * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
         */
        public int get(int key) {
            int hashKey = key % length;
            if (nodes[hashKey] == null) return -1;
            Node prev = findPrev(key);
            if (prev.next == null) return -1;
            else return prev.next.val;
        }

        /**
         * Removes the mapping of the specified value key if this map contains a mapping for the key
         */
        public void remove(int key) {
            int hashKey = key % length;
            if (nodes[hashKey] == null) return;
            Node prev = findPrev(key);
            if (prev.next == null)
                return;
            else
                prev.next = prev.next.next;
        }

        //rehash
        private void rehash() {
            Node[] tmp = nodes;
            nodes = new Node[tmp.length * 2];
            size = 0;
            for (Node head:tmp){
                for (Node cur = head;cur!=null;cur = cur.next){
                    put(cur.key,cur.val);
                }
            }

        }

        public Node findPrev(int key) {
            int hashKey = key % length;
            Node cur = nodes[hashKey], prev = null;
            while (cur!=null&&cur.key != key) {
                prev = cur;
                cur = cur.next;
            }
            return prev;
        }
    }
}
