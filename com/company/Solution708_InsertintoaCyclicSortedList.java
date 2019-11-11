package com.company;

public class Solution708_InsertintoaCyclicSortedList {
    class Node {
        public int val;
        public Node next;

        public Node() {}

        public Node(int _val,Node _next) {
            val = _val;
            next = _next;
        }
    }
    public static void main(String[] args) {

    }
    public Node insert(Node head, int insertVal) {
        if (head==null)
            return new Node(insertVal,null );
        Node cur = head.next;
        Node pre =head;
        while (cur!=head){
            if (pre.val==insertVal||(pre.val<insertVal&&cur.val>insertVal)
                ||(pre.val<insertVal&&pre.val>cur.val)
                ||(cur.val>insertVal&&pre.val>cur.val)){
                break;
            }
            pre = cur;
            cur = cur.next;
        }
        pre.next = new Node(insertVal,cur);
        return head;
    }
}
