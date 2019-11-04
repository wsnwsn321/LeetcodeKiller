package com.company;

public class Solution328_OddEvenLinkedList {

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }
    public static void main(String[] args) {

    }
    public ListNode oddEvenList(ListNode head) {
          if (head==null) return null;
          ListNode evenHead = new ListNode(0),oddHead =new ListNode(0);
          ListNode even = head,odd= head;
          evenHead.next = even;oddHead.next = odd;
        while (even!=null&&even.next!=null){
              odd.next = even.next;
              odd = odd.next;
              even.next = odd.next;
              even = even.next;
          }
          odd.next = evenHead.next;
          return oddHead.next;

    }
}
