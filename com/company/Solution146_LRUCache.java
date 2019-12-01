package com.company;

import java.util.*;

public class Solution146_LRUCache {
    class LRUCache {
        class Node{
            int key,val;
            Node prev;
            Node next;
            Node(){
            }
            Node(int k, int v){
                this.key =k;
                this.val = v;
            }
        }
        Map<Integer,Node> map;
        Node head,tail;
        int cap;
        public LRUCache(int capacity) {
            head = new Node();
            tail = new Node();
            head.next =tail;
            tail.prev = head;
            this.cap = capacity;
            map = new HashMap<>();
        }

        public int get(int key) {
            Node n = map.get(key);
            if (n==null) return -1;
            moveToHead(n);
            return n.val;
        }

        public void put(int key, int value) {
            Node n = map.get(key);
            if (n==null){
                Node add = new Node(key,value);
                addToHead(add);
                map.put(key,add);
                if (map.size()>cap){
                    Node removed = removeFromTail();
                    map.remove(removed.key);
                }
            }
            else {
                n.val = value;
                moveToHead(n);
            }
        }
        public void addToHead(Node n){
            n.prev = head;
            n.next = head.next;
            head.next.prev = n;
            head.next = n;
        }
        public void moveToHead(Node n){
            removeNode(n);
            addToHead(n);
        }

        public void removeNode(Node n){
            n.prev.next = n.next;
            n.next.prev = n.prev;
        }
        public Node removeFromTail(){
            Node removed = tail.prev;
            removeNode(removed);
            return removed;
        }

    }

}
