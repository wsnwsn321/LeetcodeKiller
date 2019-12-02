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
      if (lists==null||lists.length==0) return null;

      PriorityQueue<ListNode> queue= new PriorityQueue<ListNode>((a,b)->a.val-b.val);

      ListNode dummy = new ListNode(0);
      ListNode tail=dummy;

      for (ListNode node:lists)
          if (node!=null)
              queue.add(node);

      while (!queue.isEmpty()){
          tail.next=queue.poll();
          tail=tail.next;

          if (tail.next!=null)
              queue.add(tail.next);
      }
      return dummy.next;
  }
}
