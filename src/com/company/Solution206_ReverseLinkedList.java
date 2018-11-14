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
        if(head==null) return head;
        if(head.next==null) return head;
        ListNode pre =null;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;

        }
        return pre;
    }
}
