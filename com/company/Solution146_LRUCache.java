package com.company;

import com.company.citrix.CircularArray;

import java.util.*;

public class Solution146_LRUCache {
    class LRUCache {

        class DLinkedNode {
            int key;
            int value;
            DLinkedNode prev;
            DLinkedNode next;
        }

        private void addNode(DLinkedNode node) {
            /**
             * Always add the new node right after head.
             */
            node.prev = head;
            node.next = head.next;

            head.next.prev = node;
            head.next = node;
        }

        private void removeNode(DLinkedNode node){
            /**
             * Remove an existing node from the linked list.
             */
            DLinkedNode prev = node.prev;
            DLinkedNode next = node.next;

            prev.next = next;
            next.prev = prev;

        }

        private void moveToHead(DLinkedNode node){
            /**
             * Move certain node in between to the head.
             */
            removeNode(node);
            addNode(node);
        }

        private DLinkedNode popTail() {
            /**
             * Pop the current tail.
             */
            DLinkedNode res = tail.prev;
            removeNode(res);
            return res;
        }

        private Map<Integer, DLinkedNode> cache = new HashMap<>();
        private int capacity;
        private DLinkedNode head, tail;
        public LRUCache(int capacity) {
            this.capacity = capacity;
            head = new DLinkedNode();
            tail = new DLinkedNode();
            head.next = tail;
            tail.prev = head;

        }

        public int get(int key) {
            DLinkedNode cur = cache.get(key);
            if (cur == null) return -1;
            moveToHead(cur);
            return cur.value;
        }

        public void put(int key, int value) {
            DLinkedNode cur = cache.get(key);
            if (cur!=null){
                cur.value = value;
                moveToHead(cur);
                return;
            }
            DLinkedNode newNode = new DLinkedNode();
            newNode.key = key;
            newNode.value = value;
            cache.put(key,newNode);
            addNode(newNode);
            if (cache.size()>capacity) {
                DLinkedNode tail = popTail();
                cache.remove(tail.key);
            }
        }
    }
}
