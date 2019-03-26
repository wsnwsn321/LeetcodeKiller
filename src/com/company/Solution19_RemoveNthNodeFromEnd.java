package com.company;

public class Solution19_RemoveNthNodeFromEnd {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static void main(String[] args) {

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int f = 0, s =0;

        ListNode dummy = new ListNode(0);
        ListNode fast = dummy;
        ListNode slow = dummy;
        dummy.next = head;
        while(f-s<=n){
            fast = fast.next;
            f++;
        }
        while(fast!=null){
            //System.out.println(slow.val);
            fast =fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
