package com.company;

import java.util.*;

public class Solution146_LRUCache {
    class LRUCache {
        class Node{
            Node prev;
            Node next;
            int key,value;
            Node(int key, int val){
                this.key =key;
                this.value = val;
            }
            Node(){

            }
        }
        Map<Integer,Node> map;
        int capacity;
        Node head,tail;
        public LRUCache(int capacity) {
            map = new HashMap<>();
            this.capacity = capacity;
            head = new Node();
            tail = new Node();
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            Node cur = map.get(key);
            if (cur==null) return -1;
            moveToHead(cur);
            return cur.value;
        }

        public void put(int key, int value) {
            Node cur = map.get(key);
            if (cur==null){
                Node inserted = new Node(key,value);
                map.put(key, inserted);
                addToHead(inserted);
                if (map.size()>capacity){
                    Node removed = removeTail();
                    map.remove(removed.key);
                }
            }else {
                cur.value = value;
                moveToHead(cur);
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
