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
       PriorityQueue<Integer> p =new PriorityQueue<>();
       for (ListNode x:lists){
           while (x!=null){
               p.add(x.val);
               x=x.next;
           }
       }
       ListNode dummyHead = new ListNode(0);
       ListNode head = dummyHead;
       int size = p.size();
       while (size>0){
           //runtime of poll() is logk
           head.next = new ListNode(p.poll());
           head = head.next;
       }
       return dummyHead.next;
    }
}
