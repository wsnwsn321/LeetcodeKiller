package com.company;

public class Solution430_FlattenaMultilevelDoublyLinkedList {
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }

    public Node flatten(Node head) {
        Node cur = head;
        while (cur!=null){
            if (cur.child!=null){
                Node oldNext = cur.next;
                cur.next = flatten(cur.child);
                cur.next.prev = cur;
                cur.child=null;
                while (cur.next!=null)
                    cur = cur.next;
                if (oldNext!=null) {
                    cur.next = oldNext;
                    oldNext.prev = cur;
                }
            }
            cur = cur.next;
        }
        return head;
    }

}


}
