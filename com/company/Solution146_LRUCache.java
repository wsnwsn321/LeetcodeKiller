package com.company;

import com.company.citrix.CircularArray;

import java.util.*;

public class Solution146_LRUCache {

    class LRUCache {
        class Node{
            Node pre;
            Node next;
            int key,val;
            Node(){

            }
            Node(int k,int v){
                this.key =k ;
                this.val = v;
            }
        }
        int capacity;
        Map<Integer, Node> map;
        Node head,tail;
        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.map = new HashMap<>();
            head = new Node();
            tail = new Node();
            head.next = tail;
            tail.pre = head;
        }

        public int get(int key) {
            Node node = map.get(key);
            if(node==null) return -1;
            moveToHead(node);
            return node.val;
        }

        public void put(int key, int value) {
            Node cur = map.get(key);
            if (cur==null){
                cur = new Node(key,value);
                map.put(key,cur);
                addToHead(cur);
                if (map.size()>capacity){
                    Node removed = removeTail();
                    map.remove(removed.key);
                }
            }
            else {
                cur.val = value;
                moveToHead(cur);
            }

        }

        public void addToHead(Node node){
            Node temp = head.next;
            head.next = node;
            node.pre = head;
            node.next = temp;
            temp.pre = node;
        }

        public void removeNode(Node node){
            Node pre = node.pre;
            Node next = node.next;
            pre.next = next;
            next.pre = pre;
        }

        public void moveToHead(Node node){
            removeNode(node);
            addToHead(node);
        }

        public Node removeTail(){
            Node res = tail.pre;
            removeNode(res);
            return res;
        }

    }
}
