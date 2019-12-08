package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution23_MergeKSortedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
  //time:   O(Nlogk)    N-number of elements
  //                    k-number of ListNode
    // space: O(k)
  public ListNode mergeKLists(ListNode[] lists) {
      if (lists == null || lists.length == 0) return null;
      ListNode dummy = new ListNode(0);
      ListNode head = dummy;
      PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((a, b) -> a.val - b.val);
      for (ListNode node : lists) {
          if (node!=null)
            pq.offer(node);
      }
      while (pq.size() > 0) {
          ListNode temp = pq.poll();
          head.next = temp;
          head = head.next;
          if (temp.next != null) {
              pq.offer(temp.next);
          }
      }
      return dummy.next;
  }
}
