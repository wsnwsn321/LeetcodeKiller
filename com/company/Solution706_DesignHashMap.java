package com.company;

import java.util.*;

public class Solution706_DesignHashMap {
    public static void main(String[] args) {

    }

    class MyHashMap {
        class Node{
            Node next;
            int key;
            int val;
            Node(){}
            Node(int key,int val){
                this.key = key;
                this.val =val;
            }
        }
        Node[] buckets = new Node[10000];
        /** Initialize your data structure here. */
        public MyHashMap() {

        }

        /** value will always be non-negative. */
        public void put(int key, int value) {
            int hashKey = key%buckets.length;
            if (buckets[hashKey]==null)
                buckets[hashKey] = new Node(-1,-1);
            Node prev = findPrev(key);
            if (prev.next==null){
                prev.next = new Node(key,value);
            }
            else
                prev.next.val = value;
        }

        /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
        public int get(int key) {
            int hashCode = key%buckets.length;
            if (buckets[hashCode]==null) return -1;
            Node prev = findPrev(key);
            return prev.next==null?-1:prev.next.val;
        }

        /** Removes the mapping of the specified value key if this map contains a mapping for the key */
        public void remove(int key) {
            int hashCode = key%buckets.length;
            if (buckets[hashCode]==null) return;
            Node prev = findPrev(key);
            if (prev.next==null)
                return;
            prev.next = prev.next.next;
        }
        public Node findPrev(int key){
            int hashCode = key%buckets.length;
            Node cur = buckets[hashCode], pre = null;
            while (cur!=null&&cur.key!=key){
                pre = cur;
                cur = cur.next;
            }
            return pre;
        }
    }


}
