package com.company;

public class Solution641_DesignCircularDeque {
    public static void main(String[] args) {

    }
    public class Node{
        Node prev;
        Node next;
        int val;
        Node(){}
        Node(int val){
            this.val = val;
        }

    }
    class MyCircularDeque {
        Node head, tail;
        int capacity;
        int size;
        /** Initialize your data structure here. Set the size of the deque to be k. */
        public MyCircularDeque(int k) {
            this.capacity = k;
            this.size=0;
            head = new Node();
            tail = new Node();
            head.next = tail;
            tail.prev = head;
        }

        /** Adds an item at the front of Deque. Return true if the operation is successful. */
        public boolean insertFront(int value) {
            if (size==capacity) return false;
            Node temp = head.next;
            Node front = new Node(value);
            head.next = front;
            front.prev = head;
            front.next = temp;
            temp.prev = front;
            size++;
            return true;
        }

        /** Adds an item at the rear of Deque. Return true if the operation is successful. */
        public boolean insertLast(int value) {
            if (size==capacity) return false;
            Node temp = tail.prev;
            Node last = new Node(value);
            tail.prev = last;
            last.prev = temp;
            last.next = tail;
            temp.next = last;
            size++;
            return true;
        }

        /** Deletes an item from the front of Deque. Return true if the operation is successful. */
        public boolean deleteFront() {
            if (size==0) return false;
            Node deleted = head.next;
            head.next = deleted.next;
            deleted.next.prev = head;
            size--;
            return true;

        }

        /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
        public boolean deleteLast() {
            if (size==0) return false;
            Node deleted = tail.prev;
            tail.prev = deleted.prev;
            deleted.prev.next = tail;
            size--;
            return true;

        }

        /** Get the front item from the deque. */
        public int getFront() {
            return size==0?-1:head.next.val;
        }

        /** Get the last item from the deque. */
        public int getRear() {
            return size==0?-1:tail.prev.val;
        }

        /** Checks whether the circular deque is empty or not. */
        public boolean isEmpty() {
            return size==0;
        }

        /** Checks whether the circular deque is full or not. */
        public boolean isFull() {
            return size==capacity;
        }
    }
}
