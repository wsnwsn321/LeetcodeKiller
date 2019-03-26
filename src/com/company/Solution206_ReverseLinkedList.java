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
        ListNode next = head.next;
        head.next = null;
        while(next!=null){
            ListNode newHead = next.next;
            next.next = head;
            head = next;
            next = next.next;
        }
        return head;
    }
}
