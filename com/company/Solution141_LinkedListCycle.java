package com.company;

public class Solution141_LinkedListCycle {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null) return false;
        ListNode slow = head,fast = head.next;
        while (slow!=fast&&fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow==fast?true:false;
    }
}
