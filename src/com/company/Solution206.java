package com.company;

import java.util.ArrayList;
import java.util.List;

public class Solution206 {
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
        ListNode newHead = head.next;
        ListNode previous = head;
        ListNode tail = head;
        while(newHead.next!=null){
            ListNode next = newHead.next;
            newHead.next = previous;
            previous = newHead;
            newHead = next;
        }
        tail.next =null;
        newHead.next = previous;
        return newHead;
    }
}
