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
        dummy.next=head;
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur!=null&&cur.next!=null){
            ListNode temp = cur.next;
            pre.next = temp;
            cur.next = temp.next;
            temp.next = cur;
            pre = cur;
            cur=cur.next;
        }
        return dummy.next;
    }
}
