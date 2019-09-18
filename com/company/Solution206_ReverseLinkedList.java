package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution206_ReverseLinkedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        pre.next=head;
        ListNode cur = head;
        while (cur!=null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur =temp;
        }
        return head;

    }
}
