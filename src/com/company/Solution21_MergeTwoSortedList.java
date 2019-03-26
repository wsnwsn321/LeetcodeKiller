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

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode temp = head.next;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                temp.next = l1;
                l1 = l1.next;
            }
            else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        while(l1!=null){
            temp.next = l1;
            l1 = l1.next;
            temp = temp.next;
        }
        while(l2!=null){
            temp.next = l2;
            l2 = l2.next;
            temp = temp.next;
        }
        return head.next;
    }

}
