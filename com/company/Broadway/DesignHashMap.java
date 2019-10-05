package com.company.Broadway;

public class DesignHashMap {
    public static void main(String[] args) {

    }

    class MyHashMap {
        class ListNode {
            int key, val;
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
            int hashCode = key%nodes.length;
            if (nodes[hashCode]==null) {
                nodes[hashCode] = new ListNode(key,value);
                return;
            }
            ListNode prev = findPrev(nodes[hashCode],key);
            if (prev.next == null)
                prev.next = new ListNode(key, value);
            else prev.next.val = value;

        }

        /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
        public int get(int key) {
            int hashCode = key%nodes.length;
            if (nodes[hashCode] == null)
                return -1;
            ListNode prev = findPrev(nodes[hashCode], key);
            return prev.next == null ? -1 : prev.next.val;
        }

        /** Removes the mapping of the specified value key if this map contains a mapping for the key */
        public void remove(int key) {
            int hashCode = key%nodes.length;
            if (nodes[hashCode] == null) return;
            ListNode prev = findPrev(nodes[hashCode], key);
            if (prev.next == null) return;
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
