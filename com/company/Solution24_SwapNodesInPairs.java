package com.company;

public class Solution24_SwapNodesInPairs {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args) {

    }
    public ListNode swapPairs(ListNode head) {
        if (head==null||head.next==null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while (head != null && head.next != null) {
            ListNode temp = head.next;
            head.next = temp.next;
            temp.next = head;
            pre.next = temp;
            pre = head;
            head = head.next;
        }
        return dummy.next;
    }
}
