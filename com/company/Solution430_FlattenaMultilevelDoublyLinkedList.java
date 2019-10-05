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
                Node ogNext = cur.next;
                Node c = flatten(cur);
                cur.next =c;
                c.prev = cur;
                cur.child =null;
                while (c.next!=null) c= c.next;
                if (ogNext!=null) {
                    c.next = ogNext;
                    ogNext.prev = c;
                }
            }
            cur = cur.next;
        }
        return head;

    }

}


}
