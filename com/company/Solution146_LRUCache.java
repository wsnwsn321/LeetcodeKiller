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
        public LRUCache(int capacity){
            this.map = new HashMap<>();
            this.capacity = capacity;
            head = new Node();
            tail = new Node();
            head.next =tail;
            tail.pre = head;
        }

        public int get(int key){
            if (map.get(key)==null)
                return -1;
            Node cur = map.get(key);
            moveToHead(cur);
            return cur.val;
        }

        public void put(int key, int value){
            Node cur  =map.get(key);
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
        //always add too head
        public void addToHead(Node node){
            node.pre = head;
            node.next = head.next;
            head.next = node;
            node.next.pre = node;
        }

        public void removeNode(Node node){
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }

        public void moveToHead(Node node){
            removeNode(node);
            addToHead(node);
        }

        public Node removeTail(){
            Node removed = tail.pre;
            removeNode(removed);
            return removed;
        }

    }
}
