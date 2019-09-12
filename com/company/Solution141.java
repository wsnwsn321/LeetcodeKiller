package com.company;

public class Solution141 {
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
        if(head==null) return false;
        if(head.next==null) return false;
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while(fast!=slow&&fast!=null&&fast.next!=null&&fast.next.next!=null&&slow!=null&&slow.next!=null&&slow!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast==slow) return true;
        else return false;


    }
}
