package com.company;

public class Solution86_PartitionList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static void main(String[] args) {

    }
    public ListNode partition(ListNode head, int x) {
        ListNode beforeHeadDummy = new ListNode(0);
        ListNode afterHeadDummy = new ListNode(0);
        ListNode beforeHead = beforeHeadDummy,afterHead = afterHeadDummy;
        ListNode cur = head;
        while (cur!=null){
            if (cur.val<x){
                beforeHead.next = cur;
                beforeHead = beforeHead.next;
            }
            else{
                afterHead.next = cur;
                afterHead = afterHead.next;
            }
            cur = cur.next;
        }
        afterHead.next =null;
        beforeHead.next = afterHeadDummy.next;
        return beforeHeadDummy.next;

    }
}
