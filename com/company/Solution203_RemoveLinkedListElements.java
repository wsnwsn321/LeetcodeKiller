package com.company;

public class Solution203_RemoveLinkedListElements {
      public class ListNode {
          int val;
            ListNode next;
          ListNode(int x) { val = x; }
      }

    public static void main(String[] args) {

    }
    public ListNode removeElements(ListNode head, int val) {
          ListNode dummyHead = new ListNode(0);
          dummyHead.next =head;
          ListNode cur = head,pre = dummyHead;
          while (cur!=null){
              if (cur.val==val){
                  pre.next = cur.next;
              }
              else pre =cur;
              cur = cur.next;
          }
          return dummyHead.next;
    }
}
