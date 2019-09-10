package com.company;

import java.util.List;

public class Solution19_RemoveNthNodeFromEnd {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static void main(String[] args) {

    }
    //time: O(n) length of node
    //space: O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode dummyHead = pre;
        while (n>0){
            fast = fast.next;
            n--;
        }
        while (fast!=null){
            pre =slow;
            fast = fast.next;
            slow = slow.next;
        }
        pre.next = slow.next;
        return dummyHead.next;

    }
}
