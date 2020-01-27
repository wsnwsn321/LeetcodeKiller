package com.company;

import java.util.*;

public class Solution146_LRUCache {
    class LRUCache {
        class Node{
            int key;
            int val;
            Node prev;
            Node next;
            Node(){

            }
            Node(int k, int v){
                this.key = k;
                this.val = v;
            }
        }
        int size;
        Node head,tail;
        Map<Integer,Node> cache;
        public LRUCache(int capacity){
            this.size =capacity;
            cache = new HashMap<>();
            head = new Node();
            tail = new Node();
            head.next = tail;
            tail.prev = head;
        }
        public int get(int key) {
            Node cur = cache.get(key);
            if (cur==null)
                return -1;
            moveToHead(cur);
            return cur.val;
        }

        public void put(int key, int value) {
            Node cur = cache.get(key);
            if (cur!=null){
                cur.val = value;
                moveToHead(cur);
            }
            else {
                Node newNode = new Node(key,value);
                addToHead(newNode);
                cache.put(key,newNode);
                if (cache.size()>size){
                    Node least = removeTail();
                    cache.remove(least.key);
                }
            }
        }

        public void addToHead(Node node){
            node.prev = head;
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
        }

        public void removeNode(Node node){
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        public void moveToHead(Node node){
            removeNode(node);
            addToHead(node);
        }

        public Node removeTail(){
            Node removed = tail.prev;
            removeNode(removed);
            return removed;
        }

    }

}
