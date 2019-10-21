package com.company;

import java.util.*;

public class Solution706_DesignHashMap {
    public static void main(String[] args) {

    }

    class MyHashMap {
        class ListNode{
            int key;
            int val;
            ListNode next;
            ListNode(int key, int val) {
                this.key = key;
                this.val = val;
            }
        }
        final ListNode[] nodes = new ListNode[10000];

        /** Initialize your data structure here. */
        public MyHashMap() {

        }

        /** value will always be non-negative. */
        public void put(int key, int value) {
            int hashKey = key%nodes.length;
            if (nodes[hashKey] == null)
                nodes[hashKey] = new ListNode(-1, -1);
            ListNode prev = findPrev(nodes[hashKey],key);
            if (prev.next==null)
                prev.next =new ListNode(key,value);
            else
                prev.next.val = value;
        }

        /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
        public int get(int key) {
            int hashKey = key%nodes.length;
            if (nodes[hashKey] == null)
                return -1;
            ListNode prev = findPrev(nodes[hashKey],key);
            if (prev.next==null) return -1;
            return prev.next.val;
        }

        /** Removes the mapping of the specified value key if this map contains a mapping for the key */
        public void remove(int key) {
            int hashKey = key%nodes.length;
            if (nodes[hashKey] == null) return;
            ListNode prev = findPrev(nodes[hashKey],key);
            if (prev.next==null) return;
            prev.next = prev.next.next;
        }
        ListNode findPrev(ListNode bucket, int key) {
            ListNode node = bucket, prev = null;
            while (node != null && node.key != key) {
                prev = node;
                node = node.next;
            }
            return prev;
        }

    }


}
