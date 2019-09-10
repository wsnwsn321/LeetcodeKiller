package com.company;

import java.util.List;

public class Solution21_MergeTwoSortedList {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static void main(String[] args) {
    }

    //time:     O(l1+l2)
    //space:    O(1)
    public  ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode head = dummyHead;
        while (l1!=null||l2!=null){
            int v1 = l1==null?Integer.MAX_VALUE:l1.val;
            int v2 = l2==null?Integer.MAX_VALUE:l2.val;
            if (v1<v2) {
                head.next = l1;
                l1 = l1.next;
            }
            else {
                head.next = l2;
                l2 = l2.next;
            }
            head=head.next;
        }
        return dummyHead.next;
    }

}
