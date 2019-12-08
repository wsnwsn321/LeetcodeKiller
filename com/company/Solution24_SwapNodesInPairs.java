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
        if (head == null||head.next==null)
            return head;
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = cur;
            pre.next = temp;
            pre = cur;
            cur = cur.next;
        }
        return dummy.next;
    }
}
