package com.company;

import java.util.List;

public class Solution21_MergeTwoSortedList {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(4);
        a1.next =a2;
        a2.next =a3;
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(4);
        b1.next =b2;
        b2.next =b3;
        mergeTwoLists(a1,b1);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                temp.next = l1;
                l1 =l1.next;
            }
            else {
                temp.next =l2;
                l2=l2.next;
            }
            temp = temp.next;
        }
        if(l1!=null){
            temp.next = l1;
        }
        if(l2!=null){
            temp.next = l2;
        }
        return head.next;
    }

}
