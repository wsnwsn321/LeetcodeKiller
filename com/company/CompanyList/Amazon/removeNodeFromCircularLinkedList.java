package com.company.CompanyList.Amazon;

public class removeNodeFromCircularLinkedList {
    static class Node {
        public int val;
        public Node next;
        public Node() {}

        public Node(int _val) {
            val = _val;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
//        Node two = new Node(2);
//        Node three = new Node(3);
        head.next = head;
//        two.next = three;
//        three.next = head;
        solution(head,2);
    }
    public static Node solution(Node head,int removedVal){
        if (head==null||(head.next==head&&head.val==removedVal)) return null;
        Node pre = head;
        Node cur = head.next;
        while (cur!=head){
            if (cur.val==removedVal){
                break;
            }
            pre = cur;
            cur = cur.next;
        }
        if (cur.val==removedVal){
            if (cur==head){
                head = cur.next;
            }
            pre.next = cur.next;
        }

        return head;

    }
}
