package com.company.Google;

public class RemoveEvenNodeFromLinkedList {
    public static class Node{
        int val;
        Node next;
        Node(){

        }
        Node(int val){
            this.val =val;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        head.next = two;
        two.next = three;
        three.next = four;
        //four.next = head;
        //five.next = head;
        removeOdd(head);

    }
    public static Node removeEven(Node head){
        if (head==null) return null;
        if (head.next == head) return head;
        Node pre = head,cur = head.next;
        while (cur!=head){
            pre.next = cur.next;
            pre = cur.next;
            cur = pre.next;
            if (pre ==head) break;
        }
        return head;
    }

    public static Node removeOdd(Node head){
        if (head==null) return null;
        if (head.next == head) return null;
        Node dummyhead = head.next;
        Node cur = head.next, next = cur.next;
        while (cur!=head){
            if (next.next == head)
                cur.next = head.next;
            else cur.next = next.next;
            cur = next.next;
            next = cur.next;
            if (cur==head.next) {
                break;
            }
        }
        return dummyhead;
    }
}
