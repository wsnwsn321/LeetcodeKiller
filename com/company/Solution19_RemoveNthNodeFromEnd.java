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
      ListNode slow = head, fast = head,pre=null;
      int i=0;
      while (i<n){
        fast = fast.next;
        i++;
      }
      while (fast!=null){
        pre =slow;
        slow = slow.next;
        fast = fast.next;
      }
      if (pre==null) return null;
      pre.next = slow.next;
      return head;
    }
}
