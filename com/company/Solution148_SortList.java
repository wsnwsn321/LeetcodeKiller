package com.company;

import java.util.List;

public class Solution148_SortList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {

    }
    public ListNode sortList(ListNode head){
        if (head == null || head.next == null)
            return head;
        ListNode slow= head,fast = head,pre = null;
        while (fast!=null&&fast.next!=null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next =null;
        return merge(sortList(head),sortList(slow));

    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while (l1!=null||l2!=null){
            int n1 = l1==null?Integer.MAX_VALUE:l1.val;
            int n2 = l2==null?Integer.MAX_VALUE:l2.val;
            if (n1<n2){
                head.next = l1;
                l1 = l1.next;
            }
            else {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}
