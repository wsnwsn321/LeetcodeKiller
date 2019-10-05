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
        if (head==null){
            return new Node(insertVal,null);
        }
        Node prev = head;
        Node curr = head.next;
        while (curr!=head){
            int pre = prev.val;
            int cur = curr.val;
            if (pre == insertVal || (pre < insertVal && cur > insertVal) ||
                    (pre < insertVal && pre > cur) ||
                    (cur > insertVal && pre > cur)

            ) break;
            prev =curr;
            curr = curr.next;
        }
        prev.next = new Node(insertVal,curr);
        return head;

    }
}
