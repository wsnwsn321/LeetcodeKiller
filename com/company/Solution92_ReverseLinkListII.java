package com.company;

public class Solution92_ReverseLinkListII {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead, cur = head;
        for (int i = 1; i < m; ++i) {
            pre = cur;
            cur = cur.next;
        }
        //cur is now head of reverse,pre is going to connect to reversed head
        ListNode preOfReversedHead = pre;
        ListNode reversedTail = cur;
        for (int i = m; i <= n; ++i) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        //pre is now head of reversed list, connect it with where we started reversing.
        //cur is the first node after the reverse part, connect tail of reversed list to it
        preOfReversedHead.next = pre;
        reversedTail.next = cur;
        return dummyHead.next;
    }

}
