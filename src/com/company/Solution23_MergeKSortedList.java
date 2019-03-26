package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution23_MergeKSortedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        PriorityQueue<Integer> p = new PriorityQueue<>();

        for(int i=0;i<lists.length;++i){
            while(lists[i]!=null){
                p.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        while(p.size()>0){
            temp.next = new ListNode(p.poll());
            temp = temp.next;
        }
        return head.next;
    }
}
