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
        ListNode slow = head,fast = head;
        while (fast!=null&&fast.next!=null&&slow!=null&&slow!=fast){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow==fast?true:false;
    }
}
